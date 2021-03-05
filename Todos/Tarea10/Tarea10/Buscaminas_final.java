import java.util.*;
public class Buscaminas_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRimero preguntar por la tabla.
		Scanner entrada=new Scanner(System.in);
		//int p = entrada.nextint();
		int f = 5; //FILAS
		int	c = 5; //COlOLUMNAS
		String tabla [][]=new String[f][c]; 
		//Rellenar con puntos todo.
		fill_puntos(tabla);
		visualizar(tabla); //Visualizar la tabla
		//Ahora nos pedirá jugar con una probabilidad.
		//int p=30;
		//Ahora ir rellenando con asteriscos.
		//fill_bombas(tabla,p);
		//MEtodo para poner bombas nosotros.
		fill_minas(tabla);
		
		visualizar(tabla);
		//A continuación crear una tabla para mostrar las "X" y empezar a jugar.
		String tabla_mostrar[][]=fill_x(tabla);
		visualizar(tabla_mostrar);
		boolean bombitas=false; //un bollean para hacer el bucle y repetir mientras haya bombas.
		
		while(bombitas==false) {
		
			System.out.println("Introduce una fila: ");
			int fila=entrada.nextInt();
			fila=fila-1;
			System.out.println("Introduce una columna: ");
			int col=entrada.nextInt();
			col=col-1;
			System.out.println(tabla.length);
			if(tabla[fila][col].equals("*")) {
				System.out.println("BOMBA! - HAS PERDIDO.");
				tabla[fila][col]="O";
				visualizar(tabla);
				bombitas=true;
			}
			else {
				int bombas=0; //Contador de bombas
				//un if si el punto está en las esquina sup izq.
				if (fila==0 && col==0 && tabla_mostrar[fila][col].equals("x")) {
					bombas=0;
					if(tabla[fila][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col+1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				//un if para las otras esquinas superior derecha.
				else if(fila==0 && col==tabla[col].length-1 && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col-1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				
				//un if para la esquina inferior izq
				else if(fila==tabla.length-1 && col==0 && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col+1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				//un if para la esquina inferior derecha.
				else if(fila==tabla.length-1 && col==tabla[col].length-1 && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col-1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				
				//unos bucles para la fila superior.
				else if(fila==0 && (col!=tabla[col].length-1 || col !=0) && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col].equals("*")) {
						bombas++;
					}
					if(tabla[fila+1][col-1].equals("*")) {
						bombas++;
					}
					if(tabla[fila+1][col+1].equals("*")) {
						bombas++;
					}
					
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				//IF para la fila izquierda
				else if(fila==0 && (col!=tabla[col].length-1 || col !=0) && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila-1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col-1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				
				//UN IF para la fila derecha.
				else if(col==tabla[col].length-1 && (fila!=tabla.length-1 || fila!=0) && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila+1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col-1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				
				//Fila inferior abajo.
				else if(fila==tabla.length-1 && (col!=tabla[col].length-1 || col !=0) && tabla_mostrar[fila][col].equals("x")){
					bombas=0;
					if(tabla[fila][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col-1].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col].equals("*")) {
						bombas++;
					}
					if (tabla[fila-1][col+1].equals("*")) {
						bombas++;
					}
					if (tabla[fila][col+1].equals("*")) {
						bombas++;
					}
					System.out.println(bombas);
					tabla_mostrar[fila][col]=String.valueOf(bombas);
					visualizar(tabla_mostrar);
				}
				
//				else if(tabla_mostrar[fila][col].equals("x")) {
//					break;
//				}
				
				
				else  {
					if(tabla_mostrar[fila][col].equals("x")) {
						bombas=0;
						if(tabla[fila-1][col-1].equals("*")) {
							bombas++;
						}
						if (tabla[fila-1][col].equals("*")) {
							bombas++;
						}
						if (tabla[fila-1][col+1].equals("*")) {
							bombas++;
						}
						if (tabla[fila][col+1].equals("*")) {
							bombas++;
						}
						if (tabla[fila+1][col+1].equals("*")) {
							bombas++;
						}
						if (tabla[fila+1][col].equals("*")) {
							bombas++;
						}
						if (tabla[fila+1][col-1].equals("*")) {
							bombas++;
						}
						if (tabla[fila][col-1].equals("*")) {
							bombas++;
						}
						System.out.println(bombas);
						tabla_mostrar[fila][col]=String.valueOf(bombas);
						visualizar(tabla_mostrar);
					
					}	
					else System.out.println("Ya estaba elegido");
				}
			
				
				
			
			}
			int contador=0;
			for(int i=0;i<tabla_mostrar.length;i++) {
				for(int j=0;j<tabla_mostrar.length;j++) {
					if(tabla_mostrar[i][j].equals("x"));
						contador++;
						
							
							
						
				}
			}
			if(contador==0) {
				bombitas=true;
			}
		}
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	public static String[][] fill_x(String tabla[][]) {
		String tabla_mostrar[][]=new String [tabla.length][tabla.length];
		for(int i=0;i<tabla_mostrar.length;i++) {
			for(int z=0;z<tabla_mostrar.length;z++) {
				tabla_mostrar[i][z]="x";
			}
		}
		return tabla_mostrar;
	}
	
	
	
	
	
	public static String [][] fill_bombas(String tabla[][],int p){
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla.length;j++) {
				double var= (double) Math.random()*100;
				int value = (int)var;
				if(value<p) {
					System.out.println(value);// Comprobar el random
					tabla[i][j]="*";
				}
			}
		}
		return tabla;
	}
	
	
	public static String[][] fill_puntos(String tabla[][]) {
		for(int i=0;i<tabla.length;i++) {
			for(int z=0;z<tabla.length;z++) {
				tabla[i][z]="·";
			}
		}
		return tabla;
	}
	
	public static void visualizar(String tabla[][]) {
		System.out.println();
		for(int i=0;i<tabla.length;i++) {
			for(int z=0;z<tabla.length;z++) {
				System.out.print(tabla[i][z]+" ");
			}
			System.out.println();
		}
	}
	
	public static String[][] fill_minas(String tabla[][]){
		tabla[0][1]="*";
		tabla[1][1]="*";
		tabla[4][2]="*";
		tabla[3][2]="*";
		tabla[2][3]="*";
		tabla[0][3]="*";
		return tabla;
	}

}
