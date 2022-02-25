/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.TBLModeloXRepuestoVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.TBLMarcaImpl;
import Modelo.impl.TBLModeloImpl;
import Modelo.impl.TBLModeloXRepuestoImpl;
import Modelo.impl.TBLRepuestoImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
/**
 *
 * @author Elias
 */
public class PrincipalController {
    
    public static List<TBLModeloXRepuestoVo> ltsTBLModeloXRepuestoVo;
    public static List<TBLModeloXRepuestoVo> ltsModeloXRepuestoVo;
    public static List<TBLModeloVo> ltsModelo;
    private List<TBLMarcaVo> ltsTBLMarcaVo;
    private TBLMarcaImpl marcas;

    public PrincipalController(){
     ltsTBLModeloXRepuestoVo = new TBLModeloXRepuestoImpl().getAllBy();
     ltsModeloXRepuestoVo = new TBLModeloXRepuestoImpl().getAllBy();
     ltsModelo = new TBLModeloImpl().allModelos();
     ltsTBLMarcaVo = new TBLMarcaImpl().getMarcaAll();
    }
    
    
    public TBLMarcaVo marcasCarros(final int id){
        return ltsTBLMarcaVo.stream().filter(obj -> obj.getIdMarca() == id).collect(Collectors.toList()).get(0);
    }
}
