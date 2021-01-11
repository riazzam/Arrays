package ejercicios;

import java.util.Arrays;

public class Baraja {
	public static String cambiar(int i) {
		String s = "";
		switch (i) {
		case 0:
			s = "O";
			break;
		case 1:
			s = "E";
			break;
		case 2:
			s = "C";
			break;
		case 3:
			s = "B";
			break;

		}
		return s;
	}

	public static void main(String[] args) {
		String[] cartas = new String[40];
		String[] palos = { "O", "E", "C", "B" };
		int ind = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= 10; i++) {
				cartas[ind] = "" + i + cambiar(j);
				ind++;
			}
		}
		System.out.println(Arrays.toString(cartas));

	}

}
