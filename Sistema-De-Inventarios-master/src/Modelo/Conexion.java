package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import util.TraceInfoSistem;

public class Conexion {
    

    private static final Logger LOGGER = Logger.getLogger("Conexion");
    private final String base = "autopart_leon";//"partesleon";
    private final String user ="autopart_root";//"admin";
    private final String password = "autopartesleon";//"Root2022";
    private final String dominio = "joel.colombiahosting.com.co"; //"192.168.1.11"; 
    private final String puerto = "3306"; //"3307";
    private final String url = "jdbc:mysql://".concat(dominio).concat(":").concat(puerto).concat("/").concat(base)+"?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";

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