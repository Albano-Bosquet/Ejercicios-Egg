package Ejercicio3E;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel hotel, Hotel t1) {
            return hotel.getPrecioHabitaciones().compareTo(t1.getPrecioHabitaciones());
        }
    };

}
