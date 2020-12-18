package clases;

/**
 * @author Pablo
 *
 */
public class Jugador {
	private String nombre;
	private int dorsal;
	private String [] posiciones;
	
	public Jugador(String nombre, int dorsal, String[] posiciones) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posiciones = posiciones;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String[] getPosiciones() {
		return posiciones;
	}
	public void setPosiciones(String[] posiciones) {
		this.posiciones = posiciones;
	}
	
	public void anadirPosicion(String posicion) {
		int longitud = posiciones.length;
		String [] nuevasPosiciones = new String [longitud+1];
		for (int i = 0; i < longitud; i++) {
			nuevasPosiciones[i] = posiciones[i];
		}
		nuevasPosiciones[nuevasPosiciones.length-1] = posicion;
		this.posiciones = nuevasPosiciones;
		
	}
	public void mostrarPosiciones() {
		for (int i = 0; i < posiciones.length; i++) {
			System.out.println(posiciones[i]);
		}
		
	}
	
	
	
	
	
}
