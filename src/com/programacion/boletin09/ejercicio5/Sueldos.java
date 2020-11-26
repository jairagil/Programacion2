package boletin09.ejercicio5;

import java.util.List;

public class Sueldos {
	public void calcular(List<Integer> sueldos) {
		int menosMil, masMil;
		menosMil = masMil = 0;

		for (Integer sueldo : sueldos) {
			if (sueldo < 0) {
				continue;
			}

			if (sueldo >= 1000 && sueldo <= 1700) {
				masMil++;
			} else if (sueldo < 1000) {
				menosMil++;
			}
		}

		System.out.printf("\nMenos de mil: %d \nMás de mil: %d", menosMil, masMil);
	}
}
