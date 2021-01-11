package Evaluacion1.boletin09.ejercicio1;

public class Contador {
	public void calcular(Integer[] numeros) {
		int positivos, negativos, cero;
		positivos = negativos = cero = 0;

		for (Integer numero : numeros) {
			if (numero < 0) {
				negativos++;
			} else if (numero == 0) {
				cero++;
			} else {
				positivos++;
			}
		}

		System.out.printf("%d positivos, %d negativos, %d ceros", positivos, negativos, cero);
	}
}
