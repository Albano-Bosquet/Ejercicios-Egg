package Ejercicio1E;

import java.time.LocalDate;
import java.util.Scanner;

public class BarcoMotor extends Barco{

    Scanner leer = new Scanner(System.in);

    protected int potenciaMotor;

    //Constructores
    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaMotor) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    //Setters
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    //Getters
    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    //Metodos
    public void crearMotor(){

        System.out.print("Indique matricula del barco: ");
        matricula = leer.next();
        System.out.print("Indique eslora del barco: ");
        eslora = leer.nextInt();
        System.out.print("Indique anio de fabricacion del barco: ");
        anioFabricacion = leer.nextInt();
        System.out.print("Indique potencia del barco a motor: ");
        potenciaMotor = leer.nextInt();

    }

    @Override
    public String toString() {
        return "DATOS BARCO:" +
                "\n Matricula: " + matricula +
                "\n Eslora: " + eslora + "m" +
                "\n Año de fabricacion: " + anioFabricacion +
                "\n Potencia de motor: " + potenciaMotor;
    }
}
