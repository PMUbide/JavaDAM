
public class Ejer6_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 6: Escribe un programa Java que indique si dos Strings son rotación
//		entre ellos.
//		1º String: Hola
//		2º String: aloH
//		¡SON ROTACIÓN!
		String pal = "Hola";
		String pal_1 = "aloH";
		int cont = 0;
//		System.out.println(pal_1.length());
		//int longitud = pal_1.length();
		boolean rot = true;
		if(pal.length()==pal_1.length()) {
			for(int i = 0 ; i < pal.length(); i++) {
					System.out.println(pal.substring(i,i+1));
					System.out.println(pal_1.substring(pal_1.length()-1-i,pal_1.length()-i));
					if (!pal.substring(i,i+1).equals(pal_1.substring(pal.length()-i-1,pal.length()-i))){
						rot = false;
						break;
					}
				//longitud=longitud-1;
			}
//			System.out.println("CONTADOR "+cont);
		}
		else rot = false;
		if(rot) {
			System.out.println("Si son rotación!");
		}else System.err.println("No son rotación!");
	}
}
