/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.repositorios;

import com.albano.mascotas.entidades.Voto;
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
public interface VotoRepositorio extends JpaRepository<Voto, String>{
    
    @Query("SELECT v FROM Voto v WHERE v.mascota1.id = :id ORDER BY v.fecha DESC")
    public List<Voto> buscarVotosPropios(@Param("id") String id);
    
    @Query("SELECT v FROM Voto v WHERE v.mascota2.id = :id ORDER BY v.fecha DESC")
    public List<Voto> buscarVotosRecibidos(@Param("id") String id);
    
}
