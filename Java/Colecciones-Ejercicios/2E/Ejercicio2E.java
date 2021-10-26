package Ejercicio2E;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
 * tendrá como atributos el nombre y discoConMasVentas.
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
 * objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
 * cada cantante y su disco con más ventas por pantalla.
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
 * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
 * cambios.
 */

public class Ejercicio2E {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();

        int decision;
        String cantanteEliminar;

        System.out.println("Ingrese 5 cantantes y sus discos mas conocidos:");
        for (int i = 0; i <= 4; i++) {

            CantanteFamoso c = new CantanteFamoso();
            c.agregarFamoso();
            cantantes.add(c);

        }

        System.out.println();
        System.out.println("Los 5 cantantes con sus discos mas conocidos son:");
        for (int i = 0; i <= 4; i++) {

            System.out.println("Cantante: " + cantantes.get(i).getCantante() + ", Disco mas conocido: " + cantantes.get(i).getDiscoConMasVentas());

        }

        do {
            System.out.println();
            System.out.println("Que desea realizar?");
            System.out.println("Agregar otro cantante mas (1)");
            System.out.println("Mostrar todos los cantantes (2)");
            System.out.println("Eliminar un cantante de la lista (3)");
            System.out.println("Salir del programa (4)");
            decision = leer.nextInt();

            switch (decision){

                case 1:

                    CantanteFamoso c = new CantanteFamoso();
                    c.agregarFamoso();
                    cantantes.add(c);
                    break;

                case 2:

                    System.out.println("La lista hasta el momento es la siguiente:");
                    for (int i = 0; i <= (cantantes.size() - 1); i++) {

                        System.out.println("Cantante: " + cantantes.get(i).getCantante() + ", Disco mas conocido: " + cantantes.get(i).getDiscoConMasVentas());

                    }
                    break;

                case 3:

                    System.out.print("Indique cantante que desea eliminar: ");
                    cantanteEliminar = leer.next();
                    for (int i = 0; i <= (cantantes.size() - 1); i++){

                        if(cantanteEliminar.equals(cantantes.get(i).getCantante())){

                            cantantes.remove(i);

                        }

                    }
                    break;

            }


        } while (decision != 4);

        System.out.println("La lista de los cantantes final quedo en:");
        for (int i = 0; i <= (cantantes.size() - 1); i++) {

            System.out.println("Cantante: " + cantantes.get(i).getCantante() + ", Disco mas conocido: " + cantantes.get(i).getDiscoConMasVentas());

        }

    }
}
