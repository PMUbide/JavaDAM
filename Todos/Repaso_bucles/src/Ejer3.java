import java.util.*;
public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		En Carrefour se hace un 20% de descuento a todos los clientes
//		cuya compra supere los 300€. Implementa un programa Java que solicite
//		el importe de una compra y muestre por pantalla el precio final.
		Scanner entrada=new Scanner(System.in);
		int z=1;
		while(z>0) {
			System.out.println();
			System.out.println("Introduce un precio.");
			int precio=entrada.nextInt();
			System.out.println("Precio con descuento del 20% = "+ (precio-(precio*20/100))+"€.");
		}
	}
}
