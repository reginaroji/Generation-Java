package functionsGithub;
import java.util.Scanner;

public class Names {
	public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.nextLine();
        printNameCharacters( name );
        printNameLength( name );
        printFullName( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
        System.out.println("\nThe length is: " + name.length());
    }

    private static void printNameCharacters( String name )
    {
    	for (int contador=0;contador<name.length();contador++) {
			System.out.println(name.charAt(contador));
		}
    }
    
    private static void printFullName( String name )
    {
    	System.out.println("\nThe full name is: " + name);
    }
}
