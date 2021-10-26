package Ejercicio1.Persistencia;

import java.sql.SQLException;

public class DAOF extends DAO{

    public void agregarFabricante(String sql) throws Exception{

        try {
            estadoSQL = conexionSQL.createStatement();
            estadoSQL.executeUpdate(sql);
        } catch (Exception e){
            throw e;
        }

    }

}
