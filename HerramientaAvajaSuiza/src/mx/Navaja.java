package mx;

import com.Abrebotellas;
import com.Destornillador;
import com.Lima;
import com.Tijera;

public class Navaja {

	String marca;
	String material;
	
	Tijera tijera;
	Abrebotellas abrebotellas;
	Lima lima;
	Destornillador destornillador;
	
	public Navaja() {
		
	}	
	public Navaja(String marca, String material, Tijera tijera, Abrebotellas abrebotellas, Lima lima,
			Destornillador destornillador) {
		super();
		this.marca = marca;
		this.material = material;
		this.tijera = tijera;
		this.abrebotellas = abrebotellas;
		this.lima = lima;
		this.destornillador = destornillador;
	}
		

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Tijera getTijera() {
		return tijera;
	}

	public void setTijera(Tijera tijera) {
		this.tijera = tijera;
	}

	public Abrebotellas getAbrebotellas() {
		return abrebotellas;
	}

	public void setAbrebotellas(Abrebotellas abrebotellas) {
		this.abrebotellas = abrebotellas;
	}

	public Lima getLima() {
		return lima;
	}

	public void setLima(Lima lima) {
		this.lima = lima;
	}

	public Destornillador getDestornillador() {
		return destornillador;
	}

	public void setDestornillador(Destornillador destornillador) {
		this.destornillador = destornillador;
	}


	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", material=" + material + ", tijera=" + tijera + ", abrebotellas="
				+ abrebotellas + ", lima=" + lima + ", destornillador=" + destornillador + "]";
	}
	
	
	
}
