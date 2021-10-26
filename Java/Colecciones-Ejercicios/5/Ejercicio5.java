package Ejercicio5;

import java.util.*;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 * repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
 * guardará el país en el conjunto y después se le preguntará al usuario si quiere
 * guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
 * guardados en el conjunto.
 * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 * recordar como se ordena un conjunto.
 * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
 * país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
 * en el conjunto se le informará al usuario.
 */

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Paises> paisesListArray = new ArrayList<>();
        HashSet<String > paisesListHash = new HashSet<>();
        ArrayList<String> paisesListArrayFinal = new ArrayList<>();
        String decision;

        do{

            Paises p = new Paises();
            p.agregarPais();
            paisesListArray.add(p);

            System.out.println("Desea agregar otro pais? S/N");
            decision = leer.next().toUpperCase();

        } while (decision.equals("S"));

        //Mostramos la lista
        System.out.println();
        System.out.println("LA LISTA DE LOS PAISES SIN SACAR LOS DUPLICADOS DESORDENADA ES:");
        for (int i = 0; i <= (paisesListArray.size() - 1); i++){

            System.out.println(paisesListArray.get(i).getPais());

        }

        //Ordenamos la lista y la mostramos
        paisesListArray.sort(Comparadores.alfabetico);

        System.out.println();
        System.out.println("LA LISTA DE LOS PAISES SIN SACAR LOS DUPLICADOS PERO ORDENADA ES:");
        for (int i = 0; i <= (paisesListArray.size() - 1); i++){

            System.out.println(paisesListArray.get(i).getPais());

        }

        //Agregamos los paises al HashList
        for (int i = 0; i <= (paisesListArray.size() - 1); i++){

            paisesListHash.add(paisesListArray.get(i).getPais());

        }

        System.out.println();
        System.out.println("LA LISTA DE LOS PAISES HASHEADOS:");
        for (String temp : paisesListHash){

            System.out.println(temp);
            paisesListArrayFinal.add(temp);

        }

        //Ordenamos la lista final
        Collections.sort(paisesListArrayFinal);

        System.out.println();
        System.out.println("LA LISTA DE LOS PAISES HASHEADOS Y ORDENADOS:");
        for (int i = 0; i <= (paisesListArrayFinal.size() - 1); i++){

            System.out.println(paisesListArrayFinal.get(i));

        }

        //Eliminamos un pais a eleccion
        String paisEliminar;
        boolean bool = false;
        System.out.println();
        System.out.println("Que pais desea eliminar?");
        paisEliminar = leer.next().toUpperCase();

        for (int i = 0; i <= (paisesListArrayFinal.size() - 1); i++){

            if (paisEliminar.equals(paisesListArrayFinal.get(i))){

                paisesListArrayFinal.remove(i);
                bool = true;

            }

        }

        if (bool == false){

            System.out.println("El pais no ha sido encontrado");

        }

        if (bool == true) {
            System.out.println("LA LISTA DE LOS PAISES HASHEADOS Y ORDENADOS CON EL PAIS ELIMINADO:");
            for (int i = 0; i <= (paisesListArrayFinal.size() - 1); i++) {

                System.out.println(paisesListArrayFinal.get(i));

            }
        }
    }
}
