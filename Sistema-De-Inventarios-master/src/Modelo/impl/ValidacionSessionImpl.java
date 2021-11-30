/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import util.TraceInfoSistem;

/**
 *
 * @author Elias
 */
public class ValidacionSessionImpl {
    
    private static final Logger LOGGER = Logger.getLogger("ValidacionSessionImpl");
    private final Connection connection = Conexion.getInstance().getConexion();
    private ResultSet rs = null;
    
    public boolean validaSession(){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia validacion de segudad "));
    String userName = System.getProperty("user.name");
    Boolean  valSession = false;
    try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_SESSION)) {
        pstmt.setString(1, userName);
        rs = pstmt.executeQuery();
            if(rs.next()){
             valSession =  !rs.getString("NOMBRE").isEmpty();
            }
           return valSession;
    } catch (Exception e) {
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtner datos de la session", e));
    }
    return valSession;
    }
    
    
}
