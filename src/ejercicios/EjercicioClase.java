package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class EjercicioClase {
	public static void primero() {
		Random rnd=new Random();
		int[] miArray=new int[8];
		for (int i=0;i<miArray.length;i++) {
			miArray[i]=rnd.nextInt(25)+1;
		}
		System.out.println(Arrays.toString(miArray));
		System.out.println((miArray[1]>miArray[3])?miArray[1]:miArray[3]);
		
		//if (miArray[1]>miArray[3]) System.out.println(miArray[1]);
		//else System.out.println(miArray[3]);
		
	}

	private static String[] segundo() {
		String[] miArrayDeStrings= {"Enero", "febrero","enero","abril"};
		System.out.println(Arrays.toString(miArrayDeStrings));
		System.out.println((miArrayDeStrings[0].equalsIgnoreCase(miArrayDeStrings[2]))?"Son iguales":"No son iguales");
		if (miArrayDeStrings[0].equalsIgnoreCase(miArrayDeStrings[2])) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		return miArrayDeStrings;	
}
	private static void tercero(String[] miArrayStrings) {
		String aux=miArrayStrings[1];
		miArrayStrings[1]=miArrayStrings[3];
		miArrayStrings[3]=aux;
		System.out.println(Arrays.toString(miArrayStrings));
	}

	private static String[] cuarto (String[] miArrayStrings) {
		String aux=miArrayStrings[1];
		miArrayStrings[1]=miArrayStrings[3];
		miArrayStrings[3]=aux;
		System.out.println(Arrays.toString(miArrayStrings));
		return miArrayStrings;
	}
	
	public static String cambio(String s) {
		s="asddf";
		return s+" hola";
	}


	public static void main(String[] args) {
		primero();
		
		tercero(segundo());
		String palabra=" como estás";
		System.out.println(cambio(palabra));
		System.out.println(palabra);
		

			
        String[] dias= {"lunes","martes","miércoles", "jueves","viernes","sábado","domingo"};
		System.out.println(Arrays.toString(cuarto(dias)));
		Arrays.sort(dias);
		System.out.println(Arrays.toString(dias));
		
		
		

	
		

	}

	


}
