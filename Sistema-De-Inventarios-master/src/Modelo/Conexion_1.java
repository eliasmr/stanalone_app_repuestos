
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion_1 {
    private final String base = "repuestos";
    private final String user = "admin";
    private final String password = "3HEDWl20";
    private final String url = "jdbc:mysql://mysql-58329-0.cloudclusters.net:12049/" + base;
    private Connection con = null;
    
    public com.mysql.jdbc.Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}

    

