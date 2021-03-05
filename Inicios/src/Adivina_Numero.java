import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//queremos que el programa genere un numero aleatorio entre 0 y 100. Math.Random
		
		int aleatorio=(int)(Math.random()*100); // devuelve la parte entera de la instruccion
		
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
				
		while (numero!=aleatorio) {
			
			intentos++;
			System.out.println("Introduce un número: ");
			
			numero = entrada.nextInt(); //numero es igual al proximo entero q introduces en pantalla
			
			if (aleatorio<numero) {
				
				System.out.println("Prueba con un número más bajo");
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("Prueba con un número más alto");
				
			}
			
			
					
		}
		
		System.out.println("CORRECTO !!!!! Lo has conseguido en " + intentos +" intentos" );
		
		
				
		
	}

}
