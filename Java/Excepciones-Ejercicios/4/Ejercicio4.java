package Ejercicio4;

import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La
 * computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
 * que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
 * computadora debe decirle al usuario si el número que tiene que adivinar es mayor
 * o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
 * indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
 * adivinar el número. Si el usuario introduce algo que no es un número, se debe
 * controlar esa excepción e indicarlo por pantalla. En este último caso también se
 * debe contar el carácter fallido como un intento
 */

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num, numComp, intentos = 0;

        num = (int) (Math.random() * 501);
        System.out.println("El numero es " + num);

        do{

            Numero n = new Numero();
            n.comprobarNumero();
            numComp = n.numUser;

            //Mensajes en caso de atinar o fallar
            if (n.numUser != num){
                intentos++;
                System.out.println("Es incorrecto, usted ha intentado " + intentos + " veces");
            }
            if (n.numUser == num){
                System.out.println("Has acertado!");
            }

        } while (numComp != num);

    }
}
