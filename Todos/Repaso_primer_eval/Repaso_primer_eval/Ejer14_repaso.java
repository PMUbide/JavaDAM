
public class Ejer14_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 14: Escribe un programa Java que encuentre los elementos
//		duplicados de un array de Strings.
		String [] tabla1 = {"Chuiquita","Jorgicol","Quikel","Mal","Juancho","Pableras","Chuiquita","Mal"};
		String[] comunes= new String[tabla1.length];
		for(int i = 0; i < comunes.length; i++) {
			comunes[i]="";
		}
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = i+1; j< tabla1.length; j++) {
				if(tabla1[i].equals(tabla1[j])) {
					comunes[i]=tabla1[i];
				}
			}
			tabla1[i]="";
		}
		System.out.println("Los comunes son: ");
		for(int i = 0; i < comunes.length; i++) {
			if(!comunes[i].equals("")) {
				System.out.println(comunes[i]);
			}
		}
	}
	
	
	
	
	
	

}
