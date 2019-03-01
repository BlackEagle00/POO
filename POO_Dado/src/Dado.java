public class Dado
{
	//Atributos
	private int fro, der, pos, izq, sup, inf;
	
	//Constructor
	public Dado() 
	{
		int fro = 1, der = 2, pos = 3, izq = 4, sup = 5, inf = 6;
	}

	public int getFro() 
	{
		return fro;
	}

	public void setFro(int fro)
	{
		this.fro = fro;
	}

	public int getDer() 
	{
		return der;
	}

	public void setDer(int der) 
	{
		this.der = der;
	}

	public int getPos() 
	{
		return pos;
	}

	public void setPos(int pos)
	{
		this.pos = pos;
	}

	public int getIzq() 
	{
		return izq;
	}

	public void setIzq(int izq) 
	{
		this.izq = izq;
	}

	public int getSup() 
	{
		return sup;
	}

	public void setSup(int sup)
	{
		this.sup = sup;
	}

	public int getInf()
	{
		return inf;
	}

	public void setInf(int inf)
	{
		this.inf = inf;
	}
	
	public void giroEjeX(int fre, int der, int izq, int sup, int inf, int pos) 
	{
		int temp = fre;
		der = fre;
		pos = der;
		izq = pos;
		fre = temp;
	}
	
	public void giroEjeY() {}
	public void giroEjeZ() {}
	
	
	
	public static void main (String [] args) {}
}
