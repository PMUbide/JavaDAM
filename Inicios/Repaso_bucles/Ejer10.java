import java.util.*;
public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que dibuje una pirámide de
//		asteriscos. El usuario debe introducir la altura de la pirámide por teclado.
//		Este es un ejemplo si introducimos 5:
//				*
//			   ***
//			  *****
//			 *******
//			*********
		    Scanner in = new Scanner(System.in);
		    int num=in.nextInt();;
		    int espacios=num;
		    for (int i = 0; i <= num; i++) {  
		    	for (int espa1 = espacios; espa1 >0; espa1--) {
	            System.out.print(" ");
		        }
		    	for (int asterisk = 0; asterisk < (i*2 -1); asterisk++) {
		            System.out.print("*");
		        }
		    	espacios--;
		        System.out.println();
		    }
		}
}

