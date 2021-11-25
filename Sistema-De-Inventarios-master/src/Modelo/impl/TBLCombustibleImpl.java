
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLTipoCombustibleVo;
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
public class TBLCombustibleImpl extends  Conexion{
    
    private static final Logger LOGGER = Logger.getLogger("TBLCombustibleImpl");
    private final Connection connection = getConexion();
    private ResultSet rs = null;
    public TBLCombustibleImpl(){
    }
    
    public List<TBLTipoCombustibleVo> getAllTipoCpmbustible(){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta de todos los tipos de combustible"));
        List<TBLTipoCombustibleVo> ltsCombustible = new ArrayList<>();
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_COMBUSTIBLE)){
            rs = pstmt.executeQuery();
            while(rs.next()){
           TBLTipoCombustibleVo tipoCombustible = TBLTipoCombustibleVo
                                                .builder()
                                                .idTipoCombustible(rs.getInt("ID_TIPO_COMBUSTIBLE"))
                                                .nombre(rs.getString("NOMBRE"))
                                                .descripcion(rs.getString("DESCRIPCION"))
                                                .build();
           ltsCombustible.add(tipoCombustible);
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener todos los tipos de combustible", e));
        }
        return ltsCombustible;
    }
    public TBLTipoCombustibleVo getTipoCombustibleByNombre(final int param){
        LOGGER.info(TraceInfoSistem.getTraceInfo("consulta de tipo combustible por nombre"));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_COMBUSTIBLE)){
            pstmt.setInt(1, param);
            rs = pstmt.executeQuery();
            if(rs.next()){
            return TBLTipoCombustibleVo
                     .builder()
                     .nombre(rs.getString("NOMBRE"))
                     .descripcion(rs.getString("DESCRIPCION"))
                     .build();
            }
            
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener tipo combustible por nombre", e));
        }
        return null;
    }
}
