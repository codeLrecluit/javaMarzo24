package comm;

public class Ram {
	
	int mb;
	double velocidad;
	String tipo;
	
	public Ram() {
		
	}

	public Ram(int mb, double velocidad, String tipo) {
		super();
		this.mb = mb;
		this.velocidad = velocidad;
		this.tipo = tipo;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ram [mb=" + mb + ", velocidad=" + velocidad + ", tipo=" + tipo + "]";
	}
	
	

}
