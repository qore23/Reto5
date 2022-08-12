
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String UBICACION_BD = "C:/Users/sysic/Desktop/ProyectoGitHUb/RETO5/ProyectosConstruccion.db " ;
    

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
