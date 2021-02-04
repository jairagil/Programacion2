package Evaluacion2.boletin12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boletin12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// se generan 6 coches, siendo 5 el máximo de plazas
		Coche[] coches =  {
				new Coche(generarMatricula()),
				new Coche(generarMatricula()),
				new Coche(generarMatricula()),
				new Coche(generarMatricula()),
				new Coche(generarMatricula()),
				new Coche(generarMatricula())
		};

		// se añaden los coches al garaje, siendo 6 debería mostrar que no quedan plazas
		Garaje[] garajes = {
				new Garaje(coches[0], (float)Math.floor(Math.random() * 100)),
				new Garaje(coches[1], (float)Math.floor(Math.random() * 100)),
				new Garaje(coches[2], (float)Math.floor(Math.random() * 100)),
				new Garaje(coches[3], (float)Math.floor(Math.random() * 100)),
				new Garaje(coches[4], (float)Math.floor(Math.random() * 100)),
				new Garaje(coches[5], (float)Math.floor(Math.random() * 100)),
		};

		// ejemplo de pago para el coche 3
		System.out.printf("\nEl precio por %.0f minutos es %.2f, cuanto desea pagar?\n", garajes[2].getTiempo(), garajes[2].calcularPrecio());
		float pago = 0;

		try	{
			pago = scanner.nextFloat();
		} catch	(InputMismatchException inputMismatchException) {
			System.out.println("El valor introducido no es valido");
		}

		System.out.printf(
				"\nFACTURA \n" +
				"Matricula: %s \n" +
				"Tiempo: %.2f \n" +
				"Precio: %.2f \n" +
				"Introducido: %.2f \n" +
				"Cambio: %.2f \n\n" +
				"Gracias por usar nuestro aparcamiento.",
				garajes[2].getCoche().getMatricula(), garajes[2].getTiempo(), garajes[2].calcularPrecio(), pago, garajes[2].calcularCambio(pago)
		);

	}

	static String generarMatricula() {
		final String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String matricula = "";

		for (int i = 0; i < 7; i++) {
			if (i < 4) {
				matricula += String.valueOf(Math.floor(Math.random() * 10)).substring(0,1);
			} else {
				matricula += charset.charAt((int)Math.floor(Math.random() * charset.length()));
			}
		}

		return matricula;
	}
}
