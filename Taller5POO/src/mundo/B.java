package mundo;

public class B
{
	private int varB;
	private A mia;
	
	public B(int varB, A mia)
	{
		this.varB = varB;		
		this.mia = mia;
	}

	public int getVarB() 
	{
		return varB;
	}

	public void setVarB(int varB) 
	{
		this.varB = varB;
	}

	public int byPass()
	{ 
		return mia.getVarA();		
	}
}
