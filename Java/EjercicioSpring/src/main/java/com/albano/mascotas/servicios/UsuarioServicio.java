/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.servicios;

import com.albano.mascotas.entidades.Foto;
import com.albano.mascotas.entidades.Usuario;
import com.albano.mascotas.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
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
public class UsuarioServicio implements UserDetailsService{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private FotoServicio fotoServicio;

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String apellido, String mail, String clave) throws Exception {

        //Hacemos las validaciones
        validar(nombre, apellido, mail, clave);

        //Asignamos los valores
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(mail);
        
        //Encriptamos la clave
        String claveEncriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(claveEncriptada);
        usuario.setAlta(new Date());
        
        //Cargamos una foto para el usuario
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);

        //Guardamos los valores en la DB
        usuarioRepositorio.save(usuario);

    }

    @Transactional
    public void modificar(MultipartFile archivo, String nombre, String apellido, String mail, String id, String clave) throws Exception {

        //Hacemos las validaciones
        validar(nombre, apellido, mail, clave);

        //Comprobamos si el usuario existe
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            //Modificamos los valores
            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setMail(mail);
            
            //Encriptamos la clave
            String claveEncriptada = new BCryptPasswordEncoder().encode(clave);
            usuario.setClave(claveEncriptada);
            
            //Inicializamos un String de idFoto
            String idFoto = null;
            
            //Modificamos el idFoto
            if (usuario.getFoto() != null) {
                
                idFoto = usuario.getFoto().getId();
                
            }
            
            //Modificamos la foto para el usuario
            Foto foto = fotoServicio.actualizar(idFoto, archivo);

            //Guardamos los valores en la DB
            usuarioRepositorio.save(usuario);

        } else {

            throw new Exception("No se ha encontrado el usuario solicitado");

        }

    }
    
    @Transactional
    public void deshabilitar(String id) throws Exception{
        
        //Comprobamos si el usuario existe
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            //Modificamos los valores
            Usuario usuario = respuesta.get();
            usuario.setBaja(new Date());

            //Guardamos los valores en la DB
            usuarioRepositorio.save(usuario);

        } else {

            throw new Exception("No se ha encontrado el usuario solicitado");

        }
        
    }
    
    @Transactional
    public void habilitar(String id) throws Exception{
        
        //Comprobamos si el usuario existe
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            //Modificamos los valores
            Usuario usuario = respuesta.get();
            usuario.setBaja(null);

            //Guardamos los valores en la DB
            usuarioRepositorio.save(usuario);

        } else {

            throw new Exception("No se ha encontrado el usuario solicitado");

        }
        
    }

    public void validar(String nombre, String apellido, String mail, String clave) throws Exception {

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido no puede ser nulo");
        }
        if (mail == null || mail.isEmpty()) {
            throw new Exception("El mail no puede ser nulo");
        }
        if (clave == null || clave.isEmpty()) {
            throw new Exception("La clave no puede ser nula");
        }
        if (clave.length() < 8) {
            throw new Exception("La clave debe tener mas de 8 caracteres");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        
        //Buscamos el usuario por su mail
        Usuario usuario = usuarioRepositorio.buscarPorMail(mail);
        
        if (usuario != null) {
            
            //Listado de permisos
            List<GrantedAuthority> permisos = new ArrayList<>();
            
            //Creamos los permisos
            GrantedAuthority p1 = new SimpleGrantedAuthority("MODULO.FOTOS");
            GrantedAuthority p2 = new SimpleGrantedAuthority("MODULO.MASCOTAS");
            GrantedAuthority p3 = new SimpleGrantedAuthority("MODULO.VOTOS");
            
            //Agregamos los permisos a la lista
            permisos.add(p1);
            permisos.add(p2);
            permisos.add(p3);
            
            User user = new User(usuario.getMail(), usuario.getClave(), permisos);
            
            //Retornamos el user
            return user;
            
        } else {
            
            return null;
            
        }
        
    }

}
