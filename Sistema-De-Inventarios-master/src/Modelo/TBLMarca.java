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
public class TBLMarca {
  private int idMarca;
  private String nombre;
  private String codigo;
  private String descripcion;
  private String pathImagen;
  private Boolean estado;
  private TBLModelo idModelo;
  
}
