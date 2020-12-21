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
		jug_equipo2 [1] = new Jugador ("Piqu�", 3, 1, 2, 1 );
		jug_equipo2 [2] = new Jugador ("Clement Lenglet", 15, 6, 0, 2 );
		jug_equipo2 [3] = new Jugador ("Umtiti", 23, 10, 2, 1 );
		jug_equipo2 [4] = new Jugador ("Sergi�o Dest", 2, 15, 3, 1 );
		jug_equipo2 [5] = new Jugador ("Busquets", 5, 0, 0, 1 );
		jug_equipo2 [6] = new Jugador ("Ale��", 6, 8, 0, 1 );
		jug_equipo2 [7] = new Jugador ("Griezmann", 7, 0, 2, 1 );
		jug_equipo2 [8] = new Jugador ("Pjanic", 8, 5, 5, 1 );
		jug_equipo2 [9] = new Jugador ("Messi", 10, 12, 5, 1 );
		jug_equipo2 [10] = new Jugador ("Ricard Puig", 12, 0, 2, 1 );
		Jugador [] jug_equipo3 = new Jugador[11];   //Atl�tico de Madrid
		jug_equipo3 [0] = new Jugador ("Ibo Grbic", 1, 0, 0, 0 );
		jug_equipo3 [1] = new Jugador ("Gim�nez", 2, 20, 1, 2 );
		jug_equipo3 [2] = new Jugador ("Savic", 15, 25, 2, 2 );
		jug_equipo3 [3] = new Jugador ("Felipe Monteiro", 18, 5, 1, 0 );
		jug_equipo3 [4] = new Jugador ("Mario Hermoso", 22, 0, 2, 1 );
		jug_equipo3 [5] = new Jugador ("�lvaro Garc�a", 28, 0, 5, 1 );
		jug_equipo3 [6] = new Jugador ("Manu Sanch�z", 3, 0, 2, 4 );
		jug_equipo3 [7] = new Jugador ("Kondogbia", 4, 10, 2, 1 );
		jug_equipo3 [8] = new Jugador ("Lucas Torreira", 5, 0, 2, 1 );
		jug_equipo3 [9] = new Jugador ("Koke", 6, 0, 2, 1 );
		jug_equipo3 [10] = new Jugador ("Sa�l", 8, 0, 2, 1 );
		Jugador [] jug_equipo4 = new Jugador[11];	//Sevilla 
		jug_equipo4 [0] = new Jugador ("Vaclik", 1, 0, 1, 0 );
		jug_equipo4 [1] = new Jugador ("Javier D�az", 31, 6, 0, 1 );
		jug_equipo4 [2] = new Jugador ("Gnagnon", 2, 7, 6, 10 );
		jug_equipo4 [3] = new Jugador ("Sergi G�mez", 3, 5, 2, 6 );
		jug_equipo4 [4] = new Jugador ("Rekik", 4, 2, 2, 1 );
		jug_equipo4 [5] = new Jugador ("Jules Kound�", 12, 0, 1, 0 );
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
		jug_equipo5 [9] = new Jugador ("Pervis Estui�an", 15, 0, 2, 1 );
		jug_equipo5 [10] = new Jugador ("Alberto Montero", 18, 0, 2, 1 );
		Jugador [] jug_equipo6 = new Jugador[11];	//Real Sociedad
		jug_equipo6 [0] = new Jugador ("Remiro", 1, 0, 0, 0 );
		jug_equipo6 [1] = new Jugador ("Aihen Mu�oz", 12, 1, 2, 1 );
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
		jug_equipo7 [1] = new Jugador ("Nehu�n P�rez", 3, 5, 0, 1 );
		jug_equipo7 [2] = new Jugador ("Germ�n", 6, 17, 5, 1 );
		jug_equipo7 [3] = new Jugador ("Neider Lozano", 18, 12, 2, 7 );
		jug_equipo7 [4] = new Jugador ("Jes�s Vallejo", 20, 0, 1, 1 );
		jug_equipo7 [5] = new Jugador ("Domingos Duarte", 22, 0, 0, 1 );
		jug_equipo7 [6] = new Jugador ("Pepe Sanchez", 28, 0, 3, 3 );
		jug_equipo7 [7] = new Jugador ("Foulquier", 2, 0, 0, 1 );
		jug_equipo7 [8] = new Jugador ("Gonalons", 4, 1, 2, 1 );
		jug_equipo7 [9] = new Jugador ("Luis Milla", 5, 0, 2, 1 );
		jug_equipo7 [10] = new Jugador ("Brice", 8, 1, 0, 1 );
		Jugador [] jug_equipo8 = new Jugador[11];	//Getafe
		jug_equipo8 [0] = new Jugador ("Rub�n Y��ez", 1, 2, 0, 1 );
		jug_equipo8 [1] = new Jugador ("Eick Cabaco", 3, 12, 5, 1 );
		jug_equipo8 [2] = new Jugador ("Etxeita", 4, 20, 2, 1 );
		jug_equipo8 [3] = new Jugador ("Chema", 6, 0, 5, 3 );
		jug_equipo8 [4] = new Jugador ("Ruan Nolan", 37, 0, 1, 1 );
		jug_equipo8 [5] = new Jugador ("Djene", 2, 0, 5, 5 );
		jug_equipo8 [6] = new Jugador ("Portillo", 8, 0, 0, 1 );
		jug_equipo8 [7] = new Jugador ("Nyom", 12, 0, 2, 1 );
		jug_equipo8 [8] = new Jugador ("Ante Palaversa", 14, 1, 2, 1 );
		jug_equipo8 [9] = new Jugador ("MAth�as Olivera", 17, 3, 2, 6 );
		jug_equipo8 [10] = new Jugador ("Mauro Arambarri", 18, 1, 0, 1 );
		Jugador [] jug_equipo9 = new Jugador[11];		//Valencia
		jug_equipo9 [0] = new Jugador ("Jaume", 1, 0, 2, 1 );
		jug_equipo9 [1] = new Jugador ("Mangala", 4, 0, 2, 1 );
		jug_equipo9 [2] = new Jugador ("Gabriel Paulista", 5, 0, 2, 1 );
		jug_equipo9 [3] = new Jugador ("Mouctar Diakhaby", 12, 0, 2, 1 );
		jug_equipo9 [4] = new Jugador ("Hugo Guillam�n", 15, 15, 8 , 4 );
		jug_equipo9 [5] = new Jugador ("Molina Guti�rrez", 31, 0, 2, 1 );
		jug_equipo9 [6] = new Jugador ("Thierry Correia", 2, 0, 2, 1 );
		jug_equipo9 [7] = new Jugador ("Lato", 3, 0, 2, 1 );
		jug_equipo9 [8] = new Jugador ("Carlos Soler", 8, 0, 1, 0 );
		jug_equipo9 [9] = new Jugador ("Ruben Sobrino", 11, 0, 0, 0 );
		jug_equipo9 [10] = new Jugador ("Gay�", 14, 1, 3, 1 );
		Jugador [] jug_equipo10 = new Jugador[11];		//Osasuna
		jug_equipo10 [0] = new Jugador ("Herrera", 1, 0, 0, 1 );
		jug_equipo10 [1] = new Jugador ("Unai Garc�a", 4, 5, 1, 2 );
		jug_equipo10 [2] = new Jugador ("David Garc�a", 5, 3, 1, 1 );
		jug_equipo10 [3] = new Jugador ("Oier", 6, 0, 1, 0 );
		jug_equipo10 [4] = new Jugador ("Ra�l Navas", 22, 1, 0, 0 );
		jug_equipo10 [5] = new Jugador ("Aridane", 23, 3, 0, 1 );
		jug_equipo10 [6] = new Jugador ("Gorka Zabarte", 30, 0, 1, 0 );
		jug_equipo10 [7] = new Jugador ("Nacho Vidal", 2, 1, 2, 1 );
		jug_equipo10 [8] = new Jugador ("Alvaro Armada", 3, 5, 3, 1 );
		jug_equipo10 [9] = new Jugador ("Roberto Torres", 10, 2, 1, 5 );
		jug_equipo10 [10] = new Jugador ("Rub�n Garc�a", 14, 10, 2, 3 );
		Jugador [] jug_equipo11 = new Jugador[11];		//Athletic club
		jug_equipo11 [0] = new Jugador ("Unai Sim�n", 1, 0, 1, 1 );
		jug_equipo11 [1] = new Jugador ("Unai N��ez", 3, 11, 1, 1 );
		jug_equipo11 [2] = new Jugador ("��igo Mart�nez", 4, 6, 0, 1 );
		jug_equipo11 [3] = new Jugador ("Yeray", 5, 10, 3, 1 );
		jug_equipo11 [4] = new Jugador ("De Marcos", 18, 0, 0, 1 );
		jug_equipo11 [5] = new Jugador ("Peru Nolaskoain", 23, 15, 2, 1 );
		jug_equipo11 [6] = new Jugador ("Aitor Paredes", 38, 0, 3, 0 );
		jug_equipo11 [7] = new Jugador ("Vesga", 6, 5, 1, 5 );
		jug_equipo11 [8] = new Jugador ("Ibai G�mez", 7, 2, 0, 1 );
		jug_equipo11 [9] = new Jugador ("Unai L�pez", 8, 0, 1, 2 );
		jug_equipo11 [10] = new Jugador ("Dani Garc�a", 14, 6, 2, 2 );
		Jugador [] jug_equipo12 = new Jugador[11];		//Levante
		jug_equipo12 [0] = new Jugador ("Koke", 1, 0, 0, 0 );
		jug_equipo12 [1] = new Jugador ("R�ber", 4, 5, 2, 1 );
		jug_equipo12 [2] = new Jugador ("�scar Duarte", 6, 0, 3, 1 );
		jug_equipo12 [3] = new Jugador ("Vezo", 14, 8, 1, 2 );
		jug_equipo12 [4] = new Jugador ("Postigo", 15, 4, 0, 1 );
		jug_equipo12 [5] = new Jugador ("Eusebio Monz�", 39, 5, 1, 1 );
		jug_equipo12 [6] = new Jugador ("Son", 2, 2, 0, 0 );
		jug_equipo12 [7] = new Jugador ("To�o Garc�a", 3, 0, 2, 1 );
		jug_equipo12 [8] = new Jugador ("Radoja", 5, 5, 1, 1 );
		jug_equipo12 [9] = new Jugador ("Enis Bardhi", 10, 2, 0, 1 );
		jug_equipo12 [10] = new Jugador ("Malsa", 9, 1, 1, 0 );
		Jugador [] jug_equipo13 = new Jugador[11];		//Valladolid
		jug_equipo13 [0] = new Jugador ("Masip", 1, 1, 0, 1 );
		jug_equipo13 [1] = new Jugador ("Kiko", 4, 5, 0, 0 );
		jug_equipo13 [2] = new Jugador ("Javier S�nchez", 5, 8, 2, 2 );
		jug_equipo13 [3] = new Jugador ("Bruno Gonz�lez", 6, 4, 0, 1 );
		jug_equipo13 [4] = new Jugador ("Miguel �ngel Rubio", 30, 9, 1, 3 );
		jug_equipo13 [5] = new Jugador ("Luis P�rez", 2, 1, 2, 1 );
		jug_equipo13 [6] = new Jugador ("Ra�l Garc�a", 3, 3, 1, 1 );
		jug_equipo13 [7] = new Jugador ("Kike", 8, 1, 2, 1 );
		jug_equipo13 [8] = new Jugador ("Orellana", 12, 1, 1, 1 );
		jug_equipo13 [9] = new Jugador ("Rub�n Alcaraz", 14, 0, 1, 1 );
		jug_equipo13 [10] = new Jugador ("Roque Mesa", 17, 0, 0, 1 );
		Jugador [] jug_equipo14 = new Jugador[11];		//Eibar  //Pablo
		jug_equipo14 [0] = new Jugador ("Dmitrovic", 1, 0, 2, 1 );
		jug_equipo14 [1] = new Jugador ("Esteban Burgos", 2, 0, 7, 1 );
		jug_equipo14 [2] = new Jugador ("Bigas", 3, 0, 2, 1 );
		jug_equipo14 [3] = new Jugador ("Paulo Oliveira", 4, 0, 2, 1 );
		jug_equipo14 [4] = new Jugador ("Mart�nez", 5, 0, 0, 7 );
		jug_equipo14 [5] = new Jugador ("Arbilla", 23, 0, 2, 6 );
		jug_equipo14 [6] = new Jugador ("Sergio �lvarez", 6, 0, 0, 10 );
		jug_equipo14 [7] = new Jugador ("Diop", 8, 1, 4, 1 );
		jug_equipo14 [8] = new Jugador ("Edu Exp�sito", 10, 5, 2, 1 );
		jug_equipo14 [9] = new Jugador ("Lu�s Rafael", 11, 5, 0, 1 );
		jug_equipo14 [10] = new Jugador ("Jos� �ngel", 9, 0, 0, 1 );
		Jugador [] jug_equipo15 = new Jugador[11];		//Real Betis
		jug_equipo15 [0] = new Jugador ("Joel", 9, 1, 0, 1 );
		jug_equipo15 [1] = new Jugador ("Bartra", 5, 0, 0, 0 );
		jug_equipo15 [2] = new Jugador ("V�ctor Ruiz", 6, 0, 5, 3 );
		jug_equipo15 [3] = new Jugador ("Sidnei", 12, 11, 2, 11 );
		jug_equipo15 [4] = new Jugador ("�lex Moreno", 15, 3, 0, 0 );
		jug_equipo15 [5] = new Jugador ("Mandi", 23, 6, 8, 2 );
		jug_equipo15 [6] = new Jugador ("Montoya", 2, 3, 0, 0 );
		jug_equipo15 [7] = new Jugador ("Camarasa", 3, 1, 2, 1 );
		jug_equipo15 [8] = new Jugador ("Juanmi", 7, 6, 0, 1 );
		jug_equipo15 [9] = new Jugador ("Nabil Fekir", 8, 2, 2, 1 );
		jug_equipo15 [10] = new Jugador ("Canales", 10, 0, 0, 4 );
		//A continuaci�nm se crean los equipos.  //nombre, nombre del estaddio // a�o fundaci�n // jugador [], partidos ganados, empatados y perdidos.
		Equipo equipo1 = new Equipo ("Real Madrid", "Santiago Bernabeu", 1902, jug_equipo1, 28, 6, 4); 			//2
		Equipo equipo2 = new Equipo ("Barcelona", "Camp Nou", 1899, jug_equipo2, 29, 4, 5);						//1
		Equipo equipo3 = new Equipo ("Atl�tico de Madrid", "Calder�n", 1903, jug_equipo3, 18, 8, 12);			//5
		Equipo equipo4 = new Equipo ("Sevilla", "Ram�n S�nchez-Pizju�n", 1994, jug_equipo4, 17, 9, 12);			//6
		Equipo equipo5 = new Equipo ("Villareal", "Estadio de la Cer�mica", 1890, jug_equipo5, 18, 10, 10); 	//4
		Equipo equipo6 = new Equipo ("Real Sociedad", "Reale Arena", 1909, jug_equipo6, 13, 9, 16);				//9
		Equipo equipo7 = new Equipo ("Granada", "Estadio Nuevo Los C�rmenes", 1931, jug_equipo7, 14, 10, 14); 	//7
		Equipo equipo8 = new Equipo ("Getafe", "Coliseum Alfonso P�rez", 1983, jug_equipo8, 12, 12, 14);    	//8
		Equipo equipo9 = new Equipo ("Valencia", "Mestalla Valencia CF", 1919, jug_equipo9, 12, 8, 18);   		//11
		Equipo equipo10 = new Equipo ("Osasuna", "Estadio El Sadar", 1920, jug_equipo10, 11, 11, 16);     		//12
		Equipo equipo11 = new Equipo ("Athletic Club", "San Mam�s", 1898, jug_equipo11, 28, 4, 6);    			//3
		Equipo equipo12 = new Equipo ("Levante", "Levante UD", 1909, jug_equipo12, 12, 7, 19);					//13
		Equipo equipo13 = new Equipo ("Valladolid", "Estadio Jos� Zorrilla", 1928, jug_equipo13, 8, 18, 12); 	//15
		Equipo equipo14 = new Equipo ("Eibar", "Estadio Municipal de Ipur�a", 1940, jug_equipo14, 11, 10, 17); 	//14
		Equipo equipo15 = new Equipo ("Real Betis", "Estadio Benito Villamar�n", 1907, jug_equipo15, 11, 12, 15); //10
		//Juntamos todos los equipos creados en un ARRAY de equipos.
		Equipo [] total = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6, equipo7, equipo8, equipo9, equipo10, equipo11, equipo12, equipo13, equipo14, equipo15};
		//Creamos el objeto de la liga.
		Liga ligaNacional = new Liga ("Liga Santander 19-20", total);
		//Ahora empezar�a el programa.
		Scanner in = new Scanner (System.in);
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("BIENVENIDO AL PROGRAMA DE LA LIGA");
		System.out.println("*********************************");
		System.out.println("*********************************");
		int eleccion = 0; //Variable para la eleccion del men�.
		String consulta = ""; //Variable para finalizar posteriormente el programa si es N o n
		while (eleccion != 5) { //Un while principal para elegir las opciones del men� y que finalice si elige el n�mero 5
			System.out.println();
			System.out.println("Opciones: ");
			System.out.println("1. Mostrar la clasificaci�n por puntos.");
			System.out.println("2. Mostrar los 5 jugadores con m�s goles.");
			System.out.println("3. Mostrar los 5 jugadores con m�s expulsiones.");
			System.out.println("4. Mostrar los 3 equipos con m�s goles a favor.");
			System.out.println("5. Finalizar");
			//Se env�a al m�todo el n�mero introducido por si pudiera dar error,
			//en caso de haber generado un error, entra como valor -9999 en el while siguiente,
			//har� otra vez la comprobaci�n hasta que sea un numero entero.
			eleccion = comprobarMenu(); 
			while (eleccion == -9999) {
				System.out.println();
				System.out.println("Opciones: ");
				System.out.println("1. Mostrar la clasificaci�n por puntos");
				System.out.println("2. Mostrar los 5 jugadores con m�s goles.");
				System.out.println("3. Mostrar los 5 jugadores con m�s expulsiones.");
				System.out.println("4. Mostrar los 3 equipos m�s goles a favor.");
				System.out.println("5. Finalizar");
				eleccion = comprobarMenu(); //vuelve a volver al m�todo para que solo pueda seguir si introduce un numero entero.
			}
			if (eleccion > 5 || eleccion < 0) {	//Aqu� te advierte si has introducido un n�mero que no est� entre las posibilidades del men�.
				System.out.println("No has introducido un valor v�lido. Vuelve a intentarlo.");
			}
			switch (eleccion) { //Eleccion del men�
				case 1:  //Visualizamos la clasificaci�n ordenada por puntos.
					ordenarPuntos(total, ligaNacional); //Entra al m�todo que lo ordena, a�ade a la clasficacion de la liga, y lo muestra.
					System.out.println("�Quiere realizar otra consulta ? S/N"); 
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 2: //Visualiza los 5 m�ximos goleadores.
					maximosGoleadores(total);  //Entra el m�todo que lo ordena por goles y lo muestra.
					System.out.println("�Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) { 
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 3: //Visualiza los cinco jugadores con m�s expulsiones.
					expulsiones(total); //Entra al m�todo que ordena y lo muestra.
					System.out.println("�Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no")) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
				case 4: //Visualiza los 3 equipos con mayor goles a favor.
					equiposGoleadores(total); //Entra al m�todo que lo ordena y lo muestra.
					System.out.println("�Quiere realizar otra consulta ? S/N");
					consulta = in.next(); //Un nuevo Scanner para comprobar si el usuario quiere finalizar ahora o continuar.
					if (consulta.equalsIgnoreCase("n") || consulta.equalsIgnoreCase("no") ) {
						eleccion = 5; //Si elige n/N o NO/no se le da valor 5 y se acaba.
					}
					break;
			}
		}
		System.out.println("Gracias, hasta pronto."); //Mensaje de finalizaci�n.
		
	}
	/**
	 * M�todo que contiene un try/catch para evitar que pueda fallar en la elecci�n del men�
	 * @return
	 */
	public static int comprobarMenu () {
		Scanner in = new Scanner (System.in);
		int eleccion;
		try {
			eleccion = in.nextInt();
			return eleccion; //Devuelve el n�mero, en caso de que sea un entero.
		}catch (InputMismatchException e) { //Si introduce un caracter inv�lido, muestra el print y devuelve un valor que se recoger� en el main.
			System.out.println("No has introducido bien el valor v�lido. Vuelve a intentarlo.");
			System.out.println();
			return -9999; //Valor devuelve para tenerlo en cuenta en el main.
		}
	}

	/**
	 * M�todo que ordena por los puntos de mayor a menor.
	 * @param tabla , un array de Equipo
	 * @param liga, un objeto de la clase Liga
	 */
	public static void ordenarPuntos (Equipo [] tabla, Liga liga) {
		//Habria que copiar para comparar.
		Equipo [] equiposClasi = new Equipo [tabla.length]; //Creamos un nuevo array de Equipo que sera la copia para trabajarlo.
		Equipo equipoAux = null; //Una variable auxiliar con el Equipo que iremos utilizando en la ordenaci�n.
		//Creamos un bucle para ir rellenando la tabla copiada para no machacar los datos originales.
		for (int i = 0; i < tabla.length; i++) {
			equiposClasi[i] = tabla[i];
		}
		//Bucle anidado que ir� ordenando la tabla que tenemos copiada.
		for (int i = 0; i < tabla.length; i++) {
			for ( int j = i +1; j < tabla.length; j++) {
				if (equiposClasi[i].getPuntos() < equiposClasi[j].getPuntos()) { //Si encuentra un equipo que tenga mayor puntos: 
					// Intercambiamos valores de la
					// variable para ir almacenando.
					equipoAux = equiposClasi[i];
					// Ahora se mueve el nuevo valor que es mayor a la posici�n anterior.
					equiposClasi [i] = equiposClasi [j];
					// Ahora el valor de i que hemos sobrescrito y a�adido al auxiliar se recupera
					// en el valor de j
					equiposClasi [j] = equipoAux;
				}
			}
		}
		//Ahora le aplicamos a la Liga la clasficaci�n ordenada con su m�todo Setter.
		liga.setClasificacion(equiposClasi);
		//LLamar a la funci�n de la clase Liga que muestra la clasificaci�n.
		liga.mostrarClasificacion();
	}
	
	/**
	 * M�todo que ordena los jugadores por goles
	 * @param tabla que contiene un array de Equipo. 
	 */
	public static void maximosGoleadores (Equipo [] tabla) {
		Jugador[] todos = new Jugador [tabla[0].mostrarNumJugadores()]; //Se crea un array auxiliar para ir almacenando los jugadores de cada equipo.
		String [] nombres = new String [tabla.length*tabla[0].mostrarNumJugadores()]; //Aq�i se van a ir almacenando todos los nombres de todos los jugadores de los equipos
		//Teniendo en cuenta en este caso que todos los equipos tienen al menos 11 jugadores, que es el n�mero que retorna del equipo 0 de ejemplo.
		int [] goles = new int[nombres.length]; //Un array de enteros con los goles de cada jugador, con la longitud de todos los jugadores de los equipos.
		int cont = 0; //una variable que sevir� de �ndice de los arrays creados anteriormente.
		//Bucle anidado para ir a�adiendo la informaci�n		
		for(int i = 0; i < tabla.length; i++) {
			todos = tabla[i].getJugadores();
			for (int j = 0; j < todos.length; j++) {
				nombres[cont] = todos[j].getNombre(); //cada vez que se genera un bucle de cada jugador, su suma el �ndice hasta completar los 165 totales.
				goles[cont] = todos[j].getGoles();
				cont++;
			}
		}
		//Se ordenan con un bucle anidado. Cambiando las posiciones en ambos array para que tengan relaci�n.
		for (int i = 0; i < goles.length; i++){
            for (int j = i + 1; j < goles.length; j++){
                if (goles[i] < goles[j]){
                    //Intercambiamos valores de la variable para ir almacen�ndola.
                    int auxiliarGoles = goles[i];
                    String auxiliarNombre = nombres [i];
                    // Ahora se mueve el nuevo valor que es mayor a la posici�n anterior.
                    goles[i] = goles[j];
                    nombres[i] = nombres[j];
                    // Ahora el valor de i que hemos sobrescrito y a�adido al auxiliar se recupera
					// en el valor de j
                    goles[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println("\n");
		System.out.println("Cinco m�ximos goleadores: ");
		System.out.println("�����������������������");
		System.out.println("/// NOMBRES ///// GOLES");
		System.out.println("----------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d. %-15s %d %n", i+1, nombres[i], goles[i]);
		}
		System.out.println("_____________________________");
		
	}
	
	
	/**
	 * Commo el de m�ximo goleadores pero con tarjetas rojas,
	 * @param tabla
	 */
	public static void expulsiones(Equipo [] tabla) {
		// Creamos nuevas tablas que ir�n recogiendo la informaci�n de los equipos por
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
		//Para mostrarlos ordenados los ordenamos primero. Igual que anteriores m�todos.
		for (int i = 0; i < tarjetas.length; i++){
            for (int j = i + 1; j < tarjetas.length; j++){
                if (tarjetas[i] < tarjetas[j]){
                	//Intercambiamos valores de la variable para ir almacen�ndola.
                    int auxiliarGoles = tarjetas[i];
                    String auxiliarNombre = nombres [i];
                    // Ahora se mueve el nuevo valor que es mayor a la posici�n anterior.
                    tarjetas[i] = tarjetas[j];
                    nombres[i] = nombres[j];
                    // Ahora el valor de i que hemos sobrescrito y a�adido al auxiliar se recupera
					// en el valor de j
                    tarjetas[j] = auxiliarGoles;
                    nombres[j] = auxiliarNombre;
                }
            }
        }
		//Ahora se muestran.
		System.out.println ("\n");
		System.out.println ("Los cinco jugadores con m�s expulsiones: ");
		System.out.println ("������������������������������");
		System.out.println ("/// NOMBRES ////// Expulsiones");
		System.out.println ("------------------------------");
		for (int i = 0; i <
				5; i++) {
			System.out.printf("%d. %-20s %d %n", (i+1), nombres[i], tarjetas[i]);
		}
		System.out.println("_______________________________");
	}

	/**
	 * Como la eleccion del menu 1 pero ordenados seg�n los goles a favor.
	 * @param tabla con un array de Equipo
	 */
	public static void equiposGoleadores (Equipo [] tabla) {
		// Creamos nuevas tablas que ir�n recogiendo la informaci�n de los equipos por
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
					// Ahora se mueve el nuevo valor que es mayor a la posici�n anterior.
					equipo[i] = equipo[j];
					golesFavor[i] = golesFavor[j];
					// Ahora el valor de i que hemos sobrescrito y a�adido al auxiliar se recupera
					// en el valor de j.
					equipo[j] = auxiliarNombre;
					golesFavor[j] = auxiliarGoles;
				}
			}
		}
		// Ahora se van a visualizar la tabla de equipos por su orden.
		System.out.println("\n");
		System.out.println("Tres primeros equipos con m�s goles a favor:");
		System.out.println("��������������������������������������������");
		System.out.println("---- EQUIPO ------------ GOLES/Favor -------");
		System.out.println("____________________________________________");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d. %-25s %d %n", (i + 1), equipo[i], golesFavor[i]);
		}
		System.out.println("____________________________________________");
	}
	
	
}
