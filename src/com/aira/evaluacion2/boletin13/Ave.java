package evaluacion2.boletin13;

public class Ave implements IPuedeCaminar{
	int numeroPatas;
	float velocidadMaxima;

	public Ave(int numeroPatas, float velocidadMaxima) {
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
