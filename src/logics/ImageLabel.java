/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.*;

public class ImageLabel extends JLabel {
    int x,y;
    int hei,wid,choiceNo;
    String myimage;
   /* public void setImage(String path)
    {
        myimage=path;
    }
    public String getImage()
    {
        return(myimage);
    }
    public ImageLabel()
    {
        
    }*/
    public ImageLabel(int x,int y,int height,int width,String filename)
     {
      this.x=x;
      this.y=y;
      this.hei=height;
      this.wid=width;
 
      myimage=filename;
     }
    @Override
    public void paint(Graphics g)
    {
        try{
            
            g.drawImage(Toolkit.getDefaultToolkit().getImage(myimage), x, y, wid,hei,null);
            repaint();
        }
        catch(Exception ex)
        {
            System.out.println("Error " + ex.getMessage());
        }
     }
}
