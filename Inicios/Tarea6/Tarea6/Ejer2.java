package Tarea6;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*Escribe un programa Java que muestre los n�meros del 1 al 110, con 11
		n�meros por l�nea. El programa deber� escribir por pantalla �Coza� en
		lugar de los n�meros m�ltiplos de 3, �Loza� en lugar de los n�meros
		m�ltiplos de 5, �Woza� en lugar de los n�meros m�ltiplos de 7 y
		�CozaLoza� en lugar de los n�meros m�ltiplos de 3 y 5. El resultado debe
		ser similar al siguiente:
		*/
		
		for (int i=1;i<=110;i++) {
			
						
			if(i %3==0 && i %5==0) System.out.print("CazaLoza"+" ");
			else if (i %3==0) System.out.print("Coza"+ " ");
			else if(i %5==0) System.out.print("Loza"+" " );
			else if(i %7==0) System.out.print("Woza"+" ");
			else System.out.print(i+ " ");
			
			if((i) %11==0)System.out.println();
			
		}
		
		
		
	}

}
