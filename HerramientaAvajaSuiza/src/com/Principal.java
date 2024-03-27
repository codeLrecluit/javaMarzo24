package com;

import mx.Navaja;

public class Principal {
	
	public static void  main(String[]args) {
		
		
		
		
		Navaja n1 = new Navaja();
		
			Tijera t1 = new Tijera("punteagudas", "metal");
			
				Abrebotellas a1 = new Abrebotellas("Metal", 12);
				
					Lima l1 = new Lima(12, "Metal");
					
						Destornillador d1 = new Destornillador("Cruz", 12);
						


					Navaja n2 = new Navaja("victorinox", "Metal", t1, a1, l1, d1);
		
		
				System.out.println(n2.toString());
	}

}
