package evaluacion1.boletin07.ejercicio3;

public class Ejercicio3 {
	private int num;

	public Ejercicio3(int num) {
		this.num = num;
	}

	public String comprobar() {
		if (num > 0) {
			return "+";
		} else if (num < 0) {
			return "-";
		} else {
			return "0";
		}
	}
}
