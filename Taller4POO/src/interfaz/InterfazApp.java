    
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
    	System.out.println(mia.getVar(5));
    	mia.setVar(551, 5);
    	System.out.println(mia.getVar(5));
    }
    
	public static void main (String [] args) 
	{
		InterfazApp interfazApp = new InterfazApp();
	}
}