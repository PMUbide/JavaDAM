package Aviones;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/Airplane_Crashes_and_Fatalities_Since_1908.csv";
		File f = new File(ruta);
		ArrayList<Accidentes> datos = new ArrayList<>();
		// Leer el fichero
		try {
			Scanner archivo = new Scanner(f);
			int conteo = 0;
			while (archivo.hasNextLine()) {
				String[] lineas = archivo.nextLine().split(",");
//				for(int i = 0; i < lineas.length; i++) {
//					System.out.print(lineas[i] + " ; ");
//				}
				/*
				 * [0] fecha [1] hora if [2] substring (0,1).equals(""") -> [2]+[3] lugar [7]
				 * tipoAvion else [2] lugar [6] tipoAvion
				 */
				// Iremos almacenando las columnas en las variables
				String fecha = lineas[0];
				String hora = lineas[1];
				// método para dejar todas las horas iguales
				hora = arreglarHora(hora);
				String lugar, tipoAvion;
				if (!lineas[2].equals("") && lineas[2].substring(0, 1).equals("\"") && !lineas[4].equals("")
						&& !lineas[4].substring(lineas[4].length() - 1, lineas[4].length()).equals("\"")) {
					lugar = lineas[2] + ", " + lineas[3];
					tipoAvion = lineas[4];
				} else if (!lineas[2].equals("") && lineas[2].substring(0, 1).equals("\"") && !lineas[4].equals("")
						&& lineas[4].substring(lineas[4].length() - 1, lineas[4].length()).equals("\"")) {
					lugar = lineas[2] + ", " + lineas[3] + lineas[4];
					tipoAvion = lineas[5];
				} else {
					lugar = lineas[2];
					tipoAvion = lineas[3];
				}
//				System.out.println("Fecha " + fecha + ". hora: " + hora + ". lugar " + lugar + " AVION: "+ tipoAvion);
				if (conteo > 0) {
					Accidentes accidente = new Accidentes(fecha, lugar, hora, tipoAvion);
					datos.add(accidente);
				}
				conteo++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}

		/* Enseñar el vector */
//		for(Accidentes i : datos) {
//			System.out.println(i.toString());
//			
//		}
		/* Saca el avion que mas veces aparece */
		System.out.println("\nAvion que mas veces aparece: ");
		maxAccidentes(datos);
//		/* Saca el lugar que tiene más accidentes */
//		System.out.println("\nLugar con más accidentes: ");
//		maxLugar(datos);
//		String eleccion = "matinal";
//		System.out.println("\nAccidentes por la mañana: ");
//		accidentesHorarios(datos, eleccion);
//		eleccion = "tarde";
//		System.out.println("\nAccidentes por la tarde: ");
//		accidentesHorarios(datos,eleccion);
//		eleccion = "noche";
//		System.out.println("\nAccidentes por la noche: ");
//		accidentesHorarios(datos,eleccion);
//		//Ahora los años y los accidentes.
//		System.out.println("\nLos accidentes aéreos por año: ");
//		accidentesAnuales(datos);
		
		
		
		
//		
		//Guardar el arraylist en un fichero de objetos.
		 File fichero= new File("files/aviones_datos.dat");
//		 try {
//	            if(fichero.createNewFile()) {
//	                System.out.println("Fichero de objetos creado correctamente");
//	            } else {
//	                System.out.println("El fichero de objetos se ha sobreescrito");
//	            }
//	            ObjectOutputStream oosFP = new ObjectOutputStream(new FileOutputStream(fichero));
////	            Accidentes ac = new Accidentes("2020", "abc", "10", "gordo");
////	            oosFP.writeObject(ac);
//	            for(Accidentes	 i: datos) {
//	                oosFP.writeObject(i);
//	            }
//	            oosFP.close();
//	        } catch (IOException e) {
//				// TODO Auto-generated catch block
//	        	System.out.println("FAIL!");
//	        }
		//LEER
		ArrayList<Accidentes> lista = new ArrayList<>();

		 try {
			 
	            ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream(fichero));
	            while(oisFP.readObject() != null) {
//	            	Accidentes a = (Accidentes) oisFP.readObject();
	                lista.add((Accidentes)oisFP.readObject());
//	            	System.out.println(a);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("No se ha importado ningún objeto");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("ERROr");
	        } catch (EOFException e) {
	            System.out.println("Objetos importados correctamente.");
	        } catch (IOException e) {
	        	System.out.println("FAILED");
	            //e.printStackTrace();
	        }
		 
		 
//		 for (Accidentes i : lista) {
//			System.out.println(i);
//		 }
		
		HashMap<String, Integer> aviones_lista = new HashMap<>();
		aviones_lista = crearAviones(lista);
		for (String i : aviones_lista.keySet()) {
				System.out.println("key: " + i + " value: " + aviones_lista.get(i));
		}
		
		
		
		
		
		
//		aviones_lista.entrySet().forEach(entry->{
//			if(entry.getValue() > 10) {
//				System.out.println(entry.getKey() + " " + entry.getValue());  
//				
//			}
//		 });
		 
		
	}
	
	 public static HashMap<String, Integer> crearAviones(ArrayList<Accidentes> lista) {
		    HashMap<String, Integer> aviones = new HashMap<>();
		    for (Accidentes i : lista) {
		        if (aviones.isEmpty()) {
		            aviones.put(i.getTipoAvion(), 1); 
		        } else if (aviones.containsKey(i.getTipoAvion())) {
		            aviones.replace(i.getTipoAvion(), aviones.get(i.getTipoAvion() + 1));
		        } else {
		            aviones.put(i.getTipoAvion(),1); 
		        }
		    }
		    return aviones;
		}

	/**
	 * Método que devuelve TRUE si NO existe anteriormente ese año en el arraylist.
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean existenciaAnual(ArrayList <AccidenteAnual> a, String b) {
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).getAnno().equals(b)) {
				return false;
			}
		}
		return true;
	}
	
	public static void accidentesAnuales(ArrayList <Accidentes> a) {
		ArrayList <Accidentes> copia = new ArrayList <>(a);
		ArrayList <AccidenteAnual> veces = new ArrayList <>();
		int contador = 0;
		for(int i = 0; i < copia.size(); i++) {
			String fecha = copia.get(i).getFecha();
			String [] fechaSplit = fecha.split("/");
			String anno = fechaSplit[2];
			for(int j = 0; j < copia.size(); j++) {
				if(annosEjecucion(copia, i).equals(annosEjecucion(copia, j))){
					contador++;
				}
			}
			
			if(existenciaAnual(veces, anno)) {
				AccidenteAnual nuevo = new AccidenteAnual(anno, contador);
				veces.add(nuevo);
			}
			contador = 0;
		}
		System.out.println("Total de accidentes: " + veces.size());
		for(int i = 0; i < veces.size(); i++) {
			System.out.println("El año " + veces.get(i).getAnno() + " ha tenido " + veces.get(i).getVeces());
		}
		
		
	}
	
	/**
	 * Método que devuelve el año del atributo fecha del objeto Accidente en un index.
	 * @param a
	 * @param index
	 * @return
	 */
	public static String annosEjecucion(ArrayList <Accidentes> a, int index) {
		if(!a.get(index).getFecha().equals("")){
			String fecha = a.get(index).getFecha();
			String [] fechaSplit = fecha.split("/");
			return fechaSplit[2];
			
		}
		return "";
	}
	
	
	
	/**
	 * Método para registrar bien la hora en los campos.
	 * @param hora
	 * @return
	 */
	public static String arreglarHora(String hora) {
		while (hora.length() > 5) {
			hora = hora.substring(1);
		}
//		System.out.println(hora);
		if (hora.length() == 5) {
			hora = hora.replace(hora.substring(2, 3), ":");
		}
		hora = hora.trim();
		return hora;
	}
	
	/**
	 * Método que según que parámetro del día devuelve el número total de accidentes que han tenido lugar.
	 * @param a
	 * @param horario
	 */
	public static void accidentesHorarios(ArrayList<Accidentes> a, String horario) {
		int veces = 0;
		int contador = 0;
		String elegido = "";
		for (int i = 0; i < a.size(); i++) {
			String time = a.get(i).getHora();
			if (!time.equals("")) {
				String[] horasMin = time.split(":");
				int[] tiempo = new int[2];
				// pasarlos a int.
				tiempo[0] = Integer.parseInt(horasMin[0]);
				tiempo[1] = Integer.parseInt(horasMin[1]);
				if (horario.equals("matinal")) {
					if ((tiempo[0] >= 6 && tiempo[0] < 13 )|| (tiempo[0] == 13 && tiempo[1] == 0)) {
//						System.out.println("hora: " + tiempo[0] + " minuto " + tiempo[1] + " dentro de matinal");
						contador++;
					}
				} else if (horario.equals("tarde")) {
					if ((tiempo[0] == 13 && tiempo[1] > 0) || (tiempo[0] > 13 && tiempo[0] < 20) || (tiempo[0] == 20 && tiempo[1] == 0)) {
//						System.out.println("hora: " + tiempo[0] + " minuto " + tiempo[1] + " dentro de tarde");
						contador++;
					}
				} else {
					if ((tiempo[0] == 20 && tiempo[1] > 0) || (tiempo[0] > 20) || (tiempo[0] < 6)) {
//						System.out.println("hora: " + tiempo[0] + " minuto " + tiempo[1] + " dentro de tarde");
						contador++;
					}
				}
			}
		}
		System.out.println("En horario " + horario + " veces " + contador);
	}

	/**
	 * Método para buscar la localización que más se repite, Sin contar un espacio
	 * en blanco.
	 * 
	 * @param a
	 */
	public static void maxLugar(ArrayList<Accidentes> a) {
		int veces = 0;
		int contador = 0;
		String elegido = "";
		for (int i = 0; i < a.size(); i++) {
			String caido = a.get(i).getLugar();
//			System.out.println(caido);
//			System.out.println(i);
			for (int j = 0; j < a.size(); j++) {
				if (a.get(j).getLugar().equals(caido)) {
					contador++;
				}
			}
			if (contador > veces && !caido.equals("")) {
				veces = contador;
				elegido = caido;
			}
			contador = 0;
		}
		System.out.println("Lugar: " + elegido + " veces " + veces);

	}

	/**
	 * Método que saca el avión con más accidentes
	 * @param a
	 */
	public static void maxAccidentes(ArrayList<Accidentes> a) {
		/* Saca el avion que mas veces aparece */
		int veces = 0;
		int contador = 0;
		String elegido = "";
		for (int i = 0; i < a.size(); i++) {
			String caido = a.get(i).getTipoAvion();
//			System.out.println(caido);
//			System.out.println(i);
			for (int j = 0; j < a.size(); j++) {
				if (a.get(j).getTipoAvion().equals(caido)) {
					contador++;
				}
			}
			if (contador > veces) {
				veces = contador;
				elegido = caido;
			}
			contador = 0;
		}
		System.out.println("Avion: " + elegido + " veces " + veces);

	}

}
