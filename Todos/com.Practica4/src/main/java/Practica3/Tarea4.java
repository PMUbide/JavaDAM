package Tarea4;

public class Tarea4 {

	public static void main(String[] args) {
		//se imprime el resultado de llamar al método
		System.out.println(selfish("Wafles", "elf"));
	}
	
	/**
	 * Método que devuelve true si en el primer String se encuentran
	 * las letras que se le mandan en el segundo String de parámetro.
	 * En caso contrario devuelve false;
	 * @param str -> Palabra que se quiere comprobar
	 * @param elf -> patrón para hacer la búsqueda de sus caracteres
	 * @return -> devuelve true si se cumple o false en caso contrario.
	 */
	public static boolean selfish(String str, String elf) {
		//La condición base será que haya llegado a una longitud 0 de "elf"
		//Por lo que significará que ha encontrado todas las anteriores y
		//devuelve un true.
		if(elf.length() == 0) return true;
		//Comprueba con indexOf si está o no la primera letra de elf.
		if(str.indexOf(elf.substring(0, 1)) != -1) {
			//si la encuentra se vuelve a llamar eliminando esa primera letra
			return selfish(str, elf.substring(1));
		}
		//si no encuentra directamente la letra devuelve false ya que no
		//hace falta que comprueba las demas de "elf"
		return false;
		
	}
}
