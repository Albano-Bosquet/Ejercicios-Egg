/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1E;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Cancion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String titulo;
    private String autor;

    //Constructores
    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //Metodos
    public void cancion() {

        System.out.println("Ingrese titulo de la cancion");
        titulo = leer.next();
        System.out.println("Ingrese autor de la cancion");
        autor = leer.next();

    }

    @Override
    public String toString() {
        return "El titulo de la cancion es " + titulo + " y es de " + autor;
    }

}
