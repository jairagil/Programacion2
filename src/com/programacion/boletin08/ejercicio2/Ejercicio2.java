package boletin08.ejercicio2;

import java.util.*;

public class Ejercicio2 {
	private Scanner scanner;

	public Ejercicio2() {
		scanner = new Scanner(System.in);
	}

	public final String[] opciones = {
			"Cuadrado",
			"Triangulo",
			"Circulo"
	};

	public float calcular(int opcion) {
		try	{
			float b = 0.0f;
			float h = 0.0f;

			if (opcion == 0 || opcion == 1) {
				System.out.print("Introduce la base: ");
				b = scanner.nextFloat();
				System.out.print("Introduce la altura: ");
				h = scanner.nextFloat();
			}

			switch (opcion) {
				case 0:
					return Cuadrado(b, h);

				case 1:
					return Triangulo(b, h);

				case 2:
					System.out.print("Introduce el radio: ");
					return Circulo(scanner.nextFloat());
			}
		} catch (InputMismatchException e) {
			System.out.println("El tipo de dato introducido no es valido.");
		}


		return 0;
	}

	private float Cuadrado(float b, float h)  {
		return b * h;
	}

	private float Triangulo(float b, float h)  {
		return b * h / 2;
	}

	private float Circulo(float r)  {
		return (float)(Math.PI * Math.pow(r, 2));
	}
}