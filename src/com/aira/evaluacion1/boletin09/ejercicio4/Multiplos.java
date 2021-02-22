package evaluacion1.boletin09.ejercicio4;

public class Multiplos {
	public void calcular(int numero) {
		if (numero == 0) {
			return;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%dx%d = %d \n", numero, i, numero * i);
		}
	}
}
