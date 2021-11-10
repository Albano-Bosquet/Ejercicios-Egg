/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.entidades.Editorial;
import com.albano.ProyectoLibreria.repositorios.EditorialRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class EditorialesControlador {
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
     //Editoriales
    @GetMapping("/editoriales")
    public String editoriales(ModelMap modelo) {
        List<Editorial> editoriales = editorialRepositorio.findAll();
        modelo.put("editoriales", editoriales);
        return "editoriales";
    }  
    
}
