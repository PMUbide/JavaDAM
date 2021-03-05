package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxeador boxeador = new Boxeador("Pepe", 10, 20);
		Karateca karateca = new Karateca("Julian", 15, 10);
		
		Encuentro primeraRonda = new Encuentro (boxeador, karateca);
		
		primeraRonda.atacaBoxeador("Puñetazo");
		primeraRonda.atacaBoxeador("Patada");
		primeraRonda.atacaKarateca("Patada");
		primeraRonda.atacaKarateca("Patada");
		primeraRonda.atacaKarateca("Patada");
		
		
	}
}