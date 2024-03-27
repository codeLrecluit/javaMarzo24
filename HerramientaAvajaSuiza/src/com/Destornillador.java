package com;

public class Destornillador {
	
	String tipo;
	int tamaño;
	
	public Destornillador() {
		
	}

	public Destornillador(String tipo, int tamaño) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Destornillador [tipo=" + tipo + ", tamaño=" + tamaño + "]";
	}

	

}
