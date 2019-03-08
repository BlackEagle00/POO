package interfaz;
import mundo.Ahorros;
import java.util.Scanner;

public class InterfazApp 
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
		Ahorros cuenta = new Ahorros (0);
		int opcion, retiro, consignacion;
		do 
		{
			System.out.println("1. Retirar dinero de la cuenta\n"
					+ "2. Consulta del saldo de la cuenta\n"
					+ "3. Consignar dinero en la cuenta\n"
					+ "0. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) 
			{
				case 1:
					System.out.println("Ingrese la cantidad a retirar");
					retiro = sc.nextInt();
					cuenta.RetirarDinero(retiro);
					break;
					
				case 2:
					System.out.println("Su saldo actual es de: "+ cuenta.getSaldo());
					break;
				
				case 3:
					System.out.println("Ingrese el dinero a consignar");
					consignacion = sc.nextInt();
					cuenta.setSaldo(consignacion);
				case 0:
					break;
			}
		}
		while (opcion != 0);
	}
}
