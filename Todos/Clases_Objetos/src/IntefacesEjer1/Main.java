package IntefacesEjer1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea el ArrayList:
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		// Crean los objetos:
		Moto mochillo1 = new Moto();
		Moto mochillo2 = new Moto();
		Coche cochecico1 = new Coche(5, "blanco");
		Coche cochecico2 = new Coche(8, "negro");
		Coche cochecico3 = new Coche(3, "azul");
		// Se a�aden los objetos:
		vehiculos.add(mochillo1);
		vehiculos.add(mochillo2);
		vehiculos.add(cochecico1);
		vehiculos.add(cochecico2);
		vehiculos.add(cochecico3);
//		 Se muestran los m�todos
//		for(Vehiculo i: vehiculos) {
//			if(i.getClass().isInstance(cochecico1)) {
//			if(i instanceof Coche) {
//				System.out.println("El color del coche es : " + ((Coche) i).getColor());
//				System.out.println("Las plazas del coche son : " + ((Coche) i).getPlazas());
//				System.out.println("El coche ha acelarado hasta los " + i.acelerar(30));
//				System.out.println();
//			}
//			else {
//				System.out.println("El veh�culo ha acelarado hasta los " + i.acelerar(10));
//				System.out.println();
//			}
//		}
//		System.out.println(vehiculos.get(1).acelerar(10));
//		System.out.println(vehiculos.get(1).acelerar(50));
//		System.out.println(vehiculos.get(1).frenar(5));
//		System.out.println(cochecico1.acelerar(100));

		ArrayList<Vehiculo> cosas = new ArrayList<Vehiculo>();

		Vehiculo nuevo = new Coche();
		Vehiculo dos = new Moto();

		cosas.add(nuevo);
		cosas.add(dos);

		for (Vehiculo i : cosas) {
			if (i instanceof Coche) {
				System.out.println("Es un coche");
			} else {
				System.out.println("Es una moto");
			}
		}

	}

}
