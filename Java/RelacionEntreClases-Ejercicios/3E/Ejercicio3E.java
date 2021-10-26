package Ejercicio3E;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar
 * que te ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus
 * clientes coberturas integrales para vehículos.
 * Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del
 * sistema que quiere realizar la empresa.
 * a. Gestión Integral de clientes. En este módulo vamos a registrar la información
 * personal de cada cliente que posea pólizas en nuestra empresa. Nombre y apellido,
 * documento, mail, domicilio, teléfono.
 * b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
 * modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 * c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de
 * un vehículo, como los datos de un solo cliente. Los datos incluidos en ella son:
 * número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de
 * pago, monto total asegurado, incluye granizo, monto máximo granizo, tipo de
 * cobertura (total, contra terceros, etc.). Nota: prestar atención al principio de este
 * enunciado y pensar en las relaciones entre clases. Recuerden que pueden ser de
 * uno a uno, de uno a muchos, de muchos a uno o de muchos a muchos.
 * d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada
 * póliza. Esas cuotas van a contener la siguiente información: número de cuota,
 * monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago
 * (efectivo, transferencia, etc.).
 * Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
 * requerimientos arriba descriptos. Modelando clases con atributos y sus
 * correspondientes relaciones. Para hacer el diagrama podes utilizar easyUml de java o
 * utilizar una pagina que nos permite hacer diagramas online: diagramas online.
 */

public class Ejercicio3E {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String decision;
        ArrayList<Poliza> polizaArrayList = new ArrayList<>();
        String cliente;

        do{

            Poliza poliza = new Poliza();
            poliza.crearPoliza();
            polizaArrayList.add(poliza);
            System.out.println();
            System.out.print("Desea agregar los datos de otro usuario? S/N: ");
            decision = leer.next().toUpperCase();

        } while (decision.equals("S"));

        System.out.println();

        do {

            System.out.println();
            System.out.print("De que cliente le gustaria saber los datos?: ");
            System.out.println("Los clientes son: ");

            for (int i = 0; i <= (polizaArrayList.size() - 1); i++){

                System.out.println(polizaArrayList.get(i).getCliente().getNombre());

            }

            cliente = leer.next();

            for (int i = 0; i <= (polizaArrayList.size() - 1); i++) {

                if (polizaArrayList.get(i).getCliente().getNombre().equals(cliente)) {
                    System.out.println();
                    System.out.println(polizaArrayList.get(i).toString());
                }

            }

            System.out.print("Desea saber los datos de otro cliente? S/N: ");
            decision = leer.next().toUpperCase();

        } while (decision.equals("S"));

    }
}
