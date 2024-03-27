package com;

public class Libro {

	String tiulo;
	String autor;
	String genero;
	int numPaginas;
	
	public Libro() {
		
	}

	public Libro(String tiulo, String autor, String genero, int numPaginas) {
		super();
		this.tiulo = tiulo;
		this.autor = autor;
		this.genero = genero;
		this.numPaginas = numPaginas;
	}

	public String getTiulo() {
		return tiulo;
	}

	public void setTiulo(String tiulo) {
		this.tiulo = tiulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [tiulo=" + tiulo + ", autor=" + autor + ", genero=" + genero + ", numPaginas=" + numPaginas + "]";
	}
	
	
}
