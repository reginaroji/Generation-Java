package variables;

public class WideningCasting {
	public static void main(String[] args) {
		int myInt = 9;
		//double myDouble = myInt; //Automatic casting int to double
		double myDouble = 32;
		myDouble = myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
	}
}
