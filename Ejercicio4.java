import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca tres n�meros: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el n�mero mayor.");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es el n�mero mayor.");
		} else {
			System.out.println(n3 + " es el n�mero mayor.");
		}
		
		
		sc.close();
	}

}
