
package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Elias
 */
public class ButtonRender extends DefaultTableCellRenderer{


    @Override
   public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column){
       if(value instanceof JButton){
           JButton btn = (JButton)value;
           if(isSelected){
               btn.setBackground(Color.WHITE);
               btn.setForeground(Color.WHITE);
               btn.setBorder(null);
           }else{
              btn.setBackground(Color.WHITE);
               btn.setForeground(Color.WHITE);
                btn.setBorder(null);
           }
           return btn;
       }else if(value instanceof JCheckBox){
          JCheckBox checbox = (JCheckBox) value;
          return checbox;
       }
       return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
   }
}
