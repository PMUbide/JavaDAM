package JuegoVida;

public class Tripleta {

	private static int genInicial=0;
	private int generacion;
	private int numCelVivas;
	private int numCelNuevas;
	
	//Constructor del objeto.
	public Tripleta(int numCelVivas, int numCelNuevas) {
		this.generacion = genInicial; //Con el primer objeto creado se asocioa el valor 0
		genInicial++; //Despu�s autom�ticamente crecer� uno, y ser� el que se asociar� al siguiente objeto que se crea.
		this.numCelVivas = numCelVivas;
		this.numCelNuevas = numCelNuevas;
	}
	
	//Constructor general del objeto.
	public Tripleta() {
		this.generacion = genInicial;
		genInicial++;
	}
	
	/**
	 * M�todo getter de la generaci�n.
	 * @return
	 */
	public int getGeneracion() {
		return generacion;
	}
	
	/**
	 * M�todo setter de la generaci�n.
	 * @param generacion
	 */
	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}

	/**
	 * M�todo getter del n�mero de c�lulas vivas que hay en esa generaci�n.
	 * @return
	 */
	public int getNumCelVivas() {
		return numCelVivas;
	}

	/**
	 * M�todo setter del n�mero de c�lulas presentes en el momento.
	 * @param numCelVivas
	 */
	public void setNumCelVivas(int numCelVivas) {
		this.numCelVivas = numCelVivas;
	}

	/**
	 * M�todo getter del n�mero de c�lulas que se han creado respecto a la generaci�n anterior.
	 * @return
	 */
	public int getNumCelNuevas() {
		return numCelNuevas;
	}

	/**
	 * M�todo setter del n�mero de c�lulas que tiene respecto a la genraci�n anterior.
	 * @param numCelNuevas
	 */
	public void setNumCelNuevas(int numCelNuevas) {
		this.numCelNuevas = numCelNuevas;
	}
	
	
	
	
	
	
}
