import java.util.Scanner;
public class areaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println ("Ingresa la base del tri�ngulo");
		double base = s.nextDouble();
		System.out.println ("Ingresa la altura del tri�ngulo");
		double altura = s.nextDouble();
		double area = base*altura/2;
		System.out.println("El �rea del tri�ngulo es: " + area);
	}

}
