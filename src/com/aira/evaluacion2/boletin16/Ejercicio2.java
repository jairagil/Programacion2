package evaluacion2.boletin16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	private float[] alturaPersonas;
	private float alturaMedia;

	public void addAltura() {
		Scanner scanner = new Scanner(System.in);

		try	{
			System.out.println("¿Cuantas personas desea añadir?");
			alturaPersonas = new float[scanner.nextInt()];
			System.out.println("Introduzca las alturas:");
			for (int i = 0; i < alturaPersonas.length; i++) {
				alturaPersonas[i] = scanner.nextFloat();
			}
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("El valor introducido no es valido.");
		}

		calcularMedia();
	}

	private void calcularMedia() {
		float resultado = 0;

		for (int i = 0; i < alturaPersonas.length; i++) {
			resultado += alturaPersonas[i];
		}

		alturaMedia = resultado / alturaPersonas.length;
	}

	public float getAlturaMedia() {
		return alturaMedia;
	}
}
