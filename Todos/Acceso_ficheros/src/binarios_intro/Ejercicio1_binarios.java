package binarios_intro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1_binarios {

	public static void main(String[] args) {
		String ruta = "files/binarios/ejercicio1.bin";
		// TODO Auto-generated method stub
		DataOutputStream creado = null;
		try {
			creado = new DataOutputStream(new FileOutputStream (ruta));
			crearFichero(ruta); 
			crearFichero(ruta); 
			//Leer fichero
			leerFichero(ruta);
			creado.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void leerFichero(String nombre) {
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(nombre));
			try {
				/*
				 * Se escriben por pantalla las dos líneas que encabezan la tabla de ventas
				 */
				System.out.println("Cursadas Aprobadas  Suspendidas  Media");
				System.out.println("========  =======  ========  ======");
				while(true) {
					/*
					 * Se esriben por pantalla los datos de una de las ventas, tras
					 * haberlos leídos del fichero asociado a [f].
					 */
					int cursadas = f.readInt();
					int aprobadas = f.readInt();
					int suspendidas = f.readInt();
					double media = f.readDouble();
					System.out.printf(" %6d%10d%9d%10.2f%n", cursadas, aprobadas, suspendidas, media);
				}
				
			} catch(EOFException e) {}
			/*
			 * Se libera el fichero asociado al objeto [f]
			 */
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en operación de E/S con el fichero ");
		}
	}
	
	
	
	
	
	private static void crearFichero(String nombre) {
		try {
			DataOutputStream f = new DataOutputStream(new FileOutputStream(nombre));
			escribir(f, 20, 11, 9, 5.25);
			escribir(f, 20, 12, 8, 6.7);
			escribir(f, 20, 5, 15, 8.1);
			escribir(f, 20, 6, 14, 4.66);
			//Cerrar fichero
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en operación de E/S con el fichero ");
		}
	}
	
	
	
	
	private static void escribir(DataOutputStream f, int cursadas, int aprobadas,
			int suspendidas, double media) {
			try {
				f.writeInt(cursadas);
				f.writeInt(aprobadas);
				f.writeInt(suspendidas);
				f.writeDouble(media);
			} catch (IOException e) {
				System.out.println("Error al escribir en el fichero");
			}
	}

}
