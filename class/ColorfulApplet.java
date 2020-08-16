// Pogram to implement a colorful Applet.
import java.awt.*;
import java.applet.*;
public class ColorfulApplet extends Applet
{
    public void paint(Graphics g)
    {
		String color1=getParameter("c1");
		String color2=getParameter("c2");
		if(color1.equals("green"))
		{
			setBackground(Color.green);
		}		
		if(color2.equals("yellow"))
		{
			g.setColor(Color.yellow);
			g.setFont(new Font("arial", Font.BOLD+Font.ITALIC,20));
			g.drawString("ColorfulApplet",50, 50);
		}
	}   
}
