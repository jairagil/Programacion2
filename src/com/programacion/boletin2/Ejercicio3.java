package com.programacion.boletin2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
	public static void main(String[] args) {
		convertirEuroDolar(1.17f);
	}

	// en este caso factorConversion suele variar, por eso no se define como final
	static void convertirEuroDolar(float factorConversion) {
		Scanner scanner = new Scanner(System.in);

		float euros = 0;

		System.out.println("Introduce la cantidad de euros:");

		// Se introduce la cantidad de euros por teclado
		try {
			euros = scanner.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido es incorrecto");
		}

		if (euros <= 0) {
			System.out.println("El valor introducido debe ser mayor a cero.");
			return;
		}

		float dolares = euros * factorConversion;

		System.out.printf("%f€ son $%f \n", euros, dolares);
	}
}
