/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLMarcaVo;
import Modelo.impl.TBLMarcaImpl;

/**
 *
 * @author Elias
 */
public class PrincipalController {
    
    private final TBLMarcaImpl marcas;
    
    public PrincipalController(){
     this.marcas = new TBLMarcaImpl();
    }
    
    public TBLMarcaVo marcasCarros(final int id){
        return marcas.getMarcaById(id);
    }
    
}
