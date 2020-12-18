package array;

import java.util.Scanner;


public class E1 {
	
	
	
	static void visualizarArray(int [] array_sencillo) {
		
			for(int u=0;u<array_sencillo.length;u++) {
			System.out.println("\t" + array_sencillo[u]);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
			int matriz_guay [][]=  {{0,15,2,5}, {3,21,3,9}, {4,6,6,8}, {7,8,7,1}};
			int [] diago_1= new int [matriz_guay.length];
			int [] diago_2= new int [matriz_guay.length];
			
			for(int j=0;j<matriz_guay.length;j++) {				
				for(int i=0;i<matriz_guay.length;i++) {
													
					if(i==j) {
						diago_1[j]=matriz_guay[j][i];
					}
														
					if(i+j==3){
						diago_2[j]=matriz_guay[j][i];
					} 
				}
			}
								
			System.out.println("La primera diagonal es: ");
			
			visualizarArray(diago_1);
			
			System.out.println();
			
			System.out.println("La segunda diagonal es: ");
			
			visualizarArray(diago_2);
			
					
			 
	}
}
