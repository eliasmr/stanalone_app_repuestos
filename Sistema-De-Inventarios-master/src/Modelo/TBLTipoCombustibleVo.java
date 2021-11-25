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
public class TBLTipoCombustibleVo {
  private int idTipoCombustible;
  private String nombre;
  private String descripcion;
  
}
