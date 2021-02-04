package Evaluacion2.boletin13;

public class Boletin13 {
	public static void main(String[] args) {
		Gato gato = new Gato(4, 48);
		System.out.printf("El gato tiene %d patas y su velocidad máxima es de %.2f km/h", gato.mostrarNumeroPatas(), gato.mostrarVelocidadMaxima());

		Avestruz avestruz = new Avestruz(2, 70);
		Murcielago murcielago = new Murcielago(2, 2, 160);

	}
}
