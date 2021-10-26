/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.ejerciciosfinal;

import java.util.Scanner;
import Servicios.AutorService;
import Servicios.EditorialService;
import Servicios.LibroService;

/**
 *
 * @author blackstrack
 */
public class Menu {

    public void Menu() throws Exception {

        Scanner leer = new Scanner(System.in);

        LibroService libroService = new LibroService();
        AutorService autorService = new AutorService();
        EditorialService editorialService = new EditorialService();

        Integer decision;
        String confirmacion;

        do {

            //Mostramos las opciones
            System.out.println("");
            System.out.println("---------------HAGA SU ELECCION---------------");
            System.out.println("1. Consultar libro");
            System.out.println("2. Consultar Autor");
            System.out.println("3. Consultar Editorial");
            System.out.println("11. Modificar libro");
            System.out.println("22. Modificar autor");
            System.out.println("33. Modificar editorial");
            System.out.println("111. Eliminar libro");
            System.out.println("222. Eliminar autor");
            System.out.println("333. Eliminar editorial");
            System.out.println("1111. Crear libro");
            System.out.println("2222. Crear autor");
            System.out.println("3333. Crear editorial");
            System.out.println("99. Salir");
            System.out.println("");

            //Hacemos nuestra eleccion
            try {
                do {
                    System.out.print("Su eleccion: ");
                    decision = leer.nextInt();
                    System.out.println("Esta seguro? S/N");
                    confirmacion = leer.next().toUpperCase();
                } while (confirmacion.equals("N"));
            } catch (Exception e) {
                throw new Exception("Error al poner su decision");
            }

            //Switch del menu
            switch (decision) {

                case 1:
                    libroService.consultarLibro();
                    break;
                case 2:
                    autorService.consultarAutor();
                    break;
                case 3:
                    editorialService.consultarEditorial();
                    break;
                case 11:
                    libroService.modificarLibro();
                    break;
                case 22:
                    autorService.modificarAutor();
                    break;
                case 33:
                    editorialService.modificarEditorial();
                    break;
                case 111:
                    libroService.eliminarLibro();
                    break;
                case 222:
                    autorService.eliminarAutor();
                    break;
                case 333:
                    editorialService.eliminarEditorial();
                case 1111:
                    libroService.crearLibro();
                    break;
                case 2222:
                    autorService.crearAutor();
                    break;
                case 3333:
                    editorialService.crearEditorial();
                    break;

            }

        } while (decision != 99);

    }

}
