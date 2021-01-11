package ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemploBasico {

	public static void main(String[] args) {
		Random rnd=new Random();
		int[] otroVar= {10,11,12,13,14};
		otroVar[3]=45;
		int[] varInt=new int[3];
		varInt[0]=2;
		varInt[1]=3;
		varInt[2]=4;
		
		for (int i=0; i<varInt.length;i++) {
			System.out.println(varInt[i]+ "-"+ otroVar[i]);
		}
		
		String otraFrase="En un lugar de la Mancha de cuyo nombre no quiero acordarme";
		String [] arrayF=otraFrase.split(" ");
		System.out.println(Arrays.toString(arrayF));
		System.out.println(Arrays.toString(otroVar));
		String[] frase= {"En un", "un","lugar","de","la","Mancha"};
		System.out.println(frase[2]);
		System.out.println(Arrays.toString(frase));
		
		int[] temperaturas= new int[100];
		for (int i=0; i<temperaturas.length;i++) {
			temperaturas[i]=rnd.nextInt(9)+35;
		}
		
		for (int i: temperaturas) {
			System.out.print(i+ "-");
		}
		System.out.println(Arrays.toString(temperaturas));
		
		
		

	}

}
