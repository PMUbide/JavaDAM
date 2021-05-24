import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Programa que crea un array de 20 elementos llamado Pares
		y guarde los 20 primeros números pares. 
		Mostrar por pantalla el contenido del array creado. 
		*/
		
		
		int matriz []=new int[20];
		
		System.out.println("Introduce 20 números pares");
		Scanner entrada= new Scanner(System.in); 
		
		for(int i=0;i<20;i++) {
			
			matriz[i]=entrada.nextInt();
			
			if (matriz[i] %2!=0) {
				i--;
			}
						
		}
		
		
		
		for(int z=0;z<20;z++) {
			
			System.out.print(" "+ matriz[z]);
			
		
		
		
	}

}
}
