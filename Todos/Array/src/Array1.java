import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa que lea por teclado 10 números enteros y los guarde en un array.
		 * A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
		 */
		
		
		int matriz1[]= new int [10];
				
		double sumaPos=0;
		double sumaNeg=0;
		
		int positivos=0;
		int negativos=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce 10 números: ");
		
			for (int i=0; i<10; i++) {
				System.out.print("("+(i)+"/10) de número introducidos: ");
				
				//int n= entrada.nextInt();
				
				matriz1[i] = entrada.nextInt();
			}
		
			System.out.println("(10/10) de número introducidos.");
		
		for (int x=0; x < matriz1.length;x++) {
			
			//System.out.println(); System.out.print(matriz1[x]);
			
				if (matriz1[x] > 0){  
                
				sumaPos= sumaPos+ matriz1[x];
                positivos++;
                
				} else if (matriz1[x] < 0){ 
					
							sumaNeg= sumaNeg+ matriz1[x];
                
								negativos++;
						}
					
			
				}
		
		if (positivos!=0) System.out.println("La media de los números positivos será "+(sumaPos/positivos));
		else System.out.println("No has introducido números positivos.");
		
		if (negativos !=0) System.out.println("La medio de los números negativos será "+(sumaNeg/negativos));
		else System.out.println("No has introducido números negativos.");

}
}