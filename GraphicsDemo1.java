import java.applet.Applet;  
import java.awt.*;  
public class GraphicsDemo1 extends Applet
{    
  public void paint(Graphics g)
  {  
    g.setColor(Color.black);  
    g.drawString("Welcome to studytonight",50, 50); 
    g.setColor(Color.blue);  
    g.fillOval(170,200,100,100);  
    g.drawArc(90,150,30,30,30,270);  
    g.fillArc(270,150,30,30,0,180);  
    g.drawLine(21,31,20,300);  
    g.drawRect(70,100,100,100);  
    g.fillRect(170,100,100,100);  
    g.drawOval(70,200,100,100);  
  }  
}
