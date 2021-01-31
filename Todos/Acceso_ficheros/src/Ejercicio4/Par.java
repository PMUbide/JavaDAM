package Ejercicio4;

public class Par {
	private int concurrencias = 0;
	private String palabra;

	public Par(int concurrencias, String palabra) {
		this.concurrencias = concurrencias;
		this.palabra = palabra;
	}

	public Par() {

	}

	public int getConcurrencias() {
		return concurrencias;
	}

	public void setConcurrencias(int concurrencias) {
		this.concurrencias = concurrencias;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

}
