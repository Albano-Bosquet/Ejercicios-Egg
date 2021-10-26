/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo
 * actual. Las operaciones asociadas a dicha clase son:
 *
 * • Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés.
 *
 * • Agregar los métodos getters y setters correspondientes
 *
 * • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 *
 * • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual.
 *
 * • Método retirar(double retiro): el método recibe una cantidad de dinero a
 * retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de
 * dinero a retirar, se pondrá el saldo actual en 0.
 *
 * • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
 * Validar que el usuario no saque más del 20%.
 *
 * • Método consultarSaldo(): permitirá consultar el saldo disponible en la
 * cuenta.
 *
 * • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String decision;
        Cuenta c1 = new Cuenta();
        c1.crearCuenta();
        do{
            System.out.println("Que desea hacer?");
            System.out.println("Ingresar dinero a la cuenta (I)");
            System.out.println("Retirar dinero de la cuenta (R)");
            System.out.println("Realizar una extraccion rapida (ER)");
            System.out.println("Consultar saldo actual (SD)");
            System.out.println("Consultar datos de la cuenta (D)");
            decision = leer.next();
            decision = decision.toUpperCase();
            switch(decision){
                case "I":
                    c1.ingresar();
                    break;
                case "R":
                    c1.retirar();
                    break;
                case "ER":
                    c1.extraccionRapida();
                    break;
                case "SD":
                    c1.consultarSaldo();
                    break;
                case "D":
                    c1.consultarDatos();
                    break;
            }
            System.out.println("Desea salir del programa? S/N");
            decision = leer.next();
        } while(!(decision.equals("S")));
        
    }

}
