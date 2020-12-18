package examen;

import java.util.Arrays;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tabla = {"R","i","e","s","g","o"};
		
		String palabra="Sergio";
		palabra = palabra.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		int contador=0; //un contador para ver cuantas letras son iguales.
		String[] tabla2= new String[6];
		for(int t=0; t<tabla2.length;t++) {
			tabla2[t]=palabra.substring(t, t+1);
			
		}
		
		for(int t=0; t<tabla.length;t++) {
			tabla[t]=tabla[t].toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");;
			
		}
		
		
//		for(int j = 0;j < tabla2.length; j++) {
//				System.out.print(tabla2[j]+" ");
//			}
		
		
		Arrays.sort(tabla2);
		//tabla2 = tabla2.length.replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		for(int j = 0;j < tabla2.length; j++) {
			System.out.print(tabla2[j]+" ");
		}
		Arrays.sort(tabla);
		for(int j = 0;j < tabla.length; j++) {
			System.out.print(tabla[j]+" ");
		}
	String cadena1="";
	for(int j = 0;j < tabla.length; j++) {
			
		cadena1=cadena1+tabla[j];
		
		}
	String cadena2="";
	for(int j = 0;j < tabla2.length; j++) {
		
		cadena2=cadena2+tabla2[j];
		
		}
		
	if (cadena1.equals(cadena2)) {
		System.out.println("Son anagramas");
	}
	
	}
	

}
