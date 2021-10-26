package Ejercicio4E;

public class PersonalServicio extends Empleado{

    protected String seccion;

    //Constructores
    public PersonalServicio() {
    }

    public PersonalServicio(String nombre, String apellido, String estadoCivil, int numeroIdentificacion, int anioIncorporacion, int numeroDespacho, String seccion) {
        super(nombre, apellido, estadoCivil, numeroIdentificacion, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    //Setters
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    //Getters
    public String getSeccion() {
        return seccion;
    }

    //Metodos
    public void trasladoSeccion(){

        System.out.print("Indique nueva seccion para " + getNombre() + ": ");
        setSeccion(leer.next());

    }

    @Override
    public String toString() {
        return "PERSONAL DE SERVICIO:" +
                "\n Anio de incorporacion: " + anioIncorporacion +
                "\n Numero de despacho: " + numeroDespacho +
                "\n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Estado civil: " + estadoCivil +
                "\n Numero de identificacion: " + numeroIdentificacion +
                "\n Seccion: " + seccion;
    }

}
