/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidades.Autor;
import DAO.AutorDAO;
import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class AutorService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAutor() throws Exception{
        
        //Creamos los objetos necesarios
        Autor autor = new Autor();
        AutorDAO autorDAO = new AutorDAO();
        
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
        
        //Damos de alta al autor
        autor.setAlta(true);
        
        //Mandamos los datos al DAO
        autorDAO.crearAutorDAO(autor);
        
    }
    
    public void consultarAutor(){
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que autor le gustaria ver? Los autores son:");
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.consultarAutoresDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        autorDAO.consultarAutorDAO(consulta);
        
    }
    
    public void modificarAutor() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que autor le gustaria modificar? Los autores son:");
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.consultarAutoresDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        autorDAO.modificarAutorDAO(consulta);
        
    }
    
    public void eliminarAutor() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que autor le gustaria eliminar? Los autores son:");
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.consultarAutoresDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        autorDAO.eliminarAutorDAO(consulta);
        
    }
    
}
