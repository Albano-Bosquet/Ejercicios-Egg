/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.servicios;

import com.albano.mascotas.entidades.Foto;
import com.albano.mascotas.repositorios.FotoRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author blackstrack
 */
@Service
public class FotoServicio {

    @Autowired
    private FotoRepositorio fotoRepositorio;

    @Transactional
    public Foto guardar(MultipartFile archivo) throws Exception {

        if (archivo != null) {

            //Asignamos los valores
            Foto foto = new Foto();
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());

            //Guardamos los valores en la DB
            return fotoRepositorio.save(foto);

        } else {

            return null;

        }
        

    }
    
    @Transactional
    public Foto actualizar(String idFoto, MultipartFile archivo) throws Exception{
         
        if (archivo != null) {

            //Asignamos los valores
            Foto foto = new Foto();
            
            if (idFoto != null) {
                
                //Comprobamos que la foto exista
                Optional<Foto> respuesta = fotoRepositorio.findById(idFoto);
                
                if (respuesta.isPresent()) {
                    
                    foto = respuesta.get();
                    
                } else {
                    
                    throw new Exception("Error al obtener la foto");
                    
                }
                
            } else {
                
                throw new Exception("Error al obtener el ID de la foto");
                
            }
            
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());

            //Guardamos los valores en la DB
            return fotoRepositorio.save(foto);

        } else {

            return null;

        }
        
    }

}
