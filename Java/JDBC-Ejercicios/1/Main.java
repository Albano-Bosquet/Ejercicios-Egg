package Ejercicio1;

import Ejercicio1.Entidades.Fabricante;
import Ejercicio1.Entidades.Producto;
import Ejercicio1.Persistencia.DAOF;
import Ejercicio1.Persistencia.DAOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        DAOF daof = new DAOF();
        DAOP daop = new DAOP();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Integer decision;

        do {
            //Menu
            System.out.println("HAGA SU ELECCION:");
            System.out.println("1. Listar el nombre de todos los productos que hay en la tabla producto");
            System.out.println("2. Listar los nombres y los precios de todos los productos de la tabla producto");
            System.out.println("3. Listar aquellos productos que su precio esta entre 120 y 202");
            System.out.println("4. Listar los portatiles de la tabla producto");
            System.out.println("5. Listar el nombre y el precio del producto mas barato");
            System.out.println("6. Ingresar un producto a la base de datos");
            System.out.println("7. Ingresar un fabricante a la base de datos");
            System.out.println("8. Editar un producto con datos a eleccion");
            System.out.println("9. SALIR");

            //Ponemos nuestra decision
            do{
                decision = leer.nextInt();
            } while (decision < 0 || decision > 10);

            //Realizamos lo que queremos dependiendo lo que hayamos puesto anteriormente
            switch (decision){

                case 1:
                    System.out.println();

                    String sql1 = "SELECT * FROM producto;";
                    System.out.println("PRODUCTOS:");
                    daop.conectarBaseDeDatos();
                    daop.consultarNombresProductos(sql1);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 2:
                    System.out.println();

                    String sql2 = "SELECT * FROM producto;";
                    System.out.println("PRODUCTOS CON SUS PRECIOS:");
                    daop.conectarBaseDeDatos();
                    daop.consultarNombresyPreciosProductos(sql2);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 3:
                    System.out.println();

                    String sql3 = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202 ORDER BY precio;";
                    System.out.println("PRODUCTOS QUE TIENEN UN PRECIO ENTRE $120 Y $202:");
                    daop.conectarBaseDeDatos();
                    daop.consultarProductosEntrePrecios(sql3);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 4:
                    System.out.println();

                    String sql4 = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";
                    System.out.println("PRODUCTOS PORTATILES:");
                    daop.conectarBaseDeDatos();
                    daop.listarProductosPortatiles(sql4);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 5:
                    System.out.println();

                    String sql5 = "SELECT * FROM producto ORDER BY precio LIMIT 1;";
                    System.out.println("PRODUCTO MAS BARATO:");
                    daop.conectarBaseDeDatos();
                    daop.consultarNombresyPreciosProductos(sql5);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 6:
                    System.out.println();

                    Producto producto = new Producto();
                    System.out.println("AGREGAR UN PRODUCTO:");
                    producto.crearProducto();
                    String sql6 = "INSERT INTO producto VALUES(" + producto.getCodigo() + ",'" + producto.getNombre() + "'," + producto.getPrecio() + "," + producto.getCodigoFabricante() + ");";
                    daop.conectarBaseDeDatos();
                    daop.agregarProducto(sql6);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 7:
                    System.out.println();

                    Fabricante fabricante = new Fabricante();
                    System.out.println("AGREGAR UN FABRICANTE:");
                    fabricante.crearFabricante();
                    String sql7 = "INSERT INTO fabricante VALUES(" + fabricante.getCodigo() + ",'" + fabricante.getNombre() + "','" + fabricante.getNacionalidad() + "');";
                    daof.conectarBaseDeDatos();
                    daof.agregarFabricante(sql7);
                    daof.desconectarBaseDeDatos();

                    System.out.println();
                    break;
                case 8:
                    System.out.println();

                    String eleccion;
                    System.out.println("MODIFICAR UN PRODUCTO:");
                    System.out.println("Que producto desea modificar?");
                    daop.conectarBaseDeDatos();
                    daop.consultarNombresProductos("SELECT * FROM producto");
                    eleccion = leer.next();

                    //Ponemos los datos del producto a modificar
                    System.out.print("Indique el codigo del producto a modificar: ");
                    Integer codigo = leer.nextInt();
                    System.out.print("Indique el nombre del producto a modificar: ");
                    String nombre = leer.next();
                    System.out.print("Indique el precio del producto a modificar: ");
                    Double precio = leer.nextDouble();
                    System.out.print("Indique el codigo fabricante del producto a modificar: ");
                    Integer codigoFabricante = leer.nextInt();

                    String sql8 = "UPDATE producto SET codigo = " + codigo + ", nombre = '" + nombre + "', precio = " + precio + ", codigo_fabricante = " + codigoFabricante + " WHERE nombre = '" + eleccion + "'";
                    daop.conectarBaseDeDatos();
                    daop.modificarBaseDeDatos(sql8);
                    daop.desconectarBaseDeDatos();

                    System.out.println();
                    break;

            }

        }while (decision != 9);

    }
}
