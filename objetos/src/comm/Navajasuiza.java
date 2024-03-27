package comm;

public class Navajasuiza {
	
	Cuchillo cu;
	Desarmador des;
	
	public Navajasuiza() {}

	public Navajasuiza(Cuchillo cu, Desarmador des) {
		super();
		this.cu = cu;
		this.des = des;
	}

	public Cuchillo getCu() {
		return cu;
	}

	public void setCu(Cuchillo cu) {
		this.cu = cu;
	}

	public Desarmador getDes() {
		return des;
	}

	public void setDes(Desarmador des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "Navajasuiza [cu=" + cu + ", des=" + des + "]";
	}
	
	

}
