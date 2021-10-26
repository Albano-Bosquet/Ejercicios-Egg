package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
 * película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación:
 * 18
 * En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
 * usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
 * si quiere crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
 * en pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
 * en pantalla.
 * • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String decision;
        int decision1;
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        do{

            Pelicula p = new Pelicula();
            p.crearPelicula();
            peliculas.add(p);

            System.out.println("Desea agregar otra pelicula? S/N");
            decision = leer.next().toUpperCase();

        } while (decision.equals("S"));

        do{
            System.out.println("");
            System.out.println("Que desea realizar?:");
            System.out.println("Mostrar en pantalla todas las peliculas (1)");
            System.out.println("Mostrar en pantalla todas las peliculas con una duracion mayor a 1h (2)");
            System.out.println("Ordenar las peliculas de acuerdo a su duracion de mayor a menor y mostrarlo (3)");
            System.out.println("Ordenar las peliculas de acuerdo a su duracion de menor a mayor y mostrarlo (4)");
            System.out.println("Ordenar las peliculas por titulo alfabeticamente y mostrarlo (5)");
            System.out.println("Ordenar las peliculas por director alfabeticamente y mostrarlo (6)");
            System.out.println("Salir (7)");
            System.out.print("Decision: ");
            decision1 = leer.nextInt();
            System.out.println("");

            switch (decision1){

                case 1:
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                    }
                    break;

                case 2:
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        if(peliculas.get(i).getDuracion() > 1){

                            System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                        }

                    }
                    break;

                case 3:
                    Collections.sort(peliculas, Comparadores.porDuracionAsc);
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                    }
                    break;

                case 4:
                    Collections.sort(peliculas, Comparadores.porDuracionDesc);
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                    }
                    break;

                case 5:
                    Collections.sort(peliculas, Comparadores.porTitulo);
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                    }
                    break;
                case 6:
                    Collections.sort(peliculas, Comparadores.porDirector);
                    System.out.println("----------PELICULAS----------");
                    for (int i = 0; i <= (peliculas.size() - 1); i++){

                        System.out.println("Titulo: " + peliculas.get(i).getTitulo() + ", Director: " + peliculas.get(i).getDirector() + ", Duracion: " + peliculas.get(i).getDuracion());

                    }
                    break;
            }
        }while (decision1 != 7);
    }
}
