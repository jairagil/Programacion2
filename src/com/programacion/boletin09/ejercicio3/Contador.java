package boletin09.ejercicio3;

public class Contador {
	public void calcular(float altura, float base) {
		if (altura < 0 || base < 0) {
			System.out.println("Los valores introducidos no pueden ser negativos.");
			return;
		}

		System.out.printf("%.2f", altura * base);
	}
}
