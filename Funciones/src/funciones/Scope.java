package funciones;

public class Scope {
	public static void main(String[] args) {
		String x = "Holi";
		
		System.out.println(x);//1
		{
			System.out.println(x);//2
			{
				System.out.println(x);//3
			}
			System.out.println(x);//4
		}

		System.out.println(x);//5
	}

}
