/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.albano.ProyectoLibreria.servicios.LibroServicio;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class RegistroLibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    //Registro de libro
    @GetMapping("/registroLibro")
    public String registrolibro() {
        return "registroLibro";
    }

//    @PostMapping("/registroLibro")
//    public String registrolibro() {
//        try {
//
//        } catch (Exception e) {
//        }
//    }

}
