/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeInventarios;


import Modelo.TBLSession;
import Modelo.impl.ValidacionSessionImpl;
import Profile.Ambientes;
import Vista.FrmPrincipal;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author emedina
 */
public class SistemaDeInventarios{

    public static TBLSession seesion;
    

    public static void main(String[] args) {
        seesion = Ambientes.getEnviromentDba("prod");
        seesion = new ValidacionSessionImpl().validaSession(seesion);
        if(seesion.getAutorizado()){
            FrmPrincipal frm = new FrmPrincipal();
            
                //ImageIcon loading = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/cargando.gif"));
                //frm.add(new JLabel("loading... ", loading, JLabel.CENTER));
    
            frm.setLocationRelativeTo(null);
            frm.setResizable(false);
            frm.setExtendedState(MAXIMIZED_BOTH);
            frm.setVisible(true);
        }else{
          String message = "<html><body><div width='100px' align='center'>No autorizado!</div></body></html>";
          JLabel messageLabel = new JLabel(message);
          JOptionPane.showMessageDialog(null
                  ,messageLabel, "No autorizado",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
