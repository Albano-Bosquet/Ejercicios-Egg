/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author blackstrack
 */
public class Operacion {

    private float n1;
    private float n2;
    private float sumar;
    private float restar;
    private float multiplicar;
    private float dividir;

    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public float sumar() {
        sumar = (n1 + n2);
        return sumar;
    }

    public float restar() {
        restar = (n1 - n2);
        return restar;
    }

    public float multiplicar() {
        if ((n1 != 0) && (n2 != 0)) {
            multiplicar = (n1 * n2);
        }

        return multiplicar;
    }

    public float dividir() {
        if ((n1 != 0) && (n2 != 0)) {
            dividir = (n1 / n2);
        }

        return dividir;
    }

    @Override
    public String toString() {
        if ((n1 != 0) && (n2 != 0)) {
            return "Multiplicacion=" + multiplicar() + ", Division=" + dividir() + ", Suma=" + sumar() + ", Resta=" + restar();
        }
        if ((n1 == 0) || (n2 == 0)) {
            return "No se puede realizar multiplicacion y division | La suma es igual a " + sumar() + " y la resta es igual a " + restar();
        }
        return null;

    }

}
