import java.util.*;
public class Ejer16_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 16: Escribe un programa Java que encuentre todos los pares de
//		elementos enteros de un array que suman el valor escrito por el usuario.
//		CREA UN ARRAY HASTA EL NUMERO DEL USUARIO.
		Scanner in = new Scanner (System.in);
		/*int num = in.nextInt();
		int indice = 0;
		int suma=0;
		while(suma < num) {
			suma=suma+indice;
			indice++;
		}
		System.out.println(indice);
		System.out.println(suma);
		int tabla1 [] = new int[indice]; 
		for(int i = 0; i < tabla1.length; i++) {
			tabla1[i]=i;
		}
		//12-(15-5)=2
		//System.out.println(num+"***"+suma+"***"+(tabla1.length-1));
		tabla1[tabla1.length-1]=num-(suma-(tabla1.length-1));
		for(int i = 0; i < tabla1.length; i++) {
			System.out.println(tabla1[i]);
		}
		*/
		int elemento = in.nextInt();
		int tabla2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i = 0; i < tabla2.length; i++) {
			for(int j = i+1; j < tabla2.length; j++) {
				if(tabla2[i]+tabla2[j]==elemento) {
					System.out.println("suman "+elemento+" el "+tabla2[i]+" y el "+tabla2[j]);
				}
			}
		}
		
		
	}
	
}
 