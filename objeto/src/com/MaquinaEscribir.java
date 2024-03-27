package com;

// una clase es una plantilla, un modelo, una abstraccion
//que contiene lo necesario para mi desarrollo
//POJO: UNA CLASE PLANA, SENCILLA EN JAVA

//QUE Y COMO
public class MaquinaEscribir {
//ATRIBUTTOS
	
	// marcar, modelo, tipo. numTeclas
	
	String marca;
	String modelo;
	String tipo;
	int numTeclas;
	
	
	//MIENBROS POR DEFAULT
	//CONSTRUCTORES
	//QUE
	public MaquinaEscribir() {
		
	}


	public MaquinaEscribir(String marca, String modelo, String tipo, int numTeclas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numTeclas = numTeclas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumTeclas() {
		return numTeclas;
	}


	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
	}


	@Override
	public String toString() {
		return "MaquinaEscribir [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", numTeclas=" + numTeclas
				+ "]";
	}
	
	
	//COMO
	//1. Metodos nativos
	//2. Metodos heredados (comumente se sobre escribem)
	//3. Metodos que se implementan (traidos de interfaces)
	
	
	public void escribir() {
		System.out.println("Estoy escribiendo....");
	}
	
	
	

	
	//////////////////////////////////
	
	
}
