package evaluacion2.boletin16;

import javax.print.DocFlavor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	private int[] numeros;
	private int[] estadisticas;

	public Ejercicio1() {
	}

	public void addNumeros() {
		Scanner scanner = new Scanner(System.in);
		numeros = new int[10];

		System.out.println("Introduzca 10 numeros");

		for (int i = 0; i < numeros.length; i++) {
			try	{
				numeros[i] = scanner.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("El valor introducido no es de un tipo valido.");
			}
		}

		calcularEstadisticas();
	}

	private void calcularEstadisticas() {
		estadisticas = new int[2];						//	0 = pares	1 = negativos

		for (int i = 0; i < numeros.length; i++) {
			if ((numeros[i] % 2) == 0) {
				estadisticas[0]++;
			}
			if (numeros[i] < 0) {
				estadisticas[1]++;
			}
		}
	}

	public int[] getEstadisticas() {
		return estadisticas;
	}
}
