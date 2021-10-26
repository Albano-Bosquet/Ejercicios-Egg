package Ejercicio4E;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombre, apellido, estadoCivil;
    protected int numeroIdentificacion;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, int numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    //Metodos
    public void cambioEstadoCivil(){

        System.out.print("Indique estado civil de " + getNombre() + ": ");
        setEstadoCivil(leer.next());

    }

}
