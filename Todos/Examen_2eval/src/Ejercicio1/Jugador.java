package Ejercicio1;

public class Jugador implements HabilidadesFutbol {

	public static void main(String[] args) {
		// Se crean jugadores con el rango de habilidades de 1-10.
		// Jugador 1 con mucha agilidad poca pontencia.

		// Comienza el juego, se crearan 10 jugadores con habilidaes aleatorias.
		// Y se introducirán en un Array de Jugadores.
		Jugador[] jugadores = new Jugador[10];
		int numJugadores = 0;
		String nombre = "Jugador ";
		while (numJugadores < 10) {
			int potenciaDisparo = (int) (Math.random() * 10 + 1);
			int calidadDisparo = (int) (Math.random() * 10 + 1);
			int agilidadPorteria = (int) (Math.random() * 10 + 1);
			int calidadPorteria = (int) (Math.random() * 10 + 1);
			String nombreJug = nombre + numJugadores;
			jugadores[numJugadores] = new Jugador(nombreJug, numJugadores, potenciaDisparo, calidadDisparo,
					agilidadPorteria, calidadPorteria);
			numJugadores++;
		}
		mostrarJugadores(jugadores);
		// A continuación empezará el juego comenzando por el jugador 0
		while (vidasTotales(jugadores)) {
			int jugador = 1;
			for (int i = 0; i <= jugadores.length - 1; i++) {
				boolean gol = false;
				jugador = i + 1;
				if (jugadores[i].getVidas() > 0) {
					boolean tieneVidas = false;
					if (i == 9) {
						jugador = 0;
					}
					while (!tieneVidas) {
						if (jugadores[jugador].getVidas() > 0) {
							tieneVidas = true;
							System.out.println("Tira " + jugadores[i].getNombre() + " --- " + " Portero: "
									+ jugadores[jugador].getNombre());
							meteGol(jugadores[i], jugadores[jugador]);
							gol = true;
							break;
						} else {
							if (jugador < 9) {
								jugador++;
							} else {
								jugador = 0;
							}
						}
					}
				}
				if (gol) {
					System.out.println("Puntuaciones: ");
					for (int x = 0; x < jugadores.length; x++) {
						String vidaQuedan = "";
						if (jugadores[x].getVidas() > 0) {
							vidaQuedan = jugadores[x].getVidas() + "";
						} else {
							vidaQuedan = "Eliminado";
						}
						System.out.println(jugadores[x].getNombre() + " --- " + vidaQuedan);
					}
				}
			}
		}
		System.out.println("Fin del juego.");
	}

	/**
	 * Método que comprueba todas las vidas para acabar el juego.
	 * 
	 * @param array
	 * @return
	 */
	public static boolean vidasTotales(Jugador[] array) {
		int totalVida = 0;
		for (int i = 0; i < array.length; i++) {
			totalVida += array[i].getVidas();
		}
		if (totalVida > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Método para comprobar si mete gol o no.
	 * 
	 * @param uno
	 * @param dos
	 */
	public static void meteGol(Jugador uno, Jugador dos) {
		int ataque = uno.habilidadDisparo();
		int defensa = dos.habilidadPorteria();
		int random = (int) (Math.random() * 100);
//		System.out.println("Prob meter gol: " + ataque + " .Prob defender: " + defensa + "---r" + random);
		if (random <= ataque - defensa) {
			System.out.println("Ha metido gol.");
			dos.restarVida();
		} else {
			System.out.println("Falló!");
		}
	}

	public static void mostrarJugadores(Jugador[] array) {
		for (Jugador jugador : array) {
			System.out.println(jugador.toString());
		}
	}

	private String	nombre;				// El nombre del jugador
	private int		dorsal;				// El dorsal del jugador
	private int		potenciaDisparo;	// La potencia de disparo 1-10
	private int		calidadDisparo;		// Calidad del disparo 1-10
	private int		agilidadPorteria;	// La agilidad en la porteria 1-10
	private int		calidadPorteria;	// La caliad en la porteria 1-10
	private int		vidas;				// Las vidas del jugador

	public Jugador(String nombre, int dorsal, int potenciaDisparo, int calidadDisparo, int agilidadPorteria,
			int calidadPorteria) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.potenciaDisparo = potenciaDisparo;
		this.calidadDisparo = calidadDisparo;
		this.agilidadPorteria = agilidadPorteria;
		this.calidadPorteria = calidadPorteria;
		this.vidas = 2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getPotenciaDisparo() {
		return potenciaDisparo;
	}

	public void setPotenciaDisparo(int potenciaDisparo) {
		this.potenciaDisparo = potenciaDisparo;
	}

	public int getCalidadDisparo() {
		return calidadDisparo;
	}

	public void setCalidadDisparo(int calidadDisparo) {
		this.calidadDisparo = calidadDisparo;
	}

	public int getAgilidadPorteria() {
		return agilidadPorteria;
	}

	public void setAgilidadPorteria(int agilidadPorteria) {
		this.agilidadPorteria = agilidadPorteria;
	}

	public int getCalidadPorteria() {
		return calidadPorteria;
	}

	public void setCalidadPorteria(int calidadPorteria) {
		this.calidadPorteria = calidadPorteria;
	}

	public int getVidas() {
		return vidas;
	}

	public void restarVida() {
		if (vidas != 0) {
			this.vidas -= 1;
		}
		if (vidas == 0) {
			System.out.println(nombre + " eliminado!");
		}
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", potenciaDisparo=" + potenciaDisparo
				+ ", calidadDisparo=" + calidadDisparo + ", agilidadPorteria=" + agilidadPorteria + ", calidadPorteria="
				+ calidadPorteria + ", vidas=" + vidas + "]";
	}

	@Override
	/**
	 * Método que devuelve la probabilidad de meter gol.
	 */
	public int habilidadDisparo() {
		// Por cada punto en potencia disparo aumenta en 5% la prob de meter gol.
		// Por cada punto en calidad disparo aumenta en 5% la prob de meter gol.
		return potenciaDisparo * 5 + calidadDisparo * 5;
	}

	@Override
	/**
	 * método que devuelve la resistencia a que le metan gol, Reducirá la prob de
	 * meter gol.
	 */
	public int habilidadPorteria() {
		// TODO Auto-generated method stub
		// Por cada punto en agilidadPorteria tendrá 1% menos prob meter gol.
		// Por cada punto en calidadPorteria tendrá 1% menos prob meter gol.
		return agilidadPorteria * 1 + calidadPorteria * 1;
	}

}
