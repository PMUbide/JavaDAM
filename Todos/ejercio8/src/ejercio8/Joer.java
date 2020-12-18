package ejercio8;
import java.util.Scanner;
public class Joer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		 
		        Scanner sc = new Scanner(System.in);
		        String cadena;
		        System.out.print("Introduce cadena de texto: ");
		        cadena = sc.nextLine();
		        cajaTexto(cadena); //llamada al método
		    }

		    // método que muestra un String rodeado por un borde 
		    public static void cajaTexto(String str){
		            int n = str.length(); //longitud del String
		            for (int i = 1; i <= n + 4; i++){ //borde de arriba
		                 System.out.print("#"); 
		            }
		            System.out.println();
		            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              
		            for (int i = 1; i <= n + 4; i++){ //borde de abajo
		                 System.out.print("#"); 
		            }
		            System.out.println();
		    }
			


	}


