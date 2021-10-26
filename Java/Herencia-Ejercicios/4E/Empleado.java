package Ejercicio4E;

public class Empleado extends Persona{

    protected int anioIncorporacion, numeroDespacho;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String estadoCivil, int numeroIdentificacion, int anioIncorporacion, int numeroDespacho) {
        super(nombre, apellido, estadoCivil, numeroIdentificacion);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    //Setters
    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    //Getters
    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    //Metodos
    public void reasignacionDespacho(){

        System.out.print("Indique nuevo despacho de " + getNombre() + ": ");
        setNumeroDespacho(leer.nextInt());

    }

}
