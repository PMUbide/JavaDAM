package exportado;


public class Funciones {
	public static void bucle(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Estoy ejecutando el bucle");
		}
	}
	
	public static void sumar(int num, int num2) {
		System.out.println("La suma de " + num + 
				" + " + num2 + " = " + (num + num2));
	}
	
	public static void multiplicar(int num, int num2, int num3) {
		int multiplicacion = num * num2;
		int multiplicacion2 = multiplicarOtraVez(multiplicacion, num3);
		System.out.println("La multiplicacion es = " + multiplicacion2);
	}
	
	private static int multiplicarOtraVez(int num, int num2) {
		return num*num2;
	}
}
