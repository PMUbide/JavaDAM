package examenB;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que pregunte al usuario por
//		UN CARACTER (hasta que el usuario escriba la palabra �fin�, que entonces
//		parar� de solicitar nuevos caracteres). Estos se deben ir almacenando en
//		un String que ser� enviado a la funci�n analizarString(String cadena) que
//		mostrar� por pantalla:
//		1. Longitud de la cadena.
//		2. N�mero de caracteres distintos que contiene.
//		3. Cada uno de los caracteres junto a su n�mero de apariciones.
		Scanner in = new Scanner (System.in); //Creamos un Scanner para introducir los datos.
		System.out.println("Introduce un car�cter, se finaliza con -fin-.");
		String palabra =""; //Creamos la variable String donde se ir�n almacenando los caracteres.
		String caracter="a"; //Creamos una variable donde se ir�n guardando los caracteres.
		while (!caracter.equals("fin")) { //Creamos un bucle que vaya rellenando la variable palabra con lo que introduzca el usuario, con unas condiciones:
			caracter = in.next(); //El caracter que el usuario introduce,
			if(!caracter.equals("fin") && caracter.length()==1){  // SI es diferente de "fin" y es solo de 1 caracter entra
					palabra=palabra + caracter; //Una vez que entra lo va agregando a la palabra manteniendo lo que hab�a anteriormente
			}
			else if (caracter.equals("fin")) { //En caso de poner FIN te dice que has acabado y Tambi�n saldr� del WHILE
				System.out.println("Has parado de solicitar caracteres, la palabra que has introducido es: "+palabra+".");
			}
			else { //En otro caso es que has puesto m�s de un caracter que no es fin y por tanto te dice qe solo introducas uno y entra en el bucle WHILE de nuevo.
				System.out.println("Introduce s�lo un caracter por favor.");
			}
		}
		analizarString(palabra);
	}
	
	/**
	 * M�todo para analizar el String.
	 * PRE: un String.
	 * POST: longiotud del String, n�mero de caracteres diferentes y el n�mero de veces que aparecen.
	 */
	public static void analizarString (String palabra) {
		//1. Longitud de la cadena.
		System.out.println("La longitud de la cadena es: "+ palabra.length());
//		2. N�mero de caracteres distintos que contiene.
		String array[] = palabra.split(""); //Pasamos el STring dentro de un array para hacer mejor el conteo.
		int iguales = 0; //Una variable para ir almacenando si una palabra se repite.
		boolean dif; //un boolean para que si encuentre una palabra que sea igual luego haga la suma.
		boolean comprobar = false; //Un boolean por si aparece s�lo un caracter repetido con lo cual no habr�a caracteres diferentes que contar, pasaria al else que dice " solo aparece un caracter".
		for ( int i = 1; i < array.length; i++) {
			if (!array[0].equals(array[i])) {
				comprobar = true; //Si ya hay alguno diferente entra a comprobar cuantos diferentes hay.
			}
		}
		if(comprobar == true) {
			for (int i = 0; i < palabra.length(); i++) {
				dif = false; //Inicializamos siempre el bucle pensando que no se va a repetir el caracter
				for(int j = i+1; j < palabra.length(); j++) { //Se crearan dos bucles FOR para recorer la palabra, desde el inicio y despu�s un caracater +1 del que empieza hasta el final.
					//System.out.println(palabra_copia.substring(i,i+1)+"************"+ palabra_copia.substring(j,j+1));  //Codigo para DEBUGEAR.
					if (palabra.substring(i,i+1).equals(palabra.substring(j,j+1))) { //Si encuentra una que es igual entonces ya autom�ticamente lo hace TRUE,
						dif = true;
						break;
					}
				}
				if (dif == true) { //Al ser TRUE Sumara +1 a la variable de iguales para saber cuantos iguales tendremos al final en la palabra.
					iguales = iguales + 1;
				}
				//System.out.println(iguales);
			}
			System.out.println("Los caracteres distintos son: "+ (palabra.length() - iguales)); // Por �ltimo se restar� la longitud de la palabra a a las vceces que han sido iguales los caracteres
		}
		else {
			System.out.println("S�lo aparece un caracter.");
		}
		//3. Cada uno de los caracteres junto a su n�mero de apariciones. 
		int contador = 0; //variable para contar los caracteres cuando se van repitiendo.
		//String array[] = palabra.split(""); //Pasamos el STring dentro de un array para hacer mejor el conteo.
		for ( int i = 0; i < array.length; i++) { //Bucle para ir recorriendo la palabra.
			//System.out.println(array[i]); // Codigo debuging
			for(int j = i+1; j < array.length; j++) { //Con este bucle ir� avanzando la palabra una posici�n de la que empieza
				if(array[i].equals(array[j])) { // SI encuentra un caracter que es igual, sumara 1 al contador y adem�s establecer� donde se repita en ese momento el bucle "j" con el caracter "00" y asi despu�s no contarlo otra vez.
					contador++; //suma 1 cada vez que lo encuentra.
					array[j] = "00"; //aplica el cambio trampa del caracter.
				}
			}
			if(!array[i].equals("00")){ // Ahora un condicional para que nos desmuestre los caracteres diferentes al 0. y no se tendr� en cuenta en el bucle ya que no iba a haber una posicion con 2 caracteres.
				if (contador == 0) { //UN IF para mostrar mejor esteticamente el resultado en pantalla, solo cambia si es  "vez" o "veces".
					System.out.println("El caracter " + array[i]+" aparece "+(contador+1)+ " vez.");
				}else System.out.println("El caracter " + array[i]+" aparece "+(contador+1)+ " veces.");
			}
			contador = 0;
		}
	}
	
	
}
