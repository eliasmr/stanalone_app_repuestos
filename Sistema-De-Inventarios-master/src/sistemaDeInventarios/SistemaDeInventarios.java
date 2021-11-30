/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeInventarios;


import Modelo.impl.ValidacionSessionImpl;
import Vista.FrmPrincipal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ialonzo
 */
public class SistemaDeInventarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ValidacionSessionImpl valSession = new ValidacionSessionImpl();
        if(!valSession.validaSession()){
            FrmPrincipal frm = new FrmPrincipal();
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
        }else{
          String message = "<html><body><div width='100px' align='center'>No autorizado!</div></body></html>";
          JLabel messageLabel = new JLabel(message);
          JOptionPane.showMessageDialog(null,messageLabel, "No autorizado",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
