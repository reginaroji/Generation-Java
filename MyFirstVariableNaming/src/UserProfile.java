import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name ");
		String name = scan.nextLine();		
		System.out.println("Please enter your gender ");
		String gender = scan.nextLine();
		System.out.println("Please enter your job preference ");
		String jobPref = scan.nextLine();
		System.out.println("Please enter your nationality ");
		String nationality = scan.nextLine();
		System.out.println("Please enter your blood type ");
		String bloodType = scan.nextLine();
		System.out.println("Please enter your age ");
		int age = scan.nextInt();
		int birthdayYear = 2022 - age;
		System.out.println("Name: " + name + ". Age: " + age + ". Birthday year: " + birthdayYear + ". Gender: " + gender + ". Job preference: " + jobPref + ". Nationality: " + nationality + ". Blood type: " + bloodType);
	}
}
