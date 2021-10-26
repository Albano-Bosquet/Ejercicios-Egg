package Ejercicio3E;

import java.util.Scanner;

public class Cliente {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Datos pedidos por el programa
    private String nombre, apellido, mail, domicilio;
    private long documento, telefono;

    //Datos extra


    //Constructores
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String mail, String domicilio, long documento, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public long getDocumento() {
        return documento;
    }

    public long getTelefono() {
        return telefono;
    }

    //Metodos
    public void crearCliente(){

        System.out.print("Ingrese nombre del cliente: ");
        nombre = leer.next();
        System.out.print("Ingrese apellido del cliente: ");
        apellido = leer.next();
        System.out.print("Ingrese mail del cliente: ");
        mail = leer.next();
        System.out.print("Ingrese domicilio del cliente: ");
        domicilio = leer.next();
        System.out.print("Ingrese documento del cliente: ");
        documento = leer.nextLong();
        System.out.print("Ingrese celular del cliente: ");
        telefono = leer.nextLong();

    }

    @Override
    public String toString() {
        return "CLIENTE: \n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Mail: " + mail +
                "\n Domicilio: " + domicilio +
                "\n Documento: " + documento +
                "\n Celular: " + telefono;
    }
}
