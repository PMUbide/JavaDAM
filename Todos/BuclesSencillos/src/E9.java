import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada= new Scanner (System.in);	
		
		System.out.println("Introduce 10 números enteros: ");
		
		int i=0;
		int num=0;
		int cont=0;
		int enteros=0;
		int negativos=0;
				
			while (i<10) {
			
				i++;
			
				num=entrada.nextInt();
				
					if (num==0) {
				
					cont++;
				
					}
				
					
					if (num>0) {
				
					enteros++;
				
					}
			
					
					if (num<0) {
						
						negativos++;
					
						}
				
			}
			
			System.out.println("El numero de veces que ha introducido 0 es de "+ cont);
			System.out.println("El numero de enteros mayores que 0 es de "+ enteros );
			System.out.println("El numero de enteros menores que 0 es de "+ negativos );
		
	}

}
