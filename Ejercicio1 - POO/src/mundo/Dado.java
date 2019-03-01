package mundo;

public class Dado {
	
	//Atributos
	private int fro, der, pos, izq, sup, inf;
	
	//Constructor
	public Dado(int fro, int der, int pos, int izq, int sup, int inf) {
	this.fro = fro;
	this.der = der;
	this.pos = pos;
	this.izq = izq;
	this.sup = sup;
	this.inf = inf;
	}

	public int getFro() {
		return fro;
	}

	public void setFro(int fro) {
		this.fro = fro;
	}

	public int getDer() {
		return der;
	}

	public void setDer(int der) {
		this.der = der;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getIzq() {
		return izq;
	}

	public void setIzq(int izq) {
		this.izq = izq;
	}

	public int getSup() {
		return sup;
	}

	public void setSup(int sup) {
		this.sup = sup;
	}

	public int getInf() {
		return inf;
	}

	public void setInf(int inf) {
		this.inf = inf;
	}
	
	//Métodos funcionales
	public void horizontal() {
		int temp = der;
		der = fro;
		fro = izq;
		izq = pos;
		pos = temp;
	}
	
	public void vertical() {
		int temp = fro;
		fro = sup;
		sup = pos;
		pos = inf;
		inf = temp;
	}
	public void transversal() {
		int temp = izq;
		izq = inf;
		inf = der;
		der = sup;
		sup = temp;
	}
}
