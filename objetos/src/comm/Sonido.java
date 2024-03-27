package comm;

public class Sonido {
	
	public static void main(String[]args) {
		
		Bocinas b2 =new Bocinas();
		Bocinas b3 = new Bocinas(18, "Cerwin Vega", 4000, "Grave", "Alibaba");
		
	    System.out.println(b2);
		System.out.println(b3);
		
		b2.setTipo("medio");
		b2.setMarca("JBL");
		
		System.out.println(b2);
	System.out.println("Tipo de bafle es : " +b2.getTipo());
	}

}
