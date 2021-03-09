package practica1;

public class Jugador {
	private String	nombre;				// Nombre del jugador
	private int		dorsal;
	private int		goles;				// Goles totales de la temporada
	private int		tarjetasRojas;		// Tarjetas rojas totales que ha tenido en la temporada
	private int		tarjetasAmarillas;	// Tarjetas amarillas totales que ha tenido en la temporada.
	// Único constructor de la clase Jugador

	public Jugador(String nombre, int dorsal, int goles, int tarjetasRojas, int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;

	}

	/**
	 * Éste método devuelve el [nombre] de un jugador.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Éste método actualiza el valor de nombre a [nombre].
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Éste método devuelve el [dorsal] de un jugador.
	 * 
	 * @return
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * Éste método actualiza el valor de dorsal a [dorsal].
	 * 
	 * @param dorsal
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * Éste método devuelve los [goles] de un jugador.
	 * 
	 * @return
	 */
	public int getGoles() {
		return goles;
	}

	/**
	 * Éste método actualiza el valor de goles a [goles].
	 * 
	 * @param goles
	 */
	public void setGoles(int goles) {
		this.goles = goles;
	}

	/**
	 * Éste método devuelve las [Tarjetas Rojas] de los jugadores.
	 * 
	 * @return
	 */
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	/**
	 * Éste método actualiza el valor de Tarjetas Rojas a [Tarjetas Rojas].
	 * 
	 * @param tarjetasRojas
	 */
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	/**
	 * Éste método devuelve las [Tarjetas Amarillas] de los jugadores.
	 * 
	 * @return
	 */
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	/**
	 * Éste método devuelve el valor de Tarjetas Amarillas a [Tarjetas Amarillas].
	 * 
	 * @param tarjetasAmarillas
	 */
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

}
