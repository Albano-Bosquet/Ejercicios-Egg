package Ejercicio3E;

import java.util.Comparator;

public class Hotel5 extends Hotel4{

    private int cantidadSalonesDeConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    //Constructores
    public Hotel5() {
    }

    public Hotel5(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, Double precioHabitaciones, String gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantidadSalonesDeConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, gimnasio, nombreRestaurant, capacidadRestaurant);
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    //Setters
    public void setCantidadSalonesDeConferencia(int cantidadSalonesDeConferencia) {
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    //Getters
    public int getCantidadSalonesDeConferencia() {
        return cantidadSalonesDeConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    //Metodos
    public void crearHotel5(){

        System.out.print("Indique nombre del hotel: ");
        nombre = leer.next();
        System.out.print("Indique direccion del hotel: ");
        direccion = leer.next();
        System.out.print("Indique localidad del hotel: ");
        localidad = leer.next();
        System.out.print("Indique gerente del hotel: ");
        gerente = leer.next();
        System.out.print("Indique cantidad de habitaciones: ");
        cantidadHabitaciones = leer.nextInt();
        System.out.print("Indique numero de camas por habitacion: ");
        numeroCamas = leer.nextInt();
        System.out.print("Indique cantidad de pisos: ");
        cantidadPisos = leer.nextInt();
        do{
            System.out.print("Indique clasificacion de gimnasio (A, B): ");
            gimnasio = leer.next().toUpperCase();
            if(!(gimnasio.equals("A")) && (!(gimnasio.equals("B")))){
                System.out.println("Error, intente nuevamente");
            }
        } while (!(gimnasio.equals("A")) && (!(gimnasio.equals("B"))));
        System.out.print("Indique nombre del restaurant: ");
        nombreRestaurant = leer.next();
        System.out.print("Indique capacidad del restaurant: ");
        capacidadRestaurant = leer.nextInt();
        System.out.print("Indique cantidad de salones de conferencia: ");
        cantidadSalonesDeConferencia = leer.nextInt();
        System.out.print("Indique cantidad de suites: ");
        cantidadSuites = leer.nextInt();
        System.out.print("Indique cantidad de limosinas: ");
        cantidadLimosinas = leer.nextInt();

    }

    public void precio5e(){

        //Calculamos el precio de la habitacion
        //Plus
        precioHabitaciones = precioHabitaciones + (cantidadHabitaciones * numeroCamas);

        //Restaurante
        if(capacidadRestaurant < 30){
            precioHabitaciones = precioHabitaciones + 10;
        } else if (capacidadRestaurant > 29 && capacidadRestaurant < 51){
            precioHabitaciones = precioHabitaciones + 30;
        } else if (capacidadRestaurant > 50){
            precioHabitaciones = precioHabitaciones + 50;
        }

        //Gimnasio
        switch (gimnasio){
            case "A":
                precioHabitaciones = precioHabitaciones + 50;
                break;
            case "B":
                precioHabitaciones = precioHabitaciones + 30;
                break;
        }

        //Limosinas
        precioHabitaciones = precioHabitaciones + (15 * cantidadLimosinas);

    }
}
