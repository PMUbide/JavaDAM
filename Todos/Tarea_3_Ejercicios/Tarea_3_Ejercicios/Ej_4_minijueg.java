import java.util.Scanner;

public class Ej_4_minijueg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int aleatorio=(int)(Math.random()*20);
		
		System.out.println("Adivina EL N�MERO");
		System.out.println("Introduce n�mero: ");
		Scanner entrada = new Scanner (System.in);		
		int num1=entrada.nextInt();
		
		int i=0;
		
		while (num1!=aleatorio) {
			
			if (num1>aleatorio) {System.out.println("ES MENOR: vuelve a introducir n�mero: ");}
			
			else if (num1<aleatorio) {System.out.println("ES MAYOR: vuelve a introducir n�mero: ");}
			
			num1=entrada.nextInt();
			
			i++;
			
		}
		
		System.out.println("Felicidades, has acertado, en "+ (i+1) + " intentos.");
		
	}

}

