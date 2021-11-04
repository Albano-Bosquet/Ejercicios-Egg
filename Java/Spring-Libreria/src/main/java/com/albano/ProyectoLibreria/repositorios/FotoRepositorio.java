/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.repositorios;

import com.albano.ProyectoLibreria.entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author blackstrack
 */
@Repository
public interface FotoRepositorio extends JpaRepository<Foto, String>{
    
    @Query("SELECT f FROM Foto f WHERE f.id = :id")
    public Foto buscarPorID(@Param("id") String id);
    
}
