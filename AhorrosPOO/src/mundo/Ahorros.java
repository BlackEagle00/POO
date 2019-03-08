package mundo;

public class Ahorros 
{
	private int saldo = 0;
	
	public int getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(int saldo) 
	{
		this.saldo = saldo;
	}
	
	public Ahorros (int saldo) 
	{
		this.saldo = saldo;
	}
	
	public int Cuatro_x_mil(int retiro) 
	{
		int cupormil = (retiro * 4) / 1000;
		return cupormil;
	}
	
	public int RetirarDinero (int retiro) 
	{
		int cupormil = Cuatro_x_mil(retiro);
		int RetiroTotal = retiro + 2000 + cupormil;
		if(RetiroTotal > getSaldo()) 
		{
			System.out.println("No hay suficiente dinero para realizar el retiro");
			return -1;
		}
		else 
		{
			int nuevosaldo = getSaldo () - RetiroTotal; 
			setSaldo (nuevosaldo);
			System.out.println("Retiro realizado");
			return 0;
		}
	}
	
	public void ConsultaSaldo() 
	{
		System.out.println("Saldo Actual: "+getSaldo());
	}
	
	public void ConsignarDinero(int consignacion) 
	{
		consignacion += getSaldo();
		setSaldo(consignacion);
		System.out.println("La consignación se ha realizado correctamente");
	}
}
