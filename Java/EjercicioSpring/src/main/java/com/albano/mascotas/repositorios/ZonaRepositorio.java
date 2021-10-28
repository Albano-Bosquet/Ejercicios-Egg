/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.repositorios;

import com.albano.mascotas.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author blackstrack
 */

@Repository
public interface ZonaRepositorio extends JpaRepository<Zona, String>{
    
    
    
}
