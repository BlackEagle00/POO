package mundo;

public class A 
{
	
	private int varA;
	private B mib;
    //private A mia;
	
	public A(int varA)
	{
		this.varA = varA;
		mib = new B (8, this);
	}

	public int getVarA() 
	{
		return varA;
	}

	public void setVarA(int varA) 
	{
		this.varA = varA;
	}

	public int getVarB() 
	{
		return mib.getVarB();
	}

	public void setVarB(int var) 
	{
		mib.setVarB(var);
	}
	
	public int byPass()
	{ 
		return mib.byPass();
	}
}
