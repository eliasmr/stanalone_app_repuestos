/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julito
 */
public class Conexionproducto {
    private final String base = "repuestos";
    private final String user = "admin";
    private final String password = "3HEDWl20";
    private final String url = "jdbc:mysql://mysql-58329-0.cloudclusters.net:12049/" + base;
    private Connection con = null;
    
    public Connection getConexion()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        }
        catch(SQLException e)
                {
            System.err.println(e);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexionproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
