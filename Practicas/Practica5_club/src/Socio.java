import java.io.Serializable;

public class Socio implements Serializable {
	
	private String nombre; //Nombre de un socio
	private String primerApellido; //Primer apellido de un socio
	private String segundoApellido; //Segundo apellido de un socio.,
	private String fechaEntrada; //fecha de entrada del socio.
	
	/**
	 * Constructor del objeto. Recibe todos los atributos para su creaci�n.
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param fechaEntrada
	 */
	public Socio(String nombre, String primerApellido, String segundoApellido, String fechaEntrada) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * M�todo getter del nombre. 
	 * @return -> Devuelve el nombre del socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo setter del nombre.
	 * @param nombre -> Recibe un nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter del primer apellido.
	 * @return -> Devuelve el primer apellido.
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * M�todo setter del primer apellido
	 * @param primerApellido -> Recibe un String del apellido.
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * M�todo getter del segundo apellido.
	 * @return -> Devulve el segundo apellido.
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * M�todo setter del segundo apellido
	 * @param segundoApellido -> Recibe un String del apellido.
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * M�todo getter de la fecha de entrada.
	 * @return -> Devuelve un String con la fecha
	 */
	public String getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * M�todo setter de la fecha
	 * @param fechaEntrada -> Recibe un String con la fecha.
	 */
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * M�todo toString() del objeto.
	 */
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", fechaEntrada=" + fechaEntrada + "]";
	}
	
	
}
