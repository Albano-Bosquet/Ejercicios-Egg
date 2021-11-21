/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.controladores;

import com.albano.ProyectoLibreria.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author blackstrack
 */
@Controller
@RequestMapping("/")
public class LoginUsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    //Login de usuario
    @GetMapping("/loginUsuario")
    public String logueousuario(@RequestParam(required = false) String error, ModelMap modelo) {
        if (error != null) {
            modelo.put("Error", "Usuario o clave incorrectos");
        }
        return "loginUsuario";
    }

    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
    @GetMapping("/inicio")
    public String inicio(){
        return "inicio";
    }

    
    
}
