
public class Ejer8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que muestre por pantalla el
//		factorial de todos los valores numéricos enteros entre 1 y 100.
		double factorial = 1;
		for(int i=0;i<=100;i++) {
			factorial=1;
			for(int j=1; j<=i; j++) {
				factorial=factorial*j;
			}
			System.out.printf("%2d! = %.0f %n", i, factorial);
		}
	}
}
