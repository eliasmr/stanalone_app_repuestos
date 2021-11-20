
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.text.MessageFormat;
import java.util.logging.Logger;
import util.MensajesSistema;

public class Conexion {
    
    private static Logger LOGGER = Logger.getLogger("Conexion");
    private final String base = "repuestos";
    private final String user = "admin";
    private final String password = "3HEDWl20";
    private final String url = "jdbc:mysql://mysql-58329-0.cloudclusters.net:12049/" + base+"?characterEncoding=latin1";
    private Connection con = null;
    
    public Connection getConexion()
    {
      LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "inicia conexion a dba ",base));
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(Exception e) {
           LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_CONEXION_DBA, base,e));
        }
      return con;  
    }

}
