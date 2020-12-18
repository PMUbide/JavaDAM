package array;

import java.util.Scanner;


public class matriz4x4 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner (System.in);
			int matriz [][]=  {{0,5,2,5}, {3,7,3,9}, {4,6,6,8}, {7,8,7,1}};
			for(int u=0;u<matriz.length;u++) {
				for(int y=0;y<matriz[u].length;y++) {
					System.out.print(matriz[u][y]+" ");
				}
				System.out.println();
			}
			System.out.println("Operaciones: 1-Sumar Fila. 2-Restar filas. 3- Suma diagonal prin. 4-Suma diagonal. sec. 5-Media de la matriz.");
			int opciones=in.nextInt();
			int fila=0;
			if (opciones==1) {
				System.out.println("Introduce la fila para sumar:");
				fila=in.nextInt();
			}
			else if (opciones==2) {
				System.out.println("Introduce la fila para restar:");
				fila=in.nextInt();
			}
			switch(opciones) {
			  case 1:
				int suma=0;
			    for(int i=0;i<matriz.length;i++) {
			    	suma=suma+ matriz [fila-1][i];
			    }
			    System.out.println("La suma de la fila "+ fila + " es "+ suma);
			    break;
			  case 2:
				  int resta=0;
				    for(int i=0;i<matriz.length;i++) {
				    	if(i==0) {
				    	resta=resta + matriz [fila-1][i];
				    	}
				    	else resta=resta - matriz [fila-1][i];
				    }
				    System.out.println("La resta de la fila "+ fila + " es "+ resta);
			    break;
			  case 3:
				  int diag_sum=0;
				  int [] diago_1= new int [matriz.length];
				  for(int j=0;j<matriz.length;j++) {				
						for(int i=0;i<matriz.length;i++) {
							if(i==j) {
								//diago_1[j]=matriz[j][i];
								
								diag_sum=diag_sum+matriz[j][i];
							}
						}	
						
					}	
				  System.out.println("LA suma de la diagonal es "+ diag_sum);
				  break;
			  case 4:
				  int diag2=0;
				  for(int j=0;j<matriz.length;j++) {				
						for(int i=0;i<matriz.length;i++) {
							if(i+j==3){
								//diago_2[j]=matriz[j][i];
								diag2=diag2+matriz[j][i];
							} 
						}
					}
				  System.out.println("La suma de la diagonal secundaria es "+ diag2);
				  break;
			  case 5:
				  int sumatorio=0;
				  for(int j=0;j<matriz.length;j++) {				
						for(int i=0;i<matriz.length;i++) {
							
								//diago_2[j]=matriz[j][i];
								sumatorio=sumatorio+matriz[j][i];
						}
					}
				  System.out.println("LA media de todos números de la matriz es: "+ (sumatorio/16));
				  break;
			  default:
			    // code block
			}
	}
}
