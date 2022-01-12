package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLModeloXRepuestoVo;
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
public class TBLModeloXRepuestoImpl {
    
    private static final Logger LOGGER = Logger.getLogger("TBLModeloImpl");
    private final Connection connection = Conexion.getInstance().getConexion();
    private ResultSet rs = null;
    private TBLRepuestoImpl repuesto;
    private TBLModeloImpl modelo;
    public TBLModeloXRepuestoImpl(){
        repuesto = new TBLRepuestoImpl();
        modelo = new TBLModeloImpl();
    }
    
   public Boolean insert(List<TBLModeloXRepuestoVo> ltsModeloXRepuestoVo){
       LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la insercion de la repuesto x modelo "));
       try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_REPUESTO_X_MODELO)){
           for(TBLModeloXRepuestoVo reg: ltsModeloXRepuestoVo ){
            pstmt.setInt(1, reg.getRepuesto().getIdRepuesto());
            pstmt.setInt(2, reg.getModelo().getId());
            pstmt.execute();
           }
           return true;
       }catch (Exception e) {
         LOGGER.severe(TraceInfoSistem.getTraceInfoError("insertando repuesto x modelo ", e));
       }
       return false;
   }
   
   public List<TBLModeloXRepuestoVo> getAllByIdMarca(int idMarca){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia busqueda repuesto x modelo "));
    List<TBLModeloXRepuestoVo> lts = new ArrayList<>();
   try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_REPUESTO_X_MODELO_BY_ID_MARCA)){
       pstmt.setInt(1, idMarca);
        rs = pstmt.executeQuery();
        while(rs.next()){
            TBLModeloXRepuestoVo tmr = new TBLModeloXRepuestoVo();
            tmr.setId(rs.getInt("ID_REPUESTO_X_MODELO"));
            tmr.setRepuesto(repuesto.getRepuestoByIDRepuesto(rs.getInt("ID_REPUESTO")));
            tmr.setModelo(modelo.getModeloByIdModelo(rs.getInt("ID_MODELO")));
            lts.add(tmr);
        }
   }catch (Exception e) {
     LOGGER.severe(TraceInfoSistem.getTraceInfoError("buscando repuesto x modeloo ", e));
   }
   return lts;
   }
   
   public List<TBLModeloXRepuestoVo> getAllBy(){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia busqueda repuesto x modelo "));
    List<TBLModeloXRepuestoVo> lts = new ArrayList<>();
   try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_REPUESTO_X_MODELO)){
        rs = pstmt.executeQuery();
        while(rs.next()){
            TBLModeloXRepuestoVo tmr = new TBLModeloXRepuestoVo();
            tmr.setId(rs.getInt("ID_REPUESTO_X_MODELO"));
            tmr.setRepuesto(repuesto.getRepuestoByIDRepuesto(rs.getInt("ID_REPUESTO")));
            tmr.setModelo(modelo.getModeloById(rs.getInt("ID_MODELO")));
            lts.add(tmr);
        }
   }catch (Exception e) {
     LOGGER.severe(TraceInfoSistem.getTraceInfoError("buscando repuesto x modeloo ", e));
   }
   return lts;
   }
   public Boolean getAllByIDmodeloIDRepuesto(int idRepuesto, int idModelo){
   LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta repuesto x modelo by idRepuesto , idModelo"));
   Boolean bandera = false;
       try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_REPUESTO_MODELO_BY_IDMODELO_IDREPUESTO)){
           pstmt.setInt(1, idModelo);
           pstmt.setInt(2, idRepuesto);
         
         rs = pstmt.executeQuery();
        while(rs.next()){
            bandera = true;
            break;
        }
    }catch (Exception e) {
     LOGGER.severe(TraceInfoSistem.getTraceInfoError("borrando repuesto x modelo by idRepuesto , idModelo ", e));
   }
       return bandera;
   }
   public Boolean delete(int id){
   LOGGER.info(TraceInfoSistem.getTraceInfo("inicia borrado repuesto x modelo "));
    try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.DELETE_REPUESTO_X_MODELO)){
         pstmt.setInt(1, id);
         pstmt.execute();
         return true;
    }catch (Exception e) {
     LOGGER.severe(TraceInfoSistem.getTraceInfoError("borrando repuesto x modeloo ", e));
   }
    return false;
   }
}
