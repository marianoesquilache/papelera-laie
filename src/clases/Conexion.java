package clases;

import java.sql.*;

public class Conexion {

    //Conexión Local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ie", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local." + e);
        }

        return (null);
    }
}
