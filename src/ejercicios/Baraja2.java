package ejercicios;

import java.util.Arrays;

public class Baraja2 {
	

	public static void main(String[] args) {
		String[] cartas = new String[40];
		String[] palos = { "Oros", "Espadas", "Copas", "Bastos" };
		int ind = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= 10; i++) {
				cartas[ind] = "" + i +"-"+ palos[j];
				ind++;
			}
		}
		System.out.println(Arrays.toString(cartas));

	}

}
