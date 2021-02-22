package evaluacion1.boletin05;

public class Consumo {
	private float km;
	private float litros;
	private float pGas;
	private float vMed;

	public Consumo() {

	}

	public Consumo(float km, float litros, float pGas, float vMed) {
		this.km	 = km;
		this.litros = litros;
		this.pGas = pGas;
		this.vMed = vMed;
	}

	public float getTempo() {
		return vMed/km;
	}

	public float consumoMedio() {
		return litros/(km/100);
	}

	public float consumoEuros() {
		return consumoMedio()*pGas;
	}

	// set km, litros, vMed, pGas
	public void setKm(float valor) {
		this.km = valor;
	}

	public void setLitros(float valor) {
		this.litros = valor;
	}

	public void setvMed(float valor) {
		this.vMed = valor;
	}

	public void setPGas(float valor) {
		this.pGas = valor;
	}

	public float getVMed() {
		return vMed;
	}
}
