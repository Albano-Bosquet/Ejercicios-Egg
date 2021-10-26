package Ejercicio5;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Paises> alfabetico = new Comparator<Paises>() {
        @Override
        public int compare(Paises paises, Paises t1) {
            return paises.getPais().compareTo(t1.getPais());
        }
    };

}
