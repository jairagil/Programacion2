package boletin7.ejercicio1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce un número: ");
			int num = scanner.nextInt();
			Ejercicio1 e1 = new Ejercicio1(num);
			System.out.println(e1.comprobarNumero());
		} catch	(InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}
