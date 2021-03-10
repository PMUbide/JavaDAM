package Ejercicio3;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Trabajador implements Comparable {

	private int		id;
	private double	sueldoAnual;
	private int		diasBaja;

	public Trabajador(int id, double sueldoAnual, int diasBaja) {
		super();
		this.id = id;
		this.sueldoAnual = sueldoAnual;
		this.diasBaja = diasBaja;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/trabajadoresExamen.dat";
		ArrayList<Trabajador> trabajadores = new ArrayList<>();
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					int id = f.readInt();
					double sueldo = f.readDouble();
					int dias = f.readInt();
					trabajadores.add(new Trabajador(id, sueldo, dias));
				}
			} catch (EOFException e) {
			}
			f.close();
			System.out.println("LEidos! ");
			for (Trabajador trabajador : trabajadores) {
				System.out.println(trabajador.toString());
			}
			informacionTrabajadores(trabajadores);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void informacionTrabajadores(ArrayList<Trabajador> trabajadores) {
		Collections.sort(trabajadores);
		System.out.println("El trabajador con mas sueldo es: " + trabajadores.get(0).getId());
		int dias = 0;
		int index = 0;
		for (int i = 0; i < trabajadores.size(); i++) {
			if (trabajadores.get(i).getDiasBaja() > dias) {
				dias = trabajadores.get(i).getDiasBaja();
				index = i;
			}
		}
		System.out.println("El trabajador con mas dias es: " + trabajadores.get(index).getId());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	public int getDiasBaja() {
		return diasBaja;
	}

	public void setDiasBaja(int diasBaja) {
		this.diasBaja = diasBaja;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", sueldoAnual=" + sueldoAnual + ", diasBaja=" + diasBaja + "]";
	}

	@Override
	public int compareTo(Object miObjeto) {
		Trabajador otro = (Trabajador) miObjeto;
		if (this.sueldoAnual > otro.sueldoAnual) {
			return -1;
		}
		if (this.sueldoAnual < otro.sueldoAnual) {
			return 1;
		}
		return 0;

	}

}
