
public class Tarea3 {

	public static void main(String[] args) {
//		1) Implementa un programa Java que sume los números números naturales hasta N (introducido por el usuario) de forma recursiva.
//		2) Implementa un programa Java que dado un número natural N, devuelva su factorial de forma recursiva.
//		3) Implementa un programa Java que dada una tabla de números enteros, muestre por pantalla sus valores de forma recursiva.
//		4) Implementa un programa Java que dada una tabla de números enteros y un número N, devuelva true sí o sólo sí N se encuentra dentro de la tabla dada.
//		5) Implementa un programa Java que dada una tabla multidimensional de números enteros, muestre todos los sus elementos por pantalla de forma recursiva.
//		int ejer1 = 8;
//		System.out.println(suma(ejer1));
		int[] tabla = {2, 5, 7, 8, 34};
		boolean existeNum = false;
//		recorrerArray(tabla);
		existeNum = comprobarNum(tabla, 8);
		System.out.println(existeNum);
//		int[][] multi = {{5, 2}, {1, 2}, {2, 3}, {2, 3}};
//		mostrarMulti(multi);
//		System.out.println(calculaM(1));
	}
	
//	Realiza una función recursiva que encuentre el primer valor N para el que la suma 1 + 2 + 3 + ... + N
//	exceda a un valor M que se introduce por parámetro. 
//	Es decir, si M vale:
//	    1: devuelve 2
//	    3: devuelve 3
//	    7: devuelve 4
//	    10: devuelve 5
//	    15: devuelve 6
	
	public static void recorrerArray(int[] tabla) {
		recorrerArray(tabla, 0);
	}
	public static void recorrerArray(int[] tabla, int i) {
		if(i < tabla.length) {
			System.out.println(i + " - " + tabla[i]);
			recorrerArray(tabla, i + 1);
		}
	}
	
	
	
	
	
	public static int calculaM(int num) {
		return calculaM(num, 0, 0);
	}
	
	public static int calculaM(int num, int i, int j) {
		if(i > num) {
			return j;
		}else {
			i = i + j;
			return calculaM(num, i + 1, j + 1);
		}
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
		return comprobarNum(tabla, 0 , m);
	}
	
	public static boolean comprobarNum(int[] tabla, int i, int m) {
		if(i < tabla.length) {
			if(tabla[i] == m) {
				return true;
			}else {
				return comprobarNum(tabla, i + 1, m);
			}
		}else {
			return false;
		}
//		if(i == 0) return false;
//		if(tabla[i] == m) {
//			return true;
//		}else {
//			return comprobarNum(tabla, i - 1, m);
//		}
	}
	
	
	/**
	 * Método para el ejemplo 1
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
