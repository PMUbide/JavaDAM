

public class Ejer20_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea una tabla multidimensional (2D) de números enteros y
//		rellénala como te apetezca.
		int[][] tabla = {{700, 900, 1300, 800, 790, 850} , {1000, 950, 1080, 1070, 1200, 1100}, {2300, 930,	1800, 1170, 1000, 3000} , {1500, 1950, 1880, 1978, 2200, 2100}};  //Cuando es fila o columna.
		int num_max = max(tabla);
		System.out.println("El numero maximo "+num_max);
		int fila = 0;
		int sum_fila = rowSum (tabla, fila);
		System.out.println("El sumatorio de la fila "+fila+ " es igual a "+sum_fila);
		int columna = 2;
		int sum_colum = columnSum(tabla, columna);
		System.out.println("El sumatorio de la columna "+columna+ " es igual a "+sum_colum);
	}

	/**
	 * Escribe un método:
		public static int max(int[][] a)
		que devuelva el valor más grande del array.
	 */
	public static int max (int [][] a) {
		int max=0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				//System.out.println(a[i][j]);
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			
		}
		return max;
	}
	
	/**
	 * Escribe un método:
		public static int rowSum(int[][] a, int x)
		que devuelva la suma de todos los elementos de la fila x
	 */
	public static int rowSum(int [][] a, int x) {
		int sum_fil=0;
		for(int j = 0; j < a[x].length; j++) {
			//System.out.println(a[x-1][j]);
			sum_fil=sum_fil+a[x][j];
		}
		return sum_fil;
	}
	
	/**
	 * Escribe un método:
		public static int columnSum(int[][] a, int x)
		que devuelva la suma de todos los elementos de la columna x
	 */
	public static int columnSum (int[][] a, int x) {
		int sum_col=0;
		for(int j = 0; j < a.length; j++) {
			//System.out.println(a[j][x-1]);
			sum_col=sum_col+a[j][x-1];
		}
		return sum_col;
	}
	
	/**
	 * Escribe un método:
		public static int[] allRowSums(int[][] a)
		que calcule la suma de todas las filas del array multidimensional, y
		almacene cada una de las sumas en un nuevo array simple, en el
		índice que corresponde. Es decir, el nuevo array contendrá en la
		posición 0, la suma de los elementos de la fila 0 del array
		multidimensional, y así sucesivamente.
	 */
	public static int[] allRowSums(int[][] a) {

		
		return null;
		
	}
}
