package classGrader;
import java.util.Scanner;

public class ClassGrader {
	public static void main(String[] args) {
		/*  Failed if they scored 3 or less
			Insufficient if they scored > 3 but less than 5. (5 included)
			Good if they scored > 5 but less than 8. (8 included)
			Excellent Grade if they scored 10.
			if participants enter a negative number or a number outside the range supported 			(outside 0 - 10) */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade");
		double grade = scan.nextDouble();
		if(grade <= 3 && grade >= 0)
			System.out.println("Failed");
		else if (grade > 3 && grade <= 5)
			System.out.println("Insufficient");
		else if (grade > 5 && grade <= 9)
			System.out.println("Good");
		else if (grade == 10)
			System.out.println("Excellent");
		else
			System.out.println("Error");
	}
}
