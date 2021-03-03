package Ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] matriz = new double[2][2];
		matriz[0][0] = 1.5;
		matriz[0][1] = 1.6;
		matriz[1][0] = 1.7;
		matriz[1][1] = 1.8;
		int columna = matriz.length;
		int fila = matriz[0].length;
//		System.out.println("fila " + fila + " columna " + columna);
		DataOutputStream nuevo;
		try {
			nuevo = new DataOutputStream(new FileOutputStream ("files/ejercicio1_matriz.bin"));
			nuevo.writeInt(columna);
			nuevo.writeInt(fila);
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					nuevo.writeDouble(matriz[i][j]);
				}
			}
			nuevo.close();
			RandomAccessFile f = new RandomAccessFile("files/ejercicio1_matriz.bin", "r");
			while(true) {
				System.out.println("¿Que posición quieres leer?");
				Scanner in = new Scanner(System.in);
				int posicion = in.nextInt();
				accedeMatriz(f, posicion);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void accedeMatriz(RandomAccessFile f, int posicion) {
		int dimensiones = (2*Integer.SIZE + Double.SIZE*posicion)/8;
		
		
//		int BYTES_dimensiones = (2*Integer.SIZE + Double.SIZE*posicion)/8;
		try {
			f.seek(0);
			int fila = f.readInt();
			System.out.println("Número de filas: " + fila);
			dimensiones = (Integer.SIZE )/8;
			f.seek(dimensiones);
			int columna = f.readInt();
			System.out.println("Número de columnas: " + columna);
			dimensiones = (2*Integer.SIZE + posicion*Double.SIZE)/8;
			f.seek(dimensiones);
			double dato = f.readDouble();
			System.out.println("El dato es " + dato);
		} catch (EOFException e) {}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
