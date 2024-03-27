package com;



public class Principal {
	public static void main (String[] arg) {
		
		
//		MaquinaEscribir me = new MaquinaEscribir();
//		MaquinaEscribir me2= new MaquinaEscribir("Yamaha", "MK1", "Mecanica", 100);
//		System.out.println(me);
//		System.out.println(me2);
//		me.setModelo("MK2");
//		me.setNumTeclas(40);
//		System.out.println(me);
//		System.out.println(me2.getMarca());
//		System.out.println(me2.getNumTeclas());
	
//////////////////////////////////////////
		
		//Instanciamos los boletos
				Boleto boleto0 = new Boleto(200.00, "Noe Damian", "Acapulco");
				Boleto boleto1 = new Boleto(200.00, "Santiago Lopez", "Chilpancingo");
				Boleto boleto2 = new Boleto(200.00, "Jose Perez", "CDMX");
				Boleto boleto3 = new Boleto(200.00, "Karina Perez", "Puebla");
				Boleto boleto4 = new Boleto(200.00, "Maria Vilchis", "Queretaro");
				
				Boleto[] boletos = {boleto0, boleto1, boleto2, boleto3, boleto4};
				
				//Instanciamos EL camion
				Camion camionPuebla = new Camion(40, "Negro", 100000.00, "Mercedes Benz", boletos);
				
				//Instanciamos Central
				Central central = new Central("Merida", camionPuebla);
				
				System.out.println("Central de autobuses: " + central);
			}
		  
		    
		
		  }
		
		
	
	
