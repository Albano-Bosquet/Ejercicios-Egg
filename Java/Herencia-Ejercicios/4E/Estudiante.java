package Ejercicio4E;

public class Estudiante extends Persona{

    protected String curso;

    //Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String estadoCivil, int numeroIdentificacion, String curso) {
        super(nombre, apellido, estadoCivil, numeroIdentificacion);
        this.curso = curso;
    }

    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Getters
    public String getCurso() {
        return curso;
    }

    //Metodos
    public void nuevoCurso(){

        System.out.print("Indique nuevo curso de " + getNombre() + ": ");
        setCurso(leer.next());

    }

    //ToString
    @Override
    public String toString() {
        return "ESTUDIANTE:" +
                "\n Curso: " + curso +
                "\n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Estado civil: " + estadoCivil +
                "\n Numero de identificacion: " + numeroIdentificacion;
    }

}
