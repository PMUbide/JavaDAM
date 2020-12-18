package practica1;

public class Equipo {
	private String nombreEquipo; //El nombre del equipo.
	private String estadio; //El nombre del estadio.
	private int fundacion;  //El a�o de fundaci�n.
	private Jugador [] jugadores; //Los jugadores de los que se compone el equipo.
	private int puntos; //Los puntos al final de temporada del equipo en la clasificaci�n.
	private int ganados; //El n�mero de partidos ganados.
	private int perdidos; //El n�mero de partidos perdidos.
	private int empatados; //El n�mero de partidos empatados.
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
		this.puntos = ganados*3 + empatados;
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
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getGanados() {
		return ganados;
	}
	public void setGanados(int ganados) {
		this.ganados = ganados;
	}
	public int getPerdidos() {
		return perdidos;
	}
	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}
	public int getEmpatados() {
		return empatados;
	}
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
	public void mostrarN() {
		int conteo = 0;
		for (int i = 0; i < jugadores.length; i++) {
			conteo++;
		}
		System.out.println(conteo);
	}
	public String toString() {
		return "Los datos son:" + nombreEquipo + fundacion + estadio;
	}
	
	public int recuentoGoles() {
		int golesTotal = 0;
		for (int i = 0; i < jugadores.length; i++) {
			golesTotal = golesTotal + jugadores[i].getGoles();
		}
		return golesTotal;
	}
	
	
	
}
