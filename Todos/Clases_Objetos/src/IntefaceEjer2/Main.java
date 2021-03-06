package IntefaceEjer2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> fronteras = new ArrayList<Persona>();
		Scanner in = new Scanner(System.in);
		boolean estado = true;
		while (estado) {
			int menu = comprobarEntrada();
			boolean introducir = true;
			switch (menu) {
			case 1:
				while (introducir) {
					System.out.println("Di nombre:");
					String nombre = in.next();
					System.out.println("Introduce DNI: ");
					String dni = in.next();
					Persona persona = new Persona(nombre, dni);
					fronteras.add(persona);
					System.out.println("�Introducir otro? s/n");
					String eleccion = in.next();
					if (eleccion.equals("n")) {
						introducir = false;
						break;
					}
				}
				break;
			case 2:
				for (Persona i : fronteras) {
					System.out.printf("El nombre es %s con DNI: %s%n", i.getNombre(), i.getDni());
				}
				break;
			case 3:
				System.out.println("Introduce un nombre para buscar: ");
				String busqueda = in.next();
				boolean encontrado1 = false;
				for (Persona i : fronteras) {
					if (i.getNombre().equals(busqueda)) {
						System.out.printf("Encontrado, n�mero de DNI: %s%n", i.getDni());
						encontrado1 = true;
					}
				}
				if (!encontrado1) System.out.println("No encontrado.");
				break;
			case 4:
				System.out.println("Introduce un DNI para buscar: ");
				String encuentraDni = in.next();
				boolean encontrado2 = false;
				for (Persona i : fronteras) {
					if (i.getDni().equals(encuentraDni)) {
						System.out.printf("Encontrado, nombre %s%n", i.getNombre());
						encontrado2 = true;
					}
				}
				if (!encontrado2) System.out.println("No encontrado.");
				break;
			case 5:
				estado = false;
				break;

			}
      
		}
		System.out.println("*************FIN**************");

	}

	public static int comprobarEntrada() {
		int num = 0;
		boolean correcto = false;
		do {
			try {
				Scanner entrada = new Scanner(System.in);
				System.out.println("\nElige opciones de men�");
				System.out.println(
						"1- Paso de frontera\n 2-Mostrar todas las personas\n 3-B�squeda por nombre\n 4-B�squeda por DNI\n 5-Salir");
				num = entrada.nextInt();
				if (num < 0 || num > 5) {
					System.out.println("error");
					correcto = false;
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("error");
				correcto = false;
			}
		} while (!correcto);
		return num;
	}

}
