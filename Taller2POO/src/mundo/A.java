package mundo;

public class A 
{
	//Relaciones
	
	private B mib;
	private C mic;

	//Constructor
	public A() 
	{
		mic = new C();
		mib = new B(mic);
	}
	
	//Métodos Funcionales
	public int vlrVar() 
	{
		return mic.getVar();
	}
	
	public int vlrVarB() 
	{
		return mib.getVarB();
	}
}
