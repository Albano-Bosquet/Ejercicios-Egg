package Ejercicio2E;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {

    Scanner leer = new Scanner(System.in);

    private int cont = 0;
    private ArrayList<String> asientosArrayList = new ArrayList<>();

    private String[][] asientos = new String[8][6];
    private Pelicula peli;
    private double precioEntrada;

    //Constructores
    public Sala() {
    }

    public Sala(String[][] asientos, Pelicula peli, double precioEntrada) {
        this.asientos = asientos;
        this.peli = peli;
        this.precioEntrada = precioEntrada;
    }

    //Setters
    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    //Getters
    public String[][] getAsientos() {
        return asientos;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    //Metodos
    public void crearSala(){

        //Rellenamos un ArrayList con los asientos
        for (EnumFila aux1 : EnumFila.values()){
            for (EnumColumna aux2 : EnumColumna.values()){

                asientosArrayList.add(aux1.getCode() + aux2.toString());

            }
        }

        //Rellenamos un Array con los valores anteriormente cargados en el ArrayList
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 5; j++){

                asientos[i][j] = asientosArrayList.get(cont);
                cont++;

            }
        }

        //Volvemos el contador que usamos antes a 0 por si lo queremos utilizar nuevamente mas adelante
        cont = 0;

        //Mostramos la sala
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 5; j++){

                System.out.print("|" + asientos[i][j] + "|");

            }
            System.out.println();
        }

        Pelicula pel = new Pelicula();
        pel.crearPelicula();
        peli = pel;
        System.out.print("Indique precio de la entrada para la sala: ");
        precioEntrada = leer.nextInt();

    }

}
