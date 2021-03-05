
public class Ejer11_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 11: Escribe un programa Java que encuentre el segundo elemento
//		más largo de un array de Strings.
		String [] tabla = {"JUANCHO", "QUIKEL", "JORGICOL","PABLO"};
		int contador=0;
		String nombre="";
		int posicion=0;
		for(int i = 0; i < tabla.length; i++) {
			if (tabla[i].length()>contador) {
				contador=tabla[i].length();
				nombre=tabla[i];
				posicion=i;
			}
		}
		tabla[posicion]="";
//		System.out.println(posicion);
//		System.out.println(nombre);
//		System.out.println(contador);
		contador=0;
		for(int i = 0; i < tabla.length; i++) {
			if (tabla[i].length()>contador) {
				contador=tabla[i].length();
				nombre=tabla[i];
				posicion=i;
			}
		}
		System.out.println("El segundo nombre " + nombre + ". En la posicion "+posicion+" con "+contador+" letras.");
	}

}
