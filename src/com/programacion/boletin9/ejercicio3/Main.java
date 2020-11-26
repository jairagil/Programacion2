package boletin9.ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Contador contador = new Contador();

		System.out.println("Introduce la altura, luego la base");
		contador.calcular(scanner.nextFloat(), scanner.nextFloat());
	}
}
