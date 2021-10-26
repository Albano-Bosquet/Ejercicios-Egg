package Ejercicio2E;

import java.util.ArrayList;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
 * largo. La clase edificio tendrá como métodos:
 * • Método calcularSuperficie(): calcula la superficie del edificio.
 * • Método calcularVolumen(): calcula el volumen del edifico.
 * Estos métodos serán abstractos y los implementarán las siguientes clases:
 * • Clase Polideportivo con su nombre y tipo de instalación que puede ser
 * Techado o Abierto, esta clase implementará los dos métodos abstractos y los
 * atributos del padre.
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y numero de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 * De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
 * edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
 * oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
 * Crear el método cantPersonas(), que muestre cuantas personas entrarían en
 * un piso y cuantas en todo el edificio.
 * Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
 * contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
 * y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
 * deberá mostrar la superficie y el volumen de cada edificio.
 * Además de esto, para la clase Polideportivo nos interesa saber cuantos
 * polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
 * deberemos llamar al método cantPersonas() y mostrar los resultados de cada
 * edificio de oficinas.
 */

public class Ejercicio2E {
    public static void main(String[] args) {

        int Techados = 0, Abiertos = 0;

        ArrayList<Edificio> edificios = new ArrayList<>();

        //Creamos los edificios
        Polideportivo p1 = new Polideportivo(20, 5, 25, "Polideportivo de Lujan", "Techado");
        Polideportivo p2 = new Polideportivo(24, 4, 50, "Polideportivo de Carrodilla", "Abierto");
        EdificioDeOficinas e1 = new EdificioDeOficinas(10, 50, 10, 40, 12, 40);
        EdificioDeOficinas e2 = new EdificioDeOficinas(12, 50, 12, 45, 20, 45);

        //Agregamos los edificios al ArrayList
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(e1);
        edificios.add(e2);

        //Calculamos superficies y volumenes de los edificios
        for (int i = 0; i <= (edificios.size() - 1); i++){

            System.out.println("Edificio " + (i + 1) + ":");
            edificios.get(i).calcularSuperficie(0);
            edificios.get(i).calcularVolumen(0);

        }

        //Comprobamos cuantos polideportivos son techados y cuantos abiertos
        System.out.println();
        if(p1.getTipoInstalacion().equals("Techado")){
            Techados++;
        } else {
            Abiertos++;
        }

        if(p2.getTipoInstalacion().equals("Techado")){
            Techados++;
        } else {
            Abiertos++;
        }

        System.out.println("La cantidad de polideportivos abiertos son: " + Abiertos);
        System.out.println("La cantidad de polideportivos techados son: " + Techados);

        //Mostramos la cantidad de personas que entran por cada edificio de oficinas
        System.out.println();
        e1.candidadPersonas();
        e2.candidadPersonas();

    }
}
