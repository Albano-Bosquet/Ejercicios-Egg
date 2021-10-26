/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Persona {
    
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private LocalDate nacimiento;
    private int edad;
    private DateTimeFormatter form;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }
    
    //Metodos
    public DateTimeFormatter crearPersona(){
        
        int anio, mes, dia;
        
        //Rellena los datos de la persona
        System.out.println("Indique el nombre de la persona");
        nombre = leer.next();
        System.out.println("Indique dia de nacimiento");
        dia = leer.nextInt();
        System.out.println("Indique mes de nacimiento");
        mes = leer.nextInt();
        System.out.println("Indique anio de nacimiento");
        anio = leer.nextInt();
        
        //Rellena la fecha de nacimiento
        nacimiento = LocalDate.of(anio, mes, dia);
        
        //Muestra los datos con formato
        form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return form;
        
    }
    
    public int calcularEdad(){
        
        LocalDate fecha = LocalDate.now();
        Period periodo = Period.between(nacimiento, fecha);
        edad = periodo.getYears();
        return edad;
        
    }
    
    public void menorQue(){
        
        int edad2;
        System.out.println("Ingrese la edad de otra persona");
        edad2 = leer.nextInt();
        if (edad2 > edad){
            System.out.println("La segunda persona ingresada es mayor que " + nombre);
        } else {
            System.out.println("La segunda persona ingresada es menor que " + nombre);
        }
        
    }
    
    public void mostrarPersona(){
        
        System.out.println("La fecha de nacimiento de " + nombre + " es " + nacimiento.format(form) + " y tiene " + edad + " anios de edad");
        
    }
    
}
