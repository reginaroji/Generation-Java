package variables;

public class Main {
	// main ctrl+space
	public static void main(String[] args) {
		String nombre = "Regina";
		int edad = 25;
		//float estatura1 = 1.70f;
		double estatura = 1.70;
		final int nacimiento = 1997; // A partir de aquí la variable no se puede modificar, se vuelve constante
		
		// sysout ctrl+space
		System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + estatura + "m. Naciste en el año " + nacimiento);
	}
}
