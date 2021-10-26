package Ejercicio3E;

import java.util.ArrayList;
import java.util.Scanner;

public class Poliza {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Datos pedidos por el programa
    private Cliente cliente = new Cliente();
    private Vehiculo vehiculo = new Vehiculo();
    private int numeroDePoliza, montoTotalAsegurado, cantidadCuotas, montoMaximoGranizo;
    private String fechaInicio, fechaFin, formaDePago, tipoDeCobertura;
    private boolean incluyeGranizo = false;

    private int montoCuota;
    private boolean cuotaPagada = false;
    private String fechaVencimientoCuota;

    //Datos extra
    String decision;
    private ArrayList<String> cuotas = new ArrayList<>();
    int contCuotas = 0;

    //Constructores
    public Poliza() {
    }

    public Poliza(int montoCuota, boolean cuotaPagada, String fechaVencimientoCuota, Cliente cliente, Vehiculo vehiculo, int numeroDePoliza, int montoTotalAsegurado, String fechaInicio, String fechaFin, int cantidadCuotas, String formaDePago, String tipoDeCobertura, boolean incluyeGranizo, int montoMaximoGranizo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroDePoliza = numeroDePoliza;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaDePago = formaDePago;
        this.tipoDeCobertura = tipoDeCobertura;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.montoCuota = montoCuota;
        this.cuotaPagada = cuotaPagada;
        this.fechaVencimientoCuota = fechaVencimientoCuota;
    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setNumeroDePoliza(int numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public void setCuotaPagada(boolean cuotaPagada) {
        this.cuotaPagada = cuotaPagada;
    }

    public void setFechaVencimientoCuota(String fechaVencimientoCuota) {
        this.fechaVencimientoCuota = fechaVencimientoCuota;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public String getFechaVencimientoCuota() {
        return fechaVencimientoCuota;
    }

    //Metodos
    public void crearPoliza(){

        //Creamos los datos del cliente y vehiculo para la poliza
        new Cliente();
        cliente.crearCliente();
        new Vehiculo();
        vehiculo.crearVehiculo();

        //Agregamos los datos que faltan para la poliza
        System.out.print("Ingrese numero de poliza: ");
        numeroDePoliza = leer.nextInt();
        System.out.print("Ingrese monto total asegurado: ");
        montoTotalAsegurado = leer.nextInt();
        System.out.print("Ingrese fecha de inicio de la poliza: ");
        fechaInicio = leer.next();
        System.out.print("Ingrese fecha de fin de la poliza: ");
        fechaFin = leer.next();
        System.out.print("Ingrese cantidad de cuotas de la poliza: ");
        cantidadCuotas = leer.nextInt();
        System.out.print("Ingrese la forma de pago: ");
        formaDePago = leer.next();
        System.out.print("Ingrese tipo de cobertura: ");
        tipoDeCobertura = leer.next();
        System.out.print("Incluye proteccion contra granizo? S/N: ");
        decision = leer.next().toUpperCase();
        if(decision.equals("S")){
            incluyeGranizo = true;
            System.out.print("Ingrese monto maximo que cubre contra granizo: ");
            montoMaximoGranizo = leer.nextInt();
        }

        for (int i = 0; i <= (cantidadCuotas - 1); i++){

            System.out.println("Ingrese datos de la cuota " + contCuotas);
            System.out.print("Monto cuota: ");
            montoCuota = leer.nextInt();
            System.out.print("La cuota esta pagada? S/N: ");
            decision = leer.next().toUpperCase();
            if(decision.equals("S")){

                cuotaPagada = true;

            }
            System.out.print("Ingrese fecha de vencimiento de la cuota: ");
            fechaVencimientoCuota = leer.next();

            cuotas.add("Cuota " + contCuotas + ": " +
                    "\n Monto cuota: " + montoCuota +
                    "\n La cuota esta pagada: " + cuotaPagada +
                    "\n La fecha de vencimiento de la cuota es: " + fechaVencimientoCuota);

            contCuotas++;
            cuotaPagada = false;


        }

        contCuotas = 0;

    }

    @Override
    public String toString() {

        System.out.println("Las cuotas del usuario son: ");
        for (int i = 0; i <= (cantidadCuotas - 1); i++){

            System.out.println(cuotas.get(i));

        }

        return "POLIZA: \n" + cliente + "\n" + vehiculo +
                "\n Numero de poliza: " + numeroDePoliza +
                "\n Monto total asegurado: " + montoTotalAsegurado +
                "\n Fecha de inicio de la poliza: " + fechaInicio +
                "\n Fecha de fin de la poliza: " + fechaFin +
                "\n Cantidad de cuotas de la poliza: " + cantidadCuotas +
                "\n Forma de pago de la poliza: " + formaDePago +
                "\n Tipo de cobertura: " + tipoDeCobertura +
                "\n Incluye proteccion contra granizo: " + incluyeGranizo +
                "\n Monto maximo contra granizo: " + montoMaximoGranizo;

    }
}
