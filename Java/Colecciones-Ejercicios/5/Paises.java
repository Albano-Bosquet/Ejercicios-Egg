package Ejercicio5;

import java.util.Objects;
import java.util.Scanner;

public class Paises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String pais;

    //Constructores
    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

   //Setters
    public void setPais(String pais) {
        this.pais = pais;
    }

    //Getters
    public String getPais() {
        return pais;
    }

    //Hashes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paises paises = (Paises) o;
        return Objects.equals(pais, paises.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais);
    }

    //Metodos
    public void agregarPais(){
        System.out.println("Ingresa un pais");
        pais = leer.next().toUpperCase();
    }

}
