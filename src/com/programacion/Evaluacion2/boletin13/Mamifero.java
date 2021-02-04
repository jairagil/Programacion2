package Evaluacion2.boletin13;

public class Mamifero implements IPuedeCaminar{
	private int numeroPatas;
	private float velocidadMaxima;		// kmh

	public Mamifero(int numeroPatas, float velocidadMaxima) {
		this.numeroPatas = numeroPatas;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public int mostrarNumeroPatas() {
		return numeroPatas;
	}

	@Override
	public float mostrarVelocidadMaxima() {
		return velocidadMaxima;
	}
}
