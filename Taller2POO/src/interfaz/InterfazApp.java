package interfaz;
import mundo.A;

public class InterfazApp 
{
	//Relaciones
	private A mia;
	
	//Constructor
	public InterfazApp() 
	{
		mia = new A();
		System.out.println(mia.vlrVar());
		System.out.println(mia.vlrVarB());
	}
	
	public static void main (String [] args) 
	{
		InterfazApp interfazApp = new InterfazApp();
	}
}
