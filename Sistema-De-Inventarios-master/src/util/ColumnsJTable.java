/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Elias
 */
public class ColumnsJTable {
    
    //pamas jtable repuestos
    public static String COLUMNS_REPUESTOS[] = {"#","Nombre","Referencia","Imagen","Descripcion","Codigo","Ver Imagen"};
    public static Boolean COLUMNS_REPUESTOS_EDITABLE[] = {false,false,false,false,false,false,false,false,false,false};
    public static Class[] COLUMNS_REPUESTOS_TIPO_DATO = new Class[]{java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class};
    public static int COLUMNS_REPUESTOS_RENDERIZABLE[] = {1,2,3,5}; //datos que se muestran menos btns(no se renderizan)
    public static Integer COLUMNS_REPUESTOS_TAMANIO_EN_LA_TABLA[] = {100,50,100,200}; //espacion para cada campo en la tabla
    public static int COLUMNS_REPUESTOS_OCULTAS[] = {3,5}; //celdas ocultas en la tabla
    
    
}
