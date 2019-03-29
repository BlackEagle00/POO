package controlador;

import interfaz.InterfazApp;
import interfaz.Panel1;
import interfaz.Panel2;

public class Controlador 
{
	private InterfazApp interfaz;
	private Panel1 p1;
	private Panel2 p2;
	
	public Controlador (InterfazApp interfaz, Panel1 p1, Panel2 p2) {
		this.interfaz = interfaz;
		this.p1 = p1;
		this.p2 = p2;
	}
}
