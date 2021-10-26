package Ejercicio2E;

public class Polideportivo extends Edificio{

    private String nombre;
    private String tipoInstalacion;

    //Constructores
    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
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
}
