package ejemplos;

import java.util.Arrays;

public class Ejemplos11EneroArrays {

	public static void main(String[] args) {
		//Creaci�n e inicializaci�n
		int n=23;
		int[] miArrayEnteros1=new int[n];
		int[] miArrayEnteros= {1,2,3,45,34,64};
		String[] miArrayStrings= {"uno","dos", "tres", "cuarenta y cinco", "treinta y cuatro"};
		
		
		//Acceso a posiciones del array
		
		System.out.println(miArrayEnteros[0]);
		System.out.println(miArrayStrings[3]);
		
		//utilizaci�n del equals
		int[] miArrayEnteros2=Arrays.copyOf(miArrayEnteros,miArrayEnteros.length) ;
		System.out.println("Comparaci�n con Arrays.equals:"+Arrays.equals(miArrayEnteros, miArrayEnteros2));
		
		
		int[] otroArray=miArrayEnteros;
		System.out.println("Comparaci�n otroArray:"+miArrayEnteros.equals(otroArray));
				
		//Asignaci�n de valores
		
		miArrayEnteros[0]=8;
		miArrayStrings[0]="ocho";
		//Acceso a un indice que no existe
		//System.out.println(miArrayEnteros[6]);
		
		//Asignar contenido a un �ndice que no existe
		//miArrayEnteros[5]=23;
		
		//Utilizaci�n de funciones
		System.out.println("Length");
		String s="hola";
		System.out.println(miArrayEnteros.length + " y la del string:" +s.length());
		
		for (int i=0;i<miArrayStrings.length;i++) {
			miArrayStrings[i]+="\t "+ miArrayEnteros[i];
			System.out.print(miArrayStrings[i] + ((i==miArrayStrings.length-1)?"":";"));
		}
		System.out.println();
		for (String palabra: miArrayStrings) {
			System.out.print(palabra+ ";");
		}
		
		
		System.out.println();
		
		
		for (int i=0;i<miArrayEnteros.length;i++) {
			miArrayEnteros[i]+=1;
			System.out.print(miArrayEnteros[i] +((i==miArrayEnteros.length-1)?"":";"));
		}
		System.out.println();
		for (int num:miArrayEnteros) {
			
			System.out.print(num + ";");
		}
		
		System.out.println();
		
		
		
		//Escribo por pantalla todos los valores del array
		System.out.println(Arrays.toString(miArrayStrings));
		System.out.println(Arrays.toString(miArrayEnteros));
		System.out.println(Arrays.toString(otroArray));
		System.out.println(Arrays.toString(miArrayEnteros2));
		

	}

}
