package Ejercicio3;

import Excepciones.Excepciones;

import java.util.Scanner;

/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
 * dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
 * mostrar el resultado.
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
 * try/catch para las distintas excepciones
 */

public class Ejercicio3 {
    public static void main(String[] args) throws Excepciones {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String n1, n2;
        double n1num = 0, n2num = 0;
        double division;

        System.out.print("Ingrese numero 1: ");
        n1 = leer.next();
        System.out.print("Ingrese numero 2: ");
        n2 = leer.next();

        //Comprobamos que el primer numero es correcto
        try {

            n1num = Double.parseDouble(n1);

        } catch (Exception e) {
            System.out.println("Error al ingreso del primer numero");
        }

        //Comprobamos que el segundo numero es correcto
        try {

            n2num = Double.parseDouble(n2);

        } catch (Exception e) {
            System.out.println("Error al ingreso del segundo numero");
        }

        //Comprobamos si la division se puede realizar
        try {

            if (n1num == 0 || n2num == 0){
                throw new Excepciones("La division no se pudo realizar");
            }

            division = (n1num / n2num);
            System.out.println("La division es " + division);

        } catch (Excepciones e){
            System.out.println(e.getMessage());
        }
    }
}

