/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Elias
 */
public class RadioButtonRenderer implements TableCellRenderer{

    @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,        boolean hasFocus, int row, int column) {
      if (value==null) return null;
         return (Component)value;
   }
    
}
