import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca dos números: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1%2==0) {
			System.out.println(n1 + " es par.");
		} else {
			System.out.println(n1 + " es impar.");
		}
		
		if (n2%2==0) {
			System.out.println(n2 + " es par.");
		} else {
			System.out.println(n2 + " es impar.");
		}
		
		sc.close();

	}
}
