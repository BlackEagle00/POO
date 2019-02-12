import java.util.Scanner;
public class TiposDatosOO 
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
		float precio, tam, peso;
		String color, textura;
		
		
		System.out.println("\nBienvenido.\nPrecio del primer marcador");
        precio = sc.nextFloat();
        System.out.println("Tamaño del primer marcador");
        tam = sc.nextFloat();
        System.out.println("Peso del primer marcador");
        peso = sc.nextFloat();
        System.out.println("Color del primer marcador");
        color = sc.next();
        System.out.println("Textura del primer marcador");
        textura = sc.next();
        
		Marcador1 m = new Marcador1 (precio, tam, peso, color, textura);	
		
		Marcador2 m2 = new Marcador2 ();
        
		System.out.println("\nPrecio del segundo marcador");
        m2.setPrecio(precio = sc.nextFloat());
        System.out.println("Tamaño del segundo marcador");
        m2.setTam(tam = sc.nextFloat());
        System.out.println("Peso del segundo marcador");
        m2.setPeso(peso = sc.nextFloat());
        System.out.println("Color del segundo marcador");
        m2.setColor(color = sc.next());
        System.out.println("Textura del segundo marcador");
        m2.setTextura(textura = sc.next());
        
        Marcador3 m3 = new Marcador3 (precio, tam, peso, color, textura);	
		
		Marcador4 m4 = new Marcador4 ();
        
        System.out.println("\nBienvenido.\nPrecio del tercer marcador");
        precio = sc.nextFloat();
        System.out.println("Tamaño del tercer marcador");
        tam = sc.nextFloat();
        System.out.println("Peso del tercer marcador");
        peso = sc.nextFloat();
        System.out.println("Color del tercer marcador");
        color = sc.next();
        System.out.println("Textura del tercer marcador");
        textura = sc.next();
        
        System.out.println("\nIngrese el precio del segundo marcador");
        m4.setPrecio(precio = sc.nextFloat());
        System.out.println("Ingrese el tamaño del segundo marcador");
        m4.setTam(tam = sc.nextFloat());
        System.out.println("Ingrese el peso del segundo marcador");
        m4.setPeso(peso = sc.nextFloat());
        System.out.println("Ingrese el color del segundo marcador");
        m4.setColor(color = sc.next());
        System.out.println("Ingrese la textura del segundo marcador");
        m4.setTextura(textura = sc.next());
        
        //Primer Marcador
        System.out.println("\nDatos Primer Marcador (CONSTRUCTOR)\nEl precio del primer marcador es de: " + m.precio);
        System.out.println("El tamaño del primer marcador es de: " + m.tamaño);
        System.out.println("El peso del primer marcador es de: " + m.peso);
        System.out.println("El color del primer marcador es de: " + m.color);
        System.out.println("La textura del primer marcador es de: " + m.textura);
        
        //Segundo Marcador
        System.out.println("\nDatos Segundo Marcador (SETTER Y GETTER)\nEl precio del segundo marcador es de: " + m2.getPrecio());
        System.out.println("El temamño del segundo marcador es de: " + m2.getTam());
        System.out.println("El peso del segundo marcador es de: " + m2.getPrecio());
        System.out.println("El color del segundo marcador es de: " + m2.getColor());
        System.out.println("La textura del segundo marcador es de: " + m2.getTextura()); 
        
        //Tercer Marcador
        System.out.println("\nDAatos Tercer Marcador (CONSTRUCTOR)\nEl precio del tercer marcador es de: " + m3.precio);
        System.out.println("El tamaño del tercer marcador es de: " + m3.tamaño);
        System.out.println("El peso del tercer marcador es de: " + m3.peso);
        System.out.println("El color del tercer marcador es de: " + m3.color);
        System.out.println("La textura del tercer marcador es de: " + m3.textura);
        
        //Cuarto Marcador
        System.out.println("\nDatos Cuarto Marcador (SETTER Y GETTER)\nEl precio del cuarto marcador es de: " + m4.getPrecio());
        System.out.println("El temamño del cuarto marcador es de: " + m4.getTam());
        System.out.println("El peso del cuarto marcador es de: " + m4.getPrecio());
        System.out.println("El color del cuarto marcador es de: " + m4.getColor());
        System.out.println("La textura del cuarto marcador es de: " + m4.getTextura());
        
        System.out.println("El promedio de precios de los marcadores es de: " + ( (m.precio + m2.getPrecio() + m3.precio + m4.getPrecio() ) / 4));
	}
}