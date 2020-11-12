package boletin7.ejercicio2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce el primer número: ");
			short num0 = scanner.nextShort();
			System.out.print("Introduce el segundo número: ");
			short num1 = scanner.nextShort();

			Ejercicio2 e2 = new Ejercicio2(num0, num1);
			System.out.println(e2.comprobar());
		} catch	(InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}
