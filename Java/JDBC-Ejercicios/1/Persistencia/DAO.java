package Ejercicio1.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {

    Connection conexionSQL = null;
    Statement estadoSQL = null;
    ResultSet resultadoSQL = null;

    private final String USUARIO = "root";
    private final String CONTRASEÑA = "0561";
    private String BASEDEDATOS = "tienda";
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/" + BASEDEDATOS + "?useSSL=false";

    public void conectarBaseDeDatos() throws Exception{
        try {
            conexionSQL = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (Exception e){
            throw e;
        }
    }

    public void desconectarBaseDeDatos() throws Exception{
        try {
            if (conexionSQL != null){
                conexionSQL.close();
            }
            if (estadoSQL != null){
                conexionSQL.close();
            }
            if (resultadoSQL != null){
                resultadoSQL.close();
            }
        } catch (Exception e){
            throw e;
        }
    }

    public void modificarBaseDeDatos(String sql) throws Exception{
        try {
            estadoSQL = conexionSQL.createStatement();
            estadoSQL.executeUpdate(sql);
        } catch (Exception e){
            throw e;
        }
    }

}
