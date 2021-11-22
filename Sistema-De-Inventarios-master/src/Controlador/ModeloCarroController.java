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
    
    

    public void save(String nombre,String descripcion,String ruta, Boolean estado, Date fecha) {      
        impl.insertaModelo(setModelo(nombre,descripcion,ruta,estado, new Date(10102L),0));
    }
    
    public void loadData(JTable jt, String param){
     DefaultTableModel modeloT = new DefaultTableModel();
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Imagen");
    modeloT.addColumn("Fecha Modelo");
    modeloT.addColumn("Codigo Registo");
    
    Object[] columna = new Object [6];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    impl.allModelo(param).stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getDescripcion();
      columna[3] = obj.getPathImagen();
      columna[4] = obj.getFechaModelo();
      columna[5] = obj.getId();
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
   }
    public void updateModel(String nombre,String descripcion,String ruta, Boolean estado, Date fecha, String id){
    impl.update(setModelo(nombre,descripcion,ruta,estado,fecha,Integer.parseInt(id)));
    }
     public void deleteModelo(String text) {
        impl.delete(Integer.parseInt(text));
    }
    public TBLModelo setModelo(String nombre,String descripcion,String ruta, Boolean estado, Date fecha,int id){
    return TBLModelo.builder()
            .nombre(nombre)
            .descripcion(descripcion)
            .pathImagen(ruta)
            .estado(estado)
            .id(id)
            .fechaModelo(fecha)
            .build();
    }
 
}
