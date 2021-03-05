package tarea7;

public class Dni {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla= {2,6,1,10,5,250,1,56,32,12,12,12,12};
		int tabla2[]= new int[tabla.length];
		int aux=0;
		int y=0;
		for(int z=0;z<tabla.length;z++) {
			
//			if(tabla2[y]==tabla[z]) {
//				
//				tabla[z]=tabla2[y];
//				
//				y++;
//			}
//			
				for(int i=0;i<tabla.length;i++) {
						
	
						if(tabla[i]>=aux) {
						aux=tabla[i];
						}
				}
			
			
				
				tabla2[y]=aux;
				
				for(int d=0;d<tabla.length;d++) {
						if(tabla[d]==aux) {
							tabla[d]=0;
						}
				}
		
			
			y++;
			aux=0;

			
			
		}
			
		System.out.println(aux);
		System.out.println(y);
		
//		for(int j=0;j<tabla.length;j++) {
//			System.out.print(tabla[j]+" ");
//		
//		}
		
		for(int j=0;j<tabla2.length;j++) {
			System.out.print(tabla2[j]+" ");
		}
	}	
}
