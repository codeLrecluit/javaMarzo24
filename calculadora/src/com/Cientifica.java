package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	@Override
	public void operaciones() {
		// TODO Auto-generated method stub
		System.out.println("Caluladora Cientifica");
		
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
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Seno");
        System.out.println("8. Coseno");
        System.out.println("9. Tangente");
        
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
            case 5:
                result = Math.pow(num1, num2);
                break;
            case 6:
                result = Math.sqrt(num1);
                break;
            case 7:
                result = Math.sin(num1);
                break;
            case 8:
                result = Math.cos(num1);
                break;
            case 9:
                result = Math.tan(num1);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        System.out.println("El resultado es: " + result);
		
	}

}
