package mundo;

public class Estudiante extends Persona{
	
	private String carrera;
	private int semestre;
	
	public Estudiante(String nombre, String apellido, int edad, int cedula, String carrera, int semestre) {
		super(nombre, apellido, edad, cedula);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
}
