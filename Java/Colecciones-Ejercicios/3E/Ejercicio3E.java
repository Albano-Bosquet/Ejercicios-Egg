package Ejercicio3E;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
 * datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
 * información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
 * el título del libro, autor, número de ejemplares y número de ejemplares prestados.
 * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
 * creados.
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
 * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
 * se le pregunta al usuario si quiere crear otro Libro o no.
 * La clase Librería contendrá además los siguientes métodos:
 * • Constructor por defecto.
 * • Constructor con parámetros.
 * • Métodos Setters/getters
 * • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
 * busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
 * método. El método se incrementa de a uno, como un carrito de compras, el
 * atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
 * cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
 * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
 * podido realizar la operación y false en caso contrario.
 * • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
 * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
 * El método decrementa de a uno, como un carrito de compras, el atributo
 * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
 * vez que se produzca la devolución de un libro. No se podrán devolver libros
 * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
 * realizar la operación y false en caso contrario.
 * • Método toString para mostrar los datos de los libros.
 */

public class Ejercicio3E {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        HashSet<Libro> libros = new HashSet<Libro>();

        int decision;

        do{
            System.out.println("Que desea hacer?");
            System.out.println("Agregar un libro (1)");
            System.out.println("Salir del menu (2)");
            decision = leer.nextInt();
            if (decision == 1){

                Libro l = new Libro();
                l.agregarLibro();
                libros.add(l);

            }

        }while (decision != 2);

    }
}
