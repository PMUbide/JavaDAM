package clases;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] posiciones = {"Delantero", "Entrenador"};
		Jugador jugador = new Jugador("Maradona", 10, posiciones);
		
		String [] nuevasPosiciones = {"Centrocampista" , "Entrenador", "Delantero"}; //Una forma de a�aidrlo.
		
		//jugador.setPosiciones(nuevasPosiciones); //Aqu� a�adiria las nuevasPosiciones.
		
		jugador.anadirPosicion("Drogadicto");
		
		jugador.mostrarPosiciones();
		
	}

}
