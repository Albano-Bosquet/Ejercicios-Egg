/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author blackstrack
 */
public class Rectangulo {

    private int base;
    private int altura;
    private int perimetro;
    private int superficie;

    public Rectangulo() {
        
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    public int perimetro(){
        perimetro = ((base + altura) * 2);
        return perimetro;
    }
    public int superficie(){
        superficie = (base * altura);
        return superficie;
    }

    @Override
    public String toString() {
        for (int i = 0; i <= (base - 1); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= (altura -3); i++){
            System.out.print("*");
            for(int j = 0; j <= (base - 3); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i <= (base - 1); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("La superficie es " + superficie());
        System.out.println("El perimetro es " + perimetro());
        System.out.println("");
        return "Fin del programa";
    }

}
