/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entidades.Autor;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class AutorDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-EjerciciosFinalPU");
    EntityManager em = emf.createEntityManager();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Cargamos el autor en la DB
    public void crearAutorDAO(Autor autor) throws Exception {

        if (autor.getAlta() == null) {
            throw new Exception("Error, el alta del autor esta vacia");
        }
        if (autor.getId() == null) {
            throw new Exception("Error, la ID del autor esta vacia");
        }
        if (autor.getNombre() == null) {
            throw new Exception("Error, el nombre del autor esta vacio");
        }

        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();

    }

    public void consultarAutoresDAO() {

        //Creamos la coleccion de autores
        Collection<Autor> autores = em.createQuery("SELECT a"
                + " FROM Autor a").getResultList();

        //Iteramos entre autores
        for (Autor a : autores) {

            System.out.println(a.getNombre());

        }

    }

    public void consultarAutorDAO(String consulta) {

        //Creamos la query
        Autor autor = (Autor) em.createQuery("SELECT a"
                + " FROM Autor a"
                + " WHERE a.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Mostramos los datos
        System.out.println("La ID del autor es " + autor.getId());
        System.out.println("El nombre del autor es " + autor.getNombre());

    }
    
    public void modificarAutorDAO(String consulta) throws Exception {
        
        //Creamos la query
        Autor autor = (Autor) em.createQuery("SELECT a"
                + " FROM Autor a"
                + " WHERE a.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Asignamos los valores
        try {
            System.out.print("Ingrese la ID para el autor: ");
            autor.setId(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar la ID del autor");
        }
        try {
            System.out.print("Ingrese el nombre para el autor: ");
            autor.setNombre(leer.next());
        } catch (Exception e){
            throw new Exception("Error al ingresar el nombre del autor");
        }
        
        //Mandamos los datos a la DB
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        
    }
    
    public void eliminarAutorDAO(String consulta) throws Exception {
        
        //Creamos la query
        Autor autor = (Autor) em.createQuery("SELECT a"
                + " FROM Autor a"
                + " WHERE a.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Eliminamos los datos de la DB
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        
    }

}
