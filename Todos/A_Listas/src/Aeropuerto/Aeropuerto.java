package Aeropuerto;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre;
	private ArrayList<Avion> aviones;
	private Pila pila;
	private Cola cola;
	
	public Aeropuerto(String nombre) {
		this.nombre = nombre;
		aviones = new ArrayList<Avion>();
	}

	public void pushAvion(Avion a) {
		if(!existeAvion(a)) {
			aviones.add(a);
		}else {
			System.out.println("Avión ya existe en la bbdd.");
		}
	}
	
	public boolean existeAvion(Avion a) {
		for (Avion avion : aviones) {
			if(avion.getId() == a.getId()) {
				return true;
			}
		}
		return false;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}
	
	
	
}
