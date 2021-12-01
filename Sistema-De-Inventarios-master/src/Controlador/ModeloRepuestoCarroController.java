/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLModeloVo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Elias
 */
public class ModeloRepuestoCarroController {
 
    private  List<TBLModeloVo> ltsModelo;
    private final PrincipalController principaCtr;
    public ModeloRepuestoCarroController() {
        this.ltsModelo = new ArrayList<>();
        this.principaCtr = new PrincipalController();
    }
    
    public void loadData(JTable jt,int id, String params){
     DefaultTableModel modeloT = new DefaultTableModel();
     List<TBLModeloVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(params.isEmpty()){
         ltsModelo = principaCtr.listaModelo(id);
         ltsTem = ltsModelo;
     } else{
       ltsTem =  ltsModelo.stream().filter(registro -> 
                                             registro.getNombre().toUpperCase().contains(param)||
                                             registro.getCilindraje().contains(param) ||
                                             registro.getAnio().contains(param) ||
                                             registro.getDescripcion().toUpperCase().contains(param) ||
                                             registro.getIdMarca().getNombre().toUpperCase().contains(param) ||
                                             registro.getTipoCombustible().getNombre().toUpperCase().contains(param)
                                             ).collect(Collectors.toList());
     }
     
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Imagen");
    modeloT.addColumn("Tipo Combustible");
    modeloT.addColumn("Cilindraje");
    modeloT.addColumn("Año Modelo");
    modeloT.addColumn("Marca");
    modeloT.addColumn("Codigo");
    
    
    Object[] columna = new Object [9];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getDescripcion();
      columna[3] = obj.getPathImagen();
      columna[4] = obj.getTipoCombustible().getNombre();
      columna[5] = obj.getCilindraje();
      columna[6] = obj.getAnio();
      columna[7] = obj.getIdMarca().getNombre();
      columna[8] =obj.getId();
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
    
        TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(80);
         columnModel.getColumn(5).setPreferredWidth(50);
         columnModel.getColumn(6).setPreferredWidth(50);
         columnModel.getColumn(7).setPreferredWidth(30);
         columnModel.getColumn(8).setPreferredWidth(1);
         
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(8).setCellRenderer( centerRenderer );
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
   }

}
