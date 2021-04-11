import java.io.Serializable;

public class Socio implements Serializable {
	
	private String nombre; //Nombre de un socio
	private String primerApellido; //Primer apellido de un socio
	private String segundoApellido; //Segundo apellido de un socio.,
	private String fechaEntrada; //fecha de entrada del socio.
	
	/**
	 * Constructor del objeto. Recibe todos los atributos para su creación.
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
	 * Método getter del nombre. 
	 * @return -> Devuelve el nombre del socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter del nombre.
	 * @param nombre -> Recibe un nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter del primer apellido.
	 * @return -> Devuelve el primer apellido.
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * Método setter del primer apellido
	 * @param primerApellido -> Recibe un String del apellido.
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * Método getter del segundo apellido.
	 * @return -> Devulve el segundo apellido.
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * Método setter del segundo apellido
	 * @param segundoApellido -> Recibe un String del apellido.
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * Método getter de la fecha de entrada.
	 * @return -> Devuelve un String con la fecha
	 */
	public String getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Método setter de la fecha
	 * @param fechaEntrada -> Recibe un String con la fecha.
	 */
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Método toString() del objeto.
	 */
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", fechaEntrada=" + fechaEntrada + "]";
	}
	
	
}
