package controlDeFlujoSWITCH;
import java.util.Scanner;

public class ControlDeFlujoSWITCH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opci�n");
		int entry = scan.nextInt();
		
		switch (entry) {
			case 1:
				System.out.println("Elegiste opci�n 1.");
				break;
			case 2:
				System.out.println("Elegiste opci�n 2.");
				break;
			default:
				System.out.println("Esa opci�n no existe.");
		}
	}
}
