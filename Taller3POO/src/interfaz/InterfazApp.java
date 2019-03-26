package interfaz;
import mundo.A;

public class InterfazApp 
{
 // Relaciones	
    private A mia;

 // Constructor
    public InterfazApp()
    { 
    	mia = new A();
    	System.out.println(mia.getVlr(9));
    	mia.setVlr(9, 88);
    	System.out.println(mia.getVlr(9));
    }
    
	public static void main (String [] args) 
	{
		InterfazApp interfazApp = new InterfazApp();
	}
}
