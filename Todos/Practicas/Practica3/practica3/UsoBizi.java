package practica3;

public class UsoBizi {
	private int idUsuario; //Id del usuario que hace uso del sistema.
	private int estRetiro; //Id de la estación de retirada de una bici.
	private int estAnclaje; //Id de la estaicón de devolución de una bici.
	
	/*
	 * Constructor de la claseñ.
	 */
	public UsoBizi(int idUsuario, int estRetiro, int estAnclaje) {
		this.idUsuario = idUsuario;
		this.estRetiro = estRetiro;
		this.estAnclaje = estAnclaje;
	}
	
	/**
	 * Método toString() para devolver la información sobre un uso.
	 */
	public String toString() {
		return "ID: " + idUsuario + " Anclaje: " + estAnclaje + " Retirada " + estRetiro + "\n";
	}
	
	/**
	 * Método getter del idUsuario.
	 * @return
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * Método setter del idUsuario.
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	/**
	 * Método getter de la estación de retiro.
	 * @return
	 */
	public int getEstRetiro() {
		return estRetiro;
	}
	
	/**
	 * Método setter de la estación de retiro.
	 * @param estRetiro
	 */
	public void setEstRetiro(int estRetiro) {
		this.estRetiro = estRetiro;
	}
	
	/**
	 * Método getter de la estación de anclaje.
	 * @return
	 */
	public int getEstAnclaje() {
		return estAnclaje;
	}
	
	/**
	 * Método setter de la estación de anclaje.
	 * @param estAnclaje
	 */
	public void setEstAnclaje(int estAnclaje) {
		this.estAnclaje = estAnclaje;
	}
	
	
}
