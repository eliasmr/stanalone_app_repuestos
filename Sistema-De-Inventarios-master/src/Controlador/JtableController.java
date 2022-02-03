/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TBLRepuestoVo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
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
public class JtableController {
    
  public static void jtable(JTable jt,String[] columns,Boolean[] isEditable,Class[] tipoDato, int[] isRederizable,List<Integer> espacioEnTabla, int[] celdasOcultas,List<JButton> btn, List<String> ltsDatos){
      
      // realiza renderizado de los botos para mostarlos a la tabla
      jt.setDefaultRenderer(Object.class, new ButtonRender());
      
      // valida condiciones pata la tabla
      DefaultTableModel dtm = new DefaultTableModel() {
      @Override
      public Class getColumnClass(int columnIndex) {
            return tipoDato [columnIndex];
        };
       @Override
        public boolean isCellEditable(int row, int column) {
        return isEditable[column];
        }
       };

    jt.setModel(dtm);
    
        
    int numColum = 1;
    for(String column: columns){
     dtm.addColumn(column);
     numColum ++;
    }

    Object[] columna = new Object [numColum];
    for(int dt=0; dt <= numColum; dt++){
        columna[dt] = ltsDatos.get(dt);
      dtm.addRow(columna);
    }


        TableColumnModel columnModel = jt.getColumnModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        columnModel.getColumn(0).setMaxWidth(30);
        
        int cRender = 0;
        for(int render : isRederizable){
         jt.getColumnModel().getColumn(render).setCellRenderer( centerRenderer );
         columnModel.getColumn(render).setPreferredWidth(espacioEnTabla.get(cRender));
         cRender ++;
        }
        
        // valida si se requiere ocultar campos en la tabla
        if(celdasOcultas.length >=0){
          for(int celdasOcu : celdasOcultas){
            //ocultos
            jt.getColumnModel().getColumn(celdasOcu).setMaxWidth(0);
            jt.getColumnModel().getColumn(celdasOcu).setMinWidth(0);
            jt.getColumnModel().getColumn(celdasOcu).setPreferredWidth(0);
          }
        }

        
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
    
    }
  
   public static String duplaDatos(String dato){
    return "";
   }
}
