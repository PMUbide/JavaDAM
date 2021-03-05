
public class Ejer3_tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 3: Implementa un programa Java que, dados dos Arrays de
//		enteros, indique si ambos son exactamente iguales o no.
		
		int array1[]=new int[20];
		int array2[]=new int[20];
		rellenar(array1);
		rellenar2(array2);
		int iguales=0;
		
			
		for(int i=0;i<array1.length;i++) {
				if(array1[i]!=array2[i]) {
				iguales++;
				}
		}
			if(iguales>0) {
				System.out.println("No son iguales");
			}
			else {
				System.out.println("Son iguales.");
			
			}
	}

	public static int[] rellenar(int tabla[]) {
		tabla[0]=20;
		tabla[1]=17;
		tabla[2]=13;
		tabla[3]=11;
		tabla[4]=5;
		tabla[5]=195;
		tabla[6]=134;
		tabla[7]=15;
		tabla[8]=255;
		tabla[9]=56;
		tabla[10]=70;
		tabla[11]=90;
		tabla[12]=17;
		tabla[13]=43;
		tabla[14]=23;
		tabla[15]=12;
		tabla[16]=1;
		tabla[17]=-5;
		tabla[18]=76;
		tabla[19]=25;
		return tabla;	
	}	
	
	public static int[] rellenar2(int tabla[]) {
		tabla[0]=20;
		tabla[1]=17;
		tabla[2]=13;
		tabla[3]=11;
		tabla[4]=5;
		tabla[5]=195;
		tabla[6]=134;
		tabla[7]=15;
		tabla[8]=255;
		tabla[9]=56;
		tabla[10]=70;
		tabla[11]=90;
		tabla[12]=17;
		tabla[13]=43;
		tabla[14]=23;
		tabla[15]=12;
		tabla[16]=1;
		tabla[17]=-5;
		tabla[18]=76;
		tabla[19]=25;
		return tabla;	
	}	
		
	
}
