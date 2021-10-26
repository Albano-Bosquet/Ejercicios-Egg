package Ejercicio3E;

import java.util.Scanner;

public class Hotel4 extends Hotel{

    protected String gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    //Constructores
    public Hotel4() {
    }

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, Double precioHabitaciones, String gimnasio, String nombreRestaurant, int capacidadRestaurant) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    //Setters
    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    //Getters
    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    //Metodos
    public void crearHotel4(){

        //Cargamos todos los datos
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

    }

    public void precio4e(){

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

    }

}
