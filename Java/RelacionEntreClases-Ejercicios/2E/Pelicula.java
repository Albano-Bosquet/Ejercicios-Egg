package Ejercicio2E;

import java.util.Scanner;

public class Pelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String titulo, director;
    private double duracion;
    private int edadMinima;

    //Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    //Metodos
    public void crearPelicula(){

        System.out.println();
        System.out.print("Indique nombre de la pelicula: ");
        titulo = leer.next();
        System.out.print("Indique director de la pelicula: ");
        director = leer.next();
        System.out.print("Indique duracion de la pelicula: ");
        duracion = leer.nextDouble();
        System.out.print("Indique edad minima para la pelicula: ");
        edadMinima = leer.nextInt();

    }

}
