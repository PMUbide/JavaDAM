import java.util.Scanner;

public class Ejer17_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 17: Escribe un programa Java que encuentre, en un array de
//		enteros, los pares de elementos con mayor y menor separación entre ellos.
//		Scanner in = new Scanner (System.in);
//		int elemento = in.nextInt();
		int menor=10000;
		int mayor=0;
		int tabla2[] = {-200,15,-180,10,111,34,41,24,67};
		for(int i = 0; i < tabla2.length; i++) {
			for(int j = 0; j < tabla2.length; j++) {
				if(tabla2[i]-tabla2[j] > mayor ) {
					mayor=tabla2[i]-tabla2[j];
					System.out.println(tabla2[i]+"*****"+tabla2[j]);
					System.out.println(mayor);
				}
				if(tabla2[i]-tabla2[j] < menor && tabla2[i]-tabla2[j] >0) {
					menor=tabla2[i]-tabla2[j];
					System.out.println(tabla2[i]+"*****"+tabla2[j]);
					System.out.println(menor);
				}
			}
		}
		System.out.println("El mayor es " + mayor);
		System.out.println(" El menor es "+menor);
		
		 /*int tabla[] = {506, 1, 102, 4, 9, 21};
	        int distanciaminima = 999999;
	        int distanciamaxima = 0;
	        for(int x = 0; x < tabla.length; x++) {
	            for(int y = x + 1; y < tabla.length; y++) {
	                int distancia = tabla[x] - tabla[y];
	                if(distancia < 0) {
	                    distancia = distancia * (-1);
	                }
	                if(distanciaminima > distancia) {
	                    distanciaminima = distancia;
	                }
	                if(distanciamaxima < distancia) {
	                    distanciamaxima = distancia;
	                }
	            }
	        }
	        System.out.println("La distancia mínima: " + distanciaminima);
	        System.out.println("La distancia máxima: " + distanciamaxima);
	    }
		*/
		
		
		
	}

}
