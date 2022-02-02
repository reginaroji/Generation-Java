package funciones;

public class overMethod {
	
	static int myMethod(int edad) {
		return edad;
	}
	static float myMethod(float estatura) {
		return estatura;
	}
	static double myMethod(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println("Mi edad es: " + myMethod(25));
		System.out.println("Mi estatura es: " + myMethod(1.70f));
		System.out.println("La suma de dos números aleatorios es: " + myMethod(2.5, 3.5));
	}
}
