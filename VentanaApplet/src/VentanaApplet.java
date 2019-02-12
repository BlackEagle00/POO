import java.applet.Applet;
import java.awt.Graphics;
public class VentanaApplet extends Applet 
{
	public void init () 
	{
		resize (500, 500);
	}
	
	public void paint (Graphics g) 
	{
		g.drawString("Hola", 20, 20);
		g.drawOval(200, 200, 50, 50);
		g.drawRect(200, 200, 100, 25);
		

	}
	
	public static void main (String [] args) 
	{
		
	}
}
