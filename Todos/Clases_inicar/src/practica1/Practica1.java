package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador [] jug_equipo1 = new Jugador[11];
		jug_equipo1 [0] = new Jugador ("Sergio Ramos", 9, 1, 5, 10 );
		jug_equipo1 [1] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo1 [2] = new Jugador("Pableras", 9, 1, 2, 1 );
		jug_equipo1 [3] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo1 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo1 [5] = new Jugador("Pableras", 9, 1, 2, 1 );
		jug_equipo1 [6] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo1 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo1 [8] = new Jugador("Pableras", 9, 1, 2, 1 );
		jug_equipo1 [9] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo1 [10] = new Jugador ("Edurne", 9, 20, 2, 1 );
		Jugador [] jug_equipo2 = new Jugador[11];
		jug_equipo2 [0] = new Jugador ("Benzema", 9, 0, 2, 1 );
		jug_equipo2 [1] = new Jugador ("Pedricol", 9, 1, 2, 1 );
		jug_equipo2 [2] = new Jugador("Jorgicol", 9, 6, 2, 1 );
		jug_equipo2 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo2 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo2 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo2 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo2 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo2 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo2 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo2 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo3 = new Jugador[11];
		jug_equipo3 [0] = new Jugador ("Benzem", 9, 20, 2, 1 );
		jug_equipo3 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo3 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo3 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo3 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo3 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo3 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo3 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo3 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo3 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo3 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo4 = new Jugador[11];
		jug_equipo4 [0] = new Jugador ("Clint", 9, 203, 2, 1 );
		jug_equipo4 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo4 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo4 [3] = new Jugador ("Sergio Ramos", 9, 0, 2, 1 );
		jug_equipo4 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo4 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo4 [6] = new Jugador ("Sergio Ramos", 9, 0, 2, 1 );
		jug_equipo4 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo4 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo4 [9] = new Jugador ("Sergio Ramos", 9, 0, 2, 1 );
		jug_equipo4 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo5 = new Jugador[11];
		jug_equipo5 [0] = new Jugador ("aaaaaaaa", 9, 44, 2, 1 );
		jug_equipo5 [1] = new Jugador ("Elsucio", 9, 20, 15, 1 );
		jug_equipo5 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo5 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo5 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo5 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo5 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo5 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo5 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo5 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo5 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo6 = new Jugador[11];
		jug_equipo6 [0] = new Jugador ("Kevin", 9, 8, 2, 1 );
		jug_equipo6 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo6 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo6 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo6 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo6 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo6 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo6 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo6 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo6 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo6 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo7 = new Jugador[11];
		jug_equipo7 [0] = new Jugador ("Benzemaa", 9, 20, 2, 1 );
		jug_equipo7 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo7 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo7 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo7 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo7 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo7 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo7 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo7 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo7 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo7 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo8 = new Jugador[11];
		jug_equipo8 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo8 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo8 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo8 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo8 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo8 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo8 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo8 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo8 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo8 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo8 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo9 = new Jugador[11];
		jug_equipo9 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo9 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo9 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo9 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo9 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo9 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo9 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo9 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo9 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo9 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo9 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo10 = new Jugador[11];
		jug_equipo10 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo10 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo10 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo10 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo10 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo10 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo10 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo10 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo10 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo10 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo10 [10] = new Jugador ("VICTORINO", 9, 1, 57, 1 );
		Jugador [] jug_equipo11 = new Jugador[11];
		jug_equipo11 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo11 [1] = new Jugador ("Elmejor", 9, 10, 2, 1 );
		jug_equipo11 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo11 [3] = new Jugador ("Sergio Ramos", 9, 10, 2, 1 );
		jug_equipo11 [4] = new Jugador ("Pedricol1", 9, 0, 2, 1 );
		jug_equipo11 [5] = new Jugador("Pableras", 9, 0, 2, 1 );
		jug_equipo11 [6] = new Jugador ("Sergio Ramos", 9, 0, 2, 1 );
		jug_equipo11 [7] = new Jugador ("Pedricol1", 9, 0, 2, 1 );
		jug_equipo11 [8] = new Jugador("Pableras", 9, 0, 2, 1 );
		jug_equipo11 [9] = new Jugador ("Sergio Ramos", 9, 0, 2, 1 );
		jug_equipo11 [10] = new Jugador ("Pedricol1", 9, 0, 2, 1 );
		Jugador [] jug_equipo12 = new Jugador[11];
		jug_equipo12 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo12 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo12 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo12 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo12 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo12 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo12 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo12 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo12 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo12 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo12 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo13 = new Jugador[11];
		jug_equipo13 [0] = new Jugador ("Benzema", 9, 20, 2, 1 );
		jug_equipo13 [1] = new Jugador ("Pedricol", 9, 20, 2, 1 );
		jug_equipo13 [2] = new Jugador("Tontito", 9, 20, 2, 1 );
		jug_equipo13 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo13 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo13 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo13 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo13 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo13 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo13 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo13 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo14 = new Jugador[11];
		jug_equipo14 [0] = new Jugador ("Señor Goles", 9, 5, 2, 1 );
		jug_equipo14 [1] = new Jugador ("Pedricol", 9, 10, 2, 1 );
		jug_equipo14 [2] = new Jugador("Jorgicol", 9, 20, 2, 1 );
		jug_equipo14 [3] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo14 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo14 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo14 [6] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo14 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo14 [8] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo14 [9] = new Jugador ("Sergio Ramos", 9, 42, 2, 1 );
		jug_equipo14 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		Jugador [] jug_equipo15 = new Jugador[11];
		jug_equipo15 [0] = new Jugador ("Benzema", 9, 1, 2, 1 );
		jug_equipo15 [1] = new Jugador ("Pedricol", 9, 1, 2, 1 );
		jug_equipo15 [2] = new Jugador("Guarroman", 9, 1, 2, 1 );
		jug_equipo15 [3] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo15 [4] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo15 [5] = new Jugador("Pableras", 9, 5, 2, 1 );
		jug_equipo15 [6] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo15 [7] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		jug_equipo15 [8] = new Jugador("Pableras", 9, 1, 2, 1 );
		jug_equipo15 [9] = new Jugador ("Sergio Ramos", 9, 1, 2, 1 );
		jug_equipo15 [10] = new Jugador ("Pedricol1", 9, 1, 2, 1 );
		//A continuaciónm se crean los equipos.
		Equipo equipo1 = new Equipo("Real Madrid", "Santiago Bernabeu", 1902, jug_equipo1, 100, 9, 3);
		Equipo equipo2 = new Equipo("Barcelona", "Camp Nou", 1899, jug_equipo2, 0, 15, 6);
		Equipo equipo3 = new Equipo("Atlético de Madrid", "Calderón", 1903, jug_equipo3, 18, 16, 4);
		Equipo equipo4 = new Equipo("Sevilla", "Ramón Sánchez-Pizjuán", 1994, jug_equipo4, 19, 13, 6);
		Equipo equipo5 = new Equipo("Villareal", "Estadio de la Cerámica", 1890, jug_equipo5, 18, 6, 14);
		Equipo equipo6 = new Equipo("Real Sociedad", "Reale Arena", 1909, jug_equipo6, 16, 8, 14);
		Equipo equipo7 = new Equipo("Granada", "Estadio Nuevo Los Cármenes", 1931, jug_equipo7, 16, 8, 14);
		Equipo equipo8 = new Equipo("Getafe", "Coliseum Alfonso Pérez", 1983, jug_equipo8, 14, 12, 12);
		Equipo equipo9 = new Equipo("Valencia", "Mestalla Valencia CF", 1919, jug_equipo9, 14, 11, 13);
		Equipo equipo10 = new Equipo("Osasuna", "Estadio El Sadar", 1920, jug_equipo10, 13, 13, 12);
		Equipo equipo11 = new Equipo("Athletic Club", "San Mamés", 1898, jug_equipo11, 55, 12, 13);
		Equipo equipo12 = new Equipo("Levante", "Levante UD", 1909, jug_equipo12, 322, 7, 17);
		Equipo equipo13 = new Equipo("Valladolid", "Estadio José Zorrilla", 1928, jug_equipo13, 9, 15, 14);
		Equipo equipo14 = new Equipo("Eibar", "Estadio Municipal de Ipurúa", 1940, jug_equipo14, 87, 9, 18);
		Equipo equipo15 = new Equipo("Real Betis", "Estadio Benito Villamarín", 1907, jug_equipo15, 10, 11, 17);
		//Juntamos todos los equipos creados en un ARRAY de equipos.
		Equipo [] total = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6, equipo7, equipo8, equipo9, equipo10, equipo11, equipo12, equipo13, equipo14, equipo15};
		//Creamos el objeto de la liga.
		Liga ligaNacional = new Liga ("Liga Santander 19-20", total);
		//Ahora empezaría el programa.
		Scanner in = new Scanner (System.in);
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("BIENVENIDO AL PROGRAMA DE LA LIGA");
		System.out.println("*********************************");
		System.out.println("*********************************");
		int eleccion = 0; //Variable para la eleccion del menú.
		String consulta = "";
		while (eleccion != 5) {
			System.out.println();
			System.out.println("Opciones: ");
			System.out.println("1. Mostrar la clasificación por puntos.");
			System.out.println("2. Mostrar los 5 jugadores con más goles.");
			System.out.println("3. Mostrar los 5 jugadores con más expulsiones.");
			System.out.println("4. Mostrar los 3 equipos con más goles a favor.");
			System.out.println("5. Finalizar");
			eleccion = comprobarMenu();
			while (eleccion == -9999) {
				System.out.println();
				System.out.println("Opciones: ");
				System.out.println("1. Mostrar la clasificación por puntos");
				System.out.println("2. Mostrar los 5 jugadores con más goles.");
				System.out.println("3. Mostrar los 5 jugadores con más expulsiones.");
				System.out.println("4. Mostrar los 3 equipos más goles a favor.");
				System.out.println("5. Finalizar");
				eleccion = comprobarMenu();
			}
			if (eleccion > 5 || eleccion < 0) {
				System.out.println("No has introducido un valor válido. Vuelve a intentarlo.");
			}
			switch (eleccion) {
				case 1:
					ordenarPuntos(total, ligaNacional);
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next();
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5;
					}
					break;
				case 2:
					maximosGoleadores(total);
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next();
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5;
					}
					break;
				case 3:
					expulsiones(total);
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next();
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5;
					}
					break;
				case 4:
					equiposGoleadores(total);
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next();
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no") ) {
						eleccion = 5;
					}
					break;
			}
		}
		System.out.println("Gracias, hasta pronto.");
		
	}
	
	public static int comprobarMenu () {
		Scanner in = new Scanner (System.in);
		int eleccion;
		try {
			eleccion = in.nextInt();
			return eleccion;
		}catch (InputMismatchException e) {
			System.out.println("No has introducido bien el valor válido. Vuelve a intentarlo.");
			System.out.println();
			return -9999;
		}
	}

	
	public static void ordenarPuntos (Equipo [] tabla, Liga liga) {
		//Habria que copiar para comparar.
		Equipo [] equiposClasi = new Equipo [tabla.length];
		Equipo equipoAux = null;
		//Creamos un bucle para ir rellenando la tabla copiada para no machacar los datos originales.
		for (int i = 0; i < tabla.length; i++) {
			equiposClasi[i] = tabla[i];
		}
		for (int i = 0; i < tabla.length; i++) {
			for ( int j = i +1; j < tabla.length; j++) {
				if (equiposClasi[i].getPuntos() < equiposClasi[j].getPuntos()) {
					equipoAux = equiposClasi[i];
					//
					equiposClasi [i] = equiposClasi [j];
					//
					equiposClasi [j] = equipoAux;
				}
			}
		}
		//Ahora le aplicamos a la Liga la clasficación ordenada. ************************************
		liga.setClasificacion(equiposClasi);
		//LLamar a la función que muestra la clasificación.
		liga.mostrarClasificacion();
	}
	
	
	public static void maximosGoleadores (Equipo [] tabla) {
		Jugador[] todos = new Jugador [tabla[0].mostrarNumJugadores()];
		String [] nombres = new String [tabla.length*tabla[0].mostrarNumJugadores()];
		int [] goles = new int[nombres.length];
		int cont = 0;
		//Bucle anidado para ir ordenando.		
		for(int i = 0; i < tabla.length; i++) {
			todos = tabla[i].getJugadores();
			for (int j = 0; j < todos.length; j++) {
				nombres[cont] = todos[j].getNombre();
				goles[cont] = todos[j].getGoles();
				cont++;
			}
		}
		//Para mostrarlos ordenados los ordenamos primero.
		for (int i = 0; i < goles.length; i++){
            for (int j = i + 1; j < goles.length; j++){
                if (goles[i] < goles[j]){
                    //Intercambiamos valores
                    int auxiliarGoles = goles[i];
                    String auxiliarNombre = nombres [i];
                    goles[i] = goles[j];
                    nombres[i] = nombres[j];
                    goles[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println("\n");
		System.out.println("Cinco máximos goleadores: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("NOMBRES //////// GOLES");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
//			System.out.println((i+1) + ". " + nombres[i] + "\t" + goles[i]);
			System.out.printf("%d. %-15s %d %n", i+1, nombres[i], goles[i]);
		}
		System.out.println("_________________________");
	
		
	}
	
	
	/**
	 * Commo el de máximo goleadores pero con tarjetas rojas,
	 * @param tabla
	 */
	public static void expulsiones(Equipo [] tabla) {
		Jugador[] todos = new Jugador [tabla[0].mostrarNumJugadores()];
		String [] nombres = new String [tabla.length*tabla[0].mostrarNumJugadores()];
		int [] tarjetas = new int[nombres.length];
		int cont = 0;
		//Bucle anidado para ir rellenando.	
		for(int i = 0; i < tabla.length; i++) {
			todos = tabla[i].getJugadores();							
			for (int j = 0; j < todos.length; j++) {// getNombre y get Tarjetas
				nombres[cont] = todos[j].getNombre();						
				tarjetas[cont] = todos[j].getTarjetasRojas();
				cont++;
			}
		}
		//Para mostrarlos ordenados los ordenamos primero.
		for (int i = 0; i < tarjetas.length; i++){
            for (int j = i + 1; j < tarjetas.length; j++){
                if (tarjetas[i] < tarjetas[j]){
                    //Intercambiamos valores
                    int auxiliarGoles = tarjetas[i];
                    String auxiliarNombre = nombres [i];
                    tarjetas[i] = tarjetas[j];
                    nombres[i] = nombres[j];
                    tarjetas[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println("\n");
		System.out.println("Los cinco jugadores con más expulsiones: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("NOMBRES ////// Expulsiones");
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + ". " + nombres[i] + "\t" + tarjetas[i]);
		}
		System.out.println("__________________________");
	}

	/**
	 * Como el apartado 1 pero ordenados según los goles a favor.
	 * @param tabla
	 */
	public static void equiposGoleadores (Equipo [] tabla) {
		// Creamos nuevas tablas que irán recogiendo la información de los equipos por
		// partes.
		String[] equipo = new String[tabla.length];
		int[] golesFavor = new int[tabla.length];     
		// creamos un bucle para recoger los goles a favor ya que es el sumatorio dentro
		// de un bucle.
		for (int i = 0; i < tabla.length; i++) {
			equipo[i] = tabla[i].getNombreEquipo();
			golesFavor [i] = tabla[i].recuentoGoles();
		}
		// Usamos un bucle anidado para ir ordenando.
		for (int i = 0; i < golesFavor.length; i++) {
			for (int j = i + 1; j < golesFavor.length; j++) {
				if (golesFavor[i] < golesFavor[j]) {
					// Intercambiamos valores
					// variables para ir almacenando.
					String auxiliarNombre = equipo[i];
					int auxiliarGoles = golesFavor[i];
					// Ahora se mueve el nuevo valor que es mayor a la posicion anterior.
					equipo[i] = equipo[j];
					golesFavor[i] = golesFavor[j];
					// Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera
					// en el valor de j
					equipo[j] = auxiliarNombre;
					golesFavor[j] = auxiliarGoles;
				}
			}
		}
		// Ahora se van a visualizar la tabla de equipos por su orden.
		System.out.println("\n");
		System.out.println("Tres primeros equipos con más goles a favor:");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("---- EQUIPO ---------- GOLES/Favor ----");
		System.out.println("____________________________________________");
		for (int i = 0; i < 3; i++) {
			if (equipo[i].length() < 13) {
				System.out.println((i + 1) + ". " + equipo[i] + "\t\t" + golesFavor[i]);
			} else {
				System.out.println((i + 1) + ". " + equipo[i] + "\t" + golesFavor[i]);
			}
		}
		System.out.println("____________________________________________");
	}
	
	
}
