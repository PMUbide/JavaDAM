
public class Tarea3 {

	public static void main(String[] args) {
//		1) Implementa un programa Java que sume los n�meros n�meros naturales hasta N (introducido por el usuario) de forma recursiva.
//		2) Implementa un programa Java que dado un n�mero natural N, devuelva su factorial de forma recursiva.
//		3) Implementa un programa Java que dada una tabla de n�meros enteros, muestre por pantalla sus valores de forma recursiva.
//		4) Implementa un programa Java que dada una tabla de n�meros enteros y un n�mero N, devuelva true s� o s�lo s� N se encuentra dentro de la tabla dada.
//		5) Implementa un programa Java que dada una tabla multidimensional de n�meros enteros, muestre todos los sus elementos por pantalla de forma recursiva.
		int ejer1 = 8;
		System.out.println(suma(ejer1));
		int[] tabla = {2, 5, 7, 8, 34};
		boolean existeNum = false;
		existeNum = comprobarNum(tabla, 8);
		System.out.println(existeNum);
		int[][] multi = {{5, 2}, {1, 2}, {2, 3}, {2, 3}};
		mostrarMulti(multi);
	}

	public static int mostrarMulti(int[][] multi) {
		return mostrarMulti(multi, multi.length - 1, multi[0].length - 1);
	}
	
	public static int mostrarMulti(int[][] multi, int i, int j) {
		if(i == 0 && j == - 1) {
			return 1;
		}
		if(j == - 1) {
			j = multi[0].length - 1;
			i = i - 1;
			System.out.println();
		}
		System.out.println(multi[i][j]);
		return mostrarMulti(multi, i, j - 1);
	}
	
	
	
	public static boolean comprobarNum(int[] tabla, int m) {
		return comprobarNum(tabla, tabla.length - 1 , m);
	}
	
	public static boolean comprobarNum(int[] tabla, int i, int m) {
		if(i == 0) return false;
		if(tabla[i] == m) {
			return true;
		}else {
			return comprobarNum(tabla, i - 1, m);
		}
	}
	
	
	/**
	 * M�todo para el ejemplo 1
	 * @param a
	 * @return
	 */
	public static int suma(int a) {
		if(a == 0) {
			return 0;
		}else {
			return a + suma(a - 1);
		}
	}
}
