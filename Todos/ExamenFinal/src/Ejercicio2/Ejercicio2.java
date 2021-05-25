package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Disponemos del fichero Divorcios.csv, que contiene la información sobre los divorcios
//		en España según exista o no separación previa, separado por localidades y años (estos datos
//		pertenecen al Instituto Nacional de Estadística). Queremos desarrollar un programa Java que sea
//		capaz de mostrar por pantalla:
//		1. El número total de divorcios CON separación previa en el año 2019.
//		2. El número total de divorcios SIN separación previa en el año 2018.
//		3. La localidad cuyo número de divorcios (suma de ambos) desde 2013 hasta 2019 haya sido
//		mayor.
		String ruta = "files/divorcios.csv";
		//Método muestra el apartado 1
		muestraDatos(ruta, "si" , 2019);
		//Método muestra el apartado 2
		muestraDatos(ruta, "no" , 2018);
		//Método para mostrar la localidad con más divorcios.
		muestraLocalidad(ruta);
		
	}
	
	/**
	 * Método que recibe una ruta del fichero csv.
	 * @param ruta -> ruta del fichero
	 * @param condicion -> Debe ser "si" para separación previa, y "no" para lo contrario.
	 * @param anno -> El año en el que se desea buscar la información.
	 */
	public static void muestraDatos(String ruta, String condicion, int anno) {
		try {
			Scanner f = new Scanner(new File(ruta));
			String linea;
			int totalNum = 0; // variable donde se va a ir sumando el número.
			int cont = 0; //variable para no contar la cabecera del fichero
			while(f.hasNextLine()) {
				linea = f.nextLine();
				if(cont > 0) {
					String[] lineaSplit = linea.split(";");
					//Ahora analizaremos la información para ir sumando o no.
					if(lineaSplit[1].equalsIgnoreCase(condicion)) {
						if(Integer.parseInt(lineaSplit[2]) == anno) {
							//Quitamos los puntos de los números.
							lineaSplit[3] = lineaSplit[3].replace(".", "");
							//hacemos el sumatorio.
							totalNum += Integer.parseInt(lineaSplit[3]);
						}
					}
				}
				cont++;
			}
			//Muestra los casos:
			System.out.println("El número total de divorcios en " + anno +
					(condicion.equals("si") ? " con " : " sin ") +
					"separación previa, ha sido de "+ totalNum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void muestraLocalidad(String ruta) {
		//Creamos HashMap para ir almacenando los nombres como keys.
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			Scanner f = new Scanner(new File(ruta));
			int cont = 0;
			String linea = "";
			while(f.hasNextLine()) {
				linea = f.nextLine();
				//condicion para eliminar la linea de cabecera
				if(cont > 0) {
					String[] lineaSplit = linea.split(";");
					//primero comprueba si el año es correcto
					int anno = Integer.parseInt(lineaSplit[2]);
					if(anno >= 2013 && anno <= 2019) {
						//Quitamos los numeros que acompaña al nombre, siempre ocupan 3 posiciones.
						lineaSplit[0] = lineaSplit[0].substring(3);
						//quitamos los puntos del número
						lineaSplit[3] = lineaSplit[3].replace(".", "");
						int casos = 0;
						//Si el String de casos no está vacio lo cambia al valor
						if(!lineaSplit[3].equals("")) {
							casos = Integer.parseInt(lineaSplit[3]);
						}
						//si no lo contiene lo crea nuevo.
						if(!map.containsKey(lineaSplit[0])) {
							map.put(lineaSplit[0], casos);
						}else {
							//si ya lo contiene le va añadiendo al valor.
							map.put(lineaSplit[0], map.get(lineaSplit[0]) + casos);
						}
					}
				}
				cont++;
			}
			//Muestra la que más creando una lista a partir de un hasmap y ordenandola:
			List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
			//método de ordenar
			list.sort(Entry.comparingByValue());
			System.out.println("La ciudad con más casos es " +
					list.get(list.size() - 1).getKey() + " con " + list.get(list.size() - 1).getValue() + " casos.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
