import java.util.*;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
		}
		else{
			
			System.out.println("ERES un pedazo de ENANO");
		}
	}

}
