import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dise�a un programa Java que solicite al usuario una contrase�a.
		//El usuario debe introducir la contrase�a exactamente igual para que finalice el programa,
		//y tiene un m�ximo de 3 intentos para poder realiarlo.
		
		System.out.println("Introduce tu contrase�a.");
		
		Scanner ent=new Scanner(System.in);
		
		String pass = ent.nextLine();
			
		String pass1="Pablo";
		
		int i=3;
							
		while (pass1.equals(pass)==false && i>=1) 
		{
		
		System.out.println("Error, vuelve a probar. Te quedan " + i +" intentos.");
		i--;
		pass = ent.nextLine();
								
		}  
				
		if (pass1.equals(pass)==true) System.out.println("Enhorabuena, has acertado la contrase�a");
			
		else System.out.println("Lo siento, te has quedado sin intentos.");
	}

}
