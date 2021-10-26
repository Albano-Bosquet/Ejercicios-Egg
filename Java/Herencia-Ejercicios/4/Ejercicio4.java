package Ejercicio4;

import java.util.ArrayList;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
 * de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
 * calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
 * llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
 * perímetro y el valor de PI como constante.
 * Desarrollar el ejercicio para que las formas implementen los métodos de la
 * interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
 * formas y se mostrará el resultado final.
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

public class Ejercicio4 {
    public static void main(String[] args) {

        Circulo c = new Circulo();
        c.calculoFormas(0, 0, 0);
        Rectangulo r = new Rectangulo();
        r.calculoFormas(0, 0, 0);
        System.out.println("RECTANGULO:");
        System.out.println("AREA DEL RECTANGULO: " + r.getArea());
        System.out.println("PERIMETRO DEL RECTANGULO: " + r.getPerimetro());
        System.out.println("CIRCULO:");
        System.out.println("AREA DEL CIRCULO: " + c.getArea());
        System.out.println("PERIMETRO DEL CIRCULO: " + c.getPerimetro());

    }
}
