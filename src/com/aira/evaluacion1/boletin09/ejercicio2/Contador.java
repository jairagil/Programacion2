package Evaluacion1.boletin09.ejercicio2;

public class Contador {
	public void calcular() {
		int suma, producto;
		suma = producto	= 0;

		for (int i = 10; i < 90; i++) {
			suma += i;

			if (producto == 0) {
				producto = i;
			} else {
				producto = producto * i;
			}
		}

		System.out.printf("Suma: %d \nProducto: %d \n", suma, producto);
	}
}
