package clases;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Real Madrid";
		String estadio ="Santiago Bernabeu";
		int anoFundacion = 1902;
		Jugador[] jugadores = new Jugador [3];
		jugadores [0] = new Jugador ("Benzema", 9, null);
		jugadores [1] = new Jugador ("Hazard", 10, null);
		jugadores [2] = new Jugador ("Sergio Ramos", 4, null);
		
		Equipo equipo = new Equipo (nombre, estadio, anoFundacion, jugadores);
		
		
		
		Jugador[] jugadoresEquipo = equipo.getJugadores();
		for (int i = 0; i < jugadoresEquipo.length; i++) {
			System.out.println("Jugador = " + jugadoresEquipo[i].getnombre() +
					" con dorsal = " + jugadoresEquipo[i].getDorsal());
		}
		
		
		
		
		
		
	}

}
