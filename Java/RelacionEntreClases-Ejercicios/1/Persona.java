package Ejercicio1;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);

    private String nombre, apellido;
    private Integer edad, documento;
    private Perro perro;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    //Metodos
    public void crearPersona(){

        System.out.println();
        System.out.print("Indique nombre de la persona: ");
        nombre = leer.next();
        System.out.print("Indique apellido de la persona: ");
        apellido = leer.next();
        System.out.print("Indique edad de la persona: ");
        edad = leer.nextInt();
        System.out.print("Indique documento de la persona: ");
        documento = leer.nextInt();

    }

    public void mostrarDatos(){

        System.out.print("El nombre de la persona es ");
        System.out.println(nombre);
        System.out.print("El apellido de la persona es ");
        System.out.println(apellido);
        System.out.print("La edad de la persona es ");
        System.out.println(edad);
        System.out.print("El documento de la persona es ");
        System.out.println(documento);
        System.out.print("El perro de la persona es ");
        System.out.println(perro.toString());

    }

}
