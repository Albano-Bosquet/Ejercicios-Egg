package Ejercicio2;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double resolucion;
    protected boolean sintonizadorTDT = false;

    String decision;

    //Constructores
    public Televisor() {
    }

    public Televisor(Double precio, Double peso, String color, String consumo, double resolucion, boolean sintonizadorTDT) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Setters
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Getters
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Metodos
    public void crearTV() {

        crearElectrodomestico();
        System.out.print("Indica tamanio del TV en pulgadas: ");
        resolucion = leer.nextDouble();
        System.out.print("El TV tiene sintonizador TDT? S/N: ");
        decision = leer.next().toUpperCase();
        if (decision.equals("S")) {
            sintonizadorTDT = true;
        }

        if (resolucion > 40) {
            precio = precio + ((precio / 100) * 30);
        }
        if (sintonizadorTDT == true){
            precio = precio + 500;
        }

    }

    @Override
    public String toString() {
        return "Televisor:" +
                "\n Precio: " + precio +
                "\n Peso: " + peso +
                "\n Color: " + color +
                "\n Consumo: " + consumo +
                "\n Tamanio: " + resolucion +
                "\n Sintonizador TDT: " + sintonizadorTDT;
    }
}
