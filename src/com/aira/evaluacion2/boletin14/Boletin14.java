package Evaluacion2.boletin14;

import java.util.Scanner;

public class Boletin14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Ingresa los grados centigrados");
			float temperatura = scanner.nextFloat();

			ConversorTemperaturas.centigradosAReamur(temperatura);
		} catch	(TemperaturaErradaException temperaturaErradaException){
			System.out.println("La temperatura no puede ser inferior a 80ºC");
		}

		try {
			System.out.println("\nIngresa los grados centigrados");
			float temperatura = scanner.nextFloat();

			ConversorTemperaturas.centigradosAFharenheit(temperatura);
		} catch	(TemperaturaErradaException temperaturaErradaException){
			System.out.println("La temperatura no puede ser inferior a 80ºC");
		}
	}
}
