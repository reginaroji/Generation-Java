import java.util.Scanner;
//import java.io.Console;

public class MyFirstInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//Console console = System.console();
		System.out.println("Please enter your name ");
		String name = scan.nextLine();

		System.out.println("My name is "+ name);
	}
}
