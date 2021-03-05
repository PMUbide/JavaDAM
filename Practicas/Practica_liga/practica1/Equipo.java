package practica1;

public class Equipo {
	private String nombreEquipo; 	//El nombre del equipo.
	private String estadio; 		//El nombre del estadio.
	private int fundacion;  		//El año de fundación.
	private Jugador [] jugadores; 	//Los jugadores de los que se compone el equipo.
	private int puntos; 			//Los puntos al final de temporada del equipo en la clasificación.
	private int ganados; 			//El número de partidos ganados.
	private int perdidos; 			//El número de partidos perdidos.
	private int empatados; 			//El número de partidos empatados.
	/**
	 *  Constructor con los parámetros de la clase.
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
		this.puntos = ganados*3 + empatados;   //Aquí se generan los puntos totales con la fórmula
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
	 * Setter, método que actualiza el nombre con el parametro 
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
	/**Getter del año de fundacion
	 * @return devuelve el año.
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
	 * @param Se le envía un array de Jugador
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
	 * @return Nos devuelve el número de partidos ganados.
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
	 * @return Nos devuelve el número de partidos empatados.
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
	 * Método que devuelve la cantidad de jugadores de un equipo.
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
	 * Método que devuelve la información a modo de String.
	 */
	public String toString() {
		return "Los datos nombre/año/estadio/ganados/perdidos/empatados/puntos" + nombreEquipo + fundacion + estadio + ganados + perdidos + empatados + puntos;
	}
	/**
	 * Método que devuelve el sumatorio de los goles de un array de Jugador.
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
