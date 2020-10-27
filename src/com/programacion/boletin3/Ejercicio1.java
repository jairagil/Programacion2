package com.programacion.boletin3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		calcularDescuento();
	}

	static void calcularDescuento() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Tarifa: ");
		float tarifa = scanner.nextFloat();

		System.out.println("Pago: ");
		float pago = scanner.nextFloat();

		float descuento = (tarifa - pago) * 100 / tarifa;

		System.out.println(descuento + "% de descuento");
	}
}
