
public class Tarea4 {

	public static void main(String[] args) {
	   /* Programar un algoritmo recursivo que permita invertir un número. Ejemplo: Entrada: 123 Salida: 321
	    Programar un algoritmo recursivo que permita sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
	    Programar un algoritmo recursivo que permita sumar los elementos de una matriz.
	    Programar un algoritmo recursivo que calcule un número de la serie Fibonacci.*/
		
//		System.out.println(invertirNum(123));
//		System.out.println(sumaNum(123));
		int[] matriz = {1, 5, 5, 4, 10, 1};
//		System.out.println(sumaMatriz(matriz));
		System.out.println(fibo(4));
		
	}
	
	public static int fibo(int n) {
		if (n <= 1) return n;
	    return fibo(n-1) + fibo(n-2);
	}
	
	
	public static int sumaMatriz(int[] matriz) {
		return sumaMatriz(matriz, 0);
	}
	
	private static int sumaMatriz(int[] matriz,  int i) {
		if(i == matriz.length) return 0;

		return matriz[i] + sumaMatriz(matriz, i+1);	
		
	}
	

	public static int sumaNum(int n) {
		return sumaNum(n, 0);
	}
	
	private static int sumaNum(int n, int m) {
		if(n == 0) return m;
		int temp = n % 10;
		System.out.println("temp " + temp);
		m = m + temp;
		System.out.println(" n " + n);
		return sumaNum(n/10, m);
	}
	
	
	public static int invertirNum(int n) {
		return invertirNum(n, 0);
	}
	
	private static int invertirNum(int n, int m) {
		if(n == 0) return m;
		int temp = n % 10;
		return invertirNum(n/10, m * 10 + temp);
	}
}
