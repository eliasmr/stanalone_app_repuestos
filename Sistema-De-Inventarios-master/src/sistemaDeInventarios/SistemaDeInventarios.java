/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeInventarios;


import Modelo.TBLModeloXRepuestoVo;
import Modelo.TBLSession;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.ValidacionSessionImpl;
import Profile.Ambientes;
import Vista.FrmPrincipal;
import java.awt.FlowLayout;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import util.FRMJFrame;
import util.LoadingThread;

/**
 *
 * @author emedina
 */
public class SistemaDeInventarios{

    public static TBLSession seesion;
    
    public static void main(String[] args) {
        seesion = Ambientes.getEnviromentDba("prod");
        seesion = new ValidacionSessionImpl().validaSession(seesion);
        
        if(seesion.getErrorConectandoDba()){
          FRMJFrame.fatalError();
          return;
        }
        JFrame jFrame = FRMJFrame.FRMloading();
        new Thread(new LoadingThread(jFrame)).start();
        if (seesion.getAutorizado()) {
            FrmPrincipal frm = new FrmPrincipal();
            frm.setLocationRelativeTo(null);
            frm.setResizable(false);
            frm.setExtendedState(MAXIMIZED_BOTH);
            frm.setVisible(true);
        } else {
            FRMJFrame.noAutorizado();
        }
        new LoadingThread(jFrame).setStop(Boolean.FALSE);
    }
 
  

}
