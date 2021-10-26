package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<String> perros = new ArrayList<>();
    String perro;
    boolean bool;

    public void agregarPerro() {

        String decision;

        do {
            System.out.println("Agregue un nuevo perro");
            perros.add(leer.next());
            System.out.println("Desea agregar otro? S/N");
            decision = leer.next().toUpperCase();
        } while (decision.equals("S"));

        System.out.println("La lista de perros es: " + perros);

    }

    public void eliminarPerro() {

        System.out.println("Que perro desea eliminar?: " + perros);
        perro = leer.next();


        for (int i = 0; i <= (perros.size() - 1); i++) {

            if (perros.get(i).equals(perro)) {

                perros.remove(i);
                bool = true;

            }
        }

        if(bool == false){

            System.out.println("No se ha encontrado ese perro en la lista");
            System.out.println("La lista de perros es: " + perros);

        } else {

            System.out.println("La nueva lista con el perro eliminado es: " + perros);

        }

    }
}

