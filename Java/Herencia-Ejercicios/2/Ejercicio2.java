package Ejercicio2;

import java.util.ArrayList;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso.
 * Los constructores que se deben implementar son los siguientes:
 * • Un constructor vacío.
 * • Un constructor con todos los atributos pasados por parámetro.
 * Los métodos a implementar son:
 * • Métodos getters y setters de todos los atributos.
 * Método comprobarConsumoEnergetico(char letra): comprueba que la letra
 * es correcta, sino es correcta usara la letra F por defecto. Este método se debe
 * invocar al crear el objeto y no será visible.
 * • Método comprobarColor(String color): comprueba que el color es correcto, y
 * si no lo es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
 * está en mayúsculas o en minúsculas. Este método se invocará al crear el
 * objeto y no será visible.
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
 * electrodoméstico, también llama los métodos para comprobar el color y el
 * consumo. Al precio se le da un valor base de $1000.
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará
 * el valor del precio. Esta es la lista de precios:
 * <p>
 * A continuación se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados.
 * Los constructores que se implementarán serán:
 * • Un constructor vacío.
 * • Un constructor con la carga y el resto de atributos heredados. Recuerda que
 * debes llamar al constructor de la clase padre.
 * Los métodos que se implementara serán:
 * • Método get y set del atributo carga.
 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
 * si la carga es menor o igual, no se incrementará el precio. Este método debe
 * llamar al método padre y añadir el código necesario. Recuerda que las
 * condiciones que hemos visto en la clase Electrodoméstico también deben
 * afectar al precio.
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
 * atributos heredados.
 * Los constructores que se implementarán serán:
 * • Un constructor vacío.
 * • Un constructor con la resolución, sintonizador TDT y el resto de atributos
 * heredados. Recuerda que debes llamar al constructor de la clase padre.
 * Los métodos que se implementara serán:
 * • Método get y set de los atributos resolución y sintonizador TDT.
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio.
 * Finalmente, en el main debemos realizar lo siguiente:
 * Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
 * para mostrar el precio final de los dos electrodomésticos.
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        //Ejercicio3
        int precioSuma = 0;

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        Lavadora l1 = new Lavadora(1200d, 25d, "BLANCO", "A", 20);
        Lavadora l2 = new Lavadora(1300d, 20d, "AZUL", "C", 30);
        Televisor t1 = new Televisor(1750d, 10d, "GRIS", "E", 43, false);
        Televisor t2 = new Televisor(1800d, 7d, "ROJO", "F", 30, true);

        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);

        System.out.println("Precios electrodomesticos genericos:");
        for (int i = 0; i <= (electrodomesticos.size() - 1); i++){

            electrodomesticos.get(i).precioFinal();
            System.out.println(electrodomesticos.get(i).precio);

        }
        System.out.println("Suma de los electrodomesticos anteriores:");
        for (int i = 0; i <= (electrodomesticos.size() - 1); i++){

            precioSuma = precioSuma + electrodomesticos.get(i).precio.intValue();

        }
        System.out.println(precioSuma);

        //Ejercicio2
        Lavadora e1 = new Lavadora();
        Televisor e2 = new Televisor();

        System.out.println("LAVADORA:");
        e1.crearLavadora();
        System.out.println("TELEVISOR:");
        e2.crearTV();

        System.out.println(e1);
        System.out.println(e2);

    }
}
