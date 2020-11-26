package boletin9.ejercicio1;

public class Main {
	public static void main(String[] args) {
		Contador contador = new Contador();
		Integer[] numeros = { 0, 1, 2, -3, -4, -5, 0, 0, -5, 3, 6};

		contador.calcular(numeros);
	}
}
