
public class UsuarioBizi implements Comparable{
	private int idUsuario; //El id de un usuario.
	private int usosTraslados; //La cantidad de usos de traslados.
	private int usosCirculares; //La cantidad de usos circulares.
	private int total; //La cantidad total de usos.
	
	/**
	 * Constructor de la clase UsuarioBizi
	 * @param idUsuario
	 * @param usosTraslados
	 * @param usosCirculares
	 */
	public UsuarioBizi(int idUsuario, int usosTraslados, int usosCirculares) {
		this.idUsuario = idUsuario;
		this.usosTraslados = usosTraslados;
		this.usosCirculares = usosCirculares;
		this.total = usosCirculares + usosTraslados;
	}
	
	/**
	 * M�todo que suma +1 a los traslados y al total.
	 */
	public void sumarTraslado() {
		usosTraslados++;
		total++;
	}
	
	/**
	 * M�todo que suma +1 a los circulares y al total.
	 */
	public void sumarCircular() {
		usosCirculares++;
		total++;
	}
	
	/**
	 * M�todo toString() para mostrar la informaci�n de un usuario.
	 */
	public String toString(){
		return "Usuario: " + idUsuario + " Traslados: " + usosTraslados + " Circulares: " + usosCirculares + " Total: " + total;
	}
	
	/**
	 *	M�todo getter del idUsuario. 
	 * @return
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * M�todo setter de idUsuario.
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * M�todo getter de los usos de traslado.
	 * @return
	 */
	public int getUsosTraslados() {
		return usosTraslados;
	}


	/**
	 * M�todo setter de los usos de traslado.
	 * @param usosTraslados
	 */
	public void setUsosTraslados(int usosTraslados) {
		this.usosTraslados = usosTraslados;
	}

	/**
	 * M�todo getter de los usos circulares.
	 * @return
	 */
	public int getUsosCirculares() {
		return usosCirculares;
	}

	/**
	 * M�todo setter de los usos circulares.
	 * @param usosCirculares
	 */
	public void setUsosCirculares(int usosCirculares) {
		this.usosCirculares = usosCirculares;
	}

	/**
	 * M�todo CompareTo de la interfaz comparable 
	 * para ordenar el ArrayList con objetos de esta clase
	 * con un m�todo sort seg�n el n�mero total de usos.
	 */
	@Override
	public int compareTo(Object miObjeto) {
		// TODO Auto-generated method stub
		UsuarioBizi nuevo = (UsuarioBizi) miObjeto;
		if(total < nuevo.total) {
			return 1;
		}
		if(total > nuevo.total) {
			return -1;
		}
		return 0;
	}
	

}