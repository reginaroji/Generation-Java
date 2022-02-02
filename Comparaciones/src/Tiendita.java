import java.util.*;
public class Tiendita {
	public static void main(String[] args) {
		System.out.println("Hola, en que podemos ayudarte?");
		System.out.println("Bienvenido a la tiendita de los estudiambres, \nA continuación te ofrecemos el siguiente menú... \n1. Paquete básico \n2. Paquete chucherías \n3. Paquete sano \n4. Paquete romántico");
		System.out.println("Elige una opción");
		Scanner scan = new Scanner (System.in);
		double option = scan.nextDouble();
		int option1 = (int)option;
		if(option == 1) {
			System.out.println("El precio del paquete es $1000");
		}
		else if(option == 2) {
			System.out.println("El precio del paquete es $2000");
		}
		else if(option == 3) {
			System.out.println("El precio del paquete es $3000");
		}
		else if(option == 4) {
			System.out.println("El precio del paquete es $4000");
		}
		else
			System.out.println("Hoy no me surtieron de esa joven... Híjole joven te a debo... Hoy no fío, mañana sí");
	}
}

