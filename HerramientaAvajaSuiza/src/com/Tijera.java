package com;

public class Tijera {
	
	String tipo;
	String material;
	
	public Tijera() {
		
	}

	public Tijera(String tipo, String material) {
		super();
		this.tipo = tipo;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Tijera [tipo=" + tipo + ", material=" + material + "]";
	}

	
	

}
