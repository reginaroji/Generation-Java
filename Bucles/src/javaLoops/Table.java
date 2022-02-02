package javaLoops;
import java.util.*;

public class Table {
	public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
       //TODO implement While loop to get print result
        
        int cont = 0;
        while (cont <= 10) {
        	System.out.println(num + " * " + cont + " = " + (cont*num));
        	cont++;
        }
    }
}
