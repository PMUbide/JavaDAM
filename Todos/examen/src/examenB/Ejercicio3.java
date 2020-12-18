package examenB;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dada la siguiente tabla multidimensional, la cual almacena el
//		salario mensual de los empleados (cada fila pertenece a un empleado
//		distinto):
//		implementa un m�todo maxFila(int[][] tabla, int fila) que muestre por
//		pantalla el salario m�s elevado de la fila que se indica como par�metro. Si
//		ejecutamos el c�digo con la tabla anterior y fila = 2, deber�a mostrar por
//		pantalla el valor 1300.
		int salarios[][] = { {700, 900, 1300, 800, 790, 850} , {1000, 950, 1080, 1070, 1200, 1100} , {2300, 930,	1800, 1170, 1000, 3000} , {1500, 1950, 1880, 1978, 2200, 2100} };
		int fila = 2; //variable para establecer la fila en la que se quiere buscar el n�mero.
		maxFila(salarios, fila); //llamada al m�todo.
	}
	/**
	 * M�todo que busca el n�mero mayor de la fila que le indiquemos, los PRE son la tabla[][] y la fila, como POST mostrar� un print del n�mero mayor.
	 * @param tabla
	 * @param fila
	 */
	public static void maxFila(int[][] tabla, int fila) {
		int mayor = 0; //Creamos una variable para almacenar el mayor.
		for(int i = 0; i < tabla[fila].length; i++) { //Ser� necesario en este caso s�lo un bucle FOR ya que la fila no var�a y nos viene fijada del main.
			//System.out.println(tabla[fila][i]);    //C�digo debugging
			if(tabla[fila][i]> mayor) { //Si encuentra un valor mayor que la variable, lo que har� es establecer ese n�mero como el nuevo m�s alto.
				mayor= tabla[fila][i];
			}
		}
		System.out.println("El n�mero mayor es: "+ mayor); //Finalemnte lo imprime el pantalla el valor que queda y vuelve al main.
	}

}
