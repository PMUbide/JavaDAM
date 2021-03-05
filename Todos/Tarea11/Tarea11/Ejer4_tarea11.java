
public class Ejer4_tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 4: Implementa el mismo programa que el ejercicio anterior, pero
//		para dos Arrays de Strings.
		String array1[]=new String[5];
		String array2[]=new String[5];
		rellenar(array1);
		rellenar2(array2);
		comprobar(array1,array2);
	}
	
	public static void comprobar(String tabla1[], String tabla2[]) {
		int iguales = 0;
		for(int i = 0; i < tabla1.length; i++) {
			if(!tabla1[i].equals(tabla2[i])) {
			iguales++;
			}
		}
		
		if(iguales>0) {
		System.out.println("No son iguales.");
		}
		else {
		System.out.println("Son iguales.");
		
		}
	}	
	
	
	public static String[] rellenar(String tabla[]) {
		tabla[0]="Enero";
		tabla[1]="Febrero";
		tabla[2]="Marzo";
		tabla[3]="Abril";
		tabla[4]="Mayoo";
		return tabla;	
	}	
	
	public static String[] rellenar2(String tabla[]) {
		tabla[0]="Enero";
		tabla[1]="Febrero";
		tabla[2]="Marzo";
		tabla[3]="Abril";
		tabla[4]="Mayoo";
		return tabla;	
	}

}
