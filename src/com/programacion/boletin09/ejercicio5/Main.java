package boletin09.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sueldos sueldos = new Sueldos();

		List<Integer> numeros = new ArrayList<>();
		int numero = 1;

		while(numero != 0) {
			numero = scanner.nextInt();

			if (numero != 0) {
				numeros.add(numero);
			}
		}

		sueldos.calcular(numeros);
	}
}
