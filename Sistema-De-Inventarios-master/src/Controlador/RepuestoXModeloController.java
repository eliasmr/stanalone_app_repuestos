/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLModeloXRepuestoVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.TBLModeloXRepuestoImpl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Elias
 */
public class RepuestoXModeloController {
    
    private TBLModeloXRepuestoImpl impl;
    private DropBoxImpl dropBoxImpl;
    public List<TBLModeloXRepuestoVo> ltsModeloXRepuestoVo;
   
    public RepuestoXModeloController(){
     impl = new TBLModeloXRepuestoImpl();
     dropBoxImpl = new DropBoxImpl();
     ltsModeloXRepuestoVo = new ArrayList<>();
     ltsModeloXRepuestoVo = impl.getAllBy();
    }
    
    public Boolean insert(List<TBLModeloXRepuestoVo> ltsModeloXRepuestoVo){
     return impl.insert(ltsModeloXRepuestoVo);
    }
    
    public List<TBLModeloXRepuestoVo> getAllByIdMarca(int idMarca){
        return impl.getAllByIdMarca(idMarca);
    }
     public List<TBLModeloXRepuestoVo> getAll(){
        return impl.getAllBy();
    }
    
    public Boolean delete(int id){
     return impl.delete(id);
    }
    public Boolean getAllByIDmodeloIDRepuesto(int idRepuesto, int idModelo){
     return impl.getAllByIDmodeloIDRepuesto(idRepuesto,idModelo);
    }
    public void loadDataAllModeloXRepuesto(JTable jt, String params, int idMarca, String elimindo){
      Boolean[] isEditable = {false,false,false,false,false,false,false,false,false,false,false};
     jt.setDefaultRenderer(Object.class, new ButtonRender());
     List<TBLModeloXRepuestoVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(elimindo.equals("Eliminado")){
      ltsModeloXRepuestoVo = impl.getAllBy();
     }
     ltsTem = ltsModeloXRepuestoVo.stream().filter(obj -> obj.getModelo().getIdMarca().getIdMarca() == idMarca).collect(Collectors.toList());
     if(!params.isEmpty() ){
     ltsTem =  ltsTem.stream().filter(registro -> 
                                     registro.getRepuesto().getNombre().toUpperCase().contains(param)||
                                     registro.getModelo().getNombre().toUpperCase().contains(param) ||
                                     registro.getModelo().getIdMarca().getNombre().toUpperCase().contains(param) 
                                     ).collect(Collectors.toList());   
     }
    DefaultTableModel modeloT = new DefaultTableModel() {

       @Override
        public boolean isCellEditable(int row, int column) {
        return isEditable[column];
    }
    };

    
     JButton btn_ver_rep_img = new JButton();
     btn_ver_rep_img.setName("id_btn_ver_rep_img");
     btn_ver_rep_img.setToolTipText("Ver Imagen Del Modelo");
     Image img_ver_rep_img = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/visualizar.png")).getImage();
     ImageIcon mIcono_ver_rep_img = new ImageIcon(img_ver_rep_img.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn_ver_rep_img.setIcon(mIcono_ver_rep_img);
     btn_ver_rep_img.setOpaque(true);
    
     
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Tipo Combustible");
    modeloT.addColumn("Cilindraje");
    modeloT.addColumn("Año Modelo");
    modeloT.addColumn("path");
    modeloT.addColumn("Ver Imagen");
    modeloT.addColumn("id modelo");
    
    Object[] columna = new Object [9];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getModelo().getNombre();
      columna[2] = obj.getModelo().getDescripcion();
      columna[3] = obj.getModelo().getTipoCombustible().getNombre();
      columna[4] = obj.getModelo().getCilindraje();
      columna[5] = obj.getModelo().getAnio();
      columna[6] = obj.getModelo().getPathImagen();
      columna[7] = btn_ver_rep_img;
      columna[8] = obj.getModelo().getId();
      
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
    
        TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(30);
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        
        //ocultos
        jt.getColumnModel().getColumn(6).setMaxWidth(0);
        jt.getColumnModel().getColumn(6).setMinWidth(0);
        jt.getColumnModel().getColumn(6).setPreferredWidth(0);
        
        jt.getColumnModel().getColumn(8).setMaxWidth(0);
        jt.getColumnModel().getColumn(8).setMinWidth(0);
        jt.getColumnModel().getColumn(8).setPreferredWidth(0);
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
   }
    
  public void loadDataModeloRepuesto(JTable jt,String params, int idModelo){
       Boolean[] isEditable = {false,false,false,false,false,false,false,false,false,false};
      jt.setDefaultRenderer(Object.class, new ButtonRender());
     List<TBLModeloXRepuestoVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     ltsTem = ltsModeloXRepuestoVo.stream().filter(obj -> obj.getModelo().getId() == idModelo)
                                          .collect(Collectors.toList());
     if(!params.isEmpty()){
         ltsTem =  ltsTem.stream().filter(registro -> 
                                             registro.getRepuesto().getNombre().toUpperCase().contains(param)||
                                             registro.getRepuesto().getReferencia().toUpperCase().contains(param) ||
                                             registro.getRepuesto().getDescripcion().toUpperCase().contains(param) 
                                             ).collect(Collectors.toList());
     }
     DefaultTableModel repuestoT = new DefaultTableModel() {

       @Override
        public boolean isCellEditable(int row, int column) {
        return isEditable[column];
    }
    };
     JButton btnEliminar = new JButton();
     btnEliminar.setName("elimnar_btn");
     btnEliminar.setToolTipText("Eliminar Repuesto Del Modelo");
     Image btnEliminarImagen = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/eliminar.png")).getImage();
     ImageIcon btnEliminarIcono = new ImageIcon(btnEliminarImagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btnEliminar.setIcon(btnEliminarIcono);
     btnEliminar.setOpaque(true);
     
     JButton btn = new JButton();
     btn.setName("id_visualizar");
     btn.setToolTipText("Ver Imagen Del Repuesto");
     Image mImagen = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/visualizar.png")).getImage();
     ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn.setIcon(mIcono);
    btn.setOpaque(true);
    jt.setModel(repuestoT);
    repuestoT.addColumn("#");
    repuestoT.addColumn("Nombre");
    repuestoT.addColumn("Referencia");
    repuestoT.addColumn("Imagen");
    repuestoT.addColumn("Descripcion");
    repuestoT.addColumn("Codigo");
    repuestoT.addColumn("ver Imagen");
    repuestoT.addColumn("Eliminar");
    repuestoT.addColumn("id repuesto x modelo ");
    Object[] columna = new Object [9];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getRepuesto().getNombre();
      columna[2] = obj.getRepuesto().getReferencia();
      columna[3] = obj.getRepuesto().getPathImagen();
      columna[4] = obj.getRepuesto().getDescripcion();
      columna[5] = obj.getRepuesto().getIdRepuesto();
      columna[6] = btn;
      columna[7] = btnEliminar;
      columna[8] = obj.getId();
      counter.getAndUpdate(value -> value + 1);
      repuestoT.addRow(columna);
    });
            TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

         //ocultos
        jt.getColumnModel().getColumn(3).setMaxWidth(0);
        jt.getColumnModel().getColumn(3).setMinWidth(0);
        jt.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        jt.getColumnModel().getColumn(5).setMaxWidth(0);
        jt.getColumnModel().getColumn(5).setMinWidth(0);
        jt.getColumnModel().getColumn(5).setPreferredWidth(0);
        
        jt.getColumnModel().getColumn(8).setMaxWidth(0);
        jt.getColumnModel().getColumn(8).setMinWidth(0);
        jt.getColumnModel().getColumn(8).setPreferredWidth(0);
        
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
   }



}
