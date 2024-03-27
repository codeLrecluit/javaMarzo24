package comm;

public class Principal {
	
	
	public static void main(String[]args) {
		
		String mensaje = "usgfowhfbwoefbw";
		
		MaquinaEscribir me = new MaquinaEscribir();
		MaquinaEscribir me2 = new MaquinaEscribir("Yamaha", "MK1", "Mecanica", 90); //forma
		
		
		System.out.println(me2);
		me.setModelo("mk2");
		System.out.println(me);
		
		System.out.println(me2.getTipo());
		
	// 	me.marca ="derf"; acceso directo a un miembro private
	//	me.getMarca(); acceso correcto mediante un getter o / setter
		me.modelo = "reuiter"; // acceso posible pero incorrecto.
		
		Computadora com = new Computadora();
		
		Procesador pro1 = new Procesador("Intel", "i15", 4.2, 8, 12);
		Ram r1 = new Ram(8192, 3200, "ddr4");
		
		Computadora com2 = new Computadora("hp", "Pavilion", "Electronica",120,"windows",pro1, r1);
		
		Cuchillo cu1 = new Cuchillo(150, "Domestico", "grande");
		Desarmador des1 = new Desarmador("Grande",  "Trabajo");
		Navajasuiza n1 = new Navajasuiza(cu1, des1);
		System.out.println(n1);
	}

}
