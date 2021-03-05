import java.util.Scanner;
public class adivina_numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//queremos que el programa genere un numero aleatorio entre 0 y 100. Math.Random
		
		int aleatorio=(int)(Math.random()*100); // devuelve la parte entera de la instruccion
		
		
		Scanner entrada=new Scanner(System.in);
		
		//En caso de que de primeras saliese un 0. TRANSFORMAR el bucle a DO-WHILE, eso es que ejecutara el codigo.
		
		int numero=0;
		
		int intentos=0;
				
		do {
			
			intentos++;
			System.out.println("Introduce un número: ");
			
			numero = entrada.nextInt(); //numero es igual al proximo entero q introduces en pantalla
			
			if (aleatorio<numero) {
				
				System.out.println("Prueba con un número más bajo");
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("Prueba con un número más alto");
				
			}
			
			
					
		}while (numero!=aleatorio);
		
		System.out.println("CORRECTO !!!!! Lo has conseguido en " + intentos +" intentos" );
		
		
				
		
	}

}