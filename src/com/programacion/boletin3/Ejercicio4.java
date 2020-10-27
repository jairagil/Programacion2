package com.programacion.boletin3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4 {
	public static void main(String[] args) {
		obtenerCambio();
	}

	static void obtenerCambio() {
		Scanner scanner = new Scanner(System.in);

		int[] tipoBillete = {100, 20, 5, 1};
		int[] billetes = new int[4];
		int total;

		System.out.println("Introduce la cantidad total de euros: ");
		try {
			total = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("El valor introducido no es correcto.");
			return;
		}

		if (total <= 0) {
			System.err.println("El valor introducido debe ser superior a cero.");
			return;
		}

		for (int i = 0; i < tipoBillete.length; i++) {
			billetes[i] = total / tipoBillete[i];
			total = total % tipoBillete[i];
		}

		System.out.printf(
			"\n" +
			"Billetes de 100€: %d \n" +
			"Billetes de 20€: %d \n" +
			"Billetes de 5€: %d \n" +
			"Monedas de 1€: %d \n",
				billetes[0], billetes[1], billetes[2], billetes[3]
		);
	}
}
