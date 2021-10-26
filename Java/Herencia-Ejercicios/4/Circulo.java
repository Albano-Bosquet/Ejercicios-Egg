package Ejercicio4;

import java.util.Scanner;

public class Circulo implements Calculo{

    private double perimetro, area;

    //Constructores
    public Circulo() {
    }

    public Circulo(double perimetro, double area) {
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
        double radio;
        PI = Math.PI;
        System.out.println("Usted calculara el perimetro y el area de un circulo:");
        System.out.print("Indique radio del circulo: ");
        radio = leer.nextDouble();
        this.perimetro = PI * (radio * 2);
        this.area = PI * (Math.pow(radio, 2));

    }

}
