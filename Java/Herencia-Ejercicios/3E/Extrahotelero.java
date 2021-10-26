package Ejercicio3E;

public class Extrahotelero extends Alojamiento{

    protected boolean privado = false;
    protected double metrosCuadrados;

    //Constructores
    public Extrahotelero() {
    }

    public Extrahotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    //Setters
    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    //Getters
    public boolean isPrivado() {
        return privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
}
