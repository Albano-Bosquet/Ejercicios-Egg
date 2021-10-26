package Ejercicio2;

import Excepciones.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    Scanner leer = new Scanner(System.in);

    double n1, n2, n3;
    ArrayList<Double> notas = new ArrayList<>();
    int posicion;

    public void cargarNotar(){

        System.out.print("Indique nota 1: ");
        n1 = leer.nextDouble();
        System.out.print("Indique nota 2: ");
        n2 = leer.nextDouble();
        System.out.print("Indique nota 3: ");
        n3 = leer.nextDouble();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);

        System.out.print("Que nota le gustaria ver?: ");
        posicion = leer.nextInt() - 1;

        try {
            if (posicion != 0 && posicion != 1 && posicion != 2){
                throw new Excepciones("La nota se encuentra fuera de rango");
            }
            System.out.println("La nota de la posicion " + (posicion + 1) + " es " + notas.get(posicion));
        } catch (Excepciones e){
            System.out.println(e.getMessage());
        }


    }

}
