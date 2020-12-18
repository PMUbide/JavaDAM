package examen;
import java.util.*;
public class Martinez_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primeramente el programa pregunta por la longitud de la tabla.
		System.out.println("Introduce la longitud de la tabla de anagrama:");
		Scanner in = new Scanner(System.in);
		int longitud= in.nextInt();
		//Creamos la tabla con esa longitud.
		String[] tabla = new String[longitud];
		//Preguntamos las letras en cada una de las posiciones de la tabla rellenandola.
		//Se podría mejorar con tiempo aplicando bucle por si rellena menos de lo que se le pedía.)
		for (int i = 0; i < tabla.length;i++) {
			System.out.println("Introduce la letra de la posición "+ i);
			tabla[i]=in.next();
		}
		//Muestra la palabra.
		for(int j = 0;j < tabla.length; j++) {
			System.out.print(tabla[j]+" ");
		}
		System.out.println();
		//Preguntaremos por un String para comprobar si es anagrama.
		System.out.println("Introduce la palabra para comprobar si hay anagramas: ");
		String palabra=in.next();
		boolean anagram= reeordenar(tabla,palabra); //metodo que devolvera un boolean para saber si hay anagramas o no.
		System.out.println("HAY ANAGRAMA? "+anagram); 
	}
	
	
	public static boolean reeordenar(String[] tabla, String palabra) {
		boolean anagram=false; //la variable para recoger si es TRUE o no.
		//Primero tiene que tener la misma longitud, si no, no  entra en el bucle para hacer nada porque directamente no serán anagramas.
		if(palabra.length()==tabla.length) {
			//le quitamos las mayusculas, espacios que pudiera haber y acentos para hacer más fácil la comparación.
			palabra = palabra.toLowerCase().replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
			//Lo transformamos a tabla para después ordenarlo.
			String[] tabla2= new String[palabra.length()];
			for(int t = 0; t<tabla.length;t++) {
				tabla2[t]=palabra.substring(t, t+1);
			}
			//Dibuja lo que ha almacenado en tabla.
			System.out.println("Palabra pasada a tabla: ");
			for(int j = 0;j < tabla2.length; j++) {
					System.out.print(tabla2[j]+" ");
			}
			Arrays.sort(tabla2); //Ahora Ordenaremos la tabla 2, (después la tabla principal para comparar la igualdad)
			//Dibuja la tabla otra vez.
			System.out.println();
			System.out.println("Tabla ordenada: ");
			for(int d = 0;d < tabla2.length; d++) {
				System.out.print(tabla2[d]+" ");
			}
			//Hacemos lo mismo con las mayusculas de la cadena primera.
			for(int q = 0; q<tabla.length;q++) {
				tabla[q]=tabla[q].toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
			}
			//Ahora lo ordenamos y la enseñamos también.
			Arrays.sort(tabla);
			System.out.println();
			System.out.println("Tabla principal ordenada: ");
			for(int jj = 0;jj < tabla.length; jj++) {
				System.out.print(tabla[jj]+" ");
			}
			//ahora crearemos dos palabras para ir almacenando el contenido de las tablas a cada una y hacer más sencilla la comparación.
			String cadena1=""; //Corresponderá a la tabla1, que viene del main.
			for(int r = 0;r < tabla.length; r++) {
				cadena1=cadena1+tabla[r];
			}
			String cadena2=""; //Corresponderá a la tabla2, que viene de la palabra pasada del main.
			for(int v = 0;v < tabla2.length; v++) {
				cadena2=cadena2+tabla2[v];
			}
			//Ya por último enseñamos esas palabras y las comparamos a ver si son iguales, si lo son es anagrama y sino, no.
			System.out.println();
			System.out.println("Tabla primera cambiada a String: "+cadena1);
			System.out.println("Tabla segunda pasada a String: "+ cadena2);
			if (cadena1.equals(cadena2)) {
				anagram=true;
			}
		}
		return anagram; 
	}
	
	
	

}
