/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:
 *
 * • Un constructor por defecto.
 *
 * • Un constructor con todos los atributos como parámetro.
 *
 * • Métodos getters y setters de cada atributo.
 *
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, la función devuelve un -1. Si la fórmula da por resultado un número entre
 * 20 y 25 (incluidos), significa que el peso está por debajo de su peso ideal y
 * la función devuelve un 0. Finalmente, si el resultado de la fórmula es un
 * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
 * devuelve un 1. Se recomienda hacer uso de constantes para devolver estos
 * valores.
 *
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 *
 * A continuación, en la clase main hacer lo siguiente:
 *
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad.
 *
 * Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables, para después en el main, calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
 * cuantos son mayores de edad y cuantos menores.
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        int contbien = 0;
        int contabajo = 0;
        int contarriba = 0;
        int contedad = 0;
        int contedadm = 0;

        //Creacion de objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        //Rellenar datos de objetos
        System.out.println("Rellene los datos para la persona 1");
        p1.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 2");
        p2.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 3");
        p3.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 4");
        p4.crearPersona();
        System.out.println("");
        
        //Peso ideal
        if(p1.pesoI == -1){
            contbien = (contbien + 1);
        }
        if(p2.pesoI == -1){
            contbien = (contbien + 1);
        }
        if(p3.pesoI == -1){
            contbien = (contbien + 1);
        }
        if(p4.pesoI == -1){
            contbien = (contbien + 1);
        }
        System.out.println("El porcentaje de personas que estan en su peso ideal es de " + ((contbien * 100) / 4) + "%");
        
        //Por debajo
        if(p1.pesoI == 0){
            contabajo = (contabajo + 1);
        }
        if(p2.pesoI == 0){
            contabajo = (contabajo + 1);
        }
        if(p3.pesoI == 0){
            contabajo = (contabajo + 1);
        }
        if(p4.pesoI == 0){
            contabajo = (contabajo + 1);
        }
        System.out.println("El porcentaje de personas que estan por debajo de su peso ideal es de " + ((contabajo * 100) / 4) + "%");
        
        //Por encima
        if(p1.pesoI == 1){
            contarriba = (contarriba + 1);
        }
        if(p2.pesoI == 1){
            contarriba = (contarriba + 1);
        }
        if(p3.pesoI == 1){
            contarriba = (contarriba + 1);
        }
        if(p4.pesoI == 1){
            contarriba = (contarriba + 1);
        }
        System.out.println("El porcentaje de personas que estan por encima de su peso ideal es de " + ((contarriba * 100) / 4) + "%");
        
        //Mayor de edad
        if(p1.mayor == true){
            contedad = (contedad + 1);
        }
        if(p2.mayor == true){
            contedad = (contedad + 1);
        }
        if(p3.mayor == true){
            contedad = (contedad + 1);
        }
        if(p4.mayor == true){
            contedad = (contedad + 1);
        }
        System.out.println("El porcentaje de personas mayores es de " + ((contedad * 100) / 4) + "%");
        
        //Menor de edad
        if(p1.mayor == false){
            contedadm = (contedadm + 1);
        }
        if(p2.mayor == false){
            contedadm = (contedadm + 1);
        }
        if(p3.mayor == false){
            contedadm = (contedadm + 1);
        }
        if(p4.mayor == false){
            contedadm = (contedadm + 1);
        }
        System.out.println("El porcentaje de personas menores es de " + ((contedadm * 100) / 4) + "%");
        
    }
    
}
