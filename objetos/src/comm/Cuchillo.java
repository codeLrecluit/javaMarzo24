package comm;

public class Cuchillo {
	
	
	int precio;
	String uso;
	String tipo;
	
	public Cuchillo() {}

	public Cuchillo(int precio, String uso, String tipo) {
		super();
		this.precio = precio;
		this.uso = uso;
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuchillo [precio=" + precio + ", uso=" + uso + ", tipo=" + tipo + "]";
	}
	
	

}
