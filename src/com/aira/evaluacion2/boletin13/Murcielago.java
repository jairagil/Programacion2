package evaluacion2.boletin13;

public class Murcielago extends Mamifero implements IPuedeVolar {
	float velocidadVuelo;

	public Murcielago(int numeroPatas, float velocidadMaxima, float velocidadVuelo) {
		super(numeroPatas, velocidadMaxima);
		this.velocidadVuelo = velocidadVuelo;
	}

	@Override
	public float mostrarVelocidadVuelo() {
		return velocidadVuelo;
	}
}
