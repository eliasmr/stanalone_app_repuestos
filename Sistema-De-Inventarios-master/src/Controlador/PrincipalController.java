/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.TBLMarcaImpl;
import Modelo.impl.TBLModeloImpl;
import java.util.List;

/**
 *
 * @author Elias
 */
public class PrincipalController {
    
    private final TBLMarcaImpl marcas;
    
    //carga listas
    private final TBLModeloImpl impl;
    private DropBoxImpl drb;
    public PrincipalController(){
     this.marcas = new TBLMarcaImpl();
     this.impl = new TBLModeloImpl();
     this.drb = new DropBoxImpl();
    }
    
    public TBLMarcaVo marcasCarros(final int id){
        return marcas.getMarcaById(id);
    }
    
    public List<TBLModeloVo> listaModelo(){
     return impl.allModelo();
    }
    
}