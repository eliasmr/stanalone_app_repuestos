package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLModeloVo;
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
public class TBLModeloImpl extends  Conexion{
    
    private static final Logger LOGGER = Logger.getLogger("TBLModeloImpl");
    private final Connection connection = getConexion();
    private ResultSet rs = null;
    private TBLCombustibleImpl tipoCombustible;
    private TBLRepuestoImpl repuestoImpl;
    private TBLMarcaImpl marcaImpl;
    
    public TBLModeloImpl(){}
    public TBLModeloImpl(TBLCombustibleImpl tipoCombustible, TBLRepuestoImpl repuesto, TBLMarcaImpl marca){
         this.tipoCombustible = tipoCombustible;
         this.repuestoImpl  = repuesto;
         this.marcaImpl = marca;
    }
    public Boolean insertaModelo(final TBLModeloVo dto){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia el guardado del modelo "));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_MODELO)){
            pstmt.setString(1, dto.getNombre());
            pstmt.setString(2, dto.getAno());
            pstmt.setString(3, dto.getCilindraje());
            pstmt.setInt(4, dto.getTipoCombustible().getIdTipoCombustible());
            pstmt.setString(5, dto.getDescripcion());
            pstmt.setInt(6, dto.getRepuestos().getIdRepuesto());
            pstmt.setInt(7, dto.getIdMarca().getIdMarca());
            pstmt.execute();
            return true;
        } catch (Exception e) {
         LOGGER.severe(TraceInfoSistem.getTraceInfoError("al insertar modelo del carro", e));
        }
        return false;
    }
    
    public TBLModeloVo getModelo(final String nombre){
   LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la busqueda del modelo "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MODELO)) {
            pstmt.setString(0, nombre);
            rs = pstmt.executeQuery();
            if (rs.next()){
             return TBLModeloVo.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .ano(rs.getString("ANO"))
                             .cilindraje(rs.getString("CILINDRAJE"))
                             .tipoCombustible(tipoCombustible.getTipoCombustibleByNombre(rs.getInt("ID_TIPO_COMBUSTIBLE")))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .repuestos(repuestoImpl.getRepuestoByID(rs.getInt("ID_REPUESTO")))
                             .idMarca(marcaImpl.getMarcaById(rs.getInt("ID_MARCA")))
                             .build();
                                         
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener el modelo del carro", e));
        }
        return null;
    }
    
    public boolean update(final TBLModeloVo dto){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia actulizacion del modelo "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.UPDATE_MODELO)) {
            pstmt.setString(1, dto.getNombre());
            pstmt.setString(2, dto.getAno());
            pstmt.setString(3, dto.getCilindraje());
            pstmt.setInt(4, dto.getTipoCombustible().getIdTipoCombustible());
            pstmt.setString(5, dto.getDescripcion());
            pstmt.setInt(6, dto.getRepuestos().getIdRepuesto());
            pstmt.setInt(7, dto.getIdMarca().getIdMarca());
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al actulizar el modelo delos carros", e));
        }
        return false;
    }
    public boolean delete(final int id){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia el borrado del modelo "));
        try(PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.DELETE_MODELO)) {
            pstmt.setInt(1, id);
            pstmt.execute();
            return true;
        } catch (Exception e) {
        LOGGER.severe(TraceInfoSistem.getTraceInfoError("al borrar el modelo del carro", e));
        }
        return false;
    }
    public List<TBLModeloVo> allModelo(String filtro){
         LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la busqueda de todo los modelos de los carros "));
        List<TBLModeloVo>  lts = new ArrayList<>();
        String consulta = ConsultasSQL.ALL_MODELO;
        if(!filtro.isEmpty()){
          consulta = consulta.concat(" Where  NOMBRE like '%"+filtro+"%' or ESTADO like '%"+filtro+"%' or FECHA_MODELO like '%"+filtro+"%'");
        }
         try(PreparedStatement pstmt = connection.prepareStatement(consulta)){           
            rs = pstmt.executeQuery();
            while(rs.next()){
            TBLModeloVo tbl = TBLModeloVo.builder()
                             .id(rs.getInt("ID_MODELO"))
                             .nombre(rs.getString("NOMBRE"))
                             .ano(rs.getString("ANO"))
                             .cilindraje(rs.getString("CILINDRAJE"))
                             .tipoCombustible(tipoCombustible.getTipoCombustibleByNombre(rs.getInt("ID_TIPO_COMBUSTIBLE")))
                             .descripcion(rs.getString("DESCRIPCION"))
                             .pathImagen(rs.getString("RUTA_IMAGEN"))
                             .repuestos(repuestoImpl.getRepuestoByID(rs.getInt("ID_REPUESTO")))
                             .idMarca(marcaImpl.getMarcaById(rs.getInt("ID_MARCA")))
                             .build();
            lts.add(tbl);
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener todo los modelos delos carros", e));
        }
         return lts;
    }
    
    public TBLModeloVo getModeloById(final int id){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la busqueda del modelo by id "));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MODELO_BY_ID)){
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                return TBLModeloVo.builder()
                    .id(rs.getInt("ID_MODELO"))
                    .nombre(rs.getString("NOMBRE"))
                    .ano(rs.getString("ANO"))
                    .cilindraje(rs.getString("CILINDRAJE"))
                    .tipoCombustible(tipoCombustible.getTipoCombustibleByNombre(rs.getInt("ID_TIPO_COMBUSTIBLE")))
                    .descripcion(rs.getString("DESCRIPCION"))
                    .pathImagen(rs.getString("RUTA_IMAGEN"))
                    .repuestos(repuestoImpl.getRepuestoByID(rs.getInt("ID_REPUESTO")))
                    .idMarca(marcaImpl.getMarcaById(rs.getInt("ID_MARCA")))
                    .build();
            }
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("al obtener el modelo por id", e));
        }
        return null;
    }
}
