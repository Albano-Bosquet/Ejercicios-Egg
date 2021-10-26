package Ejercicio3;

import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
 * de tipo Integer con sus 3 notas.
 * En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
 * información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Despues de ese bluce tendremos el siguiente método en la clase Alumno:
 * Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
 * su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
 * método. Dentro del método se usará la lista notas para calcular el promedio final
 * de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
 * main.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String decision;
        Alumno a = new Alumno();

        do {

            a.cargarNombre();
            a.cargarNotas();
            a.notaFinal();

            do {
                System.out.println("Desea agregar otro alumno? S/N");
                decision = leer.next().toUpperCase();
            }while (!(decision.equals("S")) && !(decision.equals("N")));
        } while (decision.equals("S"));

        a.verFinal();

        if(a.notaFinalAlumno != 0.0) {
            System.out.println("La nota final de " + a.AlumnoFinal + " es " + a.notaFinalAlumno);
        }
    }
}
