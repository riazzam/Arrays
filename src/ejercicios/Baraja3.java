package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Baraja3 {
	static String[] cartas = new String[40];
	static int[] ocupadas=new int[40];
	static String[] palos = { "Oros", "Espadas", "Copas", "Bastos" };

	public static void barajar() {
		
	}
	
	public static String unaCarta() {
		Random rnd=new Random();
		
		return cartas[rnd.nextInt(40)];
	}
	

	public static void main(String[] args) {
		
		for (int i=0;i<40; i++) {
			cartas[i]= (i%10)+1 + palos[(i/10)];
		}
		
		System.out.println(Arrays.toString(cartas));
		

		Random rnd=new Random();
		int aleatorio=0;
	
	
		int x=0;
		while (x<40){
			aleatorio=rnd.nextInt(40);
			if (ocupadas[aleatorio]==0) {
				System.out.println(cartas[aleatorio]);
				ocupadas[aleatorio]=1;
				x++;
			}
			 
		}
		
		
		

	}

}
