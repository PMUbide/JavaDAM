import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce titular:");
		String titular = in.next();
		Cuenta cuenta = new Cuenta(titular);
		boolean menu = true;
		while (menu==true) {
			System.out.println("¿Que quieres hacer?");
			System.out.println("Opciones:");
			System.out.println("1. Ingresar dinero.");
			System.out.println("2. Retirar dinero.");
			int opciones = in.nextInt();
			switch (opciones) {
				case 1:
					System.out.println("Introduce cantidad a ingresar: ");
					double ingresado = in.nextDouble();
					cuenta.ingresar(ingresado);
					System.out.println("Desea realizar otra operación? S/N");
					String decision = in.next();
					if (decision.equalsIgnoreCase("n")) {
						menu = false;
					}
					break;
				case 2:
					System.out.println("Introduce cantidad a retirar: ");
					double retirado = in.nextDouble();
					cuenta.retirar(retirado);
					System.out.println("Desea realizar otra operación? S/N");
					String decision2 = in.next();
					if (decision2.equalsIgnoreCase("n")) {
						menu = false;
					}
					break;
			}
		}
		System.out.println("Usuario : " + cuenta.getTitular() + ". Tu saldo es: " + cuenta.getCantidad() + " €.");
		System.out.println("Gracias, hasta pronto.");
		
	}

}
