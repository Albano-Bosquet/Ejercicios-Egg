/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.servicios;

import com.albano.ProyectoLibreria.entidades.Autor;
import com.albano.ProyectoLibreria.entidades.Editorial;
import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.entidades.Libro;
import com.albano.ProyectoLibreria.repositorios.LibroRepositorio;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private FotoServicio fotoServicio;

    @Transactional
    public void crear(MultipartFile archivo, Long isbn, String titulo, Integer anio, Autor autor, Editorial editorial) throws Exception {

        //Realizamos las validaciones
        validar(isbn, titulo, anio);

        //Guardamos los valores
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setAlta(true);
        
        //Cargamos la foto
        Foto foto = fotoServicio.guardar(archivo);
        libro.setFoto(foto);

        //cargamos en la DB
        libroRepositorio.save(libro);

    }

    @Transactional
    public void modificar(MultipartFile archivo, Long isbn, String titulo, Integer anio, String id) throws Exception {

        //Realizamos las validaciones
        validar(isbn, titulo, anio);

        //Buscamos el libro
        Libro libro = getOne(id);

        //Modificamos los valores
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        
        //Cargamos la foto
        String idFoto = null;
        if (libro.getFoto() != null) {
            idFoto = libro.getFoto().getId();
        }
        
        Foto foto = fotoServicio.actualizar(archivo, id);
        libro.setFoto(foto);

        //Cargamos en la DB
        libroRepositorio.save(libro);

    }

    @Transactional
    public void baja(String id) throws Exception {

        //Buscamos el libro
        Libro libro = getOne(id);

        //Modificamos los valores
        libro.setAlta(false);

        //Cargamos en la DB
        libroRepositorio.save(libro);

    }

    @Transactional
    public void eliminar(String id) throws Exception {

        //Buscamos el libro
        Libro libro = getOne(id);

        //Cargamos en la DB
        libroRepositorio.delete(libro);

    }
    
    @Transactional
    public void alta(String id) throws Exception {
        
        //Buscamos el libro
        Libro libro = getOne(id);
        
        //Modificamos los valores
        libro.setAlta(true);
        
        //Cargamos en la DB
        libroRepositorio.save(libro);
        
    }
    
    @Transactional (readOnly = true)
    public Libro buscarPorISBN(Long isbn) {
        return libroRepositorio.buscarPorISBN(isbn);
    }
    
    @Transactional (readOnly = true)
    public Libro buscarPorTitulo (String titulo) {
        return libroRepositorio.buscarPorTitulo(titulo);
    }
    
    @Transactional (readOnly = true)
    public Libro buscarPorAnio(Integer anio) {
        return libroRepositorio.buscarPorAnio(anio);
    } 
    
    @Transactional (readOnly = true)
    public Libro buscarPorEditorial (String editorial) {
        return (Libro) libroRepositorio.buscarPorEditorial(editorial);
    }
    
    @Transactional (readOnly = true)
    public Libro buscarPorAutor (String autor) {
        return (Libro) libroRepositorio.buscarPorAutor(autor);
    }

    @Transactional (readOnly = true)
    public Libro getOne(String id) {
        return libroRepositorio.getOne(id);
    }
    
    public void validar(Long isbn, String titulo, Integer anio) throws Exception {

        if (isbn == null) {
            throw new Exception("El ISBN del libro no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new Exception("El titulo del libro no puede ser nulo");
        }
        if (anio == null) {
            throw new Exception("El año del libro no puede ser nulo");
        }

    }

}
