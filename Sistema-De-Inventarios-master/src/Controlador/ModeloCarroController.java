/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLModelo;
import Modelo.impl.TBLModeloImpl;
import Vista.FrmCrearModeloCarrro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias
 */
public class ModeloCarroController implements ActionListener{

    private TBLModeloImpl impl;
    private TBLModelo model;
    private FrmCrearModeloCarrro frm;
    
    public ModeloCarroController(FrmCrearModeloCarrro frm,TBLModeloImpl impl,TBLModelo model){
    this.impl = impl;
    this.model = model;
    this.frm = frm;
    this.frm.btnGuardar.addActionListener(this);
    }
    
    public void iniciar ()
    {
     frm.setTitle("Modelo");
     frm.setLocale(null);
     this.loadData(frm.tbGetDatosModelo);
     }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frm.btnGuardar)){
         impl.insertaModelo(gurdarModelo(frm.txtNombre.getText(),frm.txtDescripcion.getText(),"",Boolean.TRUE, new Date(10102L)));
         this.loadData(frm.tbGetDatosModelo);
        }
        
    }
    
    private void loadData(JTable jt){
     DefaultTableModel modeloT = new DefaultTableModel();
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Imagen");
    modeloT.addColumn("Fecha Modelo");
    modeloT.addColumn("Seleccion la accción");
    
    Object[] columna = new Object [6];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    impl.allModelo().stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getDescripcion();
      columna[3] = obj.getPathImagen();
      columna[4] = obj.getFechaModelo();
      columna[5] = new  JRadioButton("Seleción");
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
        
     }
    private TBLModelo gurdarModelo(String nombre,String descripcion,String ruta, Boolean estado, Date fecha){
    return TBLModelo.builder()
            .nombre(nombre)
            .descripcion(descripcion)
            .pathImagen(ruta)
            .estado(estado)
            .fechaModelo(fecha)
            .build();
    }
}
