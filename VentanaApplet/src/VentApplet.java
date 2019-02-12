import java.applet.Applet;
import java.awt.*;

public class VentApplet extends Applet
{
	//Creando Objetos
	Label label1 = new Label ("POO");
	Label label2 = new Label ("Nombre");
	TextField tf1 = new TextField (20);
	TextField tf2 = new TextField (20);
	Button b1 = new Button ("Aceptar");
	
	//Añadir Objetos
	public void init() 
	{
		add(label1);
		add(label2);
		add(tf1);
		add(b1);
		add(tf2);
	}
	
	public boolean action (Event e, Object ob) 
	{
		if (b1 == e.target) //Verficar qué accionó el evento
		{
			tf2.setText(tf1.getText());
			return true;
		}
		return false;
	}
	
	public static void main (String [] args) 
	{
		
	}
}
