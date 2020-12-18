
public class Ejer19_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escribe un programa Java que, dado un array de Strings,
//		determine si sus elementos se leen igual de principio a final y a la inversa.
//
//		Array: “Hola”, “Adios”, “Adios”, “Hola”
//		¡Los elementos se leen igual!
		String [] tabla1 = {"Hola", "Adios","Rico","Rico", "Adios", "Hola"};
		String[] tabla2= {"Hola", "Adios", "Adios", "Lobo"};
		if(comprobar(tabla1)) {
			System.out.println("Si se leen igual");
		}
		else {
			System.out.println("No se leen igual");
		}
	}
	
	public static boolean comprobar (String[] tabla) {
		int longitud = tabla.length-1;
		for(int i = 0; i < tabla.length; i++) {
			if(!tabla[i].equals(tabla[longitud])) {
				//System.out.println(tabla[i]+"*****"+tabla[longitud]);
				return false;
			}
			longitud--;
		}
		return true;
	}

}
