import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pregunta al usuario introducir 10 nueros enteros y muestre la suma final.
		
		
		Scanner entrada =new Scanner(System.in);
		
		int i=10;
		int num1=0;
		int sumatot=0;
		String sumatorio="";
		
			while (i>0) {
			
				if (i==10)
				{
				System.out.println("Introduce un n�mero : (" + (i)+ "/10)");
				i--;
				num1=entrada.nextInt();
							
				sumatot=sumatot + num1;
				
				sumatorio= sumatorio + " " + num1;
				
			
				
				}	else {
			
						System.out.println("Introduce otro n�mero : (" + (i)+ "/10)");
						i--;
						num1=entrada.nextInt();
						
						sumatot=sumatot + num1;
			
						sumatorio= sumatorio + " , " + num1;
						}
					
					if (i==1) {
						
						System.out.println("Introduce el �ltimo n�mero : (" + (i)+ "/10)");
						i--;
						num1=entrada.nextInt();
							
						sumatot=sumatot + num1;
				
						sumatorio= sumatorio + " y " + num1;
				
						}
			
		}
		
		System.out.println("La suma es: "+sumatot+ " (Los n�meros sumados han sido: "+sumatorio +".)");
		
	}

}
