import java.util.*;
public class Ejer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que calcule la suma de la
//		siguiente serie, donde n es un número introducido por el usuario:
//		1 + 1/2 + 1/3 + …… + 1/n
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		double serie = 0f;
		for(double i=1;i<=num;i++) {
			serie=serie+(1/i);
			System.out.println(serie);
		}
		System.out.println(serie);
	}
}
