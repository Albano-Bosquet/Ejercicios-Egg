/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set. En el main
 * se creará el objeto y se usará el Math.random para generar los dos números y
 * se guardaran en el objeto con su respectivos set. Deberá además implementar
 * los siguientes métodos:
 *
 * • Método devolverMayor() para retornar cuál de los dos atributos tiene el
 * mayor valor
 *
 * • Método calcularPotencia() para calcular la potencia del mayor valor de la
 * clase elevado al menor número. Previamente se deben redondear ambos valores.
 *
 * • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica m1 = new Matematica();
        
        //Define los numeros
        System.out.print("El primer numero es: ");
        m1.setNum1((double)Math.random()*10);
        System.out.println(m1.getNum1());
        System.out.print("El segundo numero es: ");
        m1.setNum2((double)Math.random()*10);
        System.out.println(m1.getNum2());
        System.out.println("");
        System.out.println("MAYOR:");
        m1.devolverMayor();
        System.out.println("");
        System.out.println("POTENCIA:");
        m1.calcularPotencia();
        System.out.println("");
        System.out.println("RAIZ:");
        m1.calcularRaiz();
        
    }

}
