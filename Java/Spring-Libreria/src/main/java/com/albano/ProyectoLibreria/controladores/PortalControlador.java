/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    
    @GetMapping("/registroAutor")
    public String registroautor() {
        return "registroAutor.html";
    }
    
    @GetMapping("/registroEditorial")
    public String registroeditorial() {
        return "registroEditorial.html";
    }
    
    @GetMapping("/registroLibro")
    public String registrolibro() {
        return "registroLibro.html";
    }
    
    @GetMapping("/registroUsuario")
    public String registrousuario() {
        return "registroUsuario.html";
    }
    
    @GetMapping("/loginUsuario")
    public String logueousuario() {
        return "loginUsuario.html";
    }
    
}
