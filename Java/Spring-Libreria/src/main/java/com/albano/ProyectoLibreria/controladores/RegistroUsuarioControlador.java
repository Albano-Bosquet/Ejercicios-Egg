/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.servicios.UsuarioServicio;
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

public class RegistroUsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    //Registro de usuario
    @GetMapping("/registroUsuario")
    public String registrousuario() {
        return "registroUsuario";
    }

    @PostMapping("/registroUsuario")
    public String guardar(ModelMap modelo, @RequestParam String nombre, MultipartFile foto, String clave, String mail, String clave2) throws Exception {

        try {
            usuarioServicio.crear(foto, nombre, clave, mail, clave2);
            modelo.put("Exito", "Ha sido registrado exitosamente");
            return "registroUsuario";
        } catch (Exception e) {
            modelo.put("Error", e.getMessage());
            modelo.put("foto", foto);
            modelo.put("nombre", nombre);
            modelo.put("clave", clave);
            modelo.put("mail", mail);
            modelo.put("clave2", clave2);
            return "registroUsuario";
        }

    }

}
