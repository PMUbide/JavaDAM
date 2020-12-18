package examenB;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que contenga un método
//		llamado ladosIguales(int[] tabla) que devuelva verdadero sí y solo sí, la
//		tabla contiene los mismos números en su lado izquierdo y derecho. Con el
//		termino “lados” se hace referencia a separar la tabla por la mitad,
//		convirtiéndola así en dos tablas de idéntica longitud.
//		convirtiéndola así en dos tablas de idéntica longitud.
//		1 2 3 2 1
//		1 2
//		2 1
		int tabla[] = {1,2,3,4,5,4,3,2,1};
		if(ladosIguales(tabla)) { //Llamar al metodo boolean que nos dará el TRUE si se leen igual por ámbos lados.
			System.out.println("Si son iguales.");
		}
		else { //en caso de devolver FALSE no se leeran igual.
			System.out.println("No son iguales.");
		}
	}
/**
 * El método que es boolean y hará la comprobación, con que le entra de PRE la tabla que queremos analizar, y devolverá TRUE o FALSE dependiendo del análisis verdadero o false del planteamiento y conoceremos en el princiap con un print el resultado deseado.
 * @param tabla
 * @return
 */
	public static boolean ladosIguales (int[] tabla) {
		int longitud = tabla.length-1; //Variable de la longitud de la tabla -1 para tener la referencia de empezar por el final en la comprobación de la tabla.
		for(int i = 0; i < tabla.length; i++) { //un bucle para ir comprobando los números.
			if(tabla[i]!=tabla[longitud]) { //En el CASO de que encuentre uno que no sea igual, ya directamente es FALSE y efectua el RETURN y se acabaría el método.
				//System.out.println(tabla[i]+"*****"+tabla[longitud]);
				return false;
			}
			longitud--; //Si en este bucle no es diferente, y encuentra un numero igual, entonces se reducira en uno la longitud para que coincida con el siguiente bucle i que aumenta en 1.
		}
		return true; //Si todas son iguales, entonces devolverá TRUE. No hará falta comprobar si la tabla es par o impar, ya que hay un momento donde coincide la i con la longitud y como es el mismo devuelve TRUE, y no afecta.
	}
	
	
	
}
