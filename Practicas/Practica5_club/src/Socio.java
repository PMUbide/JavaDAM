
public class Socio {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String fechaEntrada;
	
	public Socio(String nombre, String primerApellido, String segundoApellido, String fechaEntrada) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaEntrada = fechaEntrada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", fechaEntrada=" + fechaEntrada + "]";
	}
	
	
}
