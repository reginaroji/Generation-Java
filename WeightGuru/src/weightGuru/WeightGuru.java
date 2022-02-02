package weightGuru;
import java.util.Scanner;

public class WeightGuru {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height in m");
		double height = scan.nextDouble();
		System.out.println("Enter your weight in kg");
		double weight = scan.nextDouble();
		double imc = weight / Math.pow(height,2);
		System.out.println(imc);
		if(imc >= 18.5 && imc >= 24.9)
			System.out.println("Your IMC is good");
		else
			System.out.println("Your IMC could be better");
	}
	
}
