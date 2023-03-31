import java.util.Scanner;

public class UD2_T2_E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el primer n�mero: ");
		int n1 = sc.nextInt();

		System.out.print("Introduzca el segundo n�mero: ");
		int n2 = sc.nextInt();

		// Suponemos que en el intervalo incluimos los extremos
		// (n�meros insertados por teclado)
		// En caso de no incluirlos, habr�a que quitar los iguales en el for.

		if (n1 > n2) {
			for (int i = n1; i >= n2; i--) {
				System.out.println(i);
			}
		} else {
			for (int i = n1; i <= n2; i++) {
				System.out.println(i);
			}

		}
		sc.close();
	}
}
