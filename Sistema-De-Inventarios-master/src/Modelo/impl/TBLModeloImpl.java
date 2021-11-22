/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLModelo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import util.MensajesSistema;

/**
 *
 * @author Elias
 */
public class TBLModeloImpl extends  Conexion{
    
    private static final Logger LOGGER = Logger.getLogger("TBLModeloImpl");
    private Connection connection = getConexion();
    private ResultSet rs = null;
    public TBLModeloImpl(){}
    public TBLModeloImpl(Connection connection){
        this.connection = connection;
    }
    
    public Boolean insertaModelo(final TBLModelo dto){
        LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "Insertar","TBL_Modelo"));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_MODELO)){
            pstmt.setString(1, dto.getNombre());
            pstmt.setString(2, dto.getDescripcion());
            pstmt.setString(3, dto.getPathImagen());
            pstmt.setBoolean(4, true);
            pstmt.setDate(5, dto.getFechaModelo());
            pstmt.execute();
            return true;
        } catch (Exception e) {
         LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MODELO","TBL_Modelo","insertaModelo","27",e));
        }
        return false;
    }
    
    public TBLModelo getModelo(final String nombre){
    LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "obtener datos","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MODELO)) {
            pstmt.setString(0, nombre);
            rs = pstmt.executeQuery();
            if (rs.next()){
             return TBLModelo.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .estado(rs.getBoolean("ESTADO"))
                             .fechaModelo(rs.getDate("FECHA_MODELO"))
                             .build();
                                         
            }
        } catch (Exception e) {
            LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MODELO","TBL_Modelo","getModelo","43",e));
        }
        return null;
    }
    
    public boolean update(final TBLModelo dto){
    LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "update","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.UPDATE_MODELO)) {
            pstmt.setString(1, dto.getNombre());
            pstmt.setString(2, dto.getDescripcion());
            pstmt.setString(3, dto.getPathImagen());
            pstmt.setBoolean(4, dto.getEstado());
            pstmt.setDate(5, dto.getFechaModelo());
            pstmt.setInt(6, dto.getId());
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MODELO","TBL_Modelo","update","65",e));
        }
        return false;
    }
    public boolean delete(final int id){
        LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "borrado del registro","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.DELETE_MODELO)) {
            pstmt.setInt(1, id);
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MODELO","TBL_Modelo","delete","91",e));
        }
        return false;
    }
    public List<TBLModelo> allModelo(String filtro){
         LOGGER.info(MessageFormat.format(MensajesSistema.INFO_CLASS, "todo los modelos de vehiculos","TBL_Modelo"));
        List<TBLModelo>  lts = new ArrayList<>();
        String consulta = ConsultasSQL.ALL_MODELO;
        if(!filtro.isEmpty()){
          consulta = consulta.concat(" Where  NOMBRE like '%"+filtro+"%' or ESTADO like '%"+filtro+"%' or FECHA_MODELO like '%"+filtro+"%'");
        }
         try(PreparedStatement pstmt = connection.prepareStatement(consulta)){           
            rs = pstmt.executeQuery();
            while(rs.next()){
            TBLModelo tbl = TBLModelo.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .estado(rs.getBoolean("ESTADO"))
                             .fechaModelo(rs.getDate("FECHA_MODELO"))
                             .build();
            lts.add(tbl);
            }
        } catch (Exception e) {
            LOGGER.severe(MessageFormat.format(MensajesSistema.ERROR_SQL_DBA, "TBL_MODELO","TBL_Modelo","all","118",e));
        }
         return lts;
    }
}
