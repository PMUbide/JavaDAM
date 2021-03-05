package practica3;

public class UsoBizi {
	private int idUsuario; //Id del usuario que hace uso del sistema.
	private int estRetiro; //Id de la estaci�n de retirada de una bici.
	private int estAnclaje; //Id de la estaic�n de devoluci�n de una bici.
	
	/*
	 * Constructor de la clase�.
	 */
	public UsoBizi(int idUsuario, int estRetiro, int estAnclaje) {
		this.idUsuario = idUsuario;
		this.estRetiro = estRetiro;
		this.estAnclaje = estAnclaje;
	}
	
	/**
	 * M�todo toString() para devolver la informaci�n sobre un uso.
	 */
	public String toString() {
		return "ID: " + idUsuario + " Anclaje: " + estAnclaje + " Retirada " + estRetiro + "\n";
	}
	
	/**
	 * M�todo getter del idUsuario.
	 * @return
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * M�todo setter del idUsuario.
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	/**
	 * M�todo getter de la estaci�n de retiro.
	 * @return
	 */
	public int getEstRetiro() {
		return estRetiro;
	}
	
	/**
	 * M�todo setter de la estaci�n de retiro.
	 * @param estRetiro
	 */
	public void setEstRetiro(int estRetiro) {
		this.estRetiro = estRetiro;
	}
	
	/**
	 * M�todo getter de la estaci�n de anclaje.
	 * @return
	 */
	public int getEstAnclaje() {
		return estAnclaje;
	}
	
	/**
	 * M�todo setter de la estaci�n de anclaje.
	 * @param estAnclaje
	 */
	public void setEstAnclaje(int estAnclaje) {
		this.estAnclaje = estAnclaje;
	}
	
	
}
