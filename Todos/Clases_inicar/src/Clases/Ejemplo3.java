package clases;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Real Madrid";
		String estadio ="Santiago Bernabeu";
		int anoFundacion = 1902;
		Jugador[] jugadores = new Jugador [3];
		jugadores [0] = new Jugador ("Benzema", 9, null);
		jugadores [1] = new Jugador ("Hazard", 10, null);
		jugadores [2] = new Jugador ("Sergio Ramos", 4, null);
		Equipo equipo_local = new Equipo (nombre, estadio, anoFundacion, jugadores);
		
		
		
		nombre = "Barsa";
		estadio ="Camp Nou";
		anoFundacion = 1940;
		jugadores = new Jugador [3];
		jugadores [0] = new Jugador ("Hola", 1, null);
		jugadores [1] = new Jugador ("Sergio", 3, null);
		jugadores [2] = new Jugador ("Doritos", 1, null);
		Equipo equipo_visitante = new Equipo (nombre, estadio, anoFundacion, jugadores);
		String resultado = "1-0";
		
//		Jugador[] goleadores = new Jugador ("Mariano", 25, null);
		//goleadores = new Jugador ("KALI", 4, null);
		Jugador[] goleadores = new Jugador[1];
		goleadores[0] = new Jugador ("Gordaco", 45,null);
		
		Partido partido1 = new Partido(equipo_local, equipo_visitante, resultado, goleadores);
		
		
//		System.out.println("Han jugado "+ partido1.() + " y " + partido1.getVisitante());
		
		Equipo nombre1 = partido1.getLocal();
		Equipo nombre2 = partido1.getVisitante();
 		
		System.out.println("Han jugado " + partido1.getLocal() + " y " + nombre2.getNombre());
		System.out.println("El resultado ha sido: "+ partido1.getResultado());
		
		Jugador [] goleadores1 = partido1.getGoleadores();
		
		
		
		
		
		for (int i = 0; i < goleadores1.length; i++) {
			System.out.println("Los goleadores han sido: "+ goleadores1[i]);
		}
		
		Jugador[] jugadoresEquipo = equipo.getJugadores();
		for (int i = 0; i < jugadoresEquipo.length; i++) {
			System.out.println("Jugador = " + jugadoresEquipo[i].getnombre() +
					" con dorsal = " + jugadoresEquipo[i].getDorsal());
		}
		
		
		
//		String nombre = "Real Madrid";
//		String estadio ="Santiago Bernabeu";
//		int anoFundacion = 1902;
//		Jugador[] jugadores = new Jugador [3];
//		jugadores [0] = new Jugador ("Benzema", 9, null);
//		jugadores [1] = new Jugador ("Hazard", 10, null);
//		jugadores [2] = new Jugador ("Sergio Ramos", 4, null);
//		
//		Equipo equipo_local = new Equipo (nombre, estadio, anoFundacion, jugadores);
		
		
		
		
		
		
		
	}


}
