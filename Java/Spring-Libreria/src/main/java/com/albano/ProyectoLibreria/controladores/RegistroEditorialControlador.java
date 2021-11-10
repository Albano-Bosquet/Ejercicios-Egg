/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.servicios.EditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class RegistroEditorialControlador {

    @Autowired
    private EditorialServicio editorialServicio;

    //Registro de editorial
    @GetMapping("/registroEditorial")
    public String registroeditorial() {
        return "registroEditorial";
    }

    @PostMapping("/registroEditorial")
    public String registroeditorial(ModelMap modelo, MultipartFile foto, @RequestParam String nombre) {
        try {
            editorialServicio.crear(foto, nombre);
            modelo.put("Exito", "Ha registrado la editorial con exito");
            return "registroEditorial";
        } catch (Exception e) {
            modelo.put("Error", e.getMessage());
            modelo.put("foto", foto);
            modelo.put("nombre", nombre);
            return "registroEditorial";
        }
    }

}
