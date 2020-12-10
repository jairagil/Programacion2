package boletin11.ejercicio2;

import javax.swing.*;
import java.lang.Math;

public class JuegoOrdenador {
	public void empezarPartida() {
		int numero = (int)(Math.random() * 50);

		if (numero >= 1 && numero <= 50) {
			int n = -1;
			while (n != numero) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Número?"));
				if (n == numero) {
					System.out.println("Acierto!");
					break;
				} else if ((numero - n) > 20) {
					System.out.println("Moi lonxe");
				} else if ((numero - n) >= 10 && (numero - n) <= 20) {
					System.out.println("Lonxe");
				} else if ((numero - n) > 5 && (numero - n) < 10){
					System.out.println("Preto");
				} else if ((numero - n) <= 5) {
					System.out.println("Moi preto");
				}
			}
		} else if (numero < 0) {
			System.out.println("El número introducido no debe ser menor a 0");
		} else {
			System.out.println("El número introducido no debe ser mayor a 50");
		}

	}
}
