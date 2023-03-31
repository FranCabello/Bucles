import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la calificaci�n: ");
		
		float nota = sc.nextFloat();
		
		if (nota >=0 && nota < 4) {
			System.out.println("Su calificaci�n es un Insuficiente.");
		} else if (nota < 6) {
			System.out.println("Su calificaci�n es un Regular.");
		} else if (nota < 7) {
			System.out.println("Su calificaci�n es un Bien.");
		} else if (nota < 9) {
			System.out.println("Su calificaci�n es un Notable.");
		} else if (nota <= 10) { //Consideramos 10 como Sobresaliente
			System.out.println("Su calificaci�n es un Sobresaliente.");
		}
			
		
		sc.close();
	}

}
