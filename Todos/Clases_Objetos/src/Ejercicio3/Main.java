package Ejercicio3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico [] tienda = new Electrodomestico [10];
		tienda[0] = new Electrodomestico (1000, "asd" ,"A", 10);
		tienda[1] = new Electrodomestico ();
		tienda[2] = new Electrodomestico (1200, 50);
		tienda[3] = new Lavadora (1000, "rojo" ,"A", 10, 25);
		tienda[4] = new Lavadora ();
		tienda[5] = new Lavadora (300, 100);
		tienda[6] = new Television (700, "negro" ,"B", 35, 20, true);
		tienda[7] = new Television (600, 50);
		tienda[8] = new Television ();
		tienda[9] = new Electrodomestico (3000, "verde" ,"C", 10);
		
		
		for (Electrodomestico i: tienda) {
			System.out.printf("Producto n� %d: El precio %.2f con consumo %s, color %s, peso %.0f \n", 
					i.getId(), i.precioFinal(), i.getConsumo(), i.getColor(), i.getPeso());
		}
		
	
	}
	
	
}

