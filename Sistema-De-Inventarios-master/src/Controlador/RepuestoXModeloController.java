/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLModeloXRepuestoVo;
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
    public void loadDataAllModeloXRepuesto(JTable jt, String params, int idMarca){
      Boolean[] isEditable = {false,false,false,false,false,false,false,false,false,false,false};
     jt.setDefaultRenderer(Object.class, new ButtonRender());
     List<TBLModeloXRepuestoVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(params.isEmpty() ){
         ltsModeloXRepuestoVo = impl.getAllByIdMarca(idMarca);
         ltsTem = ltsModeloXRepuestoVo;
         
     }else{
        ltsTem =  ltsModeloXRepuestoVo.stream().filter(registro -> 
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
     JButton btn = new JButton();
     btn.setName("elimnar_btn");
     Image mImagen = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/eliminar.png")).getImage();
     ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn.setIcon(mIcono);
    btn.setOpaque(true);
    
     JButton btn_ver_rep_img = new JButton();
     btn_ver_rep_img.setName("id_btn_ver_rep_img");
     Image img_ver_rep_img = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/visualizar.png")).getImage();
     ImageIcon mIcono_ver_rep_img = new ImageIcon(img_ver_rep_img.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn_ver_rep_img.setIcon(mIcono_ver_rep_img);
     btn_ver_rep_img.setOpaque(true);
    
     JButton btn_ver_mod_img = new JButton();
     btn_ver_mod_img.setName("btn_ver_mod_img");
     Image img_ver_mod_img = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/visualizar.png")).getImage();
     ImageIcon mIcono_ver_mod_img = new ImageIcon(img_ver_mod_img.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn_ver_mod_img.setIcon(mIcono_ver_mod_img);
     btn_ver_mod_img.setOpaque(true);
     
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre Repuesto");
    modeloT.addColumn("Referencia");
    modeloT.addColumn("Img Repuesto");
    modeloT.addColumn("Nombre Modelo");
    modeloT.addColumn("Img Modelo");
    modeloT.addColumn("Marca");
    modeloT.addColumn("Codigo");
    modeloT.addColumn("Eliminar");
    modeloT.addColumn("path repuesto oculto");
    modeloT.addColumn("path modelo oculto");
    
    
    Object[] columna = new Object [11];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getRepuesto().getNombre();
      columna[2] = obj.getRepuesto().getReferencia();
      columna[3] = btn_ver_rep_img;
      columna[4] = obj.getModelo().getNombre();
      columna[5] = btn_ver_mod_img;
      columna[6] = obj. getModelo().getIdMarca().getNombre();
      columna[7] = obj.getId();
      columna[8] = btn;
      
      columna[9] = obj.getRepuesto().getPathImagen();
      columna[10] = obj.getModelo().getPathImagen();
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
    
        TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(6).setPreferredWidth(30);
        columnModel.getColumn(7).setPreferredWidth(30);
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
        
        //ocultos
        jt.getColumnModel().getColumn(7).setMaxWidth(0);
        jt.getColumnModel().getColumn(7).setMinWidth(0);
        jt.getColumnModel().getColumn(7).setPreferredWidth(0);
        
        jt.getColumnModel().getColumn(9).setMaxWidth(0);
        jt.getColumnModel().getColumn(9).setMinWidth(0);
        jt.getColumnModel().getColumn(9).setPreferredWidth(0);
        
        jt.getColumnModel().getColumn(10).setMaxWidth(0);
        jt.getColumnModel().getColumn(10).setMinWidth(0);
        jt.getColumnModel().getColumn(10).setPreferredWidth(0);
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
   }
    



}
