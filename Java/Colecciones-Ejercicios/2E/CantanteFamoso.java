package Ejercicio2E;

import java.util.Scanner;

public class CantanteFamoso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String cantante, discoConMasVentas;

    //Constructores
    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String discoConMasVentas) {
        this.cantante = cantante;
        this.discoConMasVentas = discoConMasVentas;
    }

    //Setters
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    //Getters
    public String getCantante() {
        return cantante;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }


    //Metodos
    public void agregarFamoso(){

        System.out.print("Indique nombre del famoso: ");
        cantante = leer.next();
        System.out.print("Indique su disco mas conocido: ");
        discoConMasVentas = leer.next();

    }

}
