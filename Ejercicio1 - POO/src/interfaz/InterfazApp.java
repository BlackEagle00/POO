package interfaz;

import mundo.Dado;

public class InterfazApp {
	
	public static void main (String [] args) {
		
		Dado dado;
		
		dado = new Dado (1, 5, 6, 2, 3, 4);
		
		dado.horizontal();

		System.out.print(dado.getFro()+ " "); //1
		System.out.print(dado.getDer()+ " "); //5
		System.out.print(dado.getPos()+ " "); //6
		System.out.print(dado.getIzq()+ " "); //2
		System.out.print(dado.getSup()+ " "); //3
		System.out.println(dado.getInf()+ " "); //4
		
		dado.vertical();

		System.out.print(dado.getFro()+ " "); //3
		System.out.print(dado.getDer()+ " "); //1
		System.out.print(dado.getPos()+ " "); //4
		System.out.print(dado.getIzq()+ " "); //6
		System.out.print(dado.getSup()+ " "); //5
		System.out.println(dado.getInf()+ " "); //2
		
		dado.transversal();

		System.out.print(dado.getFro()+ " "); //3
		System.out.print(dado.getDer()+ " "); //5
		System.out.print(dado.getPos()+ " "); //4
		System.out.print(dado.getIzq()+ " "); //2
		System.out.print(dado.getSup()+ " "); //6
		System.out.println(dado.getInf()+ " "); //1
		
	}
}
