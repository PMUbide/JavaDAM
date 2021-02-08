package binarios_intro;

import java.io.*;

public class BinarioDirecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/binarios/directo.bin";
		//creamos o sobrescribimos si ya existe
		crearFichero(ruta);
		//Leemos lo que hay dentro
		leerFichero(ruta);
		//Escribimos algo nuevo en una posicion.
		escribirEnPosicion(ruta, 4, 10, 5, 20, 20.20);
		//Lo volvemos a leer
		leerFichero(ruta);
	}

	
	public static void escribirEnPosicion(String ruta, int posicion, int producto,
			int cliente, int cantidad, double precio) {
		try {
			RandomAccessFile f = new RandomAccessFile(ruta, "rw");
			try {
				posicionar(f, posicion);
				escribir(f, producto, cliente, cantidad, precio);
				f.close();
		} catch (IOException e) {}
		}catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado, ERROR");
		}
	}
	

	public static void leerFichero(String nombre) {
		try {
			RandomAccessFile f = new RandomAccessFile(nombre, "r");
			try {
				System.out.println("VENTA  PRODUCTO  CLIENTE  CANTIDAD  PRECIO");
				System.out.println("=====  ========  =======  ========  ======");
				int cuenta = 0;
//				posicionar(f, 4);
				while(true) {
					int producto = f.readInt();
					int cliente = f.readInt();
					int cantidad = f.readInt();
					double precio = f.readDouble();
					cuenta++;
					System.out.printf("%4d%9d%10d%9d%10.2f\n", cuenta, producto, cliente,
							cantidad, precio);
				}
			} catch (EOFException e) {}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en la operación E/S con el fichero");
		}	
	}
	
	
	public static final int BYTES_VENTA = (3*Integer.SIZE + Double.SIZE)/8;
	
	public static void posicionar(RandomAccessFile f, int numVentas) {
			try {
				f.seek(BYTES_VENTA*(numVentas - 1));
			} catch (IOException e) {
				System.out.println("FAILED");
			}
	}
	
	public static void escribir(RandomAccessFile f, int producto, int cliente,
			int cantidad, double precio) {
		try {
			f.writeInt(producto);
			f.writeInt(cliente);
			f.writeInt(cantidad);
			f.writeDouble(precio);
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero");
		}
	}
	
	public static void crearFichero(String ruta) {
		try {
			RandomAccessFile f =  new RandomAccessFile(ruta, "rw");
			//RESETEA lo que haya dentro.
			f.setLength(0);
			escribir(f, 102, 14201, 7, 641.12);
			escribir(f, 107, 9641, 25, 604.12);
			escribir(f, 282, 14201, 6, 604.3);
			escribir(f, 107, 61734, 10, 601);
			escribir(f, 107, 61734, 8, 600.12);
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
