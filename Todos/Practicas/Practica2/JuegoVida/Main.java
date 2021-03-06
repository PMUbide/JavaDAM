package JuegoVida;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos arraylist de Tripleta.
		ArrayList <Tripleta> datos = new ArrayList <Tripleta>();
		//preguntamos filas y columnas y las generaciones, con el m�todo para que sea v�lido.
		System.out.println("****JUEGO DE LA VIDA****\n");
		int filas = comprobarEntrada("filas:");
		int columnas = comprobarEntrada("columnas:");
		int numGeneraciones = comprobarEntrada("generaciones:");
		//Crear tablero donde se ir�n almacenando.
		String [][] tablero = new String[filas][columnas];      //Si introduce fila 0 y columna 0 da ERROR.			
		//rellenar tablero con c�lulas aleatoriamente.
		rellenar(tablero);
		//Empieza el desarrollo del programa.
		int veces = 0; //Variable para controlar las veces que tiene que realizar el bucle
		int celActual = 0; // Variable para almacenar el conteo de celdas que est�n vivas.
		//Realiza el bucle hasta que llegue a la generaci�n indicada
		while(veces <= numGeneraciones) {
			celActual = contarCel(tablero); //Resgistra el conteo de c�lulas
			Tripleta celda = new Tripleta(); //Genera un objeto de tipo Tripleta para llenarlo con la info.
			//Ir rellenando la tripleta
			if(veces == 0) { 
				//Caso inicial de generaci�n 0. Las c�lulas Nuevas tambi�n ser�n las actuales. 
				celda.setNumCelVivas(celActual); 
				celda.setNumCelNuevas(celActual);
				datos.add(celda); //Se a�ade el objeto al ArrayList
			}
			else { 
				//Resto de casos para las dem�s generaciones
				celda.setNumCelVivas(celActual);
				celda.setNumCelNuevas(celActual - (datos.get(datos.size()-1).getNumCelVivas())); //(Celulas actuales) - (celulas gen. Anterior.)
				datos.add(celda);  //Se a�ade el objeto al ArrayList
			}
			//Imprimir informaci�n por pantalla
			System.out.println("GENERACI�N: " + veces);
			//C�digo debbuger
//			System.out.println("HAY UN TOTAL DE: " + datos.get(veces).getNumCelVivas() + " CELULAS VIVAS");
//			if(veces > 0) {
//				System.out.println("VIVAS RESPECTO A LA ANTERIOR GENERACI�N: " + datos.get(veces).getNumCelNuevas());
//			}
			//Visualizar el tablero
			visualizar(tablero);
			System.out.println();
			//Aplica el m�todo principal de creaci�n de c�lulas 
			supervivencia(tablero);																
			//Si No hay celulas vivas, se extingue la colonia
			if(celActual == 0) { 
				System.out.println("COLONIA EXTINGUIDA");
				break;
			}
			veces++; //Suma el contador de los procesos.
		}
		//Si ha llegado al m�ximo de generaciones, dice cuantas quedan vivas.
		if(veces == numGeneraciones + 1) {
			System.out.println("Quedan " + celActual + " vivas.");
		}
		//Por �ltimo, muestra por pantalla la informaci�n del ArrayList.
		System.out.println();
		System.out.println("----------------------------RESUMEN-------------------------------");
		System.out.printf("%-15s %-20s %-15s %n", "Generaci�n", "Celulas vivas", "Celulas respecto al anterior");
		System.out.println("------------------------------------------------------------------");
		for (Tripleta i:datos) {
			System.out.printf("%-3d| %20d| %20s%-3d| %n", i.getGeneracion(), i.getNumCelVivas(), (i.getNumCelNuevas() > 0 ? "+" : " "), i.getNumCelNuevas());
		}
		
	}
	
	
	
	
	
	/**
	 * M�todo para hacer m�s robusto el programa en caso de que el usuario introduzca un valor no posible.
	 * @param String que contiene parte de la pregunta.
	 * @return devuelve como v�lido un n�mero entero mayor de 0.
	 */
	public static int comprobarEntrada(String pregunta) {
		int num = 0;
		boolean correcto = false; //variable para controlar que sea v�lido o no el n�mero
		do {
			try { //Hace un try y recoge el Catch el error,
				Scanner entrada = new Scanner (System.in);
				System.out.println("Introduce el n�mero de " + pregunta);
				num = entrada.nextInt();
				if(num <= 0) {
					System.out.println("error");
					correcto = false;
				}
				else{ //si es correcto pasa a ser true y finaliza el bucle while y llega al return final.
					correcto = true;
				}
			}catch (InputMismatchException e) {
				System.out.println("error");
				correcto = false;
			}
		}while(!correcto); //Mientras no sea correcto no dejar� de pedir el dato al usuario.
		return num;
	}
	
	
	/**
	 * M�todo para visualizar el tablero.
	 * @param tablero
	 */
	public static void visualizar(String[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("|");
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	/**
	 * M�todo para rellenar aleatoriamente el tablero de c�lulas.
	 * @param tablero
	 */
	public static void rellenar(String [][] tabla) {
		//Recorre la tabla y la llenar� aleatoriamente.
		int random; //variable para almacenar el random
		for (int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				random =  (int) (Math.random() * 10); //Se ir� cambiando con una cifra del 0 - 9
				//System.out.println(random); //C�digo debuggear
				if(random <= 1 ) {
					tabla[i][j] = "*"; //Si es 20% a�adir� una c�lula
				}
				else {
					tabla[i][j] = " "; //El restante corresponde al 80% y crea un sitio vac�o.
				}
			}
		}
	}
	
	/**
	 * M�todo que cuenta las celulas vivas en ese momento.
	 * @param tabla
	 * @return integer con el conteo
	 */
	public static int contarCel(String [][] tabla) {
		int contador = 0; //variable para ir haciendo el conteo.
		for (int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				//Si encuentra una viva la cuenta, si no pasa a la siguiente celda
				if(tabla[i][j].equals("*")) { 
					contador++;
				}
			}
		}
		return contador;
	}
	
	/**
	 * M�todo para realizar el proceso de la supervivencia o no de una celda.
	 * @param Recibe el tablero completo
	 */
	public static void supervivencia(String [][] tabla) {
		boolean estado = false; //Variable para registrar si esta viva o muerta.
		int count = 0; //Contador de celulas de alrededor.
		//Tabla Auxiliar donde se ir�n recogiendo los resultados para no ir sobreescibiendo la principal.
		String [][] tablaAux = new String[tabla.length][tabla[0].length];
		for (int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				//Para cada celda primero registra si existe una c�lula o no.
				if(tabla[i][j].equals("*")) {
					estado = true;
					count--; //Le resta uno al contador ya que en la comprobaci�n posterior el bucle har�se contar� a ella misma.
				}
				else {
					estado = false;
				}
				//A continuaci�n recorre alrededor buscando las celulas vivas.
				for (int fila = i - 1; fila < i + 2; fila++) {
					for (int columna = j - 1; columna < j + 2; columna++) {
						//Gracias a ese m�todo se evita que llegue a buscar en una posici�n que est� fuera de los l�mites.
						if (validacionCelda(tabla, fila, columna)) {
							if (tabla[fila][columna].equals("*")) {
								count++;
							}	
						}
					}
				}
				//Ya con el conteo y el estado de la celda, aplica las reglas del juego:
			    //Si est� muerta y tiene 3 vivas alrededor revivir�.
				if (!estado && count == 3) {
					//RESUCITAR.
					tablaAux[i][j] = "*";
				}
				//si est� viva y tiene 2 o 3 vivas sigue viva,
				else if(estado && (count == 2 || count == 3)){
					//SOBREVIVE.
					tablaAux[i][j] = "*";
				}
				//de lo contrario en todos los otros casos muere.
				else {
					//ESTAR� MUERTA.
					tablaAux[i][j] = " ";
				}
				count = 0; //vuelve a restaurar el contador para la siguiente celda recorrida del bucle.
			}
		}
		//Una vez que ha recorrido todo el tablero,
		//Se copia la tabla AUX en la tabla PRINCIPAL para el cambio de generaci�n.
		for (int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = tablaAux[i][j];
			}
		}
	}
	
	/**
	 * M�todo para comprobar que las posiciones del tablero no est�n fuera de los l�mites.
	 * @param recibe el tablero para saber las dimensiones
	 * @param i corresponde a la coordenada X
	 * @param j coresponde a la coordenada Y
	 * @return devuelve TRUE en caso de que no est� fuera de los l�mites
	 */
	public static boolean validacionCelda(String[][] tabla, int i, int j) {
		//Si encuentra una coordenada menor de 0 o mayor que los l�mites de la tabla, devuelve FALSE.
		if(i < 0 || i >= tabla.length || j >= tabla[0].length || j < 0) {
			return false;
		}
		else {
			return true;
		}
	}

}
