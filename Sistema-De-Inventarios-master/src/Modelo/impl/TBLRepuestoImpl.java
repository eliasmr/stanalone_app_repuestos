package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLRepuestoVo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import util.TraceInfoSistem;

/**
 *
 * @author Elias
 */
public class TBLRepuestoImpl{
    
    private static final Logger LOGGER = Logger.getLogger("TBLCombustibleImpl");
    private final Connection connection = Conexion.getInstance().getConexion();
    private ResultSet rs = null;
    private TBLModeloImpl modelo;
    
    public TBLRepuestoImpl(){}
    public TBLRepuestoImpl(TBLModeloImpl modelo){
        this.modelo = modelo;
    }
    public boolean insert(final TBLRepuestoVo rvo){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la insercion del repuesto "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_REPUESTO)){
            pstmt.setString(1, rvo.getNombre());
            pstmt.setString(2, rvo.getReferencia());
            pstmt.setString(3, rvo.getDescripcion());
             pstmt.setInt(4, rvo.getModelo().getId());
            pstmt.setString(5, rvo.getPathImagen());
            pstmt.execute();
            return true;
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("insertando repuesto", e));
        }
        return false;
    }
    
    public boolean update(final TBLRepuestoVo rvo){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia actulizacion del repuesto "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.UPDATE_REPUESTO)){
            pstmt.setString(1, rvo.getNombre());
            pstmt.setString(2, rvo.getReferencia());
            pstmt.setString(3, rvo.getDescripcion());
            pstmt.setString(4, rvo.getPathImagen());
            pstmt.setInt(5, rvo.getModelo().getId());
            pstmt.setInt(6, rvo.getIdRepuesto());
            pstmt.execute();
            return true;
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("actulizando repuesto", e));
        }
        return false;
    }
    
    public TBLRepuestoVo getRepuesto(final String param){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la busqueda del repuesto "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_REPUESTO)){
            pstmt.setString(1, param);
            rs = pstmt.executeQuery();
            if(rs.next()){
             return TBLRepuestoVo
                      .builder()
                      .nombre(rs.getString("NOMBRE"))
                      .referencia(rs.getString("REFERENCIA"))
                      .descripcion(rs.getString("DESCRIPCION"))
                      .pathImagen(rs.getString("RUTA_IMAGEN"))
                      .modelo(modelo.getModeloById(rs.getInt("ID_MODELO")))
                      .idRepuesto(rs.getInt("ID_REPUESTO"))
                      .build();
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtner datos del repuesto", e));
        }
        return null;
    }
        public TBLRepuestoVo getRepuestoByID(final int param){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta del repuesto by id "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_REPUESTO)){
            pstmt.setInt(1, param);
            rs = pstmt.executeQuery();
            if(rs.next()){
             return TBLRepuestoVo
                      .builder()
                      .nombre(rs.getString("NOMBRE"))
                      .referencia(rs.getString("REFERENCIA"))
                      .descripcion(rs.getString("DESCRIPCION"))
                      .pathImagen(rs.getString("RUTA_IMAGEN"))
                      .modelo(modelo.getModeloById(rs.getInt("ID_MODELO")))
                      .idRepuesto(rs.getInt("ID_REPUESTO"))
                      .build();
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("sl obtener repuesto por id ", e));
        }
        return null;
    }
     public List<TBLRepuestoVo> getAllRepuesto(final String param){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la busqueda de todo los repuestos "));
        List<TBLRepuestoVo> lts = new ArrayList<>();
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_REPUESTO)){
            rs = pstmt.executeQuery();
            while(rs.next()){
             TBLRepuestoVo repuesto = TBLRepuestoVo
                      .builder()
                      .nombre(rs.getString("NOMBRE"))
                      .referencia(rs.getString("REFERENCIA"))
                      .descripcion("DESCRIPCION")
                      .pathImagen("RUTA_IMAGEN")
                      .modelo(modelo.getModeloById(rs.getInt("ID_MODELO")))
                      .idRepuesto(rs.getInt("ID_REPUESTO"))
                      .build();
             lts.add(repuesto);
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener todo los repuestos", e));
        }
        return lts;
    }
}
