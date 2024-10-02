import java.applet.*;  
import java.awt.*;  
public class ap extends Applet
{
    String msg = "";
    
    public void init()
    {
        msg = "Hello User..!!";
    }

    public void start()
    {
        msg = msg+", Welcome to Amity..!!";
    }
  
    public void paint(Graphics g){  
        g.drawString(msg,100,100);  
    }  
  
}
