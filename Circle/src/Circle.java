import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		System.out.println("Enter the diameter:");
		Scanner scan = new Scanner(System.in);
		int diameter = scan.nextInt();
		double floatDiameter = diameter;
		double area = Math.PI * floatDiameter * floatDiameter / 4;
		double perimeter = Math.PI * floatDiameter;
		System.out.println("Area =" + area);
		System.out.println("Perimeter =" + perimeter);
	}
}
