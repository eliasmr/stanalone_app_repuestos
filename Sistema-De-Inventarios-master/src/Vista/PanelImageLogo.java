package Vista;

import Modelo.impl.DropBoxImpl;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImageLogo extends JPanel{
    
    private Image imagen;

    @Override
    public void paint(Graphics g){
        super.paint(g);
        DropBoxImpl dropBoxImpl = new DropBoxImpl();
        Dimension dimension = this.getSize();
        imagen = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage();
        g.drawImage(imagen, 0, 0, dimension.width, dimension.height, this);
        setOpaque(false);
        
        
    }
 
    
}