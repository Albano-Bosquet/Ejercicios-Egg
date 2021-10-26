package Ejercicio1E;

import java.time.LocalDate;
import java.util.Scanner;

public class BarcoYate extends Barco{

    Scanner leer = new Scanner(System.in);

    protected int potenciaYate;
    protected int numeroCamarotes;

    //Constructores
    public BarcoYate() {
    }

    public BarcoYate(String matricula, double eslora, int anioFabricacion, int potenciaYate, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaYate = potenciaYate;
        this.numeroCamarotes = numeroCamarotes;
    }

    //Setters
    public void setPotenciaYate(int potenciaYate) {
        this.potenciaYate = potenciaYate;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    //Getters
    public int getPotenciaYate() {
        return potenciaYate;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    //Metodos
    public void crearYate(){

        System.out.print("Indique matricula del barco: ");
        matricula = leer.next();
        System.out.print("Indique eslora del barco: ");
        eslora = leer.nextInt();
        System.out.print("Indique anio de fabricacion del barco: ");
        anioFabricacion = leer.nextInt();
        System.out.print("Indique potencia del yate: ");
        potenciaYate = leer.nextInt();
        System.out.print("Indique numero de camarotes: ");
        numeroCamarotes = leer.nextInt();

    }

    @Override
    public String toString() {
        return "DATOS BARCO:" +
                "\n Matricula: " + matricula +
                "\n Eslora: " + eslora + "m" +
                "\n Año de fabricacion: " + anioFabricacion +
                "\n Potencia de motor: " + potenciaYate +
                "\n Numero de camarotes: " + numeroCamarotes;
    }
}
