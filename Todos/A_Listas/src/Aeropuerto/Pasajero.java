package Aeropuerto;

public class Pasajero {
	private String nombre;
	private String dni;
	private int numVuelo;
	
	public Pasajero(String nombre, String dni, int numVuelo) {
		this.nombre = nombre;
		this.dni = dni;
		this.numVuelo = numVuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", dni=" + dni + ", numVuelo=" + numVuelo + "]";
	}
	
	
	
}
