import java.util.*;
public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa el programa de compras de los supermercados
//		Hipercor:
//		 Si el pago se efectúa al “contado”, se le realiza un 5% de descuento
//		al cliente. Sin embargo, si el pago se realiza con tarjeta se
//		incrementa un 3% del valor de la compra.
//		 Si la compra se realiza el día “Martes” o “Jueves” se realizará un
//		descuento del 15% sobre el importe calculado teniendo en cuenta
//		el primer punto.
//		El usuario deberá introducir el importe de la cuenta, la forma de pago
//		(“tarjeta” o “contado”) y el día de la semana (“lunes”, “martes”, ….).
		Scanner entrada=new Scanner(System.in);
		int z=0;
		while (z==0) {
		System.out.println("Introduce la cantidad del pago.");
		double num=entrada.nextDouble();
		String pago, dia;
		do {
			System.out.println("Introduce el método de pago: contado / tarjeta");
			pago=entrada.next();
			if (pago.equalsIgnoreCase("contado")) {
				num=num-(num*0.05);
			}
			else if (pago.equalsIgnoreCase("tarjeta")) {
				num=num+(num*0.03);
			}
			else {
				System.out.println("Introduce el método de pago: contado / tarjeta");
				pago=entrada.next();
			}
		}while (!pago.equalsIgnoreCase("contado") && !pago.equalsIgnoreCase("tarjeta"));
		boolean semana=false;
		System.out.println("Introduce día de la semana. (Lunes, martes, etc...)");
		dia=entrada.next();
		while (semana==false) {
						
			if(dia.equalsIgnoreCase("martes")|| dia.equalsIgnoreCase("jueves")) {
				num=num-(num*0.15);
				semana=true;
			}
			else if (dia.equalsIgnoreCase("lunes")|| dia.equalsIgnoreCase("miercoles") ||dia.equalsIgnoreCase("viernes")|| dia.equalsIgnoreCase("sabado") ||  dia.equalsIgnoreCase("domingo") ) {
			semana=true;
			}
			else {
				System.out.println("Introduce día de la semana. (Lunes, martes, etc...)");
				dia=entrada.next();
			}
		}
		System.out.println("El precio final es: "+num);
		System.out.println();
		}
	}
}
