import java.util.ArrayList;
import java.util.Scanner;


public class MainJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Carta> baraja = new ArrayList <>();
		//LLamar a metodo para rellenar la baraja con 40 cartas.
		rellenarBaraja(baraja);
		System.out.println(baraja.size());
		//Ahora empezará el juego PARA DOS JUGADORES
		ArrayList <Carta> jugador1 = new ArrayList<>();
		ArrayList <Carta> jugador2 = new ArrayList<>();
		//Método para coger CARTAS.
		cogerCartas(jugador1, baraja);
		cogerCartas(jugador2, baraja);
		System.out.println("Cartas tiene jugador 1 " + jugador1.size());
		System.out.println("Cartas tiene jugador 2 " + jugador2.size());
		System.out.println(baraja.size());
		//SELECCIONAR TRIUNFO
		Carta triunfo = elegirTriunfo(baraja);
		System.out.println("El Trifuno del juego es: " + triunfo);
		//MENU FUNCIONAMIENTO JUEGO:
		int [] puntuaciones = new int[2];
//		int punt_jug1 = 0;
//		int punt_jug2 = 0;
		int cont = 0;
		int ronda_eleccion = 1;
		boolean estadico = false;
		Scanner in = new Scanner(System.in);
		while(baraja.size() > 0) {
//			System.out.println(baraja.get(0));
			//Elige que carta jugar.
			Carta pick1 = new Carta();
			Carta pick2 = new Carta();
			int jugar_carta = 10;
			if(ronda_eleccion == 1) {
				while(jugar_carta > 6) {
					System.out.println("Jug1 Elige una carta para tirar");
					for(int i = 0; i < jugador1.size(); i++) {
						System.out.println("Carta" + "["+ (i+1) +"]" + jugador1.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick1 = jugador1.get(jugar_carta-1); //Carta elegida primera.
					//Ahora eleminar esa carta de la mano.
					jugador1.remove(jugar_carta-1);
				}
				jugar_carta = 10;
				//Muestra ese pick y le toca al jugador 2.
				System.out.println("LA CARTA JUGADA ES: " + pick1.toString());
				
				while(jugar_carta > 6) {
					System.out.println("Jug2 Elige una carta para tirar");
					for(int i = 0; i < jugador2.size(); i++) {
						System.out.println("Carta" + "["+ (i+1) +"]" + jugador2.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick2 = jugador2.get(jugar_carta-1); //Carta elegida primera.
					//Ahora eleminar esa carta de la mano.
					jugador2.remove(jugar_carta-1);
				}
				System.out.println("LA CARTA JUGADA ES: " + pick2.toString());
				ronda_eleccion = reglasJuego(pick1, pick2, triunfo, puntuaciones, ronda_eleccion);
				//Volver a ROBAR CARTA.
				if(baraja.size() > 1) {
					cogerCartas(jugador1, baraja);
					cogerCartas(jugador2, baraja);
				}else {
					jugador1.add(baraja.get(0));
					baraja.clear();
					//cogerCartas(jugador1, baraja);
					jugador2.add(triunfo);
				}
			}else {
				while(jugar_carta > 6) {
					System.out.println("Jug2 Elige una carta para tirar");
					for(int i = 0; i < jugador2.size(); i++) {
						System.out.println("Carta" + "["+ (i+1) +"]" + jugador2.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick2 = jugador2.get(jugar_carta-1); //Carta elegida primera.
					//Ahora eleminar esa carta de la mano.
					jugador2.remove(jugar_carta-1);
				}
				jugar_carta = 10;
				//Muestra ese pick y le toca al jugador 2.
				System.out.println("LA CARTA JUGADA ES: " + pick2.toString());
				
				while(jugar_carta > 6) {
					System.out.println("Jug1 Elige una carta para tirar");
					for(int i = 0; i < jugador1.size(); i++) {
						System.out.println("Carta" + "["+ (i + 1) +"]" + jugador1.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick1 = jugador1.get(jugar_carta - 1); //Carta elegida primera.
					//Ahora eleminar esa carta de la mano.
					jugador1.remove(jugar_carta - 1);
				}
				System.out.println("LA CARTA JUGADA ES: " + pick1.toString());
				ronda_eleccion = reglasJuego(pick1, pick2, triunfo, puntuaciones, ronda_eleccion);
				//Volver a ROBAR CARTA.
				System.out.println("Cartas tiene jugador 1 " + jugador1.size());
				System.out.println("Cartas tiene jugador 2 " + jugador2.size());
				if(baraja.size() > 1) {
					cogerCartas(jugador1, baraja);
					cogerCartas(jugador2, baraja);
				}else {
					jugador2.add(baraja.get(0));
					baraja.clear();
					//cogerCartas(jugador2, baraja);
					jugador1.add(triunfo);
				}
			}
			System.out.println("\nLas puntuaciones jug1: " + puntuaciones[0]);
			System.out.println("Las puntuaciones jug12: " + puntuaciones[1]);
			cont++;
			System.out.println("JUGA 1 " + jugador1.size());
			System.out.println("JUGA 2 " + jugador2.size());
			System.out.println(baraja.size());
			if(baraja.size() == 1) {
				estadico = true;
			}
			
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Baraja acabada " + baraja.size());
		System.out.println("Cartas tiene jugador 1 " + jugador1.size());
		for(int i = 0; i < jugador1.size(); i++) {
			System.out.println("Carta" + "["+ (i + 1) +"]" + jugador1.get(i).toString());
		}
		System.out.println("Cartas tiene jugador 2 " + jugador2.size());
		for(int i = 0; i < jugador2.size(); i++) {
			System.out.println("Carta" + "["+ (i + 1) +"]" + jugador2.get(i).toString());
		}
		//EMPEZARIA EL ARRASTRE. 
		while(jugador1.size() > 0) { //mientras tenga cartas cualquiera.
			Carta pick1 = new Carta();
			Carta pick2 = new Carta();
			int jugar_carta = 10;
			if(ronda_eleccion == 1) { //Si empieza el jug1.
				while(jugar_carta > jugador1.size()) {
					System.out.println("Jug1 Elige una carta para tirar");
					for(int i = 0; i < jugador1.size(); i++) {
						System.out.println("Carta" + "["+ (i+1) +"]" + jugador1.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick1 = jugador1.get(jugar_carta-1); //Carta elegida primera.
					//Ahora eleminar esa carta de la mano.
					jugador1.remove(jugar_carta-1);
				}
				jugar_carta = 10;
				//Muestra ese pick y le toca al jugador 2.
				System.out.println("LA CARTA JUGADA ES: " + pick1.toString());
				boolean validado = false;
				while(jugar_carta > jugador2.size() && !validado) {
					System.out.println("Jug2 Elige una carta para tirar");
					for(int i = 0; i < jugador2.size(); i++) {
						System.out.println("Carta" + "["+ (i+1) +"]" + jugador2.get(i).toString());
					}
					jugar_carta = in.nextInt();
					pick2 = jugador2.get(jugar_carta-1); //Carta elegida primera.
					//ANALIZAR SI PUEDE JUGAR ESA.
					validado = analizaPick(pick1, pick2, jugador2);
					
					
					
					//Ahora eleminar esa carta de la mano.
					jugador2.remove(jugar_carta-1);
					
				}
				System.out.println("LA CARTA JUGADA ES: " + pick2.toString());
				ronda_eleccion = reglasJuego(pick1, pick2, triunfo, puntuaciones, ronda_eleccion);
				
			}else {
			
			}
			
			
			
			
		}
		

		
		
	}
	
	public static boolean analizaPick(Carta pick1, Carta pick2, ArrayList <Carta> jugad) {
		//Primero que si es de diferente palo
		if(!pick2.getPalo().equals(pick1.getPalo())) {
			for(int i = 0; i < jugad.size(); i++) {
				//si tiene en la mano de ese palo, returne false y no la puede echar.
				if(jugad.get(i).getPalo().equals(pick1.getPalo())) {
					return false;
				}
			}
			//Si no tiene de ese palo en la mano, si tiene triunfo tiene que tirarr.
			
			
		}
		
		
	}
	
	
	
	
	
	/**
	 * REGLAS DE PUNTUACION Y GANAR PERDER.
	 * @param pick1
	 * @param pick2
	 * @param triunfo
	 * @param puntuaciones
	 * @param jug_ronda -- INDICA EL JUGADOR QUE JUEGA ESA RONDA.
	 * DEVUELVE el que va a jugar la siguiente RONDA.
	 */
	public static int reglasJuego(Carta pick1, Carta pick2, Carta triunfo, int[] puntuaciones, int jug_ronda) {
		
		boolean ganador = false; //Si es FALSE gana pick1 // si es TRUE gana pick2
		//Primera opcion si los dos son triunfos
		if((pick1.getPalo().equals(triunfo.getPalo())) && (pick2.getPalo().equals(triunfo.getPalo()))) {
			if(pick1.getNumero() == 1) {
				//Gana pick1
				System.out.println("GANA JUG 1");
				ganador = false;
			}else if(pick1.getNumero() == 3){
				if(pick2.getNumero() == 1) {
					//gana pick2
					System.out.println("GANA JUG 2");
					ganador = true;
				}else{
					//gana pick1
					System.out.println("GANA JUG 1");
					ganador = false;
				}
			}
			else {
				if(pick2.getNumero() == 1) {
					//gana pick2
					System.out.println("GANA JUG 2");
					ganador = true;
				} else if(pick1.getNumero() == 3) {
					//gana pick2
					System.out.println("GANA JUG 2");
					ganador = true;
				}else {
					if(pick1.getNumero() > pick2.getNumero()) {
						//gana pick1
						System.out.println("GANA JUG 1");
						ganador = false;
					}
					else {
						//gana pick2
						System.out.println("GANA JUG 2");
						ganador = true;
					}
				}
			}
		//Si A es triunfo
		}else if((pick1.getPalo().equals(triunfo.getPalo())) && (!pick2.getPalo().equals(triunfo.getPalo()))){
			//Gana pick1
			System.out.println("GANA JUG 1");
			ganador = false;
		//Si B es triunfo
		}else if((!pick1.getPalo().equals(triunfo.getPalo())) && (pick2.getPalo().equals(triunfo.getPalo()))) {
			//gana pick2
			System.out.println("GANA JUG 2");
			ganador = true;
		
		//SI NINGUNO ES TRIUNFO. DEPENDERÁ DEL JUGADOR QUE VAYA SEGUNDO.
		}else {
			//Si jugó A
			if(jug_ronda == 1) {
				//si el B es diferente del anterior gana 1.
				if(!pick2.getPalo().equals(pick1.getPalo())) {
					//gana pick1
					System.out.println("GANA JUG 1");
					ganador = false;
				//Si es mismo palo
				}else {
					if(pick1.getNumero() == 1) {
						//Gana pick1
						System.out.println("GANA JUG 1");
						ganador = false;
					}else if(pick1.getNumero() == 3){
						if(pick2.getNumero() == 1) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						}else{
							//gana pick1
							System.out.println("GANA JUG 1");
							ganador = false;
						}
					}
					else {
						if(pick2.getNumero() == 1) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						} else if(pick1.getNumero() == 3) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						}else {
							if(pick1.getNumero() > pick2.getNumero()) {
								//gana pick1
								System.out.println("GANA JUG 1");
								ganador = false;
							}
							else {
								//gana pick2
								System.out.println("GANA JUG 2");
								ganador = true;
							}
						}
						
					}
				}
			//SI JUGÓ el B antes.
			} else {
				//si el A es diferente del anterior gana 2.
				if(!pick1.getPalo().equals(pick2.getPalo())) {
					//gana pick2
					System.out.println("GANA JUG 2");
					ganador = true;
				//Si es el mismo palo
				}else {
					if(pick1.getNumero() == 1) {
						//Gana pick1
						System.out.println("GANA JUG 1");
						ganador = false;
					}else if(pick1.getNumero() == 3){
						if(pick2.getNumero() == 1) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						}else{
							//gana pick1
							System.out.println("GANA JUG 1");
							ganador = false;
						}
					}else {
						if(pick2.getNumero() == 1) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						} else if(pick1.getNumero() == 3) {
							//gana pick2
							System.out.println("GANA JUG 2");
							ganador = true;
						}else {
							if(pick1.getNumero() > pick2.getNumero()) {
								//gana pick1
								System.out.println("GANA JUG 1");
								ganador = false;
							}
							else {
								//gana pick2
								System.out.println("GANA JUG 2");
								ganador = true;
							}
						}
					}
				}
			}
		}
		//QUIEN GANA LA RONDA Y SE DEVUELVE
		//Ahora las puntuaciones.
		if(!ganador) {
			if(pick1.getNumero() == 1) {
				puntuaciones[0] += 11;
			}else if(pick1.getNumero() == 3) {
				puntuaciones[0] += 10;
			}else if(pick1.getNumero() == 8) {
				puntuaciones[0] += 2;
			}else if(pick1.getNumero() == 9) {
				puntuaciones[0] += 3;
			}else if(pick1.getNumero() == 10) {
				puntuaciones[0] += 4;
			}
			if(pick2.getNumero() == 1) {
				puntuaciones[0] += 11;
			}else if(pick2.getNumero() == 3) {
				puntuaciones[0] += 10;
			}else if(pick2.getNumero() == 8) {
				puntuaciones[0] += 2;
			}else if(pick2.getNumero() == 9) {
				puntuaciones[0] += 3;
			}else if(pick2.getNumero() == 10) {
				puntuaciones[0] += 4;
			}
			return jug_ronda = 1;
		}else {
			if(pick1.getNumero() == 1) {
				puntuaciones[1] += 11;
			}else if(pick1.getNumero() == 3) {
				puntuaciones[1] += 10;
			}else if(pick1.getNumero() == 8) {
				puntuaciones[1] += 2;
			}else if(pick1.getNumero() == 9) {
				puntuaciones[1] += 3;
			}else if(pick1.getNumero() == 10) {
				puntuaciones[1] += 4;
			}
			if(pick2.getNumero() == 1) {
				puntuaciones[1] += 11;
			}else if(pick2.getNumero() == 3) {
				puntuaciones[1] += 10;
			}else if(pick2.getNumero() == 8) {
				puntuaciones[1] += 2;
			}else if(pick2.getNumero() == 9) {
				puntuaciones[1] += 3;
			}else if(pick2.getNumero() == 10) {
				puntuaciones[1] += 4;
			}
			return jug_ronda = 2;
		}
		
		
		
	}
	
	
	
	
	/**
	 * Método que elige aleatoriamente una carta que será el triunfo durante el juego.
	 * @param baraja
	 * @return
	 */
	public static Carta elegirTriunfo(ArrayList<Carta> baraja) {
		int random = 41;
		while(random >= baraja.size()){
			random = (int) (100 * Math.random());
		}
		Carta triunfo = baraja.get(random);
		baraja.remove(random);
		return triunfo;
		
	}
	
	
	/**
	 * Método para coger carta un jugador.
	 * @param jugador
	 * @param baraja
	 */
	public static void cogerCartas(ArrayList<Carta> jugador, ArrayList<Carta> baraja) {
		while(jugador.size() < 6) {
			int random = 41;
			while(random >= baraja.size()){
				random = (int) (100 * Math.random());
			}
			jugador.add(baraja.get(random));
			baraja.remove(random);
			//ystem.out.println(random);
		}
		
		
	}
	
	
	/**
	 * Método que rellena la baraja con todas las cartas.
	 * @param array
	 */
	public static void rellenarBaraja(ArrayList<Carta> array) {
		int conteo = 0;
		String[] palos = {"Copas", "Bastos", "Oros", "Espadas"};
		while(conteo < 4) {
			for(int i = 1; i < 11; i++) {
				array.add(new Carta(i, palos[conteo]));
			}
			conteo++;
		}
	}
	
}
