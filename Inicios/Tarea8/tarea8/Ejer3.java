package tarea8;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla[]={1,-3,0,1,-8,2,0,1,4,3,1,2};
		estadisticasTabla(tabla);
		
	}
	
	public static void estadisticasTabla(int []tabla) {
		int ceros=0,posit=0,neg=0,pares=0,impar=0;
		for(int i=0;i<tabla.length;i++) {
			if (tabla[i]>0) {
				posit++;
			}
			else if(tabla[i]<0) neg++;
			
			if(tabla[i]==0) {
				
				ceros++;
			}
			if(tabla[i]%2==0 && tabla[i]!=0) {
				pares++;
			}
			else if (tabla[i]%2!=0 && tabla[i]!=0) impar++;
		}
		System.out.println("El número de ceros es: "+ceros);
		System.out.println("El número de positivos es "+posit);
		System.out.println("El número de negativos es "+neg);
		System.out.println("El número de pares es "+pares);
		System.out.println("El número de impares es "+impar);
	}

}
