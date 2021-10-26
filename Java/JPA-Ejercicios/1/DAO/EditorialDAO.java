/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Editorial;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author blackstrack
 */
public class EditorialDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-EjerciciosFinalPU");
    EntityManager em = emf.createEntityManager();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Cargamos la editorial en la DB
    public void crearEditorialDAO(Editorial editorial) throws Exception {

        if (editorial.getAlta() == null) {
            throw new Exception("Error, el alta de la editorial esta vacia");
        }
        if (editorial.getId() == null) {
            throw new Exception("Error, la ID de la editorial esta vacia");
        }
        if (editorial.getNombre() == null) {
            throw new Exception("Error, el nombre de la editorial esta vacio");
        }

        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();

    }

    public void consultarEditorialesDAO() {

        //Creamos la coleccion de autores
        Collection<Editorial> editoriales = em.createQuery("SELECT e"
                + " FROM Editorial e").getResultList();

        //Iteramos entre autores
        for (Editorial e : editoriales) {

            System.out.println(e.getNombre());

        }

    }

    public void consultarEditorialDAO(String consulta) {

        //Creamos la query
        Editorial editorial = (Editorial) em.createQuery("SELECT e"
                + " FROM Editorial e"
                + " WHERE e.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Mostramos los datos
        System.out.println("La ID de la editorial es " + editorial.getId());
        System.out.println("El nombre de la editorial es " + editorial.getNombre());

    }
    
    public void modificarEditorialDAO(String consulta) throws Exception {
        
        //Creamos la query
        Editorial editorial = (Editorial) em.createQuery("SELECT e"
                + " FROM Editorial e"
                + " WHERE e.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Asignamos los valores
        try {
            System.out.print("Ingrese la ID para la editorial: ");
            editorial.setId(leer.nextInt());
        } catch (Exception e){
            throw new Exception("Error al ingresar la ID de la editorial");
        }
        try {
            System.out.print("Ingrese el nombre para la editorial: ");
            editorial.setNombre(leer.next());
        } catch (Exception e){
            throw new Exception("Error al ingresar el nombre de la editorial");
        }
        
        //Mandamos los datos a la DB
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        
    }
    
    public void eliminarEditorialDAO(String consulta) throws Exception {
        
        //Creamos la query
        Editorial editorial = (Editorial) em.createQuery("SELECT e"
                + " FROM Editorial e"
                + " WHERE e.nombre = :consulta").setParameter("consulta", consulta).getSingleResult();
        
        //Eliminamos los datos de la DB
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        
    }
    
}
