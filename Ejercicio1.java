import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero entero: ");
		
		int numero = sc.nextInt();
		
		if (numero > 100) {
			System.out.println("El n�mero es mayor de cien. ");
		}
		
		sc.close();

	}

}
