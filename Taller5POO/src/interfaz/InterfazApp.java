package interfaz;

import mundo.A;
import mundo.B;

public class InterfazApp 
{
 // Relaciones	
    private A mia;
    

 // Constructor
    public InterfazApp()
    { 
    	mia = new A(5);
    	System.out.println("varA = " + mia.getVarA());
    	mia.setVarA(88);
    	System.out.println("varA = " + mia.getVarA());
    	
    	System.out.println("varB = " + mia.getVarB());
    	mia.setVarB(69);
    	System.out.println("varB = " + mia.getVarB());
    	
    	System.out.println("byPass() " + mia.byPass());
    }
    
	public static void main (String [] args) 
	{
		InterfazApp interfazApp = new InterfazApp();
	}
}
