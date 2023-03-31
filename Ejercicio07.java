import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número de día de la semana: ");
		
		int dia = sc.nextInt();
		
		String semana = "";
		switch (dia) {
		case 1: semana="Es lunes.";
				break;
		case 2: semana="Es martes.";
				break;
		case 3: semana="Es miércoles.";
				break;
		case 4: semana="Es jueves.";
				break;
		case 5: semana="Es viernes.";
				break;
		case 6: semana="Es sábado.";
				break;
		case 7: semana="Es domingo.";
				break;
		default: semana="Este día no existe.";
		}
		System.out.println(semana);
		
		sc.close();
	}

}