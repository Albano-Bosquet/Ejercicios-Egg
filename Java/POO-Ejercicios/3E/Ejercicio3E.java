/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3E;

import java.util.Scanner;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, las operaciones que se
 * podrán realizar son las siguientes:
 *
 * • Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 *
 * • Método tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que
 * 0.
 *
 * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 *
 * • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
 * las 2 posibles soluciones.
 *
 * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
 * única raíz. Es en el caso en que se tenga una única solución posible.
 *
 * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
 * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
 * los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrará un mensaje. Nota:
 * Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
 * delante de -b
 */
public class Ejercicio3E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Raices r1 = new Raices();
        Scanner leer = new Scanner(System.in);

        //Definimos los valores A, B y C
        System.out.println("Ingrese el valor A");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese el valor B");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese el valor C");
        r1.setC(leer.nextInt());

        //Llamamos a los metodos a traves de un menu
        String decision;
        do {

            System.out.println("");
            System.out.println("Que desea realizar?");
            System.out.println("");
            System.out.println("Sacar la discriminante (1)");
            System.out.println("Indicar si tiene dos soluciones (2)");
            System.out.println("Indica si tiene una sola solucion (3)");
            System.out.println("Muestra la solucion en caso de ser una sola (4)");
            System.out.println("Muestra las soluciones en caso de ser dos (5)");
            System.out.println("Salir del programa (S)");
            System.out.println("");
            decision = leer.next().toUpperCase();
            switch (decision) {
                case "1":
                    r1.getDiscriminante();
                    break;
                case "2":
                    r1.tieneRaices();
                    break;
                case "3":
                case "4":
                case "5":
            }

        } while (!(decision.equals("S")));

    }

}
