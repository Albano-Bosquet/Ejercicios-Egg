/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.entidades.Autor;
import com.albano.ProyectoLibreria.entidades.Editorial;
import com.albano.ProyectoLibreria.entidades.Foto;
import com.albano.ProyectoLibreria.servicios.LibroServicio;
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
public class modificarLibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    
    //Modificar Libro
    @GetMapping("/modificarLibro/{id}")
    public String modificarLibro(@PathVariable String id, ModelMap modelo) {
        modelo.put("libro", libroServicio.getOne(id));
        return "modificarLibro";
    }
    
    @GetMapping("/altaLibro/{id}")
    public String altaLibro(@PathVariable String id){
        try {
            libroServicio.alta(id);
            return "redirect:/libros";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/bajaLibro/{id}")
    public String bajaLibro(@PathVariable String id){
        try {
            libroServicio.baja(id);
            return "redirect:/libros";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    
    @GetMapping("/modifLibro/{id}")
    public String modificarLibro(ModelMap modelo, @PathVariable String id, @RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer anio, MultipartFile foto){
        try {
            libroServicio.modificar(foto, isbn, titulo, anio, id);
            return "redirect:/libros";
        } catch (Exception e) {
            return "redirect:/libros";
        }
    }
    
    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable String id, ModelMap modelo){
        try {
            libroServicio.eliminar(id);
            return "redirect:/libros";
        } catch (Exception e) {
            return "redirect:/libros";
        }
    }
    
}
