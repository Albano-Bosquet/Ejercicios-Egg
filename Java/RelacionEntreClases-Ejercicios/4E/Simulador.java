package Ejercicio4E;

import java.util.ArrayList;

public class Simulador {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    //Constructores
    public Simulador() {
    }

    public Simulador(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //Setters
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //Getters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    //Metodos
    public void generarLista(){

        for (int i = 0; i <= 9; i++){

            Alumno alumno = new Alumno();
            alumno.crearListaNombres();
            alumno.crearAlumno();
            alumnos.add(alumno);

        }

        System.out.println("ALUMNOS:");
        for (int i = 0; i <= 9; i++){

            System.out.println();
            System.out.println("Nombre: " + alumnos.get(i).getNombreCompleto());
            System.out.println("DNI" + alumnos.get(i).getDocumento());
            System.out.println("Cantidad de votos: " + alumnos.get(i).getCantidadVotos());

        }

    }

}
