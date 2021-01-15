package Ejernuevos3;

public class Matriz {

	private int rows;
	private int columns;
	private int [][] matrix; 
	
	public Matriz(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int [rows][columns];
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++ ) {
				this.matrix[i][j] = 0;
			}
		}
	}
	
	
	/**
	 * Devuelve FILAS
	 * @return
	 */
	public int getNumberRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	/**
	 * Devuelve COLUMNAS
	 * @return
	 */
	public int getNumberColumns() {
		return columns;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	
	public void setElement(int x, int j, int element) {
		matrix[x][j] = element;
	}
	
	public void addMatrix(int[][] matriz) {
		if(matriz.length == this.matrix.length) {
			for (int i = 0; i < this.matrix.length; i++) {
				for (int j = 0; j < matriz.length; j++ ) {
					this.matrix[i][j] += matriz[i][j];
				}
			}
		}
		else {
			System.out.println("No se puede sumar, no tiene las mismas dimensiones");
		}
	}
	
	public void multMatriz(int [][] matriz) {
		if(matriz.length == this.matrix.length) {
			for (int i = 0; i < this.matrix.length; i++) {
				for (int j = 0; j < matriz.length; j++ ) {
					this.matrix[i][j] *= matriz[i][j];
				}
			}
		}
		else {
			System.out.println("No se puede multiplicar, no tiene las mismas dimensiones");
		}
		
	}
	
	
}
