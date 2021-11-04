/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.repositorios;

import com.albano.ProyectoLibreria.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author blackstrack
 */
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String>{
    
    @Query("SELECT l FROM Libro l WHERE l.id = :id")
    public Libro buscarPorID(@Param("id") String id);
    
    @Query("SELECT l FROM Libro l WHERE l.isbn = :isbn")
    public Libro buscarPorISBN(@Param("isbn") Long isbn);
    
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarPorTitulo(@Param("titulo") String titulo);
    
    @Query("SELECT l FROM Libro l WHERE l.anio = :anio")
    public Libro buscarPorAnio(@Param("anio") Integer anio);
    
    @Query("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombreeditorial")
    public List<Libro> buscarPorEditorial(@Param("nombreeditorial") String editorial);
    
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombreautor")
    public List<Libro> buscarPorAutor(@Param("nombreautor") String autor);    
}
