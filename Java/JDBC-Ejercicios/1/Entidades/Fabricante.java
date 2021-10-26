package Ejercicio1.Entidades;

import java.util.Scanner;

public class Fabricante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Integer codigo;
    private String nombre;
    private String nacionalidad;

    //Constructores
    public Fabricante() {
    }

    public Fabricante(Integer codigo, String nombre, String nacionalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    //Setters
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //Metodos
    public void crearFabricante(){

        System.out.println("CREACION DE FABRICANTE");
        try {
            System.out.print("Ingrese el codigo del fabricante: ");
            codigo = leer.nextInt();
        } catch (Exception e){
            throw e;
        }
        try {
            System.out.print("Ingrese el nombre del fabricante: ");
            nombre = leer.next();
        } catch (Exception e){
            throw e;
        }
        try {
            System.out.print("Ingrese la nacionalidad del fabricante: ");
            nacionalidad = leer.next();
        } catch (Exception e){
            throw e;
        }

    }

}
