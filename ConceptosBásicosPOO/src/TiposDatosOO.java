import java.util.Scanner;
public class TiposDatosOO 
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
		float precio = 6250, tam = 18.3F, peso = 0.1F;
		String color = "azul", textura = "liso";
		Marcador1 m = new Marcador1 (precio, tam, peso, color, textura);	
	}
}
