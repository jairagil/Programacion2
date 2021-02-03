package Evaluacion2.boletin15;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] notas = new int[30];
		int[] estadisticas = {
				0,				// suspensos
				0,				// aprobados
				0,				// media
				0				// nota máxima
		};

		for (int i = 0; i < notas.length; i++) {
			int nota = Ejercicio1.generarNumero(10);

			if (nota > 5) {
				// aprobado
				estadisticas[1]++;
			} else {
				//suspenso
				estadisticas[0]++;
			}

			// añade la nota para la media
			estadisticas[2] += nota;

			// calcula si la nota es mayor que la anterior
			if (i != 0) {
				if (nota > estadisticas[3]) {
					estadisticas[3] = nota;
				}
			} else {
				estadisticas[3] = nota;
			}

			notas[i] = nota;
		}

		estadisticas[2] = estadisticas[2] / notas.length;

		System.out.printf(
				"Aprobados:      %d \n"	+
				"Suspensos:      %d \n"	+
				"Nota media:     %d \n"	+
				"Nota máxima:    %d \n",
				estadisticas[1], estadisticas[0], estadisticas[2], estadisticas[3]
		);
	}
}
