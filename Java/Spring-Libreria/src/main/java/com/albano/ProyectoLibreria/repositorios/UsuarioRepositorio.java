/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.repositorios;

import com.albano.ProyectoLibreria.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author blackstrack
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
    
    @Query("SELECT u FROM Usuario u WHERE u.id = :id")
    public Usuario buscarPorID(@Param("id") String id);
    
    @Query("SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    public Usuario buscarPorNombre(@Param("nombre") String nombre);
    
    @Query("SELECT u FROM Usuario u WHERE u.mail = :mail")
    public Usuario buscarPorMail(@Param("mail") String mail);
    
}
