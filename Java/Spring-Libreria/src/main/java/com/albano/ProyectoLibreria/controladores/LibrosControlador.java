/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.albano.ProyectoLibreria.entidades.Libro;
import com.albano.ProyectoLibreria.repositorios.LibroRepositorio;
import com.albano.ProyectoLibreria.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class LibrosControlador {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private LibroServicio libroServicio;
    
    //Libros
    @GetMapping("/libros")
    public String libros(ModelMap modelo) {
        List<Libro> libros = libroRepositorio.findAll();
        modelo.put("libros", libros);
        return "libros";
    }
    
}
