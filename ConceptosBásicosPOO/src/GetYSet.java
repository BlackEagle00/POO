public class GetYSet
{
	public static void main (String [] args) 
	{
		float precio = 6250, tam = 18.3F, peso = 0.1F;
		String color = "azul", textura = "liso";
		Marcador2 m = new Marcador2 ();	
		m.setPrecio(6250);
		m.setTam(18.3F);
		m.setPeso(0.1F);
		m.setColor("azul");
		m.setTextura("liso");
		System.out.println(m.getPrecio());
		System.out.println(m.getTam());
		System.out.println(m.getPeso());		
		System.out.println(m.getColor());		
		System.out.println(m.getTextura());		
	}	
}
