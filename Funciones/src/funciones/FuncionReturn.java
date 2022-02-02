package funciones;

public class FuncionReturn {
	public static void main(String[] args) {
		System.out.println(suma(25));
		System.out.println(suma(7));
		System.out.println(suma(12));
	}
	
	static int suma(int a) {
		return a+3;
	}
}
