package examenB;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dada la siguiente tabla multidimensional, la cual almacena el
//		salario mensual de los empleados (cada fila pertenece a un empleado
//		distinto):
//		implementa un método maxFila(int[][] tabla, int fila) que muestre por
//		pantalla el salario más elevado de la fila que se indica como parámetro. Si
//		ejecutamos el código con la tabla anterior y fila = 2, debería mostrar por
//		pantalla el valor 1300.
		int salarios[][] = { {700, 900, 1300, 800, 790, 850} , {1000, 950, 1080, 1070, 1200, 1100} , {2300, 930,	1800, 1170, 1000, 3000} , {1500, 1950, 1880, 1978, 2200, 2100} };
		int fila = 2; //variable para establecer la fila en la que se quiere buscar el número.
		maxFila(salarios, fila); //llamada al método.
	}
	/**
	 * Método que busca el número mayor de la fila que le indiquemos, los PRE son la tabla[][] y la fila, como POST mostrará un print del número mayor.
	 * @param tabla
	 * @param fila
	 */
	public static void maxFila(int[][] tabla, int fila) {
		int mayor = 0; //Creamos una variable para almacenar el mayor.
		for(int i = 0; i < tabla[fila].length; i++) { //Será necesario en este caso sólo un bucle FOR ya que la fila no varía y nos viene fijada del main.
			//System.out.println(tabla[fila][i]);    //Código debugging
			if(tabla[fila][i]> mayor) { //Si encuentra un valor mayor que la variable, lo que hará es establecer ese número como el nuevo más alto.
				mayor= tabla[fila][i];
			}
		}
		System.out.println("El número mayor es: "+ mayor); //Finalemnte lo imprime el pantalla el valor que queda y vuelve al main.
	}

}
