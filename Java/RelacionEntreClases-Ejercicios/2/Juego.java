package Ejercicio2Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Jugador jug = new Jugador();

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private RevolverDeAgua revolver;
    int cantidadJugadores;
    boolean juegoTerminado = false;
    int contJugadores = 0;

    //Constructores
    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    //Setters
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    //Getters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    //Metodos
    public void llenarJuego(){

        System.out.print("Cuantos jugadores jugaran?: ");
        cantidadJugadores = leer.nextInt();

        //Llenamos el arraylist con los jugadores
        for (int i = 0; i <= (cantidadJugadores - 1); i++){

            System.out.println();
            System.out.print("Ingrese el nombre para el nuevo jugador: ");
            jug.setNombre(leer.next());
            System.out.print("Ingrese el ID para el nuevo jugador: ");
            jug.setID(leer.nextInt());

            jugadores.add(jug);

        }

    }

    public void ronda(){

        while (juegoTerminado == false){

            System.out.println("En la ronda le toca a " + jugadores.get(contJugadores).getNombre() + " con el ID " + jugadores.get(contJugadores).getID());
            jug.disparo();

        }

    }

}
