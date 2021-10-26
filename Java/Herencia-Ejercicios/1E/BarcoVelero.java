package Ejercicio1E;

import java.time.LocalDate;
import java.util.Scanner;

public class BarcoVelero extends Barco{

    Scanner leer = new Scanner(System.in);

    protected int numeroMastiles;

    //Constructores
    public BarcoVelero() {
    }

    public BarcoVelero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    //Setters
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    //Getters
    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    //Metodos
    public void crearVelero(){

        System.out.print("Indique matricula del barco: ");
        matricula = leer.next();
        System.out.print("Indique eslora del barco: ");
        eslora = leer.nextInt();
        System.out.print("Indique anio de fabricacion del barco: ");
        anioFabricacion = leer.nextInt();
        System.out.print("Indique numero de mastiles del velero: ");
        numeroMastiles = leer.nextInt();

    }

    @Override
    public String toString() {
        return "DATOS BARCO:" +
                "\n Matricula: " + matricula +
                "\n Eslora: " + eslora + "m" +
                "\n Año de fabricacion: " + anioFabricacion +
                "\n Numero de mastiles: " + numeroMastiles;
    }
}
