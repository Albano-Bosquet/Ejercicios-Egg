package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<Integer> notaFinal = new ArrayList<>();
    public double notaFinalAlumno;
    public String AlumnoFinal;

    //Cargamos el nombre del alumno
    public void cargarNombre() {

        System.out.println("Indique nombre del alumno");
        nombre = leer.next();
        nombres.add(nombre);

    }

    //Cargamos las notas del alumno, previamente inicializamos la lista con valores nulos
    public void cargarNotas() {

        notas.add(null);
        notas.add(null);
        notas.add(null);

        int nota, cont = 0;
        for (int i = 0; i <= 2; i++) {

            System.out.println("Indique nota " + (i + 1));
            nota = leer.nextInt();
            notas.set(cont, nota);
            cont++;

        }

        cont = 0;

    }

    //Calculamos la nota final de cada alumno y lo guardamos en un ArrayList
    public void notaFinal() {

        for (int i = 0; i <= (nombres.size() - 1); i++) {

            notaFinal.add((notas.get(0) + notas.get(1) + notas.get(2)) / 3);

        }

    }

    //
    public void verFinal() {

        String nombreAlumno;
        boolean bool = false;

        System.out.println("De que alumno le gustaria ver la nota final?: " + nombres);
        nombreAlumno = leer.next();

        for (int i = 0; i <= (nombres.size() - 1); i++) {

            if (nombres.get(i).equals(nombreAlumno)) {

                notaFinalAlumno = notaFinal.get(i);
                AlumnoFinal = nombres.get(i);
                bool = true;

            }
        }

        if (bool == false) {

            System.out.println("El alumno no se ha encontrado en la lista");

        }

        bool = false;

    }
}
