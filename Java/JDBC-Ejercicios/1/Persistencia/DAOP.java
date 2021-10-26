package Ejercicio1.Persistencia;

import java.sql.SQLException;

public class DAOP extends DAO{

    public void consultarNombresProductos(String sql) throws Exception{

        try {
            estadoSQL = conexionSQL.createStatement();
            resultadoSQL = estadoSQL.executeQuery(sql);
            while (resultadoSQL.next()){
                System.out.println("Nombre del producto: " + resultadoSQL.getString("nombre"));
            }
        } catch (Exception e){
            throw e;
        }

    }

    public void consultarNombresyPreciosProductos(String sql) throws Exception{

        try {
            estadoSQL = conexionSQL.createStatement();
            resultadoSQL = estadoSQL.executeQuery(sql);
            while (resultadoSQL.next()){
                System.out.println("Nombre del producto: " + resultadoSQL.getString("nombre") +
                        ", Precio del producto: " + resultadoSQL.getString("precio"));
            }
        } catch (Exception e){
            throw e;
        }

    }

    public void consultarProductosEntrePrecios(String sql) throws Exception{

        try {
            estadoSQL = conexionSQL.createStatement();
            resultadoSQL = estadoSQL.executeQuery(sql);
            while (resultadoSQL.next()){
                System.out.println("Nombre del producto: " + resultadoSQL.getString("nombre") +
                        ", Precio del producto: " + resultadoSQL.getString("precio") +
                        ", Codigo del producto: " + resultadoSQL.getString("codigo") +
                        ", Codigo del Fabricante del producto: " + resultadoSQL.getString("codigo_fabricante"));
            }
        } catch (Exception e){
            throw e;
        }

    }

    public void listarProductosPortatiles(String sql) throws Exception{

        try {
            estadoSQL = conexionSQL.createStatement();
            resultadoSQL = estadoSQL.executeQuery(sql);
            while (resultadoSQL.next()){
                System.out.println("Nombre del producto: " + resultadoSQL.getString("nombre") +
                        ", Precio del producto: " + resultadoSQL.getString("precio") +
                        ", Codigo del producto: " + resultadoSQL.getString("codigo") +
                        ", Codigo del Fabricante del producto: " + resultadoSQL.getString("codigo_fabricante"));
            }
        } catch (Exception e){
            throw e;
        }

    }

    public void agregarProducto(String sql) throws SQLException {

        try {
            estadoSQL = conexionSQL.createStatement();
            estadoSQL.executeUpdate(sql);
        } catch (Exception e){
            throw e;
        }

    }

}
