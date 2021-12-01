package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLModeloXRepuestoVo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import util.TraceInfoSistem;

/**
 *
 * @author Elias
 */
public class TBLModeloXRepuestoImpl {
    
    private static final Logger LOGGER = Logger.getLogger("TBLModeloImpl");
    private final Connection connection = Conexion.getInstance().getConexion();
    
    public TBLModeloXRepuestoImpl(){
    
    }
    
    public boolean inserModeloXRepuesto(final TBLModeloXRepuestoVo veo){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia el guardado de modelo x repuesto "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_COMBUSTIBLE)){
            pstmt.setInt(1, veo.getModelo().getId());
            pstmt.setInt(2, veo.getRepuesto().getIdRepuesto());
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al insertar modelo x repuesto", e));
        }
        return false;
    }
        public boolean deleteModeloXRepuesto(final int id){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia borrado de modelo x repuesto "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_COMBUSTIBLE)){
            pstmt.setInt(1, id);
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al borrar modelo x repuesto", e));
        }
        return false;
    }
}
