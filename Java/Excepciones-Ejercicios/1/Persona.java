package Ejercicio1;

import Excepciones.Excepciones;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    public boolean mayor;
    public int pesoI;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //Metodos
    public void crearPersona() {
        System.out.println("Ingrese nombre de la persona");
        nombre = leer.next();
        System.out.println("Ingrese edad de la persona");
        edad = leer.nextInt();
        esMayorDeEdad();
        System.out.println("Ingrese peso de la persona");
        peso = leer.nextDouble();
        System.out.println("Ingrese altura de la persona");
        altura = leer.nextDouble();
        do {
            System.out.println("Ingrese sexo de la persona (H, M u O)");
            sexo = (leer.next().toUpperCase());
            if(!(sexo.equals("H")) && (!(sexo.equals("M")) && (!(sexo.equals("O"))))){
                System.out.println("Sexo invalido, pruebe con H, M u O");
            }
        } while(!(sexo.equals("H") || (sexo.equals("M") || (sexo.equals("O")))));
        System.out.println("");
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad + " años");
        if(mayor == true){
            System.out.println("La persona es mayor");
        } else {
            System.out.println("La persona es menor");
        }
        System.out.println("El peso es: " + peso + "kg");
        calcularIMC();
        System.out.println("La altura es: " + altura + "m");
        System.out.println("El sexo es: " + sexo);

    }

    public void calcularIMC() {
        int pesoIdeal;
        pesoIdeal = ((int) (peso / (Math.pow(altura, 2))));
        if (pesoIdeal < 20) {
            pesoI = -1;
            System.out.println("El peso esta por debajo del ideal");
        }
        if ((pesoIdeal >= 20) && (pesoIdeal <= 25)) {
            pesoI = 0;
            System.out.println("El peso es ideal");
        }
        if (pesoIdeal > 25) {
            pesoI = 1;
            System.out.println("El peso esta por arriba del ideal");
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            mayor = true;
        } else {
            mayor = false;
        }

        //Ejercicio 1 ecepciones
        try {
            if (edad == 0){
                throw new Excepciones("El valor de la edad es nulo");
            }
        } catch (Excepciones e){
            System.out.println(e.getMessage());
        }
        return mayor;
    }

}
