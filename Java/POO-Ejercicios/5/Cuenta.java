/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private int numeroCuenta;
    private long DNI;
    private double salario;
    private double ingresar;
    private double retirar;
    private double extraccion;

    //Constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int salario) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.salario = salario;
    }

    //Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSalario() {
        return salario;
    }

    //Crear cuenta bancaria
    public void crearCuenta() {
        System.out.println("Ingrese numero de cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        DNI = leer.nextInt();
        System.out.println("Ingrese salario");
        salario = leer.nextDouble();
    }

    //Ingresar dinero
    public double ingresar() {
        System.out.println("Defina dinero a ingresar");
        ingresar = leer.nextDouble();
        salario = (salario + ingresar);
        System.out.println("El salario actual es de " + salario);
        return ingresar;
    }

    //Retirar dinero
    public double retirar() {
        System.out.println("Defina dinero a retirar");
        retirar = leer.nextDouble();
        if (retirar > salario) {
            salario = 0;
        }
        if (retirar <= salario) {
            salario = (salario - retirar);
        }
        System.out.println("El salario ahora es de " + salario);
        return retirar;
    }

    //Extraccion rapida
    public double extraccionRapida() {
        System.out.println("Cuanto desea retirar rapidamente?");
        extraccion = leer.nextDouble();
        if (extraccion > ((salario / 100) * 20)) {
            System.out.println("Con la extraccion rapida solo se permite retirar el 20%");
        } else {
            salario = (salario - extraccion);
        }
        System.out.println("El salario actual es de " + salario);
        return salario;
    }

    //Consultar dinero en cuenta
    public void consultarSaldo(){
        System.out.println("Su saldo es de " + salario);
    }
    
    //Consultar datos de cuenta
    public void consultarDatos(){
        System.out.println("El numero de cuenta es " + numeroCuenta);
        System.out.println("El DNI del usuario es " + DNI);
        System.out.println("El salario del usuario es " + salario);
    }
}
