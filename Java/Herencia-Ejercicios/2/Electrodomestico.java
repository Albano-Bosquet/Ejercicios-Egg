package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double precio = 1000d, peso;
    protected String color, consumo;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, String consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    //Setters
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    //Getters
    public Double getPrecio() {
        return precio;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    //Metodos
    public void comprobarConsumoEnergetico() {

        boolean bool = false;

        for (ConsumoEnergeticoEnum aux : ConsumoEnergeticoEnum.values()) {
            if (consumo.equals(aux.toString())) {
                bool = true;
            }
        }

        if (bool == false) {
            consumo = "F";
        }

    }

    public void comprobarColor(){

        boolean bool = false;

        for (ColorEnum aux : ColorEnum.values()){
            if(color.equals(aux.toString())){
                bool = true;
            }
        }

        if(bool == false){
            color = "BLANCO";
        }

    }

    public void crearElectrodomestico(){

        System.out.print("Indique el peso del electrodomestico: ");
        peso = leer.nextDouble();
        System.out.print("Indique el color del electrodomestico(Blanco, Negro, Rojo, Azul, Gris): ");
        color = leer.next().toUpperCase();
        System.out.print("Indique consumo del electrodomestico(A, B, C, D, E, F): ");
        consumo = leer.next().toUpperCase();
        comprobarConsumoEnergetico();
        comprobarColor();
        precioFinal();

    }

    public void precioFinal(){

        switch (consumo){
            case "A":
                precio = precio + 1000;
                break;
            case "B":
                precio = precio + 800;
                break;
            case "C":
                precio = precio + 600;
                break;
            case "D":
                precio = precio + 500;
                break;
            case "E":
                precio = precio + 300;
                break;
            case "F":
                precio = precio + 100;
                break;
        }

        if(peso > 0 && peso < 20){
            precio = precio + 100;
        } else if (peso > 19 && peso < 50){
            precio = precio + 500;
        } else if (peso > 49 && peso < 80){
            precio = precio + 800;
        } else if (peso >= 80){
            precio = precio + 1000;
        }

    }

}
