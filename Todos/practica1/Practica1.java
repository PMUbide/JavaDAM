package practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador [] jug_equipo1 = new Jugador[11]; //Jugadores del Real Madrid . Nombre/Dorsal/goles/tarjetasRojas/tarjetasAmarillas
		jug_equipo1 [0] = new Jugador ("Courtois"	, 1, 0, 0, 1 );
		jug_equipo1 [1] = new Jugador ("Sergio Ramos", 4, 30, 2, 1 );
		jug_equipo1 [2] = new Jugador ("Carvajal"	, 2, 10, 3, 1 );
		jug_equipo1 [3] = new Jugador ("Kroos"		, 8, 1, 2, 1 );
		jug_equipo1 [4] = new Jugador ("Modric"		, 10, 6, 0, 1 );
		jug_equipo1 [5] = new Jugador ("Marcelo"	, 12, 5, 0, 1 );
		jug_equipo1 [6] = new Jugador ("Casemiro"	, 14, 0, 0, 1 );
		jug_equipo1 [7] = new Jugador ("Federico Valverde", 15, 0, 0, 1 );
		jug_equipo1 [8] = new Jugador ("Odegaard"	, 21, 0, 0, 1 );
		jug_equipo1 [9] = new Jugador ("Isco"		, 22, 13, 0, 1 );
		jug_equipo1 [10] = new Jugador ("Ferland Mendy", 23, 0, 2, 1 );
		Jugador [] jug_equipo2 = new Jugador[11];   //Barcelona
		jug_equipo2 [0] = new Jugador ("Ter Stegen", 1, 0, 0, 0 );
		jug_equipo2 [1] = new Jugador ("Piqué", 3, 1, 2, 1 );
		jug_equipo2 [2] = new Jugador ("Clement Lenglet", 15, 6, 0, 2 );
		jug_equipo2 [3] = new Jugador ("Umtiti", 23, 10, 2, 1 );
		jug_equipo2 [4] = new Jugador ("Sergiño Dest", 2, 15, 3, 1 );
		jug_equipo2 [5] = new Jugador ("Busquets", 5, 0, 0, 1 );
		jug_equipo2 [6] = new Jugador ("Aleñá", 6, 8, 0, 1 );
		jug_equipo2 [7] = new Jugador ("Griezmann", 7, 0, 2, 1 );
		jug_equipo2 [8] = new Jugador ("Pjanic", 8, 5, 5, 1 );
		jug_equipo2 [9] = new Jugador ("Messi", 10, 12, 5, 1 );
		jug_equipo2 [10] = new Jugador ("Ricard Puig", 12, 0, 2, 1 );
		Jugador [] jug_equipo3 = new Jugador[11];   //Atlético de Madrid
		jug_equipo3 [0] = new Jugador ("Ibo Grbic", 1, 0, 0, 0 );
		jug_equipo3 [1] = new Jugador ("Giménez", 2, 20, 1, 2 );
		jug_equipo3 [2] = new Jugador ("Savic", 15, 25, 2, 2 );
		jug_equipo3 [3] = new Jugador ("Felipe Monteiro", 18, 5, 1, 0 );
		jug_equipo3 [4] = new Jugador ("Mario Hermoso", 22, 0, 2, 1 );
		jug_equipo3 [5] = new Jugador ("Álvaro García", 28, 0, 5, 1 );
		jug_equipo3 [6] = new Jugador ("Manu Sanchéz", 3, 0, 2, 4 );
		jug_equipo3 [7] = new Jugador ("Kondogbia", 4, 10, 2, 1 );
		jug_equipo3 [8] = new Jugador ("Lucas Torreira", 5, 0, 2, 1 );
		jug_equipo3 [9] = new Jugador ("Koke", 6, 0, 2, 1 );
		jug_equipo3 [10] = new Jugador ("Saúl", 8, 0, 2, 1 );
		Jugador [] jug_equipo4 = new Jugador[11];	//Sevilla 
		jug_equipo4 [0] = new Jugador ("Vaclik", 1, 0, 1, 0 );
		jug_equipo4 [1] = new Jugador ("Javier Díaz", 31, 6, 0, 1 );
		jug_equipo4 [2] = new Jugador ("Gnagnon", 2, 7, 6, 10 );
		jug_equipo4 [3] = new Jugador ("Sergi Gómez", 3, 5, 2, 6 );
		jug_equipo4 [4] = new Jugador ("Rekik", 4, 2, 2, 1 );
		jug_equipo4 [5] = new Jugador ("Jules Koundé", 12, 0, 1, 0 );
		jug_equipo4 [6] = new Jugador ("Aleix Vidal", 17, 0, 2, 1 );
		jug_equipo4 [7] = new Jugador ("Diego Carlos", 20, 0, 4, 1 );
		jug_equipo4 [8] = new Jugador ("Enrique Rios", 37, 0, 2, 1 );
		jug_equipo4 [9] = new Jugador ("Lucas Ocampos",5, 0, 2, 1 );
		jug_equipo4 [10] = new Jugador ("Gudelj", 6, 1, 2, 1 );
		Jugador [] jug_equipo5 = new Jugador[11];  //Villareal 
		jug_equipo5 [0] = new Jugador ("Asenjo", 1, 0, 0, 0 );
		jug_equipo5 [1] = new Jugador ("Albiol", 3, 20, 0, 1 );
		jug_equipo5 [2] = new Jugador ("Ramiro Funes", 6, 0, 2, 1 );
		jug_equipo5 [3] = new Jugador ("Sofian Chakla", 22, 6, 2, 1 );
		jug_equipo5 [4] = new Jugador ("Mario", 2, 5, 2, 1 );
		jug_equipo5 [5] = new Jugador ("Pau Francisco", 4, 8, 5, 0 );	
		jug_equipo5 [6] = new Jugador ("Parejo", 5, 1, 0, 5 );
		jug_equipo5 [7] = new Jugador ("Iborra", 10, 5, 1, 0 );  
		jug_equipo5 [8] = new Jugador ("Trigueos", 14, 5, 4, 1 );
		jug_equipo5 [9] = new Jugador ("Pervis Estuiñan", 15, 0, 2, 1 );
		jug_equipo5 [10] = new Jugador ("Alberto Montero", 18, 0, 2, 1 );
		Jugador [] jug_equipo6 = new Jugador[11];	//Real Sociedad
		jug_equipo6 [0] = new Jugador ("Remiro", 1, 0, 0, 0 );
		jug_equipo6 [1] = new Jugador ("Aihen Muñoz", 12, 1, 2, 1 );
		jug_equipo6 [2] = new Jugador ("Modibo Sagnan", 15, 5, 1, 1 );
		jug_equipo6 [3] = new Jugador ("Robin Le Normand", 24, 3, 5, 1 );
		jug_equipo6 [4] = new Jugador ("Jon Pacheco", 26, 0, 2, 1 );
		jug_equipo6 [5] = new Jugador ("Aritz Arambarri", 33, 0, 1, 3 );
		jug_equipo6 [6] = new Jugador ("Zaldua", 2, 2, 0, 1 );
		jug_equipo6 [7] = new Jugador ("Illarramendi", 4, 21, 2, 10 );
		jug_equipo6 [8] = new Jugador ("Igor Zubeldia", 5, 0, 2, 4 );
		jug_equipo6 [9] = new Jugador ("Portu", 7, 1, 2, 0 );
		jug_equipo6 [10] = new Jugador ("Merino", 8, 0, 2, 1 );
		Jugador [] jug_equipo7 = new Jugador[11]; 		//Granada
		jug_equipo7 [0] = new Jugador ("Rui Silva", 1, 1, 2, 1 );
		jug_equipo7 [1] = new Jugador ("Nehuén Pérez", 3, 5, 0, 1 );
		jug_equipo7 [2] = new Jugador ("Germán", 6, 17, 5, 1 );
		jug_equipo7 [3] = new Jugador ("Neider Lozano", 18, 12, 2, 7 );
		jug_equipo7 [4] = new Jugador ("Jesús Vallejo", 20, 0, 1, 1 );
		jug_equipo7 [5] = new Jugador ("Domingos Duarte", 22, 0, 0, 1 );
		jug_equipo7 [6] = new Jugador ("Pepe Sanchez", 28, 0, 3, 3 );
		jug_equipo7 [7] = new Jugador ("Foulquier", 2, 0, 0, 1 );
		jug_equipo7 [8] = new Jugador ("Gonalons", 4, 1, 2, 1 );
		jug_equipo7 [9] = new Jugador ("Luis Milla", 5, 0, 2, 1 );
		jug_equipo7 [10] = new Jugador ("Brice", 8, 1, 0, 1 );
		Jugador [] jug_equipo8 = new Jugador[11];	//Getafe
		jug_equipo8 [0] = new Jugador ("Rubén Yáñez", 1, 2, 0, 1 );
		jug_equipo8 [1] = new Jugador ("Eick Cabaco", 3, 12, 5, 1 );
		jug_equipo8 [2] = new Jugador ("Etxeita", 4, 20, 2, 1 );
		jug_equipo8 [3] = new Jugador ("Chema", 6, 0, 5, 3 );
		jug_equipo8 [4] = new Jugador ("Ruan Nolan", 37, 0, 1, 1 );
		jug_equipo8 [5] = new Jugador ("Djene", 2, 0, 5, 5 );
		jug_equipo8 [6] = new Jugador ("Portillo", 8, 0, 0, 1 );
		jug_equipo8 [7] = new Jugador ("Nyom", 12, 0, 2, 1 );
		jug_equipo8 [8] = new Jugador ("Ante Palaversa", 14, 1, 2, 1 );
		jug_equipo8 [9] = new Jugador ("MAthías Olivera", 17, 3, 2, 6 );
		jug_equipo8 [10] = new Jugador ("Mauro Arambarri", 18, 1, 0, 1 );
		Jugador [] jug_equipo9 = new Jugador[11];		//Valencia
		jug_equipo9 [0] = new Jugador ("Jaume", 1, 0, 2, 1 );
		jug_equipo9 [1] = new Jugador ("Mangala", 4, 0, 2, 1 );
		jug_equipo9 [2] = new Jugador ("Gabriel Paulista", 5, 0, 2, 1 );
		jug_equipo9 [3] = new Jugador ("Mouctar Diakhaby", 12, 0, 2, 1 );
		jug_equipo9 [4] = new Jugador ("Hugo Guillamón", 15, 15, 8 , 4 );
		jug_equipo9 [5] = new Jugador ("Molina Gutiérrez", 31, 0, 2, 1 );
		jug_equipo9 [6] = new Jugador ("Thierry Correia", 2, 0, 2, 1 );
		jug_equipo9 [7] = new Jugador ("Lato", 3, 0, 2, 1 );
		jug_equipo9 [8] = new Jugador ("Carlos Soler", 8, 0, 1, 0 );
		jug_equipo9 [9] = new Jugador ("Ruben Sobrino", 11, 0, 0, 0 );
		jug_equipo9 [10] = new Jugador ("Gayá", 14, 1, 3, 1 );
		Jugador [] jug_equipo10 = new Jugador[11];		//Osasuna
		jug_equipo10 [0] = new Jugador ("Herrera", 1, 0, 0, 1 );
		jug_equipo10 [1] = new Jugador ("Unai García", 4, 5, 1, 2 );
		jug_equipo10 [2] = new Jugador ("David García", 5, 3, 1, 1 );
		jug_equipo10 [3] = new Jugador ("Oier", 6, 0, 1, 0 );
		jug_equipo10 [4] = new Jugador ("Raúl Navas", 22, 1, 0, 0 );
		jug_equipo10 [5] = new Jugador ("Aridane", 23, 3, 0, 1 );
		jug_equipo10 [6] = new Jugador ("Gorka Zabarte", 30, 0, 1, 0 );
		jug_equipo10 [7] = new Jugador ("Nacho Vidal", 2, 1, 2, 1 );
		jug_equipo10 [8] = new Jugador ("Alvaro Armada", 3, 5, 3, 1 );
		jug_equipo10 [9] = new Jugador ("Roberto Torres", 10, 2, 1, 5 );
		jug_equipo10 [10] = new Jugador ("Rubén García", 14, 10, 2, 3 );
		Jugador [] jug_equipo11 = new Jugador[11];		//Athletic club
		jug_equipo11 [0] = new Jugador ("Unai Simón", 1, 0, 1, 1 );
		jug_equipo11 [1] = new Jugador ("Unai Núñez", 3, 11, 1, 1 );
		jug_equipo11 [2] = new Jugador ("Íñigo Martínez", 4, 6, 0, 1 );
		jug_equipo11 [3] = new Jugador ("Yeray", 5, 10, 3, 1 );
		jug_equipo11 [4] = new Jugador ("De Marcos", 18, 0, 0, 1 );
		jug_equipo11 [5] = new Jugador ("Peru Nolaskoain", 23, 15, 2, 1 );
		jug_equipo11 [6] = new Jugador ("Aitor Paredes", 38, 0, 3, 0 );
		jug_equipo11 [7] = new Jugador ("Vesga", 6, 5, 1, 5 );
		jug_equipo11 [8] = new Jugador ("Ibai Gómez", 7, 2, 0, 1 );
		jug_equipo11 [9] = new Jugador ("Unai López", 8, 0, 1, 2 );
		jug_equipo11 [10] = new Jugador ("Dani García", 14, 6, 2, 2 );
		Jugador [] jug_equipo12 = new Jugador[11];		//Levante
		jug_equipo12 [0] = new Jugador ("Koke", 1, 0, 0, 0 );
		jug_equipo12 [1] = new Jugador ("Róber", 4, 5, 2, 1 );
		jug_equipo12 [2] = new Jugador ("Óscar Duarte", 6, 0, 3, 1 );
		jug_equipo12 [3] = new Jugador ("Vezo", 14, 8, 1, 2 );
		jug_equipo12 [4] = new Jugador ("Postigo", 15, 4, 0, 1 );
		jug_equipo12 [5] = new Jugador ("Eusebio Monzó", 39, 5, 1, 1 );
		jug_equipo12 [6] = new Jugador ("Son", 2, 2, 0, 0 );
		jug_equipo12 [7] = new Jugador ("Toño García", 3, 0, 2, 1 );
		jug_equipo12 [8] = new Jugador ("Radoja", 5, 5, 1, 1 );
		jug_equipo12 [9] = new Jugador ("Enis Bardhi", 10, 2, 0, 1 );
		jug_equipo12 [10] = new Jugador ("Malsa", 9, 1, 1, 0 );
		Jugador [] jug_equipo13 = new Jugador[11];		//Valladolid
		jug_equipo13 [0] = new Jugador ("Masip", 1, 1, 0, 1 );
		jug_equipo13 [1] = new Jugador ("Kiko", 4, 5, 0, 0 );
		jug_equipo13 [2] = new Jugador ("Javier Sánchez", 5, 8, 2, 2 );
		jug_equipo13 [3] = new Jugador ("Bruno González", 6, 4, 0, 1 );
		jug_equipo13 [4] = new Jugador ("Miguel Ángel Rubio", 30, 9, 1, 3 );
		jug_equipo13 [5] = new Jugador ("Luis Pérez", 2, 1, 2, 1 );
		jug_equipo13 [6] = new Jugador ("Raúl García", 3, 3, 1, 1 );
		jug_equipo13 [7] = new Jugador ("Kike", 8, 1, 2, 1 );
		jug_equipo13 [8] = new Jugador ("Orellana", 12, 1, 1, 1 );
		jug_equipo13 [9] = new Jugador ("Rubén Alcaraz", 14, 0, 1, 1 );
		jug_equipo13 [10] = new Jugador ("Roque Mesa", 17, 0, 0, 1 );
		Jugador [] jug_equipo14 = new Jugador[11];		//Eibar  //Pablo
		jug_equipo14 [0] = new Jugador ("Dmitrovic", 1, 0, 2, 1 );
		jug_equipo14 [1] = new Jugador ("Esteban Burgos", 2, 0, 7, 1 );
		jug_equipo14 [2] = new Jugador ("Bigas", 3, 0, 2, 1 );
		jug_equipo14 [3] = new Jugador ("Paulo Oliveira", 4, 0, 2, 1 );
		jug_equipo14 [4] = new Jugador ("Martínez", 5, 0, 0, 7 );
		jug_equipo14 [5] = new Jugador ("Arbilla", 23, 0, 2, 6 );
		jug_equipo14 [6] = new Jugador ("Sergio Álvarez", 6, 0, 0, 10 );
		jug_equipo14 [7] = new Jugador ("Diop", 8, 1, 4, 1 );
		jug_equipo14 [8] = new Jugador ("Edu Expósito", 10, 5, 2, 1 );
		jug_equipo14 [9] = new Jugador ("Luís Rafael", 11, 5, 0, 1 );
		jug_equipo14 [10] = new Jugador ("José Ángel", 9, 0, 0, 1 );
		Jugador [] jug_equipo15 = new Jugador[11];		//Real Betis
		jug_equipo15 [0] = new Jugador ("Joel", 9, 1, 0, 1 );
		jug_equipo15 [1] = new Jugador ("Bartra", 5, 0, 0, 0 );
		jug_equipo15 [2] = new Jugador ("Víctor Ruiz", 6, 0, 5, 3 );
		jug_equipo15 [3] = new Jugador ("Sidnei", 12, 11, 2, 11 );
		jug_equipo15 [4] = new Jugador ("Álex Moreno", 15, 3, 0, 0 );
		jug_equipo15 [5] = new Jugador ("Mandi", 23, 6, 8, 2 );
		jug_equipo15 [6] = new Jugador ("Montoya", 2, 3, 0, 0 );
		jug_equipo15 [7] = new Jugador ("Camarasa", 3, 1, 2, 1 );
		jug_equipo15 [8] = new Jugador ("Juanmi", 7, 6, 0, 1 );
		jug_equipo15 [9] = new Jugador ("Nabil Fekir", 8, 2, 2, 1 );
		jug_equipo15 [10] = new Jugador ("Canales", 10, 0, 0, 4 );
		//A continuaciónm se crean los equipos.  //nombre, nombre del estaddio // año fundación // jugador [], partidos ganados, empatados y perdidos.
		Equipo equipo1 = new Equipo ("Real Madrid", "Santiago Bernabeu", 1902, jug_equipo1, 28, 6, 4); 			//2
		Equipo equipo2 = new Equipo ("Barcelona", "Camp Nou", 1899, jug_equipo2, 29, 4, 5);						//1
		Equipo equipo3 = new Equipo ("Atlético de Madrid", "Calderón", 1903, jug_equipo3, 18, 8, 12);			//5
		Equipo equipo4 = new Equipo ("Sevilla", "Ramón Sánchez-Pizjuán", 1994, jug_equipo4, 17, 9, 12);			//6
		Equipo equipo5 = new Equipo ("Villareal", "Estadio de la Cerámica", 1890, jug_equipo5, 18, 10, 10); 	//4
		Equipo equipo6 = new Equipo ("Real Sociedad", "Reale Arena", 1909, jug_equipo6, 13, 9, 16);				//9
		Equipo equipo7 = new Equipo ("Granada", "Estadio Nuevo Los Cármenes", 1931, jug_equipo7, 14, 10, 14); 	//7
		Equipo equipo8 = new Equipo ("Getafe", "Coliseum Alfonso Pérez", 1983, jug_equipo8, 12, 12, 14);    	//8
		Equipo equipo9 = new Equipo ("Valencia", "Mestalla Valencia CF", 1919, jug_equipo9, 12, 8, 18);   		//11
		Equipo equipo10 = new Equipo ("Osasuna", "Estadio El Sadar", 1920, jug_equipo10, 11, 11, 16);     		//12
		Equipo equipo11 = new Equipo ("Athletic Club", "San Mamés", 1898, jug_equipo11, 28, 4, 6);    			//3
		Equipo equipo12 = new Equipo ("Levante", "Levante UD", 1909, jug_equipo12, 12, 7, 19);					//13
		Equipo equipo13 = new Equipo ("Valladolid", "Estadio José Zorrilla", 1928, jug_equipo13, 8, 18, 12); 	//15
		Equipo equipo14 = new Equipo ("Eibar", "Estadio Municipal de Ipurúa", 1940, jug_equipo14, 11, 10, 17); 	//14
		Equipo equipo15 = new Equipo ("Real Betis", "Estadio Benito Villamarín", 1907, jug_equipo15, 11, 12, 15); //10
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
		String consulta = ""; //Variable para finalizar posteriormente el programa si es N o n
		while (eleccion != 5) { //Un while principal para elegir las opciones del menú y que finalice si elige el número 5
			System.out.println();
			System.out.println("Opciones: ");
			System.out.println("1. Mostrar la clasificación por puntos.");
			System.out.println("2. Mostrar los 5 jugadores con más goles.");
			System.out.println("3. Mostrar los 5 jugadores con más expulsiones.");
			System.out.println("4. Mostrar los 3 equipos con más goles a favor.");
			System.out.println("5. Finalizar");
			//Se envía al método el número introducido por si pudiera dar error,
			//en caso de haber generado un error, entra como valor -9999 en el while siguiente,
			//hará otra vez la comprobación hasta que sea un numero entero.
			eleccion = comprobarMenu(); 
			while (eleccion == -9999) {
				System.out.println();
				System.out.println("Opciones: ");
				System.out.println("1. Mostrar la clasificación por puntos");
				System.out.println("2. Mostrar los 5 jugadores con más goles.");
				System.out.println("3. Mostrar los 5 jugadores con más expulsiones.");
				System.out.println("4. Mostrar los 3 equipos más goles a favor.");
				System.out.println("5. Finalizar");
				eleccion = comprobarMenu(); //vuelve a volver al método para que solo pueda seguir si introduce un numero entero.
			}
			if (eleccion > 5 || eleccion < 0) {	//Aquí te advierte si has introducido un número que no esté entre las posibilidades del menú.
				System.out.println("No has introducido un valor válido. Vuelve a intentarlo.");
			}
			switch (eleccion) { //Eleccion del menú
				case 1:  //Visualizamos la clasificación ordenada por puntos.
					ordenarPuntos(total, ligaNacional); //Entra al método que lo ordena, añade a la clasficacion de la liga, y lo muestra.
					System.out.println("¿Quiere realizar otra consulta ? S/N"); 
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 2: //Visualiza los 5 máximos goleadores.
					maximosGoleadores(total);  //Entra el método que lo ordena por goles y lo muestra.
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) { 
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 3: //Visualiza los cinco jugadores con más expulsiones.
					expulsiones(total); //Entra al método que ordena y lo muestra.
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 4: //Visualiza los 3 equipos con mayor goles a favor.
					equiposGoleadores(total); //Entra al método que lo ordena y lo muestra.
					System.out.println("¿Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no") ) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
			}
		}
		System.out.println("Gracias, hasta pronto."); //Mensaje de finalización.
		
	}
	/**
	 * Método que contiene un try/catch para evitar que pueda fallar en la elección del menú
	 * @return
	 */
	public static int comprobarMenu () {
		Scanner in = new Scanner (System.in);
		int eleccion;
		try {
			eleccion = in.nextInt();
			return eleccion; //Devuelve el número, en caso de que sea un entero.
		}catch (InputMismatchException e) { //Si introduce un caracter inválido, muestra el print y devuelve un valor que se recogerá en el main.
			System.out.println("No has introducido bien el valor válido. Vuelve a intentarlo.");
			System.out.println();
			return -9999; //Valor devuelve para tenerlo en cuenta en el main.
		}
	}

	/**
	 * Método que ordena por los puntos de mayor a menor.
	 * @param tabla , un array de Equipo
	 * @param liga, un objeto de la clase Liga
	 */
	public static void ordenarPuntos (Equipo [] tabla, Liga liga) {
		//Habria que copiar para comparar.
		Equipo [] equiposClasi = new Equipo [tabla.length]; //Creamos un nuevo array de Equipo que sera la copia para trabajarlo.
		Equipo equipoAux = null; //Una variable auxiliar con el Equipo que iremos utilizando en la ordenación.
		//Creamos un bucle para ir rellenando la tabla copiada para no machacar los datos originales.
		for (int i = 0; i < tabla.length; i++) {
			equiposClasi[i] = tabla[i];
		}
		//Bucle anidado que irá ordenando la tabla que tenemos copiada.
		for (int i = 0; i < tabla.length; i++) {
			for ( int j = i +1; j < tabla.length; j++) {
				if (equiposClasi[i].getPuntos() < equiposClasi[j].getPuntos()) { //Si encuentra un equipo que tenga mayor puntos: 
					// Intercambiamos valores de la
					// variable para ir almacenando.
					equipoAux = equiposClasi[i];
					// Ahora se mueve el nuevo valor que es mayor a la posición anterior.
					equiposClasi [i] = equiposClasi [j];
					// Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera
					// en el valor de j
					equiposClasi [j] = equipoAux;
				}
			}
		}
		//Ahora le aplicamos a la Liga la clasficación ordenada con su método Setter.
		liga.setClasificacion(equiposClasi);
		//LLamar a la función de la clase Liga que muestra la clasificación.
		liga.mostrarClasificacion();
	}
	
	/**
	 * Método que ordena los jugadores por goles
	 * @param tabla que contiene un array de Equipo. 
	 */
	public static void maximosGoleadores (Equipo [] tabla) {
		Jugador[] todos = new Jugador [tabla[0].mostrarNumJugadores()]; //Se crea un array auxiliar para ir almacenando los jugadores de cada equipo.
		String [] nombres = new String [tabla.length*tabla[0].mostrarNumJugadores()]; //Aqúi se van a ir almacenando todos los nombres de todos los jugadores de los equipos
		//Teniendo en cuenta en este caso que todos los equipos tienen al menos 11 jugadores, que es el número que retorna del equipo 0 de ejemplo.
		int [] goles = new int[nombres.length]; //Un array de enteros con los goles de cada jugador, con la longitud de todos los jugadores de los equipos.
		int cont = 0; //una variable que sevirá de índice de los arrays creados anteriormente.
		//Bucle anidado para ir añadiendo la información		
		for(int i = 0; i < tabla.length; i++) {
			todos = tabla[i].getJugadores();
			for (int j = 0; j < todos.length; j++) {
				nombres[cont] = todos[j].getNombre(); //cada vez que se genera un bucle de cada jugador, su suma el índice hasta completar los 165 totales.
				goles[cont] = todos[j].getGoles();
				cont++;
			}
		}
		//Se ordenan con un bucle anidado. Cambiando las posiciones en ambos array para que tengan relación.
		for (int i = 0; i < goles.length; i++){
            for (int j = i + 1; j < goles.length; j++){
                if (goles[i] < goles[j]){
                    //Intercambiamos valores de la variable para ir almacenándola.
                    int auxiliarGoles = goles[i];
                    String auxiliarNombre = nombres [i];
                    // Ahora se mueve el nuevo valor que es mayor a la posición anterior.
                    goles[i] = goles[j];
                    nombres[i] = nombres[j];
                    // Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera
					// en el valor de j
                    goles[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println("\n");
		System.out.println("Cinco máximos goleadores: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("/// NOMBRES ///// GOLES");
		System.out.println("----------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d. %-15s %d %n", i+1, nombres[i], goles[i]);
		}
		System.out.println("_____________________________");
		
	}
	
	
	/**
	 * Commo el de máximo goleadores pero con tarjetas rojas,
	 * @param tabla
	 */
	public static void expulsiones(Equipo [] tabla) {
		// Creamos nuevas tablas que irán recogiendo la información de los equipos por
		// partes.
		Jugador[] todos = new Jugador [tabla[0].mostrarNumJugadores()];
		String [] nombres = new String [tabla.length*tabla[0].mostrarNumJugadores()];
		int [] tarjetas = new int[nombres.length];
		int cont = 0;
		//Bucle anidado para ir rellenando.	
		for(int i = 0; i < tabla.length; i++) {
			todos = tabla[i].getJugadores();							
			for (int j = 0; j < todos.length; j++) {// getNombre y get Tarjetas.
				nombres[cont] = todos[j].getNombre();						
				tarjetas[cont] = todos[j].getTarjetasRojas();
				cont++;
			}
		}
		//Para mostrarlos ordenados los ordenamos primero. Igual que anteriores métodos.
		for (int i = 0; i < tarjetas.length; i++){
            for (int j = i + 1; j < tarjetas.length; j++){
                if (tarjetas[i] < tarjetas[j]){
                	//Intercambiamos valores de la variable para ir almacenándola.
                    int auxiliarGoles = tarjetas[i];
                    String auxiliarNombre = nombres [i];
                    // Ahora se mueve el nuevo valor que es mayor a la posición anterior.
                    tarjetas[i] = tarjetas[j];
                    nombres[i] = nombres[j];
                    // Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera
					// en el valor de j
                    tarjetas[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println ("\n");
		System.out.println ("Los cinco jugadores con más expulsiones: ");
		System.out.println ("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println ("/// NOMBRES ////// Expulsiones");
		System.out.println ("------------------------------");
		for (int i = 0; i <
				5; i++) {
			System.out.printf("%d. %-20s %d %n", (i+1), nombres[i], tarjetas[i]);
		}
		System.out.println("_______________________________");
	}

	/**
	 * Como la eleccion del menu 1 pero ordenados según los goles a favor.
	 * @param tabla con un array de Equipo
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
					// Ahora se mueve el nuevo valor que es mayor a la posición anterior.
					equipo[i] = equipo[j];
					golesFavor[i] = golesFavor[j];
					// Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera
					// en el valor de j.
					equipo[j] = auxiliarNombre;
					golesFavor[j] = auxiliarGoles;
				}
			}
		}
		// Ahora se van a visualizar la tabla de equipos por su orden.
		System.out.println("\n");
		System.out.println("Tres primeros equipos con más goles a favor:");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("---- EQUIPO ------------ GOLES/Favor -------");
		System.out.println("____________________________________________");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d. %-25s %d %n", (i + 1), equipo[i], golesFavor[i]);
		}
		System.out.println("____________________________________________");
	}
	
	
}
