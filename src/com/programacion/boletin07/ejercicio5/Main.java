package boletin07.ejercicio5;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try	{
			System.out.print("Cantidad de numeros a introducir: ");
			int n = scanner.nextInt();

			Integer[] numeros = new Integer[n];

			for (int i = 0; i < numeros.length; i++) {
				System.out.printf("Introduce el %dº número: ", i+1);
				numeros[i] = scanner.nextInt();
			}

			Ejercicio5 e5 = new Ejercicio5(numeros);
			System.out.printf("\n%s", e5.comprobar());
		} catch	(InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}
