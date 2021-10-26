package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<String> perros = new ArrayList<>();

    public void agregarPerro(){

        String decision;

        do{
            System.out.println("Agregue un nuevo perro");
            perros.add(leer.next());
            System.out.println("Desea agregar otro? S/N");
            decision = leer.next().toUpperCase();
        } while (decision.equals("S"));

        System.out.println(perros);

    }
}
