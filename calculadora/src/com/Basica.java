package com;

import java.util.Scanner;

public class Basica extends Calculadora{
	double precio;
	public Basica() {
		
	}
	
	public Basica(String marca, String color, double precio) {
		super(marca, color);//atributos de la clase padre
		this.precio = precio;
	}
	

	

	@Override
	public String toString() {
		return "Basica [precio=" + precio + ", marca=" + marca + ", color=" + color + "]";
	}

	@Override
	public void operaciones() {
		// TODO Auto-generated method stub
		System.out.println("Calculadora basica");
		
		Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opc = scanner.nextInt();
        double result = 0;
        
        switch(opc) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        System.out.println("El resultado es: " + result);
    }
	}


