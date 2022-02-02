package functionsGithub;
import java.util.Scanner;

public class CalculatorBrain {
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
	
	static double raizCuadrada(double x) {
		return Math.sqrt(x);
	}
	
	static double potencia(double x, double y) {
		return Math.pow(x, y);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elige la opci�n que deseas realizar:\n1.Suma\n2.Resta\n3.Multiplicaci�n\n4.Divisi�n\n5.Ra�z cuadrada\n6.Potencia");
		int opcion = scan.nextInt();
		System.out.println("Ingresa el primer n�mero");
		double num1 = scan.nextDouble();
		System.out.println("Ingresa el segundo n�mero");
		double num2 = scan.nextDouble();
		
		switch(opcion) {
			case 1:
				System.out.println("La suma es: " + suma(num1, num2));
				break;
			case 2:
				System.out.println("La resta es: " + resta(num1, num2));
				break;
			case 3:
				System.out.println("La multiplicaci�n es: " + multiplicacion(num1, num2));
				break;
			case 4:
				System.out.println("La divisi�n es: " + division(num1, num2));
				break;
			case 5:
				System.out.println("La ra�z cuadrada del primer n�mero es: " + raizCuadrada(num1));
				break;
			case 6:
				System.out.println("La potencia del primer n�mero elevado al segundo n�mero es: " + potencia(num1, num2));
				break;
			default:
				System.out.println("Esa opci�n no est� en el men�.");
				break;
		}
	}
}
