import java.util.*;
import javax.swing.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, pedazo de hijo de puta");
		
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		String edad=entrada.nextLine();
		
		int edad_usuario=Integer.parseInt(edad);
		
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario+1)+" años."	);
				
		
		
		
	}

}
