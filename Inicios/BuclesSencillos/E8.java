import java.util.*;
public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada= new Scanner (System.in);	
	
	System.out.println("Introduce 10 números enteros: ");
	
	int i=0;
	int num=0;
	
	int mayor=0;
	int menor=1000000000;
	
		while (i<10) {
		
			i++;
		
			num=entrada.nextInt();
			
				if (num>mayor) {
			
				mayor=num;
			
				}
			
				
				if (num<menor) {
			
				menor=num;
			
				}
		
			
		}
		
		
		
		System.out.println("El numero mayor es "+mayor+" y el menor "+ menor);
		
		
	}

}
