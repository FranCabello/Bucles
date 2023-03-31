import java.util.Scanner;

public class UD2_T2_E02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Pulse 2 para mostrar los múltiplos de 2 o " + "Pulse 3 para mostrar los múltiplos de 3:");
		n = sc.nextInt();

		if (n == 2) {
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.println(+i);
				}
			}
		}

		if (n == 3) {
			for (int i = 1; i <= 100; i++) {
				if (i % 3 == 0) {
					System.out.println(+i);
				}
			}
		}

		sc.close();

	}
}