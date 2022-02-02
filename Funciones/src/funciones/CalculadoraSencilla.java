package funciones;
import java.util.*;

public class CalculadoraSencilla {
	static double suma(double x, double y) {
		return x + y;
	}
	
	static double resta(double x, double y) {
		return x - y;
	}
	
	static double multiplicacion(double x, double y) {
		return x * y;
	}
	
	static double division(double x, double y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elige la opción que deseas realizar:\n1.Suma\n2.Resta\n3.Multiplicación\n4.División");
		int opcion = scan.nextInt();
		System.out.println("Ingresa el primer número");
		double num1 = scan.nextDouble();
		System.out.println("Ingresa el segundo número");
		double num2 = scan.nextDouble();
		
		switch(opcion) {
			case 1:
				System.out.println("La suma es: " + suma(num1, num2));
				break;
			case 2:
				System.out.println("La resta es: " + resta(num1, num2));
				break;
			case 3:
				System.out.println("La multiplicación es: " + multiplicacion(num1, num2));
				break;
			case 4:
				System.out.println("La división es: " + division(num1, num2));
				break;
			default:
				System.out.println("Esa opción no está en el menú.");
				break;
		}
	}

}
