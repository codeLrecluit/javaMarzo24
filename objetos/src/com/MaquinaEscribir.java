package com;

//Una clase es una plantilla, un modelo, una abstraccion que contiene solo lo necesario para mi desarrollo
//POJO: Una clase plana, sencilla de java, . JAVA PLAIN OLD JAVA OBJECT
//Que y como
public class MaquinaEscribir {
	
	//Atributos: 
	//marca, modelo, tipo, numTeclas,
	private String marca;//solo tiene acceso al interior de la clase
	protected String modelo;//igual se puede acceder qal interior de la clase y tambien se puede acceder mediante getter y setter
	public String tipo;// 
	int numTeclas;
	
	
	
	//  Miembros por default  //
	//Constructores
	
	public MaquinaEscribir() {
		
	}

	public MaquinaEscribir(String marca, String modelo, String tipo, int numTeclas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numTeclas = numTeclas;
	}

	//Getters y Setters

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

	//toString

	@Override
	public String toString() {
		return "MaquinaEscribir [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", numTeclas=" + numTeclas
				+ "]";
	}
	
	
	//COMO
	//1: Metodos nativos
	//Nacen aqui, no viene de otra clase
	public void escribir() {
		System.out.println("estoy escribiendo...");
	}
	
	
	//2: Metodos heredados(comunmente se sobreescribem)
	//3: Metodos que se implementasn(traidos de interfaces)
	
	
	
	/////////////////
	//Una clase surge de la abstraccion, Pilares: ABSTRACCION, ENCAPSULAMIENTO. PILOMORFISMO. HERENCIA

	
	
	
}
