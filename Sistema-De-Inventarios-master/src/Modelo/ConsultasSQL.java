/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elias
 */
public class ConsultasSQL {
    public final static String INSERT_MODELO = "INSERT INTO TBL_MODELO(NOMBRE,DESCRIPCION,RUTA_IMAGEN,ESTADO,FECHA_MODELO) VALUES(?,?,?,?,?)";
    public final static String GET_MODELO = "SELECT * FROM TBL_MODELO M WHERE M.NOMBRE LIKE '%{0}%'";
    public final static String UPDATE_MODELO = "UPDATE TBL_MODELO set NOMBRE={0},DESCRIPCION={1}, RUTA_IMAGEN={2}, ESTADO={3}, FECHA_MODELO={4} WHERE ID_MODELO={5}";
    public final static String DELETE_MODELO = "DELETE FROM TBL_MODELO WHERE ID_MODELO = {0}";
    
}
