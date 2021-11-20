/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLMarca;
import Modelo.TBLModelo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Logger;
import util.MensajesSistema;

/**
 *
 * @author Elias
 */
public class TBLMarcaImpl extends Conexion {
    private static final Logger LOGGER = Logger.getLogger("TBLMarcaImpl");
    private Connection connection = getConexion();
    private ResultSet rs = null;
    
    public TBLMarcaImpl(){}
    
    public TBLMarcaImpl(Connection connection){
        this.connection = connection;
    }
    
        public Boolean insertaMarca(final TBLMarca marca){
        LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "Insertar","TBL_MARCA"));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_MARCA)){
            pstmt.setString(1, marca.getNombre());
            pstmt.setString(2, marca.getCodigo());
            pstmt.setString(3, marca.getDescripcion());
            pstmt.setString(4, marca.getPathImagen());
            pstmt.setBoolean(5, true);
            pstmt.setInt(6, marca.getIdModelo().getId());
            pstmt.execute();
            return true;
        } catch (Exception e) {
         LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MARCA","TBL_MARCA","insertaModelo","33",e));
        }
        return false;
    }
}
