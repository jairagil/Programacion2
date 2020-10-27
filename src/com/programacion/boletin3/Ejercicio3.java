package com.programacion.boletin3;

public class Ejercicio3 {
	public static void main(String[] args) {
		obtenerTotal(1, 1, 1, 1);
	}

	public static void obtenerTotal(int billetes100, int billetes20, int billetes5, int monedas) {
		int[] tipoBilletes = {100, 20, 5, 1};
		int[] billetes = {billetes100, billetes20, billetes5, monedas};
		int total = 0;

		for (int i = 0; i < billetes.length; i++) {
			total += tipoBilletes[i] * billetes[i];
		}

		System.out.printf("Total: %d€ \n", total);
	}
}
