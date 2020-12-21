package practica1;

public class Equipo {
	private String nombreEquipo; 	//El nombre del equipo.
	private String estadio; 		//El nombre del estadio.
	private int fundacion;  		//El a�o de fundaci�n.
	private Jugador [] jugadores; 	//Los jugadores de los que se compone el equipo.
	private int puntos; 			//Los puntos al final de temporada del equipo en la clasificaci�n.
	private int ganados; 			//El n�mero de partidos ganados.
	private int perdidos; 			//El n�mero de partidos perdidos.
	private int empatados; 			//El n�mero de partidos empatados.
	/**
	 *  Constructor con los par�metros de la clase.
	 * @param nombre
	 * @param estadio
	 * @param fundacion
	 * @param jugadores
	 * @param puntos
	 * @param ganados
	 * @param perdidos
	 * @param empatados
	 */
	public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugadores, int ganados,
			int empatados, int perdidos) {
		this.nombreEquipo = nombre;
		this.estadio = estadio;
		this.fundacion = fundacion;
		this.jugadores = jugadores;
		this.puntos = ganados*3 + empatados;   //Aqu� se generan los puntos totales con la f�rmula
		this.ganados = ganados;
		this.perdidos = perdidos;
		this.empatados = empatados;
	}
	/**
	 * Getter nombre
	 * @return el nombre del equipo.
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	/**
	 * Setter, m�todo que actualiza el nombre con el parametro 
	 * @param nombre
	 */
	public void setNombreEquipo(String nombre) {
		this.nombreEquipo = nombre;
	}
	/**
	 * Getter nombre estadio
	 * @return
	 */
	public String getEstadio() {
		return estadio;
	}
	/**
	 * Setter nombre del estadio
	 * @param estadio del equipo
	 */
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	/**Getter del a�o de fundacion
	 * @return devuelve el a�o.
	 */
	public int getFundacion() {
		return fundacion;
	}
	/** Setter de la fundacion.
	 * @param fundacion
	 */
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	/**
	 * Getter de jugadores
	 * @return Devuelve un array de Jugador
	 */
	public Jugador[] getJugadores() {
		return jugadores;
	}
	/**
	 * Setter de los jugadores
	 * @param Se le env�a un array de Jugador
	 */
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	/**
	 * Getter de los puntos. 
	 * @return Nos devuelve un int de los puntos.
	 */
	public int getPuntos() {
		return puntos;
	}
	/**
	 * Setter de los puntos del equipo
	 * @param puntos
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	/**
	 * Getter de los partidos ganados
	 * @return Nos devuelve el n�mero de partidos ganados.
	 */
	public int getGanados() {
		return ganados;
	}
	/**
	 * Setter de los ganados
	 * @param ganados
	 */
	public void setGanados(int ganados) {
		this.ganados = ganados;
	}
	/**
	 * Getter de los partidos perdidos
	 * @return Nos devuelve el numero de partidos perdidos
	 */
	public int getPerdidos() {
		return perdidos;
	}
	/**
	 * Setter de los partidos perdidos.
	 * @param perdidos
	 */
	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}
	/**
	 * Getter de los empatados
	 * @return Nos devuelve el n�mero de partidos empatados.
	 */
	public int getEmpatados() {
		return empatados;
	}
	/**
	 * Setter de los empatados
	 * @param empatados
	 */
	public void setEmpatados(int empatados) {
		this.empatados = empatados;
	}
	/**
	 * M�todo que devuelve la cantidad de jugadores de un equipo.
	 * @return
	 */
	public int mostrarNumJugadores() {
		int conteo = 0;
		for (int i = 0; i < jugadores.length; i++) {
			conteo++;
		}
		return conteo;
	}
	/**
	 * M�todo que devuelve la informaci�n a modo de String.
	 */
	public String toString() {
		return "Los datos nombre/a�o/estadio/ganados/perdidos/empatados/puntos" + nombreEquipo + fundacion + estadio + ganados + perdidos + empatados + puntos;
	}
	/**
	 * M�todo que devuelve el sumatorio de los goles de un array de Jugador.
	 * @return
	 */
	public int recuentoGoles() {
		int golesTotal = 0;
		for (int i = 0; i < jugadores.length; i++) {
			golesTotal = golesTotal + jugadores[i].getGoles();
		}
		return golesTotal;
	}
	
	
	
}
