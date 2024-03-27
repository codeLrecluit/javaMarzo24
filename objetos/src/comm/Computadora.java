package comm;

public class Computadora extends MaquinaEscribir {

	public Computadora() {
	}

	String sistemasoperativos;
	Procesador proc;
	Ram ram;

	public Computadora(String marca, String modelo, String tipo, int numTeclas, 
			String sistemasoperativos,
			Procesador proc, Ram ram) {
		super(marca, modelo, tipo, numTeclas);
		this.sistemasoperativos = sistemasoperativos;
		this.proc = proc;
		this.ram = ram;
	}

	public String getSistemasoperativos() {
		return sistemasoperativos;
	}

	public void setSistemasoperativos(String sistemasoperativos) {
		this.sistemasoperativos = sistemasoperativos;
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
		return "Computadora [sistemasoperativos=" + sistemasoperativos + ", proc=" + proc + ", ram=" + ram + "]";
	}

}
