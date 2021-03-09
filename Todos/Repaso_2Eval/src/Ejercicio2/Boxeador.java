package Ejercicio2;

public class Boxeador extends Personaje implements Combate{
	private double potenciaPatada; //Potencia 1-100
	private double potenciaPuno; //Potencia 1-100
	
	public Boxeador(String nombre, int potenciaPatada, int potenciaPuno) {
		super(nombre);
		this.potenciaPatada = potenciaPatada;
		this.potenciaPuno = potenciaPuno;
	}
	
	@Override
	public double pegarPuno() {
		return potenciaPuno*0.8;
	}

	@Override
	public double pegarPatada() {
		// TODO Auto-generated method stub
		return potenciaPatada*0.1;
	}
	
	
}
