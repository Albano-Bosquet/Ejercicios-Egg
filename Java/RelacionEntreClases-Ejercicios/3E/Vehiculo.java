package Ejercicio3E;

import java.util.Scanner;

public class Vehiculo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Datos pedidos por el programa
    private String marca, modelo, color, tipo;
    private int anio, numeroDeMotor, chasis;

    //Datos extra


    //Constructores
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String tipo, int anio, int numeroDeMotor, int chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNumeroDeMotor(int numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnio() {
        return anio;
    }

    public int getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public int getChasis() {
        return chasis;
    }

    //Metodos
    public void crearVehiculo() {

        System.out.print("Ingrese marca del vehiculo: ");
        marca = leer.next();
        System.out.print("Ingrese modelo del vehiculo: ");
        modelo = leer.next();
        System.out.print("Ingrese color del vehiculo: ");
        color = leer.next();
        System.out.print("Ingrese tipo de vehiculo: ");
        tipo = leer.next();
        System.out.print("Ingrese año del vehiculo: ");
        anio = leer.nextInt();
        System.out.print("Ingrese numero de motor: ");
        numeroDeMotor = leer.nextInt();
        System.out.print("Ingrese numero de chasis: ");
        chasis = leer.nextInt();

    }

    @Override
    public String toString() {
        return "VEHICULO: \n Marca: " + marca +
                "\n Modelo: " + modelo +
                "\n Color: " + color +
                "\n Tipo: " + tipo +
                "\n Año: " + anio +
                "\n Numero de motor: " + numeroDeMotor +
                "\n Numero de chasis: " + chasis;
    }
}
