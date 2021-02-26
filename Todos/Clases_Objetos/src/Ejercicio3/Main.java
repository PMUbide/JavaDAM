package Ejercicio3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico [] tienda = new Electrodomestico [10];
		tienda[0] = new Electrodomestico (1000, "asd", "A", 10);
		tienda[1] = new Electrodomestico ();
		tienda[2] = new Electrodomestico (1200, 50);
		tienda[3] = new Lavadora (1000, "rojo", "A", 10, 25);
		tienda[4] = new Lavadora ();
		tienda[5] = new Lavadora (300, 100);
		tienda[6] = new Television (700, "negro", "B", 35, 20, true);
		tienda[7] = new Television (600, 50);
		tienda[8] = new Television ();
		tienda[9] = new Electrodomestico (3000, "verde", "C", 10);
		
		
//		for (Electrodomestico i: tienda) {
//			System.out.printf("Producto nº %d: El precio %.2f con consumo %s, color %s, peso %.0f \n", 
//		}
		//Metodo para ordenar objetos de la clase array., estatico, por eso se le llama
		//Pero hará falta implementar una interfaz, en la clase.
		
//		Arrays.sort(tienda);
		
		for (Electrodomestico i: tienda) {
			System.out.printf("Producto nº %d: El precio %.2f con consumo %s, color %s, peso %.0f \n", 
					i.getId(), i.precioFinal(), i.getConsumo(), i.getColor(), i.getPeso());
		}
		
		for (int i = 0; i < tienda.length; i++) {
			if(tienda[i] instanceof Lavadora) {
				System.out.println("Es una lavadora, posicion " + i + " del array");
			}
		} 
		
		
		
		Electrodomestico elegido = new Television(100, "negro", "C", 40, 21, false);
		
		Comparable ejemplo = new Electrodomestico(); //Una instancia de la interfaz Comparable.
		
		
		if (elegido instanceof Electrodomestico) { //Nos advierte 
			System.out.println("Es de tipo Television");
		}
		
		if (ejemplo instanceof Comparable) {
			System.out.println("Implemente la interfaz comparable");
		}
		
		
		//Consumo de luz interfaz.
		elegido.encender(true);
		
		
		
		
	}
	
	
}

