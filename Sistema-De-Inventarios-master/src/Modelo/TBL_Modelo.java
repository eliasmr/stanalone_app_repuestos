/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Dtos.ModeloDto;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import util.MensajesSistema;

/**
 *
 * @author Elias
 */
public class TBL_Modelo extends  Conexion{
    
    private static final Logger LOGGER = Logger.getLogger("TBL_Modelo");
    private Connection connection = getConexion();
    private ResultSet rs = null;
    public TBL_Modelo(Connection connection){
        this.connection = connection;
    }
    
    public Boolean insertaModelo(final ModeloDto dto){
        LOGGER.info(String.format(MensajesSistema.INFO_CLASS, "Insertar","TBL_Modelo"));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_MODELO)){
            pstmt.setString(1, dto.getNombre());
            pstmt.setString(2, dto.getDescripcion());
            pstmt.setString(3, dto.getPathImagen());
            pstmt.setBoolean(4, true);
            pstmt.setDate(5, dto.getFechaModelo());
            pstmt.execute();
            return true;
        } catch (Exception e) {
         LOGGER.severe(String.format(MensajesSistema.ERROR__SQL_DBA, "TBL_MODELO","TBL_Modelo","insertaModelo","27",e));
        }
        return false;
    }
    
    public ModeloDto getModelo(final String nombre){
    LOGGER.info(String.format(MensajesSistema.INFO_CLASS, "GET","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MODELO)) {
            pstmt.setString(0, nombre);
            rs = pstmt.executeQuery();
            if (rs.next()){
             return ModeloDto.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .estado(rs.getBoolean("ESTADO"))
                             .fechaModelo(rs.getDate("FECHA_MODELO"))
                             .build();
                                         
            }
        } catch (Exception e) {
            LOGGER.severe(String.format(MensajesSistema.ERROR__SQL_DBA, "TBL_MODELO","TBL_Modelo","getModelo","43",e));
        }
        return null;
    }
    
    public ModeloDto update(final ModeloDto dto){
    LOGGER.info(String.format(MensajesSistema.INFO_CLASS, "update","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.UPDATE_MODELO)) {
            pstmt.setString(0, dto.getNombre());
            pstmt.setString(1, dto.getDescripcion());
            pstmt.setString(2, dto.getPathImagen());
            pstmt.setBoolean(3, dto.getEstado());
            pstmt.setDate(4, dto.getFechaModelo());
            pstmt.setInt(5, dto.getId());
            rs = pstmt.executeQuery();
                        if (rs.next()){
             return ModeloDto.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .estado(rs.getBoolean("ESTADO"))
                             .fechaModelo(rs.getDate("FECHA_MODELO"))
                             .build();
                                         
            }
        } catch (Exception e) {
        LOGGER.severe(String.format(MensajesSistema.ERROR__SQL_DBA, "TBL_MODELO","TBL_Modelo","update","65",e));
        }
        return null;
    }
    public ModeloDto delete(final ModeloDto dto){
        LOGGER.info(String.format(MensajesSistema.INFO_CLASS, "delete","TBL_Modelo"));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.DELETE_MODELO)) {
            pstmt.setInt(0, dto.getId());
            rs = pstmt.executeQuery();
                        if (rs.next()){
             return ModeloDto.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .estado(rs.getBoolean("ESTADO"))
                             .fechaModelo(rs.getDate("FECHA_MODELO"))
                             .build();
                                         
            }
        } catch (Exception e) {
        LOGGER.severe(String.format(MensajesSistema.ERROR__SQL_DBA, "TBL_MODELO","TBL_Modelo","delete","91",e));
        }
        return null;
    }
    
}
