package Ejercicio1;

import java.util.Scanner;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
 * dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
 * que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
 * mostrar desde la clase Persona, la información del Perro y de la Persona.
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombrePerro;

        Persona p1 = new Persona();
        p1.crearPersona();
        Persona p2 = new Persona();
        p2.crearPersona();
        Persona p3 = new Persona();
        p3.crearPersona();
        Persona p4 = new Persona();
        p4.crearPersona();
        Persona p5 = new Persona();
        p5.crearPersona();

        Perro pe1 = new Perro();
        pe1.crearPerro();
        Perro pe2 = new Perro();
        pe2.crearPerro();
        Perro pe3 = new Perro();
        pe3.crearPerro();
        Perro pe4 = new Perro();
        pe4.crearPerro();
        Perro pe5 = new Perro();
        pe5.crearPerro();

        System.out.println();
        System.out.println("Que perro le gustaria adoptar para " + p1.getNombre() + "?");
        if(pe1.isPerroAdoptado() == false){
            System.out.println(pe1.getNombre());
        }
        if(pe2.isPerroAdoptado() == false){
            System.out.println(pe2.getNombre());
        }
        if(pe3.isPerroAdoptado() == false){
            System.out.println(pe3.getNombre());
        }
        if(pe4.isPerroAdoptado() == false){
            System.out.println(pe4.getNombre());
        }
        if(pe5.isPerroAdoptado() == false){
            System.out.println(pe5.getNombre());
        }
        nombrePerro = leer.next();

        if(nombrePerro.equals(pe1.getNombre())){
            p1.setPerro(pe1);
            pe1.setPerroAdoptado(true);
        } else if(nombrePerro.equals(pe2.getNombre())){
            p1.setPerro(pe2);
            pe2.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe3.getNombre())){
            p1.setPerro(pe3);
            pe3.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe4.getNombre())){
            p1.setPerro(pe4);
            pe4.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe5.getNombre())){
            p1.setPerro(pe5);
            pe5.setPerroAdoptado(true);
        }

        System.out.println();
        System.out.println("Que perro le gustaria adoptar para " + p2.getNombre() + "?");
        if(pe1.isPerroAdoptado() == false){
            System.out.println(pe1.getNombre());
        }
        if(pe2.isPerroAdoptado() == false){
            System.out.println(pe2.getNombre());
        }
        if(pe3.isPerroAdoptado() == false){
            System.out.println(pe3.getNombre());
        }
        if(pe4.isPerroAdoptado() == false){
            System.out.println(pe4.getNombre());
        }
        if(pe5.isPerroAdoptado() == false){
            System.out.println(pe5.getNombre());
        }
        nombrePerro = leer.next();

        if(nombrePerro.equals(pe1.getNombre())){
            p2.setPerro(pe1);
            pe1.setPerroAdoptado(true);
        } else if(nombrePerro.equals(pe2.getNombre())){
            p2.setPerro(pe2);
            pe2.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe3.getNombre())){
            p2.setPerro(pe3);
            pe3.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe4.getNombre())){
            p2.setPerro(pe4);
            pe4.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe5.getNombre())){
            p2.setPerro(pe5);
            pe5.setPerroAdoptado(true);
        }

        System.out.println();
        System.out.println("Que perro le gustaria adoptar para " + p3.getNombre() + "?");
        if(pe1.isPerroAdoptado() == false){
            System.out.println(pe1.getNombre());
        }
        if(pe2.isPerroAdoptado() == false){
            System.out.println(pe2.getNombre());
        }
        if(pe3.isPerroAdoptado() == false){
            System.out.println(pe3.getNombre());
        }
        if(pe4.isPerroAdoptado() == false){
            System.out.println(pe4.getNombre());
        }
        if(pe5.isPerroAdoptado() == false){
            System.out.println(pe5.getNombre());
        }
        nombrePerro = leer.next();

        if(nombrePerro.equals(pe1.getNombre())){
            p3.setPerro(pe1);
            pe1.setPerroAdoptado(true);
        } else if(nombrePerro.equals(pe2.getNombre())){
            p3.setPerro(pe2);
            pe2.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe3.getNombre())){
            p3.setPerro(pe3);
            pe3.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe4.getNombre())){
            p3.setPerro(pe4);
            pe4.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe5.getNombre())){
            p3.setPerro(pe5);
            pe5.setPerroAdoptado(true);
        }

        System.out.println();
        System.out.println("Que perro le gustaria adoptar para " + p4.getNombre() + "?");
        if(pe1.isPerroAdoptado() == false){
            System.out.println(pe1.getNombre());
        }
        if(pe2.isPerroAdoptado() == false){
            System.out.println(pe2.getNombre());
        }
        if(pe3.isPerroAdoptado() == false){
            System.out.println(pe3.getNombre());
        }
        if(pe4.isPerroAdoptado() == false){
            System.out.println(pe4.getNombre());
        }
        if(pe5.isPerroAdoptado() == false){
            System.out.println(pe5.getNombre());
        }
        nombrePerro = leer.next();

        if(nombrePerro.equals(pe1.getNombre())){
            p4.setPerro(pe1);
            pe1.setPerroAdoptado(true);
        } else if(nombrePerro.equals(pe2.getNombre())){
            p4.setPerro(pe2);
            pe2.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe3.getNombre())){
            p4.setPerro(pe3);
            pe3.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe4.getNombre())){
            p4.setPerro(pe4);
            pe4.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe5.getNombre())){
            p4.setPerro(pe5);
            pe5.setPerroAdoptado(true);
        }

        System.out.println();
        System.out.println("Que perro le gustaria adoptar para " + p5.getNombre() + "?");
        if(pe1.isPerroAdoptado() == false){
            System.out.println(pe1.getNombre());
        }
        if(pe2.isPerroAdoptado() == false){
            System.out.println(pe2.getNombre());
        }
        if(pe3.isPerroAdoptado() == false){
            System.out.println(pe3.getNombre());
        }
        if(pe4.isPerroAdoptado() == false){
            System.out.println(pe4.getNombre());
        }
        if(pe5.isPerroAdoptado() == false){
            System.out.println(pe5.getNombre());
        }
        nombrePerro = leer.next();

        if(nombrePerro.equals(pe1.getNombre())){
            p5.setPerro(pe1);
            pe1.setPerroAdoptado(true);
        } else if(nombrePerro.equals(pe2.getNombre())){
            p5.setPerro(pe2);
            pe2.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe3.getNombre())){
            p5.setPerro(pe3);
            pe3.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe4.getNombre())){
            p5.setPerro(pe4);
            pe4.setPerroAdoptado(true);
        } else if (nombrePerro.equals(pe5.getNombre())){
            p5.setPerro(pe5);
            pe5.setPerroAdoptado(true);
        }

        System.out.println();
        System.out.println("Los datos de " + p1.getNombre() + " son:");
        p1.mostrarDatos();
        System.out.println();
        System.out.println("Los datos de " + p2.getNombre() + " son:");
        p2.mostrarDatos();
        System.out.println();
        System.out.println("Los datos de " + p3.getNombre() + " son:");
        p3.mostrarDatos();
        System.out.println();
        System.out.println("Los datos de " + p4.getNombre() + " son:");
        p4.mostrarDatos();
        System.out.println();
        System.out.println("Los datos de " + p5.getNombre() + " son:");
        p5.mostrarDatos();

    }
}
