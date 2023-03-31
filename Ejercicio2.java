import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca dos números: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			System.out.println(n1 + " es el menor.");
		} else {
			System.out.println(n2 + " es el menor.");
		}
		
		sc.close();

	}

}
	