package practica1;

public class Liga {
	private String nomLiga;  //El Nombre de la liga.
	private Equipo[] clasificacion; //Los equipos que compone la liga
	/**
	 * Constructor de la clase Liga con esos parámetros.
	 * @param nomLiga
	 * @param clasificacion
	 */
	public Liga(String nomLiga, Equipo[] clasificacion) {
		this.nomLiga = nomLiga;
		this.clasificacion = clasificacion;
	}
	/**
	 * Getter del nombre de la liga
	 * @return Nos devuelve un String con el nombre
	 */
	public String getNomLiga() {
		return nomLiga;
	}
	/**
	 * Setter del nombre de la liga
	 * @param nomLiga 
	 */
	public void setNomLiga(String nomLiga) {
		this.nomLiga = nomLiga;
	}
	/**
	 * Getter de la clasificación
	 * @return Devuelve un array de la clase Equipo
	 */
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	/**
	 * Setter de la clasificacion. Interesará enviarle una composición de equipos clasificada.
	 * @param clasificacion
	 */
	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
	/**
	 * Método que muestra la tabla de la clasificación por puntos, que está añadida a la clase Liga.
	 */
	public void mostrarClasificacion() {
		System.out.println("\n");
		System.out.println("CLASIFICACIÓN: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("--------- EQUIPO ----------- GANADOS ----- EMPATES ------- PERDIDOS -------- PUNTOS ------ GOLES/Favor ----");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		for (int i = 0; i < clasificacion.length; i++) {
				System.out.printf("%2d. %-25s %-15d %-15d %-15d %-15d %-15d %n", (i + 1), clasificacion[i].getNombreEquipo(), clasificacion[i].getGanados(),
						clasificacion[i].getEmpatados(), clasificacion[i].getPerdidos(), clasificacion[i].getPuntos(), clasificacion[i].recuentoGoles());      //GOLES TOTALES- (clasificacion[i].getEmpatados() + clasificacion[i].getGanados() + clasificacion[i].getPerdidos()));
		}	
		System.out.println("________________________________________________________________________________________________________");
	}
}
