package Ejercicio4E;

/**
 * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
 * que gestione la información sobre las personas vinculadas con la misma y que se
 * pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
 * continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 * • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
 * de identificación y su estado civil.
 * • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
 * incorporación a la facultad y qué número de despacho tienen asignado.
 * • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
 * matriculados.
 * • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
 * pertenecen (lenguajes, matemáticas, arquitectura, ...).
 * • Sobre el personal de servicio, hay que conocer a qué sección están asignados
 * (biblioteca, decanato, secretaría, ...).
 * El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
 * aplicación. A continuación, debe programar las clases definidas en las que,
 * además de los constructores, hay que desarrollar los métodos correspondientes
 * a las siguientes operaciones:
 * • Cambio del estado civil de una persona.
 * • Reasignación de despacho a un empleado.
 * • Matriculación de un estudiante en un nuevo curso.
 * • Cambio de departamento de un profesor.
 * • Traslado de sección de un empleado del personal de servicio.
 * • Imprimir toda la información de cada tipo de individuo. Incluya un programa
 * de prueba que instancie objetos de los distintos tipos y pruebe los métodos
 * desarrollados
 */

public class Ejercicio4E {
    public static void main(String[] args) {

        //Creamos los tres objetos
        Estudiante estudiante = new Estudiante("Albano", "Bosquet", "Soltero", 56, "Java");
        Profesor profesor = new Profesor("Cristian", "Bosquet", "Soltero", 50, 2021, 2, "Electronica");
        PersonalServicio personalServicio = new PersonalServicio("Ariel", "Caruso", "Soltero", 24, 2020, 3, "Jardin");

        //Mostramos en pantalla los objetos creados
        System.out.println("LAS PERSONAS SON:");
        System.out.println(estudiante);
        System.out.println(profesor);
        System.out.println(personalServicio);

        //Probamos los metodos
        System.out.println();
        System.out.println("AHORA VAMOS A PROBAR LOS METODOS:");
        estudiante.cambioEstadoCivil();
        estudiante.nuevoCurso();
        personalServicio.reasignacionDespacho();
        profesor.cambioDepartamento();
        personalServicio.trasladoSeccion();

        //Mostramos nuevamente los datos con los valores cambiados
        System.out.println();
        System.out.println("MOSTRAMOS LAS PERSONAS CON LOS DATOS CAMBIADOS:");
        System.out.println(estudiante);
        System.out.println(profesor);
        System.out.println(personalServicio);

    }
}
