
public class Ejer13_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 13: Escribe un programa Java que muestre los elementos comunes
//		de dos arrays de Strings.
		String [] tabla1 = {"Jorgicol","Quikel","Juancho","Pableras","Chuiquita","Mal"};
		String[] tabla2= {"Jorgicol","Pedricol","Rulo","Mal"};
		String[] comunes;
		if(tabla1.length>tabla2.length) {
			comunes=new String[tabla1.length];
		} else {
			comunes=new String[tabla2.length];
		}
		for(int i = 0; i < comunes.length; i++) {
			comunes[i]="";
		}
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = 0; j< tabla2.length; j++) {
				if(tabla1[i].equals(tabla2[j])) {
					comunes[i]=tabla1[i];
					tabla2[j]="";
				}
			}
		}
		System.out.println("Los comunes son: ");
		for(int i = 0; i < comunes.length; i++) {
			if(!comunes[i].equals("")) {
				System.out.println(comunes[i]);
			}
		}
	}

}
