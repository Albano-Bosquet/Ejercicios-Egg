package Ejercicio1E;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
 * y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
 * introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
 * programa mostrará por pantalla el número de valores que se han leído, su suma y su
 * media (promedio).
 */

public class Ejercicio1E {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int num;

        do{

            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            if(num != -99){

                numeros.add(num);

            }

        } while (num != -99);

        System.out.println("La lista de numeros queda de la siguiente manera:");
        for (int i = 0; i <= (numeros.size() - 1); i++){

            System.out.println(numeros.get(i));

        }

    }
}
