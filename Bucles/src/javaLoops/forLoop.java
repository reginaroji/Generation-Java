package javaLoops;
import java.util.*;

public class forLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese un nombre: ");
		String nombre = sc.nextLine();

		for (int contador=0;contador<nombre.length();contador++) {
			
			System.out.println(nombre.charAt(contador));
		}
	}
}
