package interfaz;
import mundo.A;
public class InterfazApp 
{
	//Atributos
	
	//Relaciones
	private A mia;
	
	public InterfazApp() 
	{
		mia = new A();
		System.out.println(mia.valorVar());
	}
	
	public static void main (String [] args) 
	{
		InterfazApp interfazApp = new InterfazApp();
	}
}