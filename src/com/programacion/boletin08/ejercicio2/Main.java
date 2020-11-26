package boletin08.ejercicio2;

import java.util.*;

public class Main {
	static Ejercicio2 e2;

	public static void main(String[] args) {
		e2 = new Ejercicio2();

		mostrarMenu();
	}

	static void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);

		try	{
			System.out.println("\nMenu");

			for (int i = 0; i < e2.opciones.length; i++) {
				System.out.printf("[%d] %s \n", i, e2.opciones[i]);
			}

			System.out.print("\nSelecciona una opción: ");
			int opcion = scanner.nextInt();

			// comprueba si la opción existe
			if (opcion > (e2.opciones.length - 1)) {
				System.out.printf("\n%d no es un opción valida.\n", opcion);
				mostrarMenu();
			} else {
				System.out.printf("\nEl area del %s es: %.2f \n", e2.opciones[opcion] ,e2.calcular(opcion));
			}

		} catch (InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}