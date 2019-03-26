package mundo;

public class A 
{
	//Relaciones
	private B [] mib;
	
	//Constructor
	public A() 
	{
		mib = new B [15];
		
		for (int i=0; i<15; i++)
		{	
			mib[i] = new B(i);
		}
	}
	
	public int getVlr(int i)
	{ 
		return mib[i].getVar();		
	}
	
	public void setVlr(int i, int vlr)
	{ 
		mib[i].setVar(vlr);		
	}	

}
