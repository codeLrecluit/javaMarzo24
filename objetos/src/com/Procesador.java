package com;

public class Procesador {

	String marca;
	String modelo;
	double velocidad;
	int nucleos;
	double cache;
	public Procesador() {
		
	}
	public Procesador(String marca, String modelo, double velocidad, int nucleos, double cache) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.nucleos = nucleos;
		this.cache = cache;
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
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public int getNucleos() {
		return nucleos;
	}
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	public double getCache() {
		return cache;
	}
	public void setCache(double cache) {
		this.cache = cache;
	}
	
}
