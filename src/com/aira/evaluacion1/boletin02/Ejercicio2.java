package Evaluacion1.boletin02;

import java.lang.Math;

public class Ejercicio2 {
	public static void main(String[] args) {
		calcularAreaCuadrado(5.0f);
	}

	static void calcularAreaCuadrado(float lado) {
		float area = (float)Math.pow(lado, 2);

		System.out.printf("El area es de: %.2f \n", area);
	}
}
