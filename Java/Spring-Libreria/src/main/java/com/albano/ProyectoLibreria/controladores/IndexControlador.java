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
public class IndexControlador {
    
    //Index
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}
