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
import org.springframework.web.bind.annotation.PathVariable;
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
public class modificarEditorialControlador {
    
    @Autowired
    private EditorialServicio editorialServicio;
    
    //Modificar Editorial
    @GetMapping("/modificarEditorial/{id}")
    public String modificarEditorial(@PathVariable String id, ModelMap modelo) {
        modelo.put("editorial", editorialServicio.getOne(id));
        return "modificarEditorial";
    }
    
    @GetMapping("/altaEditorial/{id}")
    public String altaEditorial(@PathVariable String id){
        try {
            editorialServicio.alta(id);
            return "redirect:/editoriales";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/bajaEditorial/{id}")
    public String bajaEditorial(@PathVariable String id){
        try {
            editorialServicio.baja(id);
            return "redirect:/editoriales";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/modifEditorial/{id}")
    public String modificarEditorial(ModelMap modelo, @PathVariable String id, @RequestParam String nombre, MultipartFile foto){
        try {
            editorialServicio.modificar(foto, nombre, id);
            return "redirect:/editoriales";
        } catch (Exception e) {
            return "redirect:/editoriales";
        }
    }
    
    @GetMapping("/eliminarEditorial/{id}")
    public String eliminarEditorial(@PathVariable String id, ModelMap modelo){
        try {
            editorialServicio.eliminar(id);
            return "redirect:/editoriales";
        } catch (Exception e) {
            return "redirect:/editoriales";
        }
    }
    
}
