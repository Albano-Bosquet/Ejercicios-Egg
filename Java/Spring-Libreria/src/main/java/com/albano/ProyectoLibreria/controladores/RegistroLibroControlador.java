/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.entidades.Autor;
import com.albano.ProyectoLibreria.entidades.Editorial;
import com.albano.ProyectoLibreria.repositorios.EditorialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.albano.ProyectoLibreria.servicios.LibroServicio;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.albano.ProyectoLibreria.repositorios.AutorRepositorio;
import java.util.List;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class RegistroLibroControlador {

    @Autowired
    private LibroServicio libroServicio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    //Registro de libro
    @GetMapping("/registroLibro")
    public String registrolibro(ModelMap modelo) {
        List<Autor> autores = autorRepositorio.findAll();
        modelo.put("autores", autores);
        List<Editorial> editoriales = editorialRepositorio.findAll();
        modelo.put("editoriales", editoriales);
        return "registroLibro";
    }

    @PostMapping("/registroLibro")
    public String registrolibro(ModelMap modelo, MultipartFile foto, @RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Autor autor, @RequestParam Editorial editorial) {
        try {
            libroServicio.crear(foto, isbn, titulo, anio, autor, editorial);
            modelo.put("Exito", "Ha registrado el libro con exito");
            return "registroLibro";
        } catch (Exception e) {
            modelo.put("Error", e.getMessage());
            modelo.put("foto", foto);
            modelo.put("isbn", isbn);
            modelo.put("titulo", titulo);
            modelo.put("anio", anio);
            modelo.put("autor", autor);
            modelo.put("editorial", editorial);
            return "registroLibro";
        }
    }

}
