
public class Ejer4_tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tenemos la siguiente tabla multidimensional, la cual almacena
//		por cada una de sus filas el número de kilogramos vendidos de peras y
//		manzanas en una frutería:
//		int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
//		A su vez, disponemos también de una tabla alimentos, con los nombres
//		de las dos frutas de temporada que estamos vendiendo:
//		String frutas[] = {&quot;Pera&quot;, &quot;Manzana&quot;}
//		Y una tabla con los precios de ambos alimentos:
//		int precios[] = {6, 7};
//		Implementa un programa Java que te muestre la suma total de los
//		kilogramos vendidos de cada uno de los alimentos, y al final muestre las
//		ganancias obtenidas gracias a las ventas de cada uno de ellos. El resultado
//		debe ser el siguiente:
//		Pera -> 64 kg x 6€ = 384€
//		Manzana ->; 99 kg x 7€ = 693€
		int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
		String frutas[] = {"Pera", "Manzana"};
		int precios[] = {6, 7};
		int suma;
		for(int i=0;i<frutas.length;i++) {
			System.out.print(frutas[i]+ " -> ");
			suma=0;
			for(int z=0;z<kilos[i].length;z++) {
				suma=suma+kilos[i][z];
			}
			System.out.print(suma+ "kg x "+precios[i] +" € = "+(suma*precios[i])+"€.");
			System.out.println();
		}
		
		for(String i : frutas) {
			System.out.print(i+", ");
		}
		for(int i : precios) {
			System.out.println(i);
		}
	}
}
