import java.util.Scanner;

public class UD2_T2_E05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1, i = 0, mayor = 0, menor = 0;

		while (n != 0) {
			System.out.println("Introduzca un número: ");
			n = sc.nextInt();

			if (n != 0) {
				i++;
				if (i == 1) {
					mayor = menor = n;
				} else {
					if (n > mayor) {
						mayor = n;
					}
					if (n < menor) {
						menor = n;
					}
				}
			}
		}

		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);

		sc.close();
	}
}