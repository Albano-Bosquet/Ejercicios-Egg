/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.servicios;

import com.albano.ProyectoLibreria.entidades.Editorial;
import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.repositorios.EditorialRepositorio;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Autowired
    private FotoServicio fotoServicio;

    @Transactional
    public void crear(MultipartFile archivo, String nombre) throws Exception {

        //Realizamos las validaciones
        validar(nombre);

        //Guardamos los valores
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        
        //Cargamos la foto
        Foto foto = fotoServicio.guardar(archivo);
        editorial.setFoto(foto);

        //Cargamos en la DB
        editorialRepositorio.save(editorial);

    }

    @Transactional
    public void modificar(MultipartFile archivo, String nombre, String id) throws Exception {

        //Realizamos las validaciones
        validar(nombre);

        //Buscamos la editorial
        Editorial editorial = new Editorial();
        editorial = editorialRepositorio.buscarPorID(id);

        //Modificamos los valores
        editorial.setNombre(nombre);
        
        //Cargamos la foto
        String idFoto = null;
        if (editorial.getFoto() != null) {
            idFoto = editorial.getFoto().getId();
        }
        
        Foto foto = fotoServicio.actualizar(archivo, id);
        editorial.setFoto(foto);

        //Cargamos en la DB
        editorialRepositorio.save(editorial);

    }

    @Transactional
    public void baja(String id) throws Exception {

        //Buscamos la editorial
        Editorial editorial = new Editorial();
        editorial = editorialRepositorio.buscarPorID(id);
        
        //Modificamos los valores
        editorial.setAlta(false);
        
        //Cargamos en la DB
        editorialRepositorio.save(editorial);

    }
    
    @Transactional
    public void eliminar(String id) throws Exception {
        
        //Buscamos la editorial
        Editorial editorial = new Editorial();
        editorial = editorialRepositorio.buscarPorID(id);
        
        //Cargamos en la DB
        editorialRepositorio.delete(editorial);
        
    }
    
    @Transactional (readOnly = true)
    public Editorial buscarPorNombre(String nombre) {
        return editorialRepositorio.buscarPorNombre(nombre);
    }

    public void validar(String nombre) throws Exception {

        if (nombre == null) {
            throw new Exception("El nombre de la editorial no puede ser nulo");
        }

    }

}
