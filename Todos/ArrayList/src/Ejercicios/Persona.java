package Ejercicios;
import java.util.*;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private String sexo; //H hombre o M mujer.
	private double peso; //en kg
	private double altura; //Altura en m
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		this.dni = generaDni();
	}
	public Persona() {
		this.nombre = "Aleatorio";
		this.edad = 10;
		this.dni = generaDni();
		this.sexo = "H";
		this.peso = 10;
		this.altura = 1.50;
	}
	public int calcularImc() {
		double valor = peso / (altura*altura);
		if (valor < 20) {
			 return -1; //flaco
		}
		else if (valor >=20 && valor <= 25) {
			return 0; //normal
		}
		else  {
			return 1; //gordo
		}
	}
	public boolean esMayorEdad() {
		if (edad >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	public String comprobarSexo (String genero) {
		if (genero.equalsIgnoreCase("H")) {
			return sexo = "Masculino";
		}
		else if (genero.equalsIgnoreCase("M")){
			return sexo = "Femenino";
		}
		else {
			return sexo = "Indefinido";
		}
	}
	public String generaDni() {
		int num_alea = (int) (100000000 * Math.random());
		int resto = num_alea % 23;
		String dni = Integer.toString(num_alea);
//		int codigoAscii = (int) Math.floor (Math.random()*(122 - 97)+97); 
//		dni = dni + (char)codigoAscii;
		String letra="";
		String[] letras =  {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L",
				"C", "K", "E"};
		for (int i = 0; i < letras.length; i++) {
			if(resto == i) {
				letra = letras[i];
			}
		}
//		return dni.toUpperCase(); 
		return dni+letra;
	}
	@Override
	public String toString() {
		return "El nombre es " + nombre + " el dni es " + dni + " y " + edad + " años.";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
