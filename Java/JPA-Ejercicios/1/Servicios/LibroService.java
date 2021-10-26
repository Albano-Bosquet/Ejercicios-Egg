/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import java.util.Scanner;
import Entidades.Libro;
import Entidades.Autor;
import Entidades.Editorial;
import DAO.LibroDAO;
import DAO.AutorDAO;
import DAO.EditorialDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author blackstrack
 */
public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-EjerciciosFinalPU");
    EntityManager em = emf.createEntityManager();
    
    public void crearLibro() throws Exception{
        
        String decisionAutor;
        String decisionEditorial;

        //Creamos los objetos necesarios
        Libro libro = new Libro();
        LibroDAO libroDAO = new LibroDAO();
        EditorialDAO editorialDAO = new EditorialDAO();
        AutorDAO autorDAO = new AutorDAO();
        
        //Asignamos los valores
        try {
            System.out.print("Ingrese la ID para el libro: ");
            libro.setId(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar la ID del libro");
        }
        try {
            System.out.print("Ingrese el nombre para el libro: ");
            libro.setTitulo(leer.next());
        } catch (Exception e){
            throw new Exception("Error al ingresar el nombre del libro");
        }
        try {
             System.out.print("Ingrese el anio para el libro: ");
             libro.setAnio(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar el anio del libro");
        }
        try {
             System.out.print("Ingrese los ejemplares para el libro: ");
             libro.setEjemplares(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar los ejemplares del libro");
        }
        try {
             System.out.print("Ingrese los ejemplares prestados para el libro: ");
             libro.setEjemplaresPrestados(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar los ejemplares prestados del libro");
        }
        try {
             System.out.print("Ingrese los ejemplares restantes para el libro: ");
             libro.setEjemplaresRestantes(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar los ejemplares restantes del libro;");
        }
        try {
             System.out.print("Ingrese el codigo ISBN para el libro: ");
             libro.setISBN(leer.nextLong());
        } catch (Exception e){
            throw new Exception("Error al ingresar el ISBN del libro");
        }
        System.out.println("Que editorial le gustaria asignar al libro? las editoriales son:");
        editorialDAO.consultarEditorialesDAO();
        try {
            decisionEditorial = leer.next();
            Editorial editorial = (Editorial) em.createQuery("SELECT e"
                + " FROM Editorial e"
                + " WHERE e.nombre = :decisionEditorial").setParameter("decisionEditorial", decisionEditorial).getSingleResult();
            libro.setEditorial(editorial);
        } catch (Exception e) {
            throw new Exception("Error al ingresar la editorial del libro");
        }
        System.out.println("Que autor le gustaria asignar al libro? los autores son:");
        autorDAO.consultarAutoresDAO();
        try {
            decisionAutor = leer.next();
            Autor autor = (Autor) em.createQuery("SELECT a"
                + " FROM Autor a"
                + " WHERE a.nombre = :decisionAutor").setParameter("decisionAutor", decisionAutor).getSingleResult();
            libro.setAutor(autor);
        } catch (Exception e) {
            throw new Exception("Error al ingresar el autor del libro");
        }
        
        //Damos de alta al libro
        libro.setAlta(true);
        
        //Mandamos los datos al DAO
        libroDAO.crearLibroDAO(libro);

    }
    
    public void consultarLibro(){
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los libros
        System.out.println("Que libro le gustaria ver? Los libros son:");
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.consultarLibrosDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        libroDAO.consultarLibroDAO(consulta);
        
    }
    
    public void modificarLibro() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los libros
        System.out.println("Que libro le gustaria modificar? Los libros son:");
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.consultarLibrosDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        libroDAO.modificarLibroDAO(consulta);
        
    }
    
    public void eliminarLibro() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los libros
        System.out.println("Que libro le gustaria eliminar? Los libros son:");
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.consultarLibrosDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        libroDAO.eliminarLibroDAO(consulta);
        
    }
    
}
