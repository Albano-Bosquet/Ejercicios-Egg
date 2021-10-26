package Ejercicio3E;

import java.util.Objects;
import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String titulo, autor;
    private int numeroDeEjemplares;

    //Constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDeEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    //Comparators
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(numeroDeEjemplares, libro.numeroDeEjemplares);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, numeroDeEjemplares);
    }

    //Metodos
    public void agregarLibro(){

        System.out.print("Indique titulo del libro: ");
        titulo = leer.next();
        System.out.print("Indique autor del libro: ");
        autor = leer.next();
        System.out.print("Indique numero de ejemplares del libro: ");
        numeroDeEjemplares = leer.nextInt();

    }

    public void prestamo(){



    }

}
