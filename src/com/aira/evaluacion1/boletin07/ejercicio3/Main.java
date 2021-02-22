package evaluacion1.boletin07.ejercicio3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce un número: ");
			int num = scanner.nextShort();
			Ejercicio3 e3 = new Ejercicio3(num);
			System.out.println(e3.comprobar());
		} catch	(InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es correcto.");
		}
	}
}