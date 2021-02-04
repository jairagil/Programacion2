package Evaluacion2.boletin13;

public class Papagayo extends Ave implements IPuedeVolar {
	float velocidadVuelo;

	public Papagayo(int numeroPatas, float velocidadMaxima, float velocidadVuelo) {
		super(numeroPatas, velocidadMaxima);
		this.velocidadVuelo = velocidadVuelo;
	}

	@Override
	public float mostrarVelocidadVuelo() {
		return velocidadVuelo;
	}
}
