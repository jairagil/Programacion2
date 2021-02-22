package evaluacion1.boletin07.ejercicio4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try	{
			System.out.print("PRIMERA PERSONA \nNombre: ");
			String nombre0 = scanner.next();
			System.out.print("Peso: ");
			float peso0 = scanner.nextFloat();

			System.out.print("\nSEGUNDA PERSONA \nNombre: ");
			String nombre1 = scanner.next();
			System.out.print("Peso: ");
			float peso1 = scanner.nextFloat();

			Ejercicio4 e4 = new Ejercicio4(nombre0, peso0, nombre1, peso1);
			System.out.printf("\n%s", e4.comprobar());
		} catch	(InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}
