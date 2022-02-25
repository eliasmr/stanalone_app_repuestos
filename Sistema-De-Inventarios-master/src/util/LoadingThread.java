/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import javax.swing.JFrame;

/**
 *
 * @author Elias
 */
public class LoadingThread  implements Runnable{
    
    private Boolean stop = true;
    private JFrame jFrame;
    
    public LoadingThread(JFrame jFrame){
      this.jFrame = jFrame;
    }
    @Override
    public void run() {
        this.jFrame.setVisible(true);
        System.out.println("inicio cargando...............");
       
    }

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
       this.jFrame.setVisible(false);
        System.out.println("fin cargando...............");
        this.stop = stop;
    }

}
