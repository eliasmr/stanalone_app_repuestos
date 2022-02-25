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
public class TBLSession {
    private String userName;
    private String descripcion;
    private Boolean dropbox;
    private String pathFolderRecursos;
    private Boolean autorizado;
    private Boolean userHabilitado;
    
    private Boolean errorConectandoDba;
     
    private String nombreDba;
    private String nombreUsuarioDba;
    private String contraseniaDba;
    private String hostDba;
    private String puertoDba;
    
   
}
