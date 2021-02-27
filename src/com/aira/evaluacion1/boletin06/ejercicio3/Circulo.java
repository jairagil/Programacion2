package evaluacion1.boletin06.ejercicio3;

public class Circulo {
	private double radio;
	private final double PI = 3.14;

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	// get & set
	public double getRadio() {
		return radio;
	}

	public void setRadio(double valor) {
		radio = valor;
	}

	public double calcularArea() {
		return PI*Math.pow(radio, 2);
	}

	public double calcularLonxitude() {
		return 2*PI*radio;
	}
}
