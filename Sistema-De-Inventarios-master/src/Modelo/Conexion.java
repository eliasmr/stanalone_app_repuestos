package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import util.TraceInfoSistem;

public class Conexion {
    

    private static final Logger LOGGER = Logger.getLogger("Conexion");
    private final String base = "partesleon";
    private final String user = "admin";
    private final String password = "root";
    private final String url = "jdbc:mysql://192.168.0.6:3307/"+base+"?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";

    private Connection con = null;
    
    public static Conexion dbInstance;
    
    public static Conexion getInstance(){
        if(dbInstance==null){
            dbInstance = new Conexion();
        }
        return dbInstance;
    }
    public Connection getConexion()
    {
      if(con == null){
         LOGGER.info(TraceInfoSistem.getTraceInfo("inicia conexion a base de datos "));
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(Exception e) {
           LOGGER.severe(TraceInfoSistem.getTraceInfoError("conectando base de datos", e));
        }
      }
      return con;  
    }

}