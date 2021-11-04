/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.servicios;

import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.entidades.Usuario;
import com.albano.ProyectoLibreria.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private FotoServicio fotoServicio;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public void crear(MultipartFile archivo, String nombre, String clave, String mail) throws Exception {

        //Realizamos las validaciones
        validar(nombre, clave);

        //Guardamos los valores
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setMail(mail);
        
        //Generamos el encriptador
        String encriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(encriptada);

        //Cargamos la foto
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);

        //Cargamos en la DB
        usuarioRepositorio.save(usuario);

    }

    public void modificar(MultipartFile archivo, String nombre, String clave, String id) throws Exception {

        //Realizamos las validaciones
        validar(nombre, clave);

        //Buscamos el usuario
        Usuario usuario = new Usuario();
        usuario = usuarioRepositorio.buscarPorID(id);

        //Modificamos los valores
        usuario.setNombre(nombre);
        
        //Generamos el encriptador
        String encriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(encriptada);

        //Cargamos la foto
        String idFoto = null;
        if (usuario.getFoto() != null) {
            idFoto = usuario.getFoto().getId();
        }

        Foto foto = fotoServicio.actualizar(archivo, id);
        usuario.setFoto(foto);

        //Cargamos en la DB
        usuarioRepositorio.save(usuario);

    }

    public void eliminar(String id) {

        //Buscamos el usuario
        Usuario usuario = new Usuario();
        usuario = usuarioRepositorio.buscarPorID(id);

        //Cargamos en la DB
        usuarioRepositorio.delete(usuario);

    }

    public void validar(String nombre, String clave) throws Exception {

        if (nombre == null) {
            throw new Exception("El nombre del usuario no puede ser nulo");
        }
        if (clave == null) {
            throw new Exception("La clave del usuario no puede ser nula");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.buscarPorNombre(nombre);
        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();

            GrantedAuthority p1 = new SimpleGrantedAuthority("MODULO_FOTOS");
            permisos.add(p1);

            User user = new User(usuario.getNombre(), usuario.getClave(), permisos);
            return user;

        } else {
            return null;
        }
    }

}
