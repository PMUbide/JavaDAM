
public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5: Implementa un método Java llamado mayorYmenor, el cual
//		recibe como parámetro una tabla de Strings y muestra por pantalla el
//		String con mayor longitud y el String con menor longitud.
		String productos[]=  {"Kit-Kat","Lacasitos","KinderBueno","chocolate","oreo"};
		mayorYmenor(productos);
	}

	
	/**
	 * @param tabla
	 */
	public static void mayorYmenor(String []tabla) {
		int caracter_max=0;// para ir guardando el mayor
		int caracter_min=100;
		String name_max=" ", name_min=" "; // el nombre del mayor
		for (int i=0;i<tabla.length;i++) {
			if (tabla[i].length()>caracter_max) {
				caracter_max=tabla[i].length();
				name_max=tabla[i];
			}
			if (tabla[i].length()<caracter_min) {
				caracter_min=tabla[i].length();
				name_min=tabla[i];
			}
		}
		
		System.out.println("Mayor longitud:  "+name_max+ ", tiene "+caracter_max+" letras.");
		System.out.println("Menor longitud:  "+name_min+ ", tiene "+caracter_min+" letras.");
	}
	
}

