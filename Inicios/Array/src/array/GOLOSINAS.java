package array;

import java.util.Scanner;

public class GOLOSINAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner (System.in);
		String productos[][]=  {{"Kit-Kat","Lacasitos","KinderBueno"}, {"Chicles","Oreos","Haribo"}, {"Burn","Red bull","Monster"}};
		double precios[][]=  {{1.50,1.20,2.00}, {1.60,2.00,2.50}, {3.10,2.80,3.00}};
		int cantidad[][]={{5,5,5}, {5,5,5}, {5,5,5}};
		
		System.out.println("Bienvenido a la máquina de golosinas.");
		System.out.println("Ahora introduce OPCIONES: 1.Pedir algo // 2. Mostrar cantidades // 3. Rellenar // 4. Apagar");
		int opcion=0;
		double resto=0.0;
		do {
			do  {
				System.out.println("Introduce OPCIONES: 1.Pedir algo // 2. Mostrar cantidades // 3. Rellenar // 4. Apagar");
				opcion=in.nextInt();
				if( opcion ==1 || opcion==2 || opcion==3 || opcion==4) {
					break;
				}
				System.out.println("Vuelve a introducir un número válido.");
			}while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);
			
			switch(opcion) {
				case 1:
					System.out.println(resto);
//					System.out.println("Introduce dinero");
//					double resto;
//					double saldo=in.nextDouble();
//					saldo=saldo+resto;
//					System.out.println("Introduce fila y columna del producto");
//					int fila=in.nextInt();
//					int columna=in.nextInt();
					resto=pedir (productos,precios, cantidad,resto);
					System.out.println(resto);
					break;
				
				case 2:
					System.out.println("Has elegido mostrar cuantos productos quedan.");
					visualizar(cantidad, productos);
					break;
					
				case 3:
					rellenar(cantidad,productos);
					break;
					
				case 4:
					System.out.println("Programa acabado.");
					
			}
		
		}while(opcion!=4);
	}
	
	public static double  pedir(String[][] productos, double[][] precios, int[][]cantidad, double resto) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce dinero");
		double saldo=in.nextDouble();
		saldo=saldo+resto;
		System.out.println("Introduce fila y columna del producto");
		int fila=in.nextInt();
		int columna=in.nextInt();
		System.out.println("El producto elegido es: "+ productos[fila-1][columna-1]+ ". Precio: "+ precios[fila-1][columna-1]+ " €.");
		if (saldo>=precios[fila-1][columna-1]) {
			System.out.println("Saldo suficiente.");
			saldo=saldo-precios[fila-1][columna-1];
			System.out.println("Te quedan "+ saldo+ " €.");
			cantidad[fila-1][columna-1]=cantidad[fila-1][columna-1]-1;
			System.out.println("Quedan "+ cantidad [fila-1][columna-1]+ " " +productos[fila-1][columna-1]+" en la máquina.");
			resto=saldo;
			
			return resto;
		}
		else {
			System.out.println("No tienes suficiente dinero. Te quedan" + saldo + " €.");
			return resto;
		}
		
	}
	
	
	static void visualizar(int [][] array, String [][] prod) {
		for(int u=0;u<array.length;u++) {
			for(int y=0;y<array[u].length;y++) {
				System.out.printf("%5s",prod[u][y]+" ");
				
				//System.out.print((array[u][y])+" ");
			}
			System.out.println();
			for(int y=0;y<array[u].length;y++) {
				//System.out.print(prod[u][y]+ " ");
				System.out.printf("%8s",(array[u][y]));
			}
			System.out.println();	
		}
	}
	
	
	static void rellenar(int[][]cantidad, String[][] productos) {
		Scanner in=new Scanner(System.in);
		String pass="";
		String contra="MAQUINA";
		int bucle=0;
		do {
				System.out.println("Introduce contraseña.");
				pass=in.nextLine();
				
				if(pass.equals("1")) {
					bucle++;
				}
				else if(pass.equals(contra)) {
					System.out.println("Contraseña correcta.");
					System.out.println("Elige fila y columna");
					int fila=in.nextInt();
					int columna=in.nextInt();
					System.out.println("Introduce cantidad introducida: ");
					int sumale=in.nextInt();
					cantidad [fila-1][columna-1]=cantidad [fila-1][columna-1]+sumale;
				
				} else System.out.println("Contraseña incorrecta. Pulsa 1 para reiniciar.");
		}while(!pass.equals(contra) && bucle==0);
		
	}
	
	
}
