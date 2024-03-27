package com;

public class Lima {
	
	int tamaño;
	String material;
	
	public Lima() {
		
	}

	public Lima(int tamaño, String material) {
		super();
		this.tamaño = tamaño;
		this.material = material;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Lima [tamaño=" + tamaño + ", material=" + material + "]";
	}

	}
