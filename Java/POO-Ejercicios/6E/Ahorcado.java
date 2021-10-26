/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6E;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Ahorcado {

    Scanner leer = new Scanner(System.in);

    //Variables
    private String[] palabra;
    private int cantidad;
    private int jugadas;
    private int longitudPalabra;
    private String palabraIngresada;
    private int intentos;
    private boolean confirmacion;

    //Constructores
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidad, int jugadas) {
        this.palabra = palabra;
        this.cantidad = cantidad;
        this.jugadas = jugadas;
    }

    //Setters
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    //Getters
    public String[] getPalabra() {
        return palabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getJugadas() {
        return jugadas;
    }

    //Metodos
    public String crearJuego() {

        int cont1 = 0, cont2 = 1;
        System.out.println("Ingrese una palabra");
        palabraIngresada = leer.next();
        longitudPalabra = palabraIngresada.length();
        palabra = new String[palabraIngresada.length()];
        System.out.println("Ingrese la cantidad de jugadas que tendra el jugador");
        jugadas = leer.nextInt();
        intentos = jugadas;

        for (int i = 0; i <= (longitudPalabra - 1); i++) {

            palabra[i] = palabraIngresada.substring(cont1, cont2);
            cont1++;
            cont2++;

        }

        return palabraIngresada;

    }

    public void longitud() {

        System.out.println("La longitud de la palabra es de " + longitudPalabra + " caracteres");

    }

    public void buscarLetra() {

        boolean confirm = false;
        String letra;
        int contJugadas = 0;
        boolean sino = false;
        String[] resolucion = new String[longitudPalabra];
        int cont2 = 0;

        //Muestra en pantalla la palabra a buscar
        System.out.println("");
        System.out.println("PALABRA:");
        for (int i = 0; i <= (longitudPalabra) - 1; i++) {

            resolucion[i] = "_ ";
            System.out.print(resolucion[i]);

        }
        System.out.println("");

        do {

            //Ingresamos una letra a buscar
            System.out.println("Ingrese una letra a buscar");
            letra = leer.next();

            for (int i = 0; i <= (longitudPalabra - 1); i++) {

                if (palabra[i].equals(letra)) {

                    sino = true;

                }

            }

            //Nos fijamos si la letra esta en la palabra, y en caso de que este, rellena la linea correspondiente con
            //la letra a ingresada
            if (sino == true) {

                System.out.println("La letra se encuentra en la palabra");
                sino = false;
                for (int i = 0; i <= (longitudPalabra - 1); i++) {

                    if (letra.equals(palabra[i])) {

                        resolucion[i] = letra;

                    }

                }

                System.out.println("");
                System.out.println("PALABRA:");
                for (int i = 0; i <= (longitudPalabra - 1); i++) {

                    System.out.print(resolucion[i]);

                }
                System.out.println("");

            } else {

                System.out.println("La letra no se encuentra en la palabra");

                System.out.println("");
                System.out.println("PALABRA:");
                for (int i = 0; i <= (longitudPalabra - 1); i++) {

                    System.out.print(resolucion[i]);

                }
                System.out.println("");

                contJugadas++;
                intentos();

            }

            //Cierra el programa en caso de que hayamos descubierto toda la palabra
            for (int i = 0; i <= (longitudPalabra) - 1; i++) {

                if (cont2 == 0) {
                    if (resolucion[i].equals(palabra[i])) {
                        
                        confirm = true;

                    } else {
                        
                        confirm = false;
                        cont2++;
                        
                    }

                }
            }
            cont2 = 0;

        } while (jugadas != contJugadas && confirm != true);
        confirmacion = confirm;

    }

    public void intentos() {

        intentos = (intentos - 1);
        System.out.println("Le quedan " + intentos + " intentos");

    }

    public void juego() {
        
        System.out.println("");
        if (confirmacion == true){
            
            System.out.println("Ha ganado el juego!");
            
        } else {
            
            System.out.println("Que lastima, se ha quedado sin intentos");
            
        }

    }

}
