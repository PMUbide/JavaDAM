package Ejercicio2;

public class Encuentro {
	Boxeador boxeador;
	Karateca karateca;
	
	
	
	public Encuentro(Boxeador boxeador, Karateca karateca) {
		super();
		this.boxeador = boxeador;
		this.karateca = karateca;
	}

	/*
	 * atacaBoxeador(String ataque): si el ataque es pu�etazo, invoca al m�todo
		pegarPu�etazo() del boxeador, obtiene el da�o que va a hacer, y se lo resta a la
		vida del karateca. Si el ataque es patada, realiza la misma acci�n pero invocando
		al m�todo pegarPatada(). Muestra por pantalla la vida restante de ambos
		personajes.
	 */
	public void atacaBoxeador(String ataque) {
		if(ataque.equalsIgnoreCase("pu�etazo")) {
			double atac = boxeador.pegarPuno();
			karateca.restarVida(atac);
		}else if(ataque.equalsIgnoreCase("patada")) {
			double atac = boxeador.pegarPatada();
			karateca.restarVida(atac);
		}
		System.out.println("Vida boxeador: ");
		System.err.print(boxeador.getPuntosVida());
		System.out.println("\nVida karatecar: ");
		System.err.print(karateca.getPuntosVida());
	}
	
	
	/*
	 * 
	 * atacaKarateca(String ataque): si el ataque es pu�etazo, invoca al m�todo
		pegarPu�etazo() del katareca, obtiene el da�o que va a hacer, y se lo resta a la
		vida del boxeador. Si el ataque es patada, realiza la misma acci�n pero
		invocando al m�todo pegarPatada(). Muestra por pantalla la vida restante de
		ambos personajes.
	 */
	public void atacaKarateca(String ataque) {
		if(ataque.equalsIgnoreCase("pu�etazo")) {
			double atac = karateca.pegarPuno();
			boxeador.restarVida(atac);
		}else if(ataque.equalsIgnoreCase("patada")) {
			double atac = karateca.pegarPatada();
			boxeador.restarVida(atac);
		}
		System.out.println("\nVida boxeador: ");
		System.err.print(boxeador.getPuntosVida());
		System.out.println("\nVida karatecar: ");
		System.err.print(karateca.getPuntosVida());
	}
}
