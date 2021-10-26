package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String titulo;
    private String director;
    private Integer duracion;
    public ArrayList<String> peliculasMayores = new ArrayList<>();
    public String peliculaFinal;

    //Constructores
    public Pelicula() {
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    //Metodos
    public void crearPelicula(){

        System.out.println("Introduce el nombre de la pelicula");
        titulo = leer.next();
        System.out.println("Ingrese director de la pelicula");
        director = leer.next();
        System.out.println("Ingrese duracion de la pelicula");
        duracion = leer.nextInt();

    }
}
