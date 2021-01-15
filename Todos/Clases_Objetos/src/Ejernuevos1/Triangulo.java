package Ejernuevos1;

public class Triangulo {
		
	private double b; //lado base
	private double y;
	private double j;
	private double h; //altura
	
	public Triangulo(double b, double y, double j, double h) {
		this.b = b;
		this.y = y;
		this.j = j;
		this.h = h;
	}
	
	public Triangulo() {
		
	}
	
		
	public double perimetro() {
		return b + y + j;
	}
	
	public double area() {
		return (b * h) / 2;
	}
}
