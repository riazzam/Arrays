package ejemplos;

public class ForAcumulacionVariable {

	public static void main(String[] args) {
        //Este arrays será la colección de elementos por la que iteraremos
        int array[] = new int[10];
        int suma = 0, contador = 0;
        //con este bucle damos valores a los elementos del array
        for (int i = 0; i < array.length; i++) {
            array[i]= 2*i;
        }
        //este es el nuevo tipo de bucle. Va acumulando de la variable
        //suma los valores de todo los elementos del array; el bucle
        //se repetirá a una vez por cada elemento del array y la variable e
        //ir a tomando como valores cada uno de los contenidos de éste
        for (int e : array){  //para cada elemento del array
            suma = suma + e;
        }
        System.out.println(suma);

    }

}
