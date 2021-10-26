package Ejercicio1E;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombre;
    protected int documento;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected String posicionAmarre;
    protected Barco barco;

    int diaAlquiler, mesAlquiler, anioAlquiler, diaDevolucion, mesDevolucion, anioDevolucion, numeroDias;
    String barcoSeleccion;

    double precioFinal;

    //Constructores
    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    @Override
    public String toString() {
        return "ALQUILER:" +
                "\n Nombre: " + nombre +
                "\n Documento: " + documento +
                "\n Posicion de amarre: " + posicionAmarre +
                "\n Tipo de barco: " + barcoSeleccion +
                "\n" + barco +
                "\n Numero de dias: " + numeroDias +
                "\n Precio final: $" + precioFinal;
    }

    //Metodos
    public void crearAlquiler() {

        //Agregamos nombre y documento
        System.out.print("Indique nombre del usuario: ");
        nombre = leer.next();
        System.out.print("Indique documento del usuario: ");
        documento = leer.nextInt();

        //Agregamos la fecha de alquiler
        System.out.print("Indique dia de alquiler: ");
        diaAlquiler = leer.nextInt();
        System.out.print("Indique mes de alquiler: ");
        mesAlquiler = leer.nextInt();
        System.out.print("Indique anio de alquiler: ");
        anioAlquiler = leer.nextInt();
        fechaAlquiler = LocalDate.of(anioAlquiler, mesAlquiler, diaAlquiler);

        //Agregamos la fecha de devolucion
        System.out.print("Indique dia de devolucion: ");
        diaDevolucion = leer.nextInt();
        System.out.print("Indique mes de devolucion: ");
        mesDevolucion = leer.nextInt();
        System.out.print("Indique anio de devolucion: ");
        anioDevolucion = leer.nextInt();
        fechaDevolucion = LocalDate.of(anioDevolucion, mesDevolucion, diaDevolucion);

        //Calculamos el numero de dias que se ocupara el barco
        numeroDias = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        //Agregamos posicion amarre
        System.out.print("Indique posicion del amarre: ");
        posicionAmarre = leer.next();

        //Preguntamos que barco quiere alquilar
        do {
            System.out.print("Que barco desea alquilar? (Velero, Motor, Yate): ");
            barcoSeleccion = leer.next().toUpperCase();
            if (!(barcoSeleccion.equals("VELERO")) && (!(barcoSeleccion.equals("MOTOR"))) && (!(barcoSeleccion.equals("YATE")))) {
                System.out.println("Seleccion no valida, vuelva a intentarlo");
            }
        } while (!(barcoSeleccion.equals("VELERO")) && (!(barcoSeleccion.equals("MOTOR"))) && (!(barcoSeleccion.equals("YATE"))));

        //Creamos el barco
        switch (barcoSeleccion) {

            case "VELERO":
                BarcoVelero a = new BarcoVelero();
                a.crearVelero();
                barco = a;

                //Calculamos el modulo
                precioFinal = numeroDias * (a.getEslora() * 10);

                //Calculamos el precio final por ser velero
                precioFinal = precioFinal + (a.getNumeroMastiles());
                break;

            case "MOTOR":
                BarcoMotor b = new BarcoMotor();
                b.crearMotor();
                barco = b;

                //Calculamos el modulo
                precioFinal = numeroDias * (b.getEslora() * 10);

                //Calculamos el precio final por ser barco a motor
                precioFinal = precioFinal + (b.getPotenciaMotor());
                break;

            case "YATE":
                BarcoYate c = new BarcoYate();
                c.crearYate();
                barco = c;

                //Calculamos el modulo
                precioFinal = numeroDias * (c.getEslora() * 10);

                //Calculamos el precio final por ser un yate
                precioFinal = precioFinal + (c.potenciaYate + c.numeroCamarotes);
                break;

        }

    }

}
