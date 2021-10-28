/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.servicios;

import com.albano.mascotas.entidades.Mascota;
import com.albano.mascotas.entidades.Voto;
import com.albano.mascotas.repositorios.MascotaRepositorio;
import com.albano.mascotas.repositorios.VotoRepositorio;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author blackstrack
 */
@Service
public class VotoServicio {

    @Autowired
    private MascotaRepositorio mascotaRepositorio;
    
    @Autowired
    private VotoRepositorio votoRepositorio;

    @Transactional
    public void votar(String idUsuario, String idMascota1, String idMascota2) throws Exception {

        //Comprobamos que la votacion sea a otra mascota
        if (!(idMascota1.equals(idMascota2))){
            
            throw new Exception("No puede votarse a si mismo");
            
        }

        //Le asignamos una fecha al voto
        Voto voto = new Voto();
        voto.setFecha(new Date());

        //Comprobamos si la mascota existe
        Optional<Mascota> respuesta = mascotaRepositorio.findById(idMascota1);

        if (respuesta.isPresent()) {

            Mascota mascota1 = respuesta.get();

            //Verificamos si el usuario es duenio de la mascota 1
            if (mascota1.getUsuario().getId().equals(idUsuario)) {

                voto.setMascota1(mascota1);

            } else {

                throw new Exception("No tiene permisos para hacer la operacion");

            }

        } else {

            throw new Exception("No se ha encontrado la mascota solicitada");

        }

        //Comprobamos si la mascota existe
        Optional<Mascota> respuesta2 = mascotaRepositorio.findById(idMascota2);

        if (respuesta2.isPresent()) {

            Mascota mascota2 = respuesta2.get();
            voto.setMascota2(mascota2);

        } else {

            throw new Exception("No se ha encontrado la mascota solicitada");

        }
        
        //Guardamos los valores en la DB
        votoRepositorio.save(voto);

    }
    
    @Transactional
    public void responder(String idVoto) throws Exception {
        
        //Comprobamos si el voto existe
        Optional<Voto> respuesta = votoRepositorio.findById(idVoto);
        
        if (respuesta.isPresent()) {
            
            Voto voto = respuesta.get();
            voto.setRespuesta(new Date());
            
            //Guardamos los valores en la DB
            votoRepositorio.save(voto);
            
        } else {
            
            throw new Exception("No existe el voto solicitado");
            
        }
        
    }

}
