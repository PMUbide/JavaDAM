import java.util.Arrays;

public class Ejer1_tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 1: Implementa un programa Java que encuentre el segundo
//		elemento más pequeño, y el segundo elemento mayor de un Array de
//		enteros de longitud 20.
		
		int [] array=new int[20]; 
		array[0]=20;
		array[1]=17;
		array[2]=13;
		array[3]=11;
		array[4]=5;
		array[5]=195;
		array[6]=134;
		array[7]=15;
		array[8]=255;
		array[9]=56;
		array[10]=70;
		array[11]=90;
		array[12]=17;
		array[13]=43;
		array[14]=23;
		array[15]=12;
		array[16]=1;
		array[17]=-5;
		array[18]=76;
		array[19]=25;
		
		
		Arrays.sort(array);
		visualizar(array);
		
		System.out.println("El segundo elemento mayor: "+ array[18]);
		System.out.println("El segundo elemento menor: "+ array[1]);

		
		
		
		
	}
	
	public static void visualizar(int tabla[]) {
		System.out.println();
		for(int i=0;i<tabla.length;i++) {
			
				System.out.print(tabla[i]+" ");
			
			System.out.println();
		}
	}
}
