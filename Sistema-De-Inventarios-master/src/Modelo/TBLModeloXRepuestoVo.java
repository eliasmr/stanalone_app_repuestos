/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Elias
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TBLModeloXRepuestoVo {
    private int id;
    private TBLModeloVo modelo;
    private TBLRepuestoVo repuesto;

    @Override
    public String toString() {
        return "TBLModeloXRepuestoVo{" + "id=" + id + ", modelo=" + modelo + ", repuesto=" + repuesto + '}';
    }
    
    
    
}
