package Ejercicio4E;

import java.util.Scanner;

public class Profesor extends Empleado{

    protected String departamento;

    //Constructores
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String estadoCivil, int numeroIdentificacion, int anioIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellido, estadoCivil, numeroIdentificacion, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    //Setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Getters
    public String getDepartamento() {
        return departamento;
    }

    //Metodos
    public void cambioDepartamento(){

        System.out.print("Indique nuevo departamento de " + getNombre() + ": ");
        setDepartamento(leer.next());

    }

    //ToString
    @Override
    public String toString() {
        return "PROFESOR:" +
                "\n Anio de incorporacion: " + anioIncorporacion +
                "\n Numero de despacho: " + numeroDespacho +
                "\n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Estado civil: " + estadoCivil +
                "\n Numero de identificacion: " + numeroIdentificacion +
                "\n Departamento: " + departamento;
    }

}
