package Ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Implementa un método recursivo en Java llamado tablaMultiplicar() que muestre por
//		pantalla la tabla de multiplicar del número solicitado (hasta multiplicar por 10).
		tablaMultiplicar(3);
	}

	public static int tablaMultiplicar(int n) {
		return tablaMultiplicar(n, 10);
	}
	
	private static int tablaMultiplicar(int n, int t) {
		if(t < 0) return 0;
		System.out.println(n + " x " + t + " = " + (n * t));
		//lo vuelve a llamar con el indice de multiplcar - 1
		return tablaMultiplicar(n, t - 1);
	}
}
