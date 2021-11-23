/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLModelo;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.TBLModeloImpl;
import Vista.FrmCrearModeloCarrro;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias
 */
public class ModeloCarroController{

    private TBLModeloImpl impl;
    private TBLModelo model;
    private FrmCrearModeloCarrro frm;
    
    public ModeloCarroController(){
      this.impl = new TBLModeloImpl();
    }
    public ModeloCarroController(FrmCrearModeloCarrro frm,TBLModeloImpl impl,TBLModelo model){
    /*DropBoxImpl im =  new DropBoxImpl();
   // im.dropbox();
    this.impl = impl;
    this.model = model;
    this.frm = frm;*/
    //this.frm.btnGuardarModelo.addActionListener(this);
    }
    
    

    public void save(String nombre,String descripcion,String ruta, String estado, String modelo,String fecha) {      
        impl.insertaModelo(setModelo(nombre,descripcion,ruta,estado,modelo,fecha,0));
    }
    
    public void loadData(JTable jt, String param){
     DefaultTableModel modeloT = new DefaultTableModel();
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Imagen");
    modeloT.addColumn("Estado");
    modeloT.addColumn("Modelo");
    modeloT.addColumn("Fecha Modelo");
    modeloT.addColumn("Codigo Registo");
    
    Object[] columna = new Object [8];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    impl.allModelo(param).stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getDescripcion();
      columna[3] = obj.getPathImagen();
      columna[4] = obj.getEstado().equals("Danado") ? "Dañado" : obj.getEstado();
      columna[5] = obj.getModelo();
      columna[6] = obj.getFechaModelo();
      columna[7] = obj.getId();
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
   }
    public void updateModel(String nombre,String descripcion,String ruta, String estado,String modelo, String fecha, String id){
    impl.update(setModelo(nombre,descripcion,ruta,estado,modelo,fecha,Integer.parseInt(id)));
    }
     public void deleteModelo(String text) {
        impl.delete(Integer.parseInt(text));
    }
    public TBLModelo setModelo(String nombre,String descripcion,String ruta, String estado,String modelo, String fecha,int id){
    return TBLModelo.builder()
            .nombre(nombre)
            .descripcion(descripcion)
            .pathImagen(ruta)
            .estado(estado)
            .modelo(modelo)
            .id(id)
            .fechaModelo(fecha)
            .build();
    }
 
    public int mes(String mes){
     int mesT = 0;
    switch(mes){
        case "enero": mesT =1; break;
        case "febrero": mesT =2; break;
        case "marzo": mesT =3; break;
        case "abril": mesT =4; break;
        case "mayo": mesT =5; break;
        case "junio": mesT =6; break;
        case "julio": mesT =7; break;
        case "agosto": mesT =8; break;
        case "septiembre": mesT =9; break;
        case "octubre": mesT =10; break;
        case "noviembre": mesT =11; break;
        case "diciembre": mesT =12; break;
    }
    return mesT-1;
    }
   public String mesStr(int mes){
     String mesT = "";
    switch(mes){
        case 1:  mesT ="Enero"; break;
        case 2: mesT = "Febrero"; break;
        case 3: mesT ="Marzo"; break;
        case 4: mesT ="Abril"; break;
        case 5: mesT ="Mayo"; break;
        case 6: mesT ="Junio"; break;
        case 7: mesT ="Julio"; break;
        case 8: mesT ="Agosto"; break;
        case 9: mesT ="Septiembre"; break;
        case 10: mesT ="Octubre"; break;
        case 11: mesT ="Noviembre"; break;
        case 12: mesT ="Diciembre"; break;
    }
    return mesT;
    }
}
