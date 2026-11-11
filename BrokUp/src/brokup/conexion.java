package brokup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion 
{

    private static final String URL =
            "jdbc:mysql://localhost:3306/database";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public Connection conexion() throws SQLException 
        {
        try 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } 
        catch (ClassNotFoundException e) 
            {
                throw new SQLException("No se encontró el driver de MySQL.", e);
            }

        return DriverManager.getConnection(URL, USUARIO, CLAVE);
        }
}
