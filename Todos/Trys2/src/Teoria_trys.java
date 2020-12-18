import java.util.*;
public class Teoria_trys {

	public static int pedirNumero() {
		Scanner in = new Scanner(System.in);
		System.out.println("Dame un número: ");
		int num;
		try {
			num = in.nextInt();
			System.out.println("El numero introducido es "+ num);
			return num;
		}catch(InputMismatchException e) {
			System.out.println("Tienes que introducir un entero!");
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta=pedirNumero(); //Método para llamar a pedir el numero. 
		while(respuesta==-1) {
			respuesta=pedirNumero();
		}
	}

	
	
	//finally
		//return -1;
}
