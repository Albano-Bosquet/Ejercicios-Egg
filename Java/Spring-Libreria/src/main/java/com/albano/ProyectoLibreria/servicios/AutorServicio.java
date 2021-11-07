/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.servicios;

import com.albano.ProyectoLibreria.entidades.Autor;
import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.repositorios.AutorRepositorio;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private FotoServicio fotoServicio;

    @Transactional
    public void crear(MultipartFile archivo, String nombre) throws Exception {

        //Realizamos las validaciones
        validar(nombre);

        //Guardamos los valores
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);
        
        //Cargamos la foto
        Foto foto = fotoServicio.guardar(archivo);
        autor.setFoto(foto);

        //Cargamos en la DB
        autorRepositorio.save(autor);

    }

    @Transactional
    public void modificar(MultipartFile archivo, String nombre, String id) throws Exception {

        //Realizamos las validaciones
        validar(nombre);

        //Buscamos el autor
        Autor autor = new Autor();
        autor = autorRepositorio.buscarPorID(id);

        //Modificamos los valores
        autor.setNombre(nombre);
        
        //Cargamos la foto
        String idFoto = null;
        if (autor.getFoto() != null) {
            idFoto = autor.getFoto().getId();
        }
        
        Foto foto = fotoServicio.actualizar(archivo, id);
        autor.setFoto(foto);

        //Cargamos en la DB
        autorRepositorio.save(autor);

    }

    @Transactional
    public void baja(String id) throws Exception {

        //Buscamos el autor
        Autor autor = new Autor();
        autor = autorRepositorio.buscarPorID(id);
        
        //Modificamos los valores
        autor.setAlta(false);
        
        //Cargamos en la DB
        autorRepositorio.save(autor);

    }
    
    @Transactional
    public void eliminar(String id) throws Exception {
        
        //Buscamos el autor
        Autor autor = new Autor();
        autor = autorRepositorio.buscarPorID(id);
        
        //Cargamos en la DB
        autorRepositorio.delete(autor);
        
    }
    
    @Transactional
    public void alta(String id) throws Exception {
        
        //Buscamos el autor
        Autor autor = new Autor();
        autor = autorRepositorio.buscarPorID(id);
        
        //Modificamos los valores
        autor.setAlta(true);
        
        //Cargamos en la DB
        autorRepositorio.save(autor);
        
    }
    
    @Transactional (readOnly = true)
    public Autor buscarPorNombre(String nombre){
        return autorRepositorio.buscarPorNombre(nombre);
    }

    public void validar(String nombre) throws Exception {

        if (nombre == null) {
            throw new Exception("El nombre del autor no puede ser nulo");
        }

    }

}
