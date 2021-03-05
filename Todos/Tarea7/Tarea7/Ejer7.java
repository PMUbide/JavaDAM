
import java.util.Arrays;

import javax.swing.*;
public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[]={1,5,7,8,3,4,1,2,5,4,1,2,3,4,5,6,1,4,5,6,1,2,5,10,2,10,20,30,50,53,20,60,25,30,40,30,40,50,50,25,62,54,65,67};	
		int contador=0;
		insertNUM(tabla);
	}
	
	
	public static int[] insertNUM(int[] tabla) {
		int contador=0;
		int repetido=-1;
		Arrays.sort(tabla);//ordenar el array
		Muestra(tabla);
		//bucle para ir contadorando los que hay iguales,
		//cada nuevo numero lo marca en "repetido", si luego al seguir la i es el mismo no ejecuta el
		//codigo de buscar, así hasta que la i es diferente al "repetido"
		for (int i=0;i<tabla.length;i++) {
			if (tabla[i]!=repetido) {
				for (int j=i+1;j<tabla.length;j++) {
						if(tabla[i]==tabla[j]) {
							contador++;
							repetido=tabla[i];
						}
				}			
			}
		}	
		System.out.println("numero de veces que los números se repiten-------->"+contador);
		int tabla2[]=new int[(tabla.length)-contador];
		int index2=0;
		int num_2=-1;
		//Ahora rellenar con los datos
			do{
				for (int i=0;i<tabla.length;i++) {
		
					if (tabla[i]!=num_2) {
					tabla2[index2]=tabla[i];
					num_2=tabla[i];
					index2++;
					}
			//if (index2==tabla2.length) break;   ¿SE podria poner este tipo de break para cortar, o estaria mejor el while?
				}
			}while (index2<tabla2.length);
		Muestra(tabla2);
		return tabla;
	}
	
	public static void Muestra (int[]a) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
	}
}