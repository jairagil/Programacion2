package evaluacion1.boletin05;

public class Boletin5 {
	public static void main(String[] args) {
		Consumo consumo0 = new Consumo();
		consumo0.setLitros(50);
		consumo0.setPGas(1.57f);

		Consumo consumo1 = new Consumo(333, 21, 1.50f, 97);
		System.out.printf("Consumo medio: %.2f l\n", consumo1.consumoMedio());
		consumo1.setLitros(22);
		System.out.printf("Velocidad media: %.2f Km/h\n", consumo1.getVMed());
	}
}
