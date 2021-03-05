import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un numero:");		
		int num1=entrada.nextInt();
		
		System.out.println("Introduce un segundo numero:");		
		int num2=entrada.nextInt();
		
		System.out.println("Número random entra esos números");
		int aleatorio=(int)(Math.random()*100);
		
		
		while (aleatorio<num1 || aleatorio>num2) {
			
			aleatorio=(int)(Math.random()*100);

		}
		
		System.out.println(aleatorio);

		
	}

}
