
public class Ejer12_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 12: Escribe un programa Java que muestre los elementos comunes
//		de dos arrays de enteros.
		int [] tabla1 = {6,7,8,1};
		int [] tabla2= {2,5,1,6,12,4,1};
		int[] comunes;
		if(tabla1.length>tabla2.length) {
			comunes=new int[tabla1.length];
		} else {
			comunes=new int[tabla2.length];
		}
		for(int i = 0; i < comunes.length; i++) {
			comunes[i]=0;
		}
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = 0; j< tabla2.length; j++) {
				if(tabla1[i] ==tabla2[j]) {
					comunes[i]=tabla1[i];
					tabla2[j]=0;
				}
			}
		}
		System.out.println("Los comunes son: ");
		for(int i = 0; i < comunes.length; i++) {
			if(comunes[i]!=0) {
				System.out.println(comunes[i]);
			}
		}
		
	}

}
