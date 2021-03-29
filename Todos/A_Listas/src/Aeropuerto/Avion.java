package Aeropuerto;

import java.util.ArrayList;

public class Avion {
	private ArrayList<Pasajero> integrantes;
	private int totalPasajeros;
	private int id;

	public Avion(int id) {
		this.id = id;
		integrantes = new ArrayList<Pasajero>();
	}

	public void subirPasajero(Pasajero p) {
		integrantes.add(p);
		totalPasajeros++;
	}
	
	
	public ArrayList<Pasajero> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Pasajero> integrantes) {
		this.integrantes = integrantes;
	}

	public int getTotalPasajeros() {
		return totalPasajeros;
	}

	public void setTotalPasajeros(int totalPasajeros) {
		this.totalPasajeros = totalPasajeros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
