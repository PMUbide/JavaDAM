import java.util.*;
public class prueba_quike {

	public static void main(String[] argumentos) {
		// TODO Auto-generated method stub

	double x = preguntar ("Introduzca el primer n�mero: ");
	
	double y = preguntar (" Introduzca el segundo n�mero: ");
		
	suma(x,y);
		
				
	}

		public static void suma (double x, double y) {
		
						
		System.out.println("La suma de los dos n�meros es " +  (x+y));
		
	}
	
	public static double preguntar (String mensaje) {
		
		System.out.println(mensaje);
		
		Scanner entrada = new Scanner(System.in);
		
		return entrada.nextDouble();
		
	}
	
	
	
}
