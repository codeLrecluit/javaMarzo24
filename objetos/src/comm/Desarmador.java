package comm;

public class Desarmador {
	
	String tipo;
	String uso;
	
	public Desarmador() {}

	public Desarmador(String tipo, String uso) {
		super();
		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public String toString() {
		return "Desarmador [tipo=" + tipo + ", uso=" + uso + "]";
	}
	
	

}
