/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.entidades.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.albano.ProyectoLibreria.repositorios.AutorRepositorio;
import org.springframework.ui.ModelMap;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class AutoresControlador {
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    //Autores
    @GetMapping("/autores")
    public String autores(ModelMap modelo) {
        List<Autor> autores = autorRepositorio.findAll();
        modelo.put("autores", autores);
        return "autores";
    }
    
}
