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
    public void crear(MultipartFile archivo, Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) throws Exception {

        //Realizamos las validaciones
        validar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);

        //Guardamos los valores
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
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
    public void modificar(MultipartFile archivo, Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial, String id) throws Exception {

        //Realizamos las validaciones
        validar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);

        //Buscamos el libro
        Libro libro = new Libro();
        libro = libroRepositorio.buscarPorID(id);

        //Modificamos los valores
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
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
        Libro libro = new Libro();
        libro = libroRepositorio.buscarPorID(id);

        //Modificamos los valores
        libro.setAlta(false);

        //Cargamos en la DB
        libroRepositorio.save(libro);

    }

    @Transactional
    public void eliminar(String id) throws Exception {

        //Buscamos el libro
        Libro libro = new Libro();
        libro = libroRepositorio.buscarPorID(id);

        //Cargamos en la DB
        libroRepositorio.delete(libro);

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

    public void validar(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) throws Exception {

        if (isbn == null) {
            throw new Exception("El ISBN del libro no puede ser nulo");
        }
        if (titulo == null) {
            throw new Exception("El titulo del libro no puede ser nulo");
        }
        if (anio == null) {
            throw new Exception("El año del libro no puede ser nulo");
        }
        if (ejemplares == null) {
            throw new Exception("Los ejemplares de libros no pueden ser nulos");
        }
        if (ejemplaresPrestados == null) {
            throw new Exception("Los ejemplares prestados de libros no pueden ser nulos");
        }
        if (ejemplaresRestantes == null) {
            throw new Exception("Los ejemplares restantes de libros no pueden ser nulos");
        }
        if (autor == null) {
            throw new Exception("El autor del libro no puede ser nulo");
        }
        if (editorial == null) {
            throw new Exception("La editorial del libro no puede ser nula");
        }

    }

}
