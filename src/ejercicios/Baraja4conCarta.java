package ejercicios;

import java.util.Arrays;

public class Baraja4conCarta {
	

	public static void main(String[] args) {
		String[] cartas = new String[40];
		String[] palos = { "Oros", "Espadas", "Copas", "Bastos" };
		
		for (int i=0;i<40; i++) {
			cartas[i]= (i%10)+1 + palos[(i/10)];
		}
		
		System.out.println(Arrays.toString(cartas));

	}

}
