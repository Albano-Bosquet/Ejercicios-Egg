package Ejercicio2E;

public class EdificioDeOficinas extends Edificio{

    private int numeroOficinas;
    private int cantidadPersonasPorOficina;
    private int numeroDePisos;

    //Constructores
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroOficinas, int cantidadPersonasPorOficina, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    //Setters
    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public void setCantidadPersonasPorOficina(int cantidadPersonasPorOficina) {
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    //Getters
    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public int getCantidadPersonasPorOficina() {
        return cantidadPersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    //Metodos
    @Override
    public void calcularSuperficie(double superficie) {
        superficie = getAncho() * getLargo();
        System.out.println("La superficie del edificio es " + superficie);
    }

    @Override
    public void calcularVolumen(double volumen) {
        volumen = getAncho() * getLargo() * getAlto();
        System.out.println("El volumen del edificio es " + volumen);
    }

    public void candidadPersonas(){

        System.out.println("En cada oficina entran " + cantidadPersonasPorOficina + " personas");
        System.out.println("En todo el edificio entran " + (numeroDePisos * cantidadPersonasPorOficina) + " personas");

    }
}
