/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo
 * con la clase Date. En este ejercicio deberemos instanciar en el main, una
 * fecha usando la clase Date, para esto vamos a tener que crear 3 variables,
 * dia, mes y anio que se le pedirán al usuario para poner el constructor del
 * objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y
 * mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede
 * conseguir instanciando un objeto Date con constructor vacío.
 *
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 *
 * Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        int anio1, anio2, comp;

        //Se dan valores para las variables
        System.out.println("Ingrese un dia: ");
        dia = leer.nextInt();
        System.out.println("Ingrese un mes: ");
        mes = leer.nextInt();
        mes = (mes - 1);
        System.out.println("Ingrese un anio: ");
        anio = leer.nextInt();
        anio = (anio - 1900);

        //Se introducen los valores para el anio
        Date fecha = new Date(anio, mes, dia);

        //Se define otra fecha con la fecha actual
        Date fechaActual = new Date();

        //Se le da formato a la fecha
        String formato = "yyyy/MM/dd";
        SimpleDateFormat form = new SimpleDateFormat(formato);

        //Se muestran las fechas con los formatos
        System.out.println("La fecha ingresada es " + form.format(fecha));
        System.out.println("La fecha actual es " + (form.format(fechaActual)));
        anio1 = (fecha.getYear() + 1900);
        anio2 = (fechaActual.getYear() + 1900);
        System.out.println("Anio 1: " + anio1 + ", anio 2: " + anio2);

        //Se comparan ambos anios
        if (anio1 < anio2) {
            comp = anio2 - anio1;
            System.out.println(comp + " anios hay entre la fecha ingresada y la fecha actual");

        }
        
        if (anio1 > anio2) {
            comp = anio1 - anio2;
            System.out.println(comp + " anios hay entre la fecha actual y la fecha ingresada");
        }
        
        if (anio1 == anio2){
            System.out.println("Las fechas tienen el mismo anio");
        }

    }
}
