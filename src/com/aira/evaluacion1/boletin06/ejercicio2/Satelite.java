package evaluacion1.boletin06.ejercicio2;

public class Satelite {
	private double meridiano;
	private double paralelo;
	private double distanciaTerra;

	public Satelite() {
		meridiano = paralelo = distanciaTerra = 0;
	}

	public Satelite(double meridiano, double paralelo, double distanciaTerra) {
		this.meridiano = meridiano;
		this.paralelo = paralelo;
		this.distanciaTerra = distanciaTerra;
	}

	public void verPosicion() {
		System.out.printf("O satelite atopase no paralelo %.2f, meridiano %.2f a una distancia de la tierra de %.2f", paralelo, meridiano, distanciaTerra);
	}
}
