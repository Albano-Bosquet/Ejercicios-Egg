/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.servicios.AutorServicio;
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
public class RegistroAutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    //Registro de autor
    @GetMapping("/registroAutor")
    public String registroautor() {
        return "registroAutor";
    }

    @PostMapping("/registroAutor")
    public String guardar(ModelMap modelo, @RequestParam String nombre, MultipartFile foto) throws Exception {

        try {
            autorServicio.crear(foto, nombre);
            modelo.put("Exito", "Ha registrado el autor con exito");
            return "registroAutor";
        } catch (Exception e) {
            modelo.put("Error", e.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("foto", foto);
            return "registroAutor";
        }

    }

}
