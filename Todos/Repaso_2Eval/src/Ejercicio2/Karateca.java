package Ejercicio2;

public class Karateca extends Personaje implements Combate{
	double potenciaPatada; //Potencia 1-100
	double potenciaPuno; //Potencia 1-100
	
	public Karateca(String nombre, double potenciaPatada, double potenciaPuno) {
		super(nombre);
		this.potenciaPatada = potenciaPatada;
		this.potenciaPuno = potenciaPuno;
	}

	@Override
	public double pegarPuno() {
		// TODO Auto-generated method stub
		return potenciaPuno*0.3;
	}

	@Override
	public double pegarPatada() {
		// TODO Auto-generated method stub
		return potenciaPatada*0.6;
	}
	
	
	
}
