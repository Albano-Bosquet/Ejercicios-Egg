package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
 * entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
 * clase debe contener un método toString() que retorne el número de carta y el palo. La
 * baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 * Las operaciones que podrá realizar la baraja son:
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
 * haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
 * número de cartas. En caso de que haya menos cartas que las pedidas, no
 * devolveremos nada, pero debemos indicárselo al usuario.
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
 * carta y luego se llama al método, este no mostrara esa primera carta.
 */




public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int decision;

        OperacionesCarta o = new OperacionesCarta();
        o.crearMazo();

        //Menu interactivo
        do {

            System.out.println();
            System.out.println("Que desea realizar?");
            System.out.println("Barajar el mazo (1)");
            System.out.println("Mostrar siguiente carta en el mazo (2)");
            System.out.println("Indicar la cantidad de cartas que aun se pueden repartir (3)");
            System.out.println("Dar cartas (4)");
            System.out.println("Mostrar aquellas cartas que ya hayan salido (5)");
            System.out.println("Mostrar baraja actual (6)");
            System.out.println("Salir (7)");
            System.out.print("Su decision: ");
            decision = leer.nextInt();

            switch (decision) {
                case 1:
                    o.barajar();
                    break;
                case 2:
                    o.siguienteCarta();
                    break;
                case 3:
                    o.cartasDisponibles();
                    break;
                case 4:
                    o.darCartas();
                    break;
                case 5:
                    o.cartasMonton();
                    break;
                case 6:
                    o.mostrarBaraja();
                    break;
            }

        } while (decision != 7);

    }
}
