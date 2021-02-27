package evaluacion1.boletin08.ejercicio1;

public class Ejercicio1 {
	String nombre;
	int ventas;

	public Ejercicio1(String nombre, int ventas) {
		this.nombre = nombre;
		this.ventas = ventas;
	}

	public String clasificar() {
		if (ventas <= 100) {
			return "es de consumo bajo";
		} else if (ventas > 100 && ventas <= 500) {
			return "es de consumo medio";
		} else if (ventas > 500 && ventas <= 1000) {
			return "es de consumo alto";
		}

		return "es de primera necesidad.";
	}
}