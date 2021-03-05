
public class Ejer2_tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 2: Implementa un programa Java que cree un Array de enteros
//		de longitud 100 y lo rellene con enteros aleatorios entre 1 y 100 (ambos
//		incluidos).
//		
		int array[]=new int[100];
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*(100-(-100))-100);  //(hasta-desde+1)+desde)
		}
		visualizar(array);
		
	}

	public static void visualizar(int tabla[]) {
		System.out.println();
		for(int i=0;i<tabla.length;i++) {
			
				System.out.print(tabla[i]+" ");
			
			System.out.println();
		}
}
}