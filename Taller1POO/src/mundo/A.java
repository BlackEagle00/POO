package mundo;

public class A 
{
	//Atributos
	
	//Relaciones
	private B mib;
	
	public A () 
	{
		mib = new B();
	}
	
	public int valorVar() 
	{
		return mib.getVar();
	}
}