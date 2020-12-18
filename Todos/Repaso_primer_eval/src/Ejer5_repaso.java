
public class Ejer5_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 5: Escribe un programa Java que cuente y muestre todos los
//		caracteres duplicados de un String.
		String pal="eres un bastardo rancio";
		int cont=0;
		//int longitud=pal.length();
		while(pal.length()>0) {
			for(int j = 1; j < pal.length(); j++) {
				//System.out.println("princpal     "+pal.substring(0,1));
				//System.out.println(pal.substring(j,j+1));
				if (pal.substring(0,1).equals(pal.substring(j,j+1))){
					cont++;
					//System.out.println(pal);
				}
			}
			if(cont>=1) {
				System.out.println(pal.substring(0,1)+" se repite "+(cont+1)+" veces.");
			}
			pal=pal.replace(pal.substring(0,1),"");
			cont=0;
		}
	}
}
