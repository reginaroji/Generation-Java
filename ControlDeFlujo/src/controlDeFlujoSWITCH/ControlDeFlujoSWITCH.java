package controlDeFlujoSWITCH;
import java.util.Scanner;

public class ControlDeFlujoSWITCH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opción");
		int entry = scan.nextInt();
		
		switch (entry) {
			case 1:
				System.out.println("Elegiste opción 1.");
				break;
			case 2:
				System.out.println("Elegiste opción 2.");
				break;
			default:
				System.out.println("Esa opción no existe.");
		}
	}
}
