/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLSession;
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
    
    public  TBLSession validaSession(TBLSession session){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia validacion de segudad "));
    String userName = System.getProperty("user.name");
    try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_SESSION)) {
        pstmt.setString(1, userName);
        rs = pstmt.executeQuery();
            if(rs.next()){
                session.setUserName(rs.getString("NOMBRE"));
                session.setDescripcion(rs.getString("DESCRIPCION"));
                session.setDropbox(rs.getBoolean("DROPBOX"));
                session.setPathFolderRecursos(rs.getString("PATH_FOLDER_RECURSOS"));
                session.setUserHabilitado(rs.getBoolean("USER_HABILITADO"));
                session.setAutorizado(Boolean.TRUE);
            }else{
             session.setAutorizado(Boolean.FALSE);
            }
            session.setErrorConectandoDba(Boolean.FALSE);
           return session;
    } catch (Exception e) {
        session.setErrorConectandoDba(Boolean.TRUE);
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtner datos de la session", e));
    }
    return session;
    }
    
    
}
