package Ejercicio1.Entidades;

import java.util.Scanner;

public class Producto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigoFabricante;

    //Constructores
    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, Integer codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    //Setters
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCodigoFabricante(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    //Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCodigoFabricante() {
        return codigoFabricante;
    }

    //Metodos
    public void crearProducto(){

        System.out.println("CREACION DE PRODUCTO");
        try {
            System.out.print("Ingrese el codigo del producto: ");
            codigo = leer.nextInt();
        } catch (Exception e){
            throw e;
        }
        try {
            System.out.print("Ingrese el nombre del producto: ");
            nombre = leer.next();
        } catch (Exception e){
            throw e;
        }
        try {
            System.out.print("Ingrese el precio del producto: ");
            precio = leer.nextDouble();
        } catch (Exception e){
            throw e;
        }
        try {
            System.out.print("Ingrese el codigo de fabricante para este producto: ");
            codigoFabricante = leer.nextInt();
        } catch (Exception e){
            throw e;
        }

    }

}
