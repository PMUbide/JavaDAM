
public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que imprima por pantalla la
//		cantidad de números primos que hay entre 1 y 500.
		int veces=0;
		for(int i=0; i<=500;i++) {
			int contador = 2;
			boolean primo=true;
			while ((primo) && (contador!=i)){
			   if (i % contador == 0)
			   primo = false;
			    contador++;
			  }
			if (primo==true) veces++;
			
			  System.out.println(i + " es primo? "+ primo);
			}
		System.out.println("Numero de primos: " + veces);	
		}
	}


