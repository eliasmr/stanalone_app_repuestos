package Vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImage2 extends JPanel{
    
    private Image imagen;

    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.jfif")).getImage();
        g.drawImage(imagen, 0, 0, dimension.width, dimension.height, this);
        setOpaque(false);
        super.paint(g);
    }
 
    
}