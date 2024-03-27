package comm;
// Una clase es una plantilla, un modelo, una abstracion que contiene solo lo necesario para mi desarrollo
//POJO : una clase plana, sencilla de java
// que y como
public class MaquinaEscribir {
	//Atributos
	//miembros por default
//	constructores
//	getters and setters
//	toString
//abstraccion,encapsulamiento,polimorfismo, herencia
	
	private String marca;
	protected String modelo;
	public String tipo;
	int numTeclas;
	
	
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
		return "MaquinaEscribir [marca=" + marca + 
				", modelo=" + modelo + ", tipo=" + 
				tipo + ", numTeclas=" + numTeclas
				+ "]";
	}
	
	//como
	//1.- Metodos nativos
	
	public void escribir() {
		System.out.println("Estoy escribiendo.....");
	}
	//2.- Metodos heredados(conmunmente se sobreescriben)
	//3.- metodos que se implementan(traidos de interfaces)
	
	
	
	
}
