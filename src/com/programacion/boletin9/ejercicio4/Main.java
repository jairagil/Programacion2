package boletin9.ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Multiplos multiplos = new Multiplos();

		int n;

		do {
			System.out.println("Introduce un número:");
			n = scanner.nextInt();
			multiplos.calcular(n);
		} while(n != 0);
	}
}
