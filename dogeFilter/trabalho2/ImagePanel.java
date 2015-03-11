/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author breno
 */
public class ImagePanel extends JPanel {
    private BufferedImage image;
    
    private void createEmptyImage()
    {
        this.image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
    }
    
    public void setImage(BufferedImage img)
    {
        this.image = img;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        if (image == null)
            createEmptyImage();
        
        g.drawImage(this.image, 0, 0, null);   
    }
}
