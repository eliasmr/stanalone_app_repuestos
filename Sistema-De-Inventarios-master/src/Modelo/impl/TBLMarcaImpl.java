/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.impl;

import Modelo.Conexion;
import Modelo.ConsultasSQL;
import Modelo.TBLMarcaVo;
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
public class TBLMarcaImpl extends Conexion {
    private static final Logger LOGGER = Logger.getLogger("TBLMarcaImpl");
    private final Connection connection = getConexion();
    private ResultSet rs = null;
    private TBLModeloImpl marcaImpl;
    
    public TBLMarcaImpl(){}
    
    public TBLMarcaImpl(Connection connection, TBLModeloImpl marca){
        this.marcaImpl=marca;
    }
    
    public Boolean insertaMarca(final TBLMarcaVo marca){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia la insercion de la marca "));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.INSERT_MARCA)){
            pstmt.setString(1, marca.getNombre());
            pstmt.setString(3, marca.getDescripcion());
            pstmt.setInt(6, marca.getIdModelo().getId());
            pstmt.execute();
            return true;
        } catch (Exception e) {
         LOGGER.severe(TraceInfoSistem.getTraceInfoError("insertando marca", e));
        }
        return false;
    }
    
    public boolean  updateMarca(final TBLMarcaVo vo){
    LOGGER.info(TraceInfoSistem.getTraceInfo("inicia actualizacion de los datos "));
            try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.UPDATE_MARCA)){
                pstmt.setString(1, vo.getNombre());
                pstmt.setString(2, vo.getDescripcion());
                pstmt.setInt(3, vo.getIdModelo().getId());
                pstmt.setInt(4, vo.getIdMarca());
                return true;
            } catch (Exception e) {
                LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo realziando actulizacion", e));
            }
            return false;
    }
    public TBLMarcaVo getMarcaById(final String nombre){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta by id "+nombre));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MARCA)){
            pstmt.setString(1, nombre);
            rs = pstmt.executeQuery();
            if(rs.next()){
             TBLMarcaVo
                     .builder()
                     .idMarca(rs.getInt("ID_MARCA"))
                     .nombre(rs.getString("NOMBRE"))
                     .descripcion(rs.getString("DESCRIPCION"))
                     .idModelo(marcaImpl.getModeloById(rs.getInt("ID_MODELO")))
                     .build();
            }
            
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo marca por id", e));
        }
        return null;
    }
    public TBLMarcaVo getMarcaById(final int id){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta by id "+id));
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.GET_MARCA_BY_ID)){
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
             TBLMarcaVo
                     .builder()
                     .idMarca(rs.getInt("ID_MARCA"))
                     .nombre(rs.getString("NOMBRE"))
                     .descripcion(rs.getString("DESCRIPCION"))
                     .idModelo(marcaImpl.getModeloById(rs.getInt("ID_MODELO")))
                     .build();
            }
            
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo marca por id", e));
        }
        return null;
    }
        public List<TBLMarcaVo> getMarcaAll(){
        LOGGER.info(TraceInfoSistem.getTraceInfo("inicia consulta de toda las marcas "));
        List<TBLMarcaVo> lts = new ArrayList<>();
        try (PreparedStatement pstmt = connection.prepareStatement(ConsultasSQL.ALL_MARCA)){
            rs = pstmt.executeQuery();
            while(rs.next()){
            TBLMarcaVo marca = TBLMarcaVo
                                .builder()
                                .idMarca(rs.getInt("ID_MARCA"))
                                .nombre(rs.getString("NOMBRE"))
                                .descripcion(rs.getString("DESCRIPCION"))
                                .idModelo(marcaImpl.getModeloById(rs.getInt("ID_MODELO")))
                                .build();
            lts.add(marca);
            }
            
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo marca por id", e));
        }
        return lts;
    }
    
}
