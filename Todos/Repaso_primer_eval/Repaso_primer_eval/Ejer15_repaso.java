
public class Ejer15_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 15: Escribe un programa Java que encuentre los elementos
//		duplicados de un array de enteros.
		int [] tabla1 = {2,5,1,6,12,4,1,5};
		int[] comunes= new int[tabla1.length];
		for(int i = 0; i < comunes.length; i++) {
			comunes[i]=9999;
		}
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = i+1; j< tabla1.length; j++) {
				if(tabla1[i]==(tabla1[j])) {
					comunes[i]=tabla1[i];
				}
			}
			tabla1[i]=9999;
		}
		System.out.println("Los comunes son: ");
		for(int i = 0; i < comunes.length; i++) {
			if(comunes[i]!=9999) {
				System.out.println(comunes[i]);
			}
		}
	}

}
