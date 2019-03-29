package interfaz;
import controlador.Controlador;

public class InterfazApp 
{
	
	private Panel1 p1;
	private Panel2 p2;
	private Controlador ctrl;
	
	public InterfazApp() {
		
		p1 = new Panel1();
		p2 = new Panel2();
		ctrl = new Controlador(this, p1, p2);
	}
	
	public static void main(String[] args) {
		InterfazApp interfazApp = new InterfazApp();
		
	}
}
