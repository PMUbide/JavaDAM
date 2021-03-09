package practica1;

public class Jugador {
	private String	nombre;				// Nombre del jugador
	private int		dorsal;
	private int		goles;				// Goles totales de la temporada
	private int		tarjetasRojas;		// Tarjetas rojas totales que ha tenido en la temporada
	private int		tarjetasAmarillas;	// Tarjetas amarillas totales que ha tenido en la temporada.
	// �nico constructor de la clase Jugador

	public Jugador(String nombre, int dorsal, int goles, int tarjetasRojas, int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;

	}

	/**
	 * �ste m�todo devuelve el [nombre] de un jugador.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * �ste m�todo actualiza el valor de nombre a [nombre].
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * �ste m�todo devuelve el [dorsal] de un jugador.
	 * 
	 * @return
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * �ste m�todo actualiza el valor de dorsal a [dorsal].
	 * 
	 * @param dorsal
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * �ste m�todo devuelve los [goles] de un jugador.
	 * 
	 * @return
	 */
	public int getGoles() {
		return goles;
	}

	/**
	 * �ste m�todo actualiza el valor de goles a [goles].
	 * 
	 * @param goles
	 */
	public void setGoles(int goles) {
		this.goles = goles;
	}

	/**
	 * �ste m�todo devuelve las [Tarjetas Rojas] de los jugadores.
	 * 
	 * @return
	 */
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	/**
	 * �ste m�todo actualiza el valor de Tarjetas Rojas a [Tarjetas Rojas].
	 * 
	 * @param tarjetasRojas
	 */
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	/**
	 * �ste m�todo devuelve las [Tarjetas Amarillas] de los jugadores.
	 * 
	 * @return
	 */
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	/**
	 * �ste m�todo devuelve el valor de Tarjetas Amarillas a [Tarjetas Amarillas].
	 * 
	 * @param tarjetasAmarillas
	 */
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

}
