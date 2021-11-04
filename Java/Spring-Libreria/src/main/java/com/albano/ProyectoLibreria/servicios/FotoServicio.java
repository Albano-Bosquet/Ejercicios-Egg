/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.servicios;

import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.repositorios.FotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class FotoServicio {

    @Autowired
    private FotoRepositorio fotoRepositorio;

    public Foto guardar(MultipartFile archivo) throws Exception {

        if (archivo != null) {

            //Guardamos los valores
            Foto foto = new Foto();
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());

            //Cargamos en la DB
            return fotoRepositorio.save(foto);

        } else {
            return null;
        }

    }

    public Foto actualizar(MultipartFile archivo, String id) throws Exception {

        if (archivo != null) {

            //Buscamos la foto
            Foto foto = new Foto();
            foto = fotoRepositorio.buscarPorID(id);

            //Modificamos los valores
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());

            //Cargamos en la DB
            return fotoRepositorio.save(foto);

        } else {
            return null;
        }

    }

}
