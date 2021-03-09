package Ejernuevos1;

public class Rectangulo {
	private double	b;	// Lado base
	private double	h;	// lados laterales

	public Rectangulo(double b, double h) {
		this.b = b;
		this.h = h;
	}

	public Rectangulo() {

	}

	public double perimetro() {
		return (b * 2) + (h * 2);
	}

	public double area() {
		return (b * h);
	}
}
