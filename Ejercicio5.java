import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el n�mero de cr�ditos acumulados: ");
		
		int credito = sc.nextInt();
		
		if (credito < 32) {
			System.out.println("El estudiante se encuentra en el primer a�o.");
		} else if (credito <= 63) {
			System.out.println("El estudiante se encuentra en el segundo a�o.");
		} else if (credito <= 95) {
			System.out.println("El estudiante se encuentra en el tercer a�o.");
		} else {
			System.out.println("El estudiante se encuentra en el �ltimo a�o.");
		}
			
		
		sc.close();
	}

}
