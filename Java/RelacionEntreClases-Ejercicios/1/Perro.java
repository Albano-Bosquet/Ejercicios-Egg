package Ejercicio1;

import java.util.Scanner;

public class Perro {

    Scanner leer = new Scanner(System.in);

    private String nombre, tamanio;
    private Integer edad;
    private Raza raza;
    private boolean perroAdoptado = false;

    //Constructores
    public Perro() {
    }

    public Perro(String nombre, String raza, String tamanio, Integer edad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.edad = edad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setPerroAdoptado(boolean perroAdoptado) {
        this.perroAdoptado = perroAdoptado;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean isPerroAdoptado() {
        return perroAdoptado;
    }

    //Metodos
    public void crearPerro(){

        System.out.println();
        System.out.print("Indique nombre del perro: ");
        nombre = leer.next();
        System.out.print("Indique tamanio del perro: ");
        tamanio = leer.next();
        System.out.print("Indique edad del perro: ");
        edad = leer.nextInt();

    }

    @Override
    public String toString() {
        return "(PERRO:" + " Nombre: " + nombre + ", tamanio: " + tamanio + ", edad: " + edad + ", raza: " + raza + ")";
    }
}
