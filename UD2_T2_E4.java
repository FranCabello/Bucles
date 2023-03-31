import java.util.Scanner;

public class UD2_T2_E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int n = sc.nextInt();
		int s = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				s = s + i;
			}
		}
		System.out.print(+s);
		sc.close();
	}

}
