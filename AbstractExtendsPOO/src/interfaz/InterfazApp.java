package interfaz;

import mundo.Estudiante;
import mundo.Persona;

public class InterfazApp {

	public static void main(String[] args) {
		
		//Persona p = new Persona("", "", 0);
		Estudiante estudiante = new Estudiante("Andres", "Bonilla", 18, 12345, "Ing. Sistemas", 3);
		
		System.out.println(estudiante.getNombre());
		System.out.println(estudiante.getApellido());
		System.out.println(estudiante.getEdad());
		System.out.println(estudiante.getCedula());
		System.out.println(estudiante.getCarrera());
		System.out.println(estudiante.getSemestre());
	}
}
