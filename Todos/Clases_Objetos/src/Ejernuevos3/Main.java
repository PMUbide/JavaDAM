package Ejernuevos3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz uno = new Matriz (2, 2);
		Matriz dos = new Matriz (2, 2);
		int[][] sumada = {{1,3},{2,2}};
		for (int i = 0; i < uno.getMatrix().length; i++) {
			for (int j = 0; j < uno.getMatrix().length; j++ ) {
				System.out.print(uno.getMatrix()[i][j]);
			}
			System.out.println();
		}
		uno.addMatrix(sumada);
		for (int i = 0; i < uno.getMatrix().length; i++) {
			for (int j = 0; j < uno.getMatrix().length; j++ ) {
				System.out.print(uno.getMatrix()[i][j]);
			}
			System.out.println();
		}
		uno.multMatriz(sumada);
		for (int i = 0; i < uno.getMatrix().length; i++) {
			for (int j = 0; j < uno.getMatrix().length; j++ ) {
				System.out.print(uno.getMatrix()[i][j]);
			}
			System.out.println();
		}
		
	}

};
