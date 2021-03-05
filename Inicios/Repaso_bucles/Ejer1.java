import java.util.*;
public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que lea la edad introducida por
//		el usuario y “Eres mayor de edad” si la edad es &gt;= 18 años, o “Eres menor
//		de edad” si la edad es &lt; 18 años.
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce la edad");
		int edad=entrada.nextInt();
		if(edad>=18) System.out.println("Eres mayor de edad");
		else System.out.println("Eres menor de edad");
		
		
	}

}
