package Evaluacion1.boletin11.ejercicio1;

import javax.swing.JOptionPane;

public class Juego {
	public void empezarPartida() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 50"));
		int intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos"));

		if (intentos <= 0) {
			System.out.println("El número de intentos debe ser valido");
			return;
		}

		if (numero >= 1 && numero <= 50) {
			int n;
			while (intentos != 0) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Número?"));
				if (n == numero) {
					System.out.println("Acierto!");
					break;
				} else if (n < numero){
					System.out.println("El número introducido es menor");
				} else	{
					System.out.printf("El número introducido es mayor");
				}

				intentos--;
			}
		} else if (numero < 0) {
			System.out.println("El número introducido no debe ser menor a 0");
		} else {
			System.out.println("El número introducido no debe ser mayor a 50");
		}

	}
}
