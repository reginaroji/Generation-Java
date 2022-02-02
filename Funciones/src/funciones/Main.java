package funciones;

public class Main {
	public static void main(String[] args) {
		listado("Regina", "Rojí", 25);
		listado("Sofía", "Aguilar", 24);
		listado("Rosa", "Carrillo", 27);
	}
	
	static void listado(String nombre, String apellido, int edad) {
		System.out.println(nombre + " " + apellido + ". Edad: " + edad);
	}
}
