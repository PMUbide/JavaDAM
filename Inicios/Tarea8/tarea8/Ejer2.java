package tarea8;

public class Ejer2 {

	public static void main(String[] args) {
		int tabla[]={3,1,2,1,4,3,1,2,1,7};
		int numero=2;
		incrementarValores(tabla, numero);
		for(int u=0;u<tabla.length;u++) {
			System.out.println(tabla[u]);
		}
	}
	
	
	public static void incrementarValores(int tabla[], int numero) {
		for (int i=0;i<tabla.length;i++) {
			if(i!=0 && i!=(tabla.length-1)) {
				tabla[i]=tabla[i]*numero;
			}
		}
		
	}
}

