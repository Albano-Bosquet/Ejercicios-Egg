package Ejercicio4;

import java.util.Scanner;

public class Rectangulo implements Calculo{

    private double perimetro, area;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    //Setters
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //Getters
    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    //Metodos
    @Override
    public void calculoFormas(double perimetro, double PI, double area) {
        Scanner leer = new Scanner(System.in);
        double base, altura;
        PI = Math.PI;
        System.out.println("Usted calculara el perimetro y el area de un rectangulo:");
        System.out.print("Indique base del rectangulo: ");
        base = leer.nextDouble();
        System.out.print("Indique altura del rectangulo: ");
        altura = leer.nextDouble();
        this.perimetro = base * altura;
        this.area = (base + altura) * 2;

    }

}
