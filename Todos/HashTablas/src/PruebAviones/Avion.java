package PruebAviones;


public class Avion implements Comparable {
	private String nombre;
	private int veces;
	
	public Avion(String nombre, int veces) {
		this.nombre = nombre;
		this.veces = veces;
	}
	
	@Override
	public int compareTo(Object miObjeto) {
		//Casting, refundición del objeto.
		Avion otro = (Avion) miObjeto;
		if(this.veces < otro.veces) {
			return 1;
		}
		if(this.veces > otro.veces) {
			return -1;
		}
		return 0;
	}	
	
	
	
	public String toString(){
		return "avion: " + nombre + " veces: " + veces;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVeces() {
		return veces;
	}

	public void setVeces(int veces) {
		this.veces = veces;
	}
	
	
	
	
	
}
