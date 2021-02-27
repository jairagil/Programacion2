package evaluacion1.boletin08.ejercicio1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Producto:");
		String nombre = scanner.nextLine();

		System.out.println("Ventas:");
		int ventas = scanner.nextInt();

		Ejercicio1 e1 = new Ejercicio1(nombre, ventas);

		System.out.printf("%s %s", nombre, e1.clasificar());
	}
}
