
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(suma(5));
		int[] tabla = {1, 2, 5, 10};
//		int i = 2;
		System.out.println(sumaTabla(tabla));
	}

	
	public static int suma(int n) {
		if(n == 0) return 0;
		else return n + suma(n - 1);
	}
	
	public static int sumaTabla(int[] n) {
		return sumaTabla(n, n.length-1);
	}
	
	
	private static int sumaTabla(int[] n, int i) {
		if(i == 0) return n[i];
		else return n[i] + sumaTabla(n, i - 1);
	}
	
}
