package com.programacion.boletin6.ejercicio1;

public class Boletin6_1 {
	public static void main(String[] args) {
		Coche coche = new Coche();

		for (int i = 1; i < 10; i++) {
			coche.acelerar(2*i);
			System.out.printf("Velocidad actual: %d \n", coche.getVelocidade());
		}
		
		for (int i = 1; i < 10; i++) {
			coche.frenar(i);
			System.out.printf("Velocidad actual: %d \n", coche.getVelocidade());
		}
	}
}
