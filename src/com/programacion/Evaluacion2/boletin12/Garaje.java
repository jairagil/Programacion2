package Evaluacion2.boletin12;

public class Garaje {
	private static int numeroCoches;
	private float tiempo;							// minutos
	private Coche coche;
	private static final int CAPACIDAD = 5;

	public Garaje(Coche coche, float tiempo) {
		// se comprueba si hay espacio antes de añadir el vehiculo
		if (comprobarSitio()) {
			System.out.printf("Hay %d plazas disponibles \n", 5 - numeroCoches);
			this.coche = coche;
			this.tiempo = tiempo;
			numeroCoches++;
		} else {
			System.out.println("No hay plazas disponibles");
		}
	}

	public float calcularCambio(float pago) {
		float importe = calcularPrecio();

		if (importe > 0 && pago > importe) {
			return pago - importe;
		}

		return 0;
	}

	// check needed
	public float calcularPrecio() {
		float resultado = 0;

		if (tiempo > 0) {
			if ((tiempo / 60) > 3) {
				tiempo -= 3*60;
				resultado += (3 * 1.5f + (tiempo / 60) * 0.2f);
			} else {
				resultado += 1.5;
			}
		}

		return resultado;
	}

	private boolean comprobarSitio() {
		if (numeroCoches < CAPACIDAD) {
			return true;
		}

		return false;
	}

	public float getTiempo() {
		return tiempo;
	}

	public Coche getCoche() {
		return coche;
	}
}
