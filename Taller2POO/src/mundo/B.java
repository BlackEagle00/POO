package mundo;

public class B 
{
	//Relaciones
	
	private C mic;
	
	//Constructor
	public B (C mic) 
	{
		this.mic = mic;
	}

	//Métodos funcionales
	
	public int vlrVarB() 
	{
		return mic.getVar();
	}
	
	public int getVarB() 
	{
		return mic.getVar();
	}
}
