/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import Modelo.impl.DropBoxImpl;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias
 */
public class FRMJFrame {
    
    public static JFrame FRMloading() {
        JFrame jFrame = new JFrame();
        try {

            Image img3 = new ImageIcon(new DropBoxImpl().getFileDrobox("/AutopartesLeon/recusos_app/cargando.gif")).getImage();
            ImageIcon imageIcon = new ImageIcon(img3.getScaledInstance(400, 400, Image.SCALE_DEFAULT));

            jFrame.setLayout(new FlowLayout());

            jFrame.setSize(400, 400);
            JLabel jLabel = new JLabel();
            jFrame.setIconImage(new ImageIcon(new DropBoxImpl().getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage());
            jLabel.setIcon(imageIcon);
            jFrame.add(jLabel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setUndecorated(true);
        } catch (Exception e) {
        }
        return jFrame;
    }

    public static void noAutorizado() {
        try {
            JFrame jFrame = new JFrame();
            Image img3 = new ImageIcon(new DropBoxImpl().getFileDrobox("/AutopartesLeon/recusos_app/noAutorizado.png")).getImage();
            ImageIcon imageIcon = new ImageIcon(img3.getScaledInstance(400, 400, Image.SCALE_DEFAULT));
            jFrame.setTitle("No Autorizado!");
            JLabel messageLabel = new JLabel();
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(400, 400);
            messageLabel.setIcon(imageIcon);
            jFrame.setIconImage(new ImageIcon(new DropBoxImpl().getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage());
            jFrame.add(messageLabel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
        }
    }
        public static void fatalError() {
        try {
          String message = "<html><body><div width='100px' align='center'>Problemas Obteniendo Datos!</div></body></html>";
          JLabel messageLabel = new JLabel(message);
          JOptionPane.showMessageDialog(null
                  ,messageLabel, "Error",JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
        }
    }
}
