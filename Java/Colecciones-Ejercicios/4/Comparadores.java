package Ejercicio4;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> porDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula, Pelicula t1) {
            return t1.getDuracion().compareTo(pelicula.getDuracion());
        }
    };

    public static Comparator<Pelicula> porDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula, Pelicula t1) {
            return pelicula.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> porTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula, Pelicula t1) {
            return pelicula.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> porDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula, Pelicula t1) {
            return pelicula.getDirector().compareTo(t1.getDirector());
        }
    };

}
