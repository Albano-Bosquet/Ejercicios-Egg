/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 */
public class Ejemplo_Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Definimos una fecha
        Date fecha = new Date();
        String DATE_FORMAT = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        System.out.println(sdf.format(fecha));

        //Muestra la fecha actual
        Date fecha2 = new Date();
        System.out.println(fecha2);

        //Muestra la fecha sin hora
        LocalDate fecha3 = LocalDate.of(2021, 8, 21);
        System.out.println(fecha3);
        
        //Compara fechas
        if(fecha.before(fecha2)){
            System.out.println("Hola");
        } else {
            System.out.println("Chau");
        }
        
        if(fecha.after(fecha2)){
            System.out.println("Hola");
        } else {
            System.out.println("Chau");
        }

    }

}
