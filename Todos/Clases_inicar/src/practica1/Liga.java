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
	public String getNomLiga() {
		return nomLiga;
	}
	public void setNomLiga(String nomLiga) {
		this.nomLiga = nomLiga;
	}
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
	/**
	 * Método que devuelve la tabla de la clasificación por puntos que es la que está añadida a la clase Liga.
	 */
	public void mostrarClasificacion() {
		System.out.println("\n");
		System.out.println("CLASIFICACIÓN: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("--------- EQUIPO ------- GANADOS ----- EMPATES ------- PERDIDOS -------- PUNTOS ------ GOLES/Favor ----");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		for (int i = 0; i < clasificacion.length; i++) {
			if (clasificacion[i].getNombreEquipo().length() < 13) {
				System.out.println((i + 1) + ". " + clasificacion[i].getNombreEquipo() + "\t\t" + clasificacion[i].getGanados() +
						"\t\t" + clasificacion[i].getEmpatados() + "\t\t"+ clasificacion[i].getPerdidos() + "\t\t" + clasificacion[i].getPuntos() + "\t\t" + clasificacion[i].recuentoGoles());
			}
			else{System.out.println((i + 1) + ". " + clasificacion[i].getNombreEquipo() + "\t" + clasificacion[i].getGanados()  + "\t\t" +
			clasificacion[i].getEmpatados() + "\t\t"+ clasificacion[i].getPerdidos() + "\t\t" + clasificacion[i].getPuntos() + "\t\t" + clasificacion[i].recuentoGoles());}
		}
		System.out.println("________________________________________________________________________________________________________");
		
		
	}
}
