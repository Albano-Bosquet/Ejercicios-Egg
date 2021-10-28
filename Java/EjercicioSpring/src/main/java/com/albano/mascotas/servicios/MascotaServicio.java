/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.servicios;

import com.albano.mascotas.entidades.Foto;
import com.albano.mascotas.entidades.Mascota;
import com.albano.mascotas.entidades.Usuario;
import com.albano.mascotas.enums.Sexo;
import com.albano.mascotas.repositorios.MascotaRepositorio;
import org.springframework.stereotype.Service;
import com.albano.mascotas.repositorios.UsuarioRepositorio;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class MascotaServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private MascotaRepositorio mascotaRepositorio;

    @Autowired
    private FotoServicio fotoServicio;

    @Transactional
    public void registrar(MultipartFile archivo, String idUsuario, String nombre, Sexo sexo) throws Exception {

        //Buscamos el usuario para la mascota
        Usuario usuario = usuarioRepositorio.findById(idUsuario).get();

        //Hacemos las validaciones
        validar(nombre, sexo);

        //Asignamos los valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setSexo(sexo);
        mascota.setAlta(new Date());

        //Cargamos una foto para la mascota
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);

        //Guardamos los valores en la DB
        mascotaRepositorio.save(mascota);

    }

    @Transactional
    public void modificar(MultipartFile archivo, String idUsuario, String idMascota, String nombre, Sexo sexo) throws Exception {

        //Hacemos las validaciones
        validar(nombre, sexo);

        //Comprobamos si la mascota existe
        Optional<Mascota> respuesta = mascotaRepositorio.findById(idMascota);

        if (respuesta.isPresent()) {

            Mascota mascota = respuesta.get();

            //Comprobamos que el id del usuario sea equivalente al id que traemos
            if (mascota.getUsuario().getId().equals(idUsuario)) {

                mascota.setNombre(nombre);
                mascota.setSexo(sexo);

                //Inicializamos un String de idFoto
                String idFoto = null;

                //Modificamos el idFoto
                if (mascota.getFoto() != null) {

                    idFoto = mascota.getFoto().getId();

                }

                //Modificamos la foto para el usuario
                Foto foto = fotoServicio.actualizar(idFoto, archivo);

                //Guardamos los valores en la DB
                mascotaRepositorio.save(mascota);

            } else {

                throw new Exception("No tiene permisos para hacer la operacion");

            }

        } else {

            throw new Exception("No se ha encontrado la mascota solicitada");

        }

    }

    @Transactional
    public void eliminar(String idUsuario, String idMascota) throws Exception {

        //Comprobamos si la mascota existe
        Optional<Mascota> respuesta = mascotaRepositorio.findById(idMascota);

        if (respuesta.isPresent()) {

            Mascota mascota = respuesta.get();

            //Comprobamos que el id del usuario sea equivalente al id que traemos
            if (mascota.getUsuario().getId().equals(idUsuario)) {

                mascota.setBaja(new Date());
                mascotaRepositorio.save(mascota);

            } else {

                throw new Exception("No tiene permisos para hacer la operacion");

            }

        } else {

            throw new Exception("No se ha encontrado la mascota solicitada");

        }

    }

    public void validar(String nombre, Sexo sexo) throws Exception {

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }
        if (sexo == null) {
            throw new Exception("El sexo no puede ser nulo");
        }

    }

}
