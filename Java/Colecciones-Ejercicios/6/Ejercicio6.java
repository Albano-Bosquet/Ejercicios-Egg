package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se necesita
 * que la aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el main. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su precio
 * (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
 * el precio. Realizar un menú para lograr todas las acciones previamente
 * mencionadas.
 */

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashMap<String, Integer> producto = new HashMap<>();

        String prod, prodRemove, prodReemplazar;
        Integer precio, decisionMenu, precioNuevo;

        do {
            //Menu interactivo
            System.out.println();
            System.out.println("Que desea realizar?");
            System.out.println("Agregar un producto (1)");
            System.out.println("Eliminar un producto de la lista (2)");
            System.out.println("Modificar un producto de la lista (3)");
            System.out.println("Mostrar los productos de la lista (4)");
            System.out.println("Salir (5)");
            decisionMenu = leer.nextInt();

            switch (decisionMenu) {

                case 1:

                    System.out.print("Ingrese nombre del producto: ");
                    prod = leer.next();
                    System.out.print("Ingrese precio del producto: ");
                    precio = leer.nextInt();

                    //Ingresamos el producto en el map
                    producto.put(prod, precio);
                    break;

                case 2:

                    //Mostramos la lista de los articulos
                    System.out.println("Los elementos de la lista para eliminar son:");
                    for (Map.Entry<String, Integer> aux : producto.entrySet()) {

                        String key = aux.getKey();
                        Integer value = aux.getValue();

                        System.out.println("PRODUCTO: " + key + ", PRECIO: $" + value);

                    }

                    //Removemos el articulo
                    System.out.print("Indique producto a remover: ");
                    prodRemove = leer.next();
                    producto.remove(prodRemove);

                    //Mostramos la lista nueva
                    System.out.println("La lista quedo de la siguiente manera:");
                    for (Map.Entry<String, Integer> aux : producto.entrySet()) {

                        String key = aux.getKey();
                        Integer value = aux.getValue();

                        System.out.println("PRODUCTO: " + key + ", PRECIO: $" + value);

                    }
                    break;

                case 3:

                    //Mostramos la lista de los articulos
                    System.out.println("Los elementos de la lista para reemplazar son:");
                    for (Map.Entry<String, Integer> aux : producto.entrySet()) {

                        String key = aux.getKey();
                        Integer value = aux.getValue();

                        System.out.println("PRODUCTO: " + key + ", PRECIO: $" + value);

                    }

                    //Indicamos el producto que queremos reemplazar
                    System.out.print("Indique el producto al que desea cambiar su precio: ");
                    prodReemplazar = leer.next();
                    System.out.print("Indique nuevo precio: ");
                    precioNuevo = leer.nextInt();

                    //Reemplazamos el precio del producto
                    producto.replace(prodReemplazar, precioNuevo);

                    //Mostramos la lista nueva
                    for (Map.Entry<String, Integer> aux : producto.entrySet()) {

                        String key = aux.getKey();
                        Integer value = aux.getValue();

                        System.out.println("PRODUCTO: " + key + ", PRECIO: $" + value);

                    }
                    break;

                case 4:

                    //Mostramos los productos
                    System.out.println("Los productos son:");
                    for (Map.Entry<String, Integer> aux : producto.entrySet()) {

                        String key = aux.getKey();
                        Integer value = aux.getValue();

                        System.out.println("PRODUCTO: " + key + ", PRECIO: $" + value);

                    }
                    break;

            }

        } while (decisionMenu != 5);
    }
}
