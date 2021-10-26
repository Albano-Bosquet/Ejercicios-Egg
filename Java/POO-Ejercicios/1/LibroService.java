/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Service;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        String ISBN, titulo, autor, paginas;
        System.out.println("Ingrese titulo del libro");
        titulo = leer.next();
        System.out.println("Ingrese autor del libro");
        autor = leer.next();
        System.out.println("Ingrese paginas del libro");
        paginas = leer.next();
        System.out.println("Ingrese codigo ISBN del libro");
        ISBN = leer.next();
        Libro l = new Libro(ISBN, titulo, autor, paginas);
        return l;
        
    }
}
