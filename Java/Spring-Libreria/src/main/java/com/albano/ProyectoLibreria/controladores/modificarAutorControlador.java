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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class modificarAutorControlador {
    
    @Autowired
    private AutorServicio autorServicio;
    
    //Modificar Autor
    @GetMapping("/modificarAutor/{id}")
    public String modificarAutor(@PathVariable String id, ModelMap modelo) {
        modelo.put("autor", autorServicio.getOne(id));
        return "modificarAutor";
    }
    
    @GetMapping("/altaAutor/{id}")
    public String altaAutor(@PathVariable String id){
        try {
            autorServicio.alta(id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/bajaAutor/{id}")
    public String bajaAutor(@PathVariable String id){
        try {
            autorServicio.baja(id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/modifAutor/{id}")
    public String modificarAutor(ModelMap modelo, @PathVariable String id, @RequestParam String nombre, MultipartFile foto){
        try {
            autorServicio.modificar(foto, nombre, id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/autores";
        }
    }
    
    @GetMapping("/eliminarAutor/{id}")
    public String eliminarAutor(@PathVariable String id, ModelMap modelo){
        try {
            autorServicio.eliminar(id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/autores";
        }
    }
    
}
