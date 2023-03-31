import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		
		int numero = sc.nextInt();
		
		if (numero > 100) {
			System.out.println("El número es mayor de cien. ");
		}
		
		sc.close();

	}

}
