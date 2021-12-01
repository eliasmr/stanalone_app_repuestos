/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

import lombok.Getter;

/**
 *
 * @author Elias
 */
@Getter
public enum MarcasCarros {
    TOYOTA(1,"Toyota"),
    MITSUBISHI(2,"Mitsubishi"),
     NISSAN(3,"Nissan"),
    DAIHATSU(4,"Daihatsu");
   
    
    
    private int id;
    private String marca;

    private MarcasCarros(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }
    


    
    
    
}
