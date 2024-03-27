package mx;

import com.MaquinaEscribir;
import com.Procesador;
import com.Ram;

public class Computadora extends MaquinaEscribir {
 //MaquinaEscribir maqEsc = new MaquinaEscribir();
 
	public Computadora() {
		
	 }
	 String sistemaOperativo;//Con solo este atributo se rompe la forma clasica de lo que se esta heredando
	 //Atributos de composicion
	 Procesador proc; //clase-objeto -Composicion
	 Ram ram;
	 
	 
	public Computadora(String marca, String modelo, String tipo, int numTeclas, String sistemaOperativo,
			Procesador proc, com.Ram ram) {
		super(marca, modelo, tipo, numTeclas);
		this.sistemaOperativo = sistemaOperativo;
		this.proc = proc;
		this.ram = ram;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public Procesador getProc() {
		return proc;
	}
	public void setProc(Procesador proc) {
		this.proc = proc;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Computadora [sistemaOperativo=" + sistemaOperativo + ", proc=" + proc + ", ram=" + ram + "]";
	}
	 
	 
}
