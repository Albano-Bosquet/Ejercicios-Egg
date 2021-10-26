package Ejercicio1;

public class Animal {

    protected String nombre, alimento, raza;
    protected int edad;

    //Constructores
    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    //Metodos
    public void alimentarse(){

        System.out.println("El animal " + nombre + " es un " + raza + ", tiene " + edad + " anios, y se alimenta de " + alimento);

    }

}
