package binarios_intro;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * La clase ofrece un método main que permite construir un programa que crea
 * un fichero de acceso direto que almacena una colección de ventas. Muestra
 * por pantalla su contenido total y después accede a la venta nº 3 para
 * volver a mostrarla.
 */
public class AccesoDirecto_prueba {
	
	/*
	 * El valor de la constante [bytesVenta] es igual al número de bytes que ocupan
	 * los datos que definen una venta: tres datos de tipo [int] y un dato
	 * de tipo [double]
	 */
	private static final int BYTES_VENTA = (3*Integer.SIZE + Double.SIZE)/8;
	
	/**
	 * Pre: numVenta >= 1 y numVenta <= f.length()/BYTES_VENTA
	 * Post: Se posiciona para leer o modificar la venta número [numVenta] 
	 * 		almacenada en el fichero de ventas asociado a [f].
	 */
	public static void posicionar(RandomAccessFile f, int numVentas) {
		try {
			f.seek(BYTES_VENTA*(numVentas - 1));
		} catch (IOException e) {
			System.out.println("Error al posicionarnos en el fichero");
		}
	}
	
	/**
	 * Pre: el objeto [f] está asociado a un fichero en modo escritura de datos.
	 * Post: Escribe, en el fichero asociado a [f], los datos [producto],
	 * 		[cliente], [cantidad] y [precio] todos ellos codificados en binario.
	 */
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
	
	/**
	 * Pre: ---
	 * Post: Crea un fichero de ventas denominado [nombre] y almacena en él los
	 * 		datos correspondientes a una colección de ventas. Cada venta está
	 * 		caracterizada por una secuencia de cuatro valores: producto,
	 * 		cliente, cantidad y precio.
	 */
	public static void crearFichero(String nombre) {
		try {
			/*
			 * Crea un objeto [RandomAccessFile] al que se asocia un fichero deno
			 * minado [nombre] en modo "rw" (lectura y escritura, read, write).
			 */
			RandomAccessFile f = new RandomAccessFile(nombre, "rw");
			/*
			 * Elimina todos los datos que pudiera almacenar, en su caso, el fichero
			 * asociado a [f] (lo limpia por completo).
			 */
			f.setLength(0);
			/*
			 * Escribe en el fichero asociado a [f] los datos de ventas mostrados
			 * en la tabla.
			 */
			escribir(f, 102, 14201, 7, 641.12);
			escribir(f, 107, 9641, 25, 604.12);
			escribir(f, 282, 14201, 6, 604.3);
			escribir(f, 107, 61734, 10, 601);
			escribir(f, 107, 61734, 8, 600.12);
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en la operación E/S con el fichero");
		}
	}
	
	/**
	 * Pre: Existe un fichero de ventas denominado [nombre]
	 * Post: Presenta por pantalla los datos almacenados en un fichero de ventas 
	 * 		denominado [nombre]. En el caso de que no haya nigún fichero accesible con
	 * 		ese nombre informa con un mensaje de la circunstancia.
	 */
	public static void leerFichero(String nombre) {
		try {
			/*
			 * Se crea un objeto [RandomAccessFile] al que se asocia un fichero
			 * denominado [nombre]
			 */
			RandomAccessFile f = new RandomAccessFile(nombre, "r");
			try {
				/*
				 * Se escriben por pantalla las dos líneas que encabezan la tabla
				 * de ventas.
				 */
				System.out.println("VENTA  PRODUCTO  CLIENTE  CANTIDAD  PRECIO");
				System.out.println("=====  ========  =======  ========  ======");
				int cuenta = 0;
				while(true) {
					/*
					 * Se escriben por pantalla los datos de una de las ventas, tras 
					 * haberlos leído del fichero asociado a [f]
					 */
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
	
	/**
	 * Pre: ---
	 * Post: Presenta por pantalla los datos que definen la venta ubicada en la
	 * 		posición [número] del fichero de ventas asociado al nombre [nombre].
	 */
	public static void inspeccionar(String nombre, int numero) {
		try {
			/*
			 * Se crea un objeto [RandomAccessFile] al que se asocia un fichero
			 * denominado [nombre]
			 */
			RandomAccessFile f = new RandomAccessFile(nombre, "r");
			/*
			 * Sitúa el punto de trabajo en elf ichero asociado a [f] en la
			 * venta ubicada en la posición [numero]
			 */
			posicionar(f, numero);
			/*
			 * Lee los cuatro datos que definen la venta
			 */
			int producto = f.readInt();
			int cliente = f.readInt();
			int cantidad = f.readInt();
			double precio = f.readDouble();
			System.out.printf("INSPECCIONAMOS VENTA Nº " + numero + 
					" --> " + "%9d%10d%9d%10.2f\n", producto, cliente,
					cantidad, precio);
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en la lectura de datos del fichero");
		}
		
	}
	
	/**
	 * Pre: ---
	 * Post: Crea un fichero indexado de ventas y presenta por pantalla un listado
	 * 		de la información almacenada en él. Posteriormente, accede a la venta
	 * 		número 3 y la muestra por pantalla.
	 */
	public static void main(String[] args) {
		String nombreFichero = "Ficheros/ventas.bin";
		crearFichero(nombreFichero);
		leerFichero(nombreFichero);
		inspeccionar(nombreFichero, 3);
	}
}
