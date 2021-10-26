package Ejercicio3E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Una compañía de promociones turísticas desea mantener información sobre la
 * infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
 * planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
 * identifican por un nombre, una dirección, una localidad y un gerente encargado
 * del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
 * Alojamientos Extrahoteleros.
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
 * Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
 * estrellas. Las características de las distintas categorías son las siguientes:
 * • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
 * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
 * Habitaciones.
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
 * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
 * Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
 * de las Habitaciones.
 * Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
 * “B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
 * para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
 * limosinas tenga el hotel, más caro será.
 * El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
 * PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
 * restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
 * Donde:
 * Valor agregado por el restaurante:
 * • $10 si la capacidad del restaurante es de menos de 30 personas.
 * • $30 si está entre 30 y 50 personas.
 * • $50 si es mayor de 50.
 * Valor agregado por el gimnasio:
 * • $50 si el tipo del gimnasio es A.
 * • $30 si el tipo del gimnasio es B.
 * Valor agregado por las limosinas:
 * • $15 por la cantidad de limosinas del hotel.
 * En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
 * de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
 * recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
 * como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
 * alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
 * indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
 * posee o no un restaurante dentro de las instalaciones. Para las residencias se
 * indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
 * si posee o no campo deportivo. Realizar un programa en el que se representen
 * todas las relaciones descriptas.
 * Realizar un sistema de consulta que le permite al usuario consultar por diferentes
 * criterios:
 * • todos los alojamientos.
 * • todos los hoteles de más caro a más barato.
 * • todos los campings con restaurante
 * • todos las residencias que tienen descuento.
 */

public class Ejercicio3E {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int decision;

        //Creamos los arraylist para cada tipo de alojamiento
        ArrayList<Hotel4> hotel4s = new ArrayList<>();
        ArrayList<Hotel5> hotel5s = new ArrayList<>();
        ArrayList<Hotel> hotels = new ArrayList<>();
        ArrayList<Camping> campings = new ArrayList<>();
        ArrayList<Residencia> residencias = new ArrayList<>();

        //Creamos los hoteles 4 estrellas
        Hotel4 h41 = new Hotel4("Don Antonio", "Las compuertas 2345", "Lujan", "Antonio", 25, 4, 10, 50d, "A", "Juancito", 25);
        Hotel4 h42 = new Hotel4("Don Jose", "Ayelen 2967", "Lujan", "Ana", 4, 2, 3, 50d, "B", "Masala", 10);
        Hotel4 h43 = new Hotel4("Club Pepito", "Haras de Perdriel lote 21", "Perdriel", "Cristian", 6, 1, 1, 50d, "B", "CristianR", 50);

        //Calculamos los precios de los hoteles
        h41.precio4e();
        h42.precio4e();
        h43.precio4e();

        //Creamos los hoteles 5 estrellas
        Hotel5 h51 = new Hotel5("Prepare", "Peralitos 23", "Chacras", "Luna", 10, 2, 2, 50d, "A", "Luna comida canabica", 20, 3, 1, 1);
        Hotel5 h52 = new Hotel5("Ritalin", "Peralitos 28", "Chacras", "Sandra", 8, 7, 3, 50d, "B", "Sandra panificados", 5, 1, 2, 3);
        Hotel5 h53 = new Hotel5("Porro gratis", "n/a", "n/a", "Albano", 1, 2, 1, 50d, "B", "Unica comida, porro", 5, 1, 1, 10);

        //Calculamos los precios de los hoteles
        h51.precio5e();
        h52.precio5e();
        h53.precio5e();

        //Creamos los campings
        Camping c1 = new Camping("Pensilvania", "Anahi 23", "Cordoba", "Alejandro", true, 300, 30, 5, true);
        Camping c2 = new Camping("Escuelita", "Marte calle 3", "Marte", "Marciano", false, 550, 65, 1, true);
        Camping c3 = new Camping("Relojes", "Saturno calle 2", "Saturno", "Alejandrinho", true, 200, 5, 1, false);

        //Creamos las residencias
        Residencia r1 = new Residencia("Residencia 1", "Playa fonseca 1", "Lujan", "Albano", true, 20, 2, true, true);
        Residencia r2 = new Residencia("Residencia 2", "Playa fonseca 2", "Lujan", "Albano", true, 20, 2, true, true);
        Residencia r3 = new Residencia("Residencia 3", "Playa fonseca 3", "Lujan", "Albano", true, 20, 2, true, true);

        //Agregamos cada alojamiento a su correspondiente arraylist
        hotel4s.add(h41);
        hotel4s.add(h42);
        hotel4s.add(h43);
        hotel5s.add(h51);
        hotel5s.add(h52);
        hotel5s.add(h53);
        campings.add(c1);
        campings.add(c2);
        campings.add(c3);
        residencias.add(r1);
        residencias.add(r2);
        residencias.add(r3);
        hotels.add(h41);
        hotels.add(h42);
        hotels.add(h43);
        hotels.add(h51);
        hotels.add(h52);
        hotels.add(h53);


        //todo
        //Menu interactivo
        do {

            System.out.println();
            System.out.println("Que desea realizar?");
            System.out.println("Visualizar todos los alojamientos (1)");
            System.out.println("Visualizar todos los hoteles del mas caro al mas barato (2)");
            System.out.println("Visualizar los campings con restaurant (3)");
            System.out.println("Visualizar las residencias con campos deportivos (4)");
            System.out.println("Salir (5)");
            decision = leer.nextInt();
            System.out.println();

            switch (decision) {

                case 1:
                    System.out.println("HOTELES 4 ESTRELLAS:");
                    for (int i = 0; i <= (hotel4s.size() - 1); i++) {
                        System.out.println(hotel4s.get(i).getNombre());
                    }
                    System.out.println("HOTELES 5 ESTRELLAS:");
                    for (int i = 0; i <= (hotel5s.size() - 1); i++) {
                        System.out.println(hotel5s.get(i).getNombre());
                    }
                    System.out.println("CAMPINGS:");
                    for (int i = 0; i <= (campings.size() - 1); i++) {
                        System.out.println(campings.get(i).getNombre());
                    }
                    System.out.println("RESIDENCIAS:");
                    for (int i = 0; i <= (residencias.size() - 1); i++) {
                        System.out.println(residencias.get(i).getNombre());
                    }
                    break;

                case 2:

                    System.out.println("HOTELES CON LOS PRECIOS DE MENOR A MAYOR:");
                    Collections.sort(hotels, Comparadores.porPrecio);
                    for (int i = 0; i <= (hotels.size() - 1); i++){
                        System.out.println(hotels.get(i).getNombre() + " con un precio de $" + hotels.get(i).getPrecioHabitaciones());
                    }

                case 3:
                    System.out.println("CAMPINGS CON RESTAURANT:");
                    for (int i = 0; i <= (campings.size() - 1); i++) {
                        if (campings.get(i).isPoseeRestaurant() == true) {
                            System.out.println(campings.get(i).getNombre());
                        }
                    }
                    break;
                case 4:
                    System.out.println("RESIDENCIAS CON CAMPOS DEPORTIVOS:");
                    for (int i = 0; i <= (residencias.size() - 1); i++){
                        if (residencias.get(i).isPoseeCampoDeportivo() == true){
                            System.out.println(residencias.get(i).getNombre());
                        }
                    }
                    break;

            }

        } while (decision != 5);

    }
}
