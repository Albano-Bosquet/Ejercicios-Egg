/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import DAO.EditorialDAO;
import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class EditorialService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearEditorial() throws Exception{
        
        //Creamos los objetos necesarios
        Editorial editorial = new Editorial();
        EditorialDAO editorialDAO = new EditorialDAO();
        
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
        
        //Damos de alta a la editorial
        editorial.setAlta(true);
        
        //Mandamos los datos al DAO
        editorialDAO.crearEditorialDAO(editorial);
        
    }
    
    public void consultarEditorial(){
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que editorial le gustaria ver? Las editoriales son:");
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.consultarEditorialesDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        editorialDAO.consultarEditorialDAO(consulta);
        
    }
    
    public void modificarEditorial() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que editorial le gustaria modificar? Las editoriales son:");
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.consultarEditorialesDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        editorialDAO.modificarEditorialDAO(consulta);
        
    }
    
    public void eliminarEditorial() throws Exception{
        
        //Hacemos un string para la consulta
        String consulta;
        
        //Mostramos los autores
        System.out.println("Que editorial le gustaria eliminar? Las editoriales son:");
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.consultarEditorialesDAO();
        
        //Definimos la consulta
        consulta = leer.next();
        
        //Mandamos la consulta al DAO
        editorialDAO.eliminarEditorialDAO(consulta);
        
    }
    
}
