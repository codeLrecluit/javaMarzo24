package com;

import mx.Computadora;

public class Principal {
	public static void main(String[]args) {
		
		String mensaje = "kxdjncñkzdc";
		
		//se crea un objeto vacio
		MaquinaEscribir me = new MaquinaEscribir();//Se dio ctrl+espacio
		MaquinaEscribir me2 = new MaquinaEscribir("Yamaha", "MK1", "Mecanica", 90);
		System.out.println(me);//muestra el objeto vacio con su valor default
		System.out.println(me2);
		
		me.setModelo("MK2");
		me.setNumTeclas(40);
		System.out.println(me);
		System.out.println(me2.getMarca());
		
		// --------------------------------------------------------------------------- 
		
		//me.marca = "cds"; //Acceso directo a un miembre private no es correcto, ni siquiera se puede
		//me.getMarca();//Acceso correcto mediante un getter y un setter
		
		me.modelo="ioois"; //acceso posible, pero incorrecto
		me.setModelo("svrd");//acceso corecto
		
		Computadora com = new Computadora();
		
		Procesador pro1 = new Procesador("Intel", "i5", 4.2,8,12);
		Ram r1 = new Ram(8192,3200,"DDR4");
		
		Computadora com2 = new Computadora("HP", "Pavilion","ELECTRONICA", 120, "Windows", pro1, r1);
		
		
		
	
		
		
//		Libro asign= new Libro("Orgullo y Prejuicio", "Jane Austen", "Ficcion", 360);
//		System.out.println(asign);
//		Libro asign2= new Libro();
//		asign2.setTiulo("Ángeles y demonios");
//		asign2.setAutor("Dan Brown");
//		asign2.setGenero("Misterio");
//		asign.setNumPaginas(702);
//		System.out.println(asign2);
//		System.out.println(asign.getGenero());
		
		
		
		
		
		
}

	}

