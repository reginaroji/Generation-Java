package javaLoops;
import java.util.*;

public class Fibonacci {
	/*public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Fibonacci");
        
       //TODO implement While loop to get print result
        int aux = 0;
        int aux2 = 1;
        int aux3 = 0;
        System.out.println(aux);
        System.out.println(aux2);
        do {
        	aux3 = aux2 + aux;
        	aux = aux2;
        	aux2 = aux3;
        	System.out.println(aux3);
        	
        } while(aux3 < num);
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=1;
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();
		System.out.println("n°| Fibonacci(n)");
		
		do {
			System.out.println(i+" |  "+n1);
			int siguienteTermino = n1+n2;
			n1=n2;
			n2=siguienteTermino;
			i++;
		} while (i<numero+1);
	} 

}
