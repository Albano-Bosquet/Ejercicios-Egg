/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Entidades.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author blackstrack
 */
public class LibroDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-EjerciciosFinalPU");
    EntityManager em = emf.createEntityManager();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Cargamos la editorial en la DB
    public void crearLibroDAO(Libro libro) throws Exception {

        if (libro.getAlta() == null) {
            throw new Exception("Error, el alta del libro esta vacia");
        }
        if (libro.getAnio() == null) {
            throw new Exception("Error, el anio del libro esta vacio");
        }
        if (libro.getAutor() == null) {
            throw new Exception("Error, el autor del libro esta vacio");
        }
        if (libro.getEditorial() == null) {
            throw new Exception("Error, la editorial del libro esta vacia");
        }
        if (libro.getEjemplares() == null) {
            throw new Exception("Error, los ejemplares de libros estan vacios");
        }
        if (libro.getEjemplaresPrestados() == null) {
            throw new Exception("Error, los ejemplares prestados de libros estan vacios");
        }
        if (libro.getEjemplaresRestantes() == null) {
            throw new Exception("Error, los ejemplares restantes de libros estan vacios");
        }
        if (libro.getISBN() == null) {
            throw new Exception("Error, el ISBN del libro esta vacio");
        }
        if (libro.getId() == null) {
            throw new Exception("Errorm la ID del libro esta vacia");
        }
        if (libro.getTitulo() == null) {
            throw new Exception("Error, el titulo del libro esta vacio");
        }
        

        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    }

    public void consultarLibrosDAO() {

        //Creamos la coleccion de autores
        Collection<Libro> libros = em.createQuery("SELECT l"
                + " FROM Libro l").getResultList();

        //Iteramos entre autores
        for (Libro l : libros) {

            System.out.println(l.getTitulo());

        }

    }

    public void consultarLibroDAO(String consulta) {

        //Creamos la query
        Libro libro = (Libro) em.createQuery("SELECT l"
                + " FROM Libro l"
                + " WHERE l.titulo = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Mostramos los datos
        System.out.println("La id del libro es " + libro.getId());
        System.out.println("El titulo del libro es " + libro.getTitulo());
        System.out.println("El anio del libro es " + libro.getAnio());
        System.out.println("El autor del libro es " + libro.getAutor().getNombre());
        System.out.println("La editorial del libro es " + libro.getEditorial().getNombre());
        System.out.println("Los ejemplares del libro son " + libro.getEjemplares());
        System.out.println("Los ejemplares prestados del libro son " + libro.getEjemplaresPrestados());
        System.out.println("Los ejemplares restantes del libro son " + libro.getEjemplaresRestantes());
        System.out.println("El codigo ISBN del libro es " + libro.getISBN());

    }
    
    public void modificarLibroDAO(String consulta) throws Exception {
        
        //Creamos la query
        Libro libro = (Libro) em.createQuery("SELECT l"
                + " FROM Libro l"
                + " WHERE l.titulo = :consulta").setParameter("consulta", consulta).getSingleResult();
        
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
        
        //Mandamos los datos a la DB
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        
    }
    
    public void eliminarLibroDAO(String consulta) throws Exception {
        
        //Creamos la query
        Libro libro = (Libro) em.createQuery("SELECT l"
                + " FROM Libro l"
                + " WHERE l.titulo = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Eliminamos los datos de la DB
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        
    }
    
}
