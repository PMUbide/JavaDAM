import java.util.*;
public class adivina_numero3 {


 public static void main(String[] args) {

    int aleatorio = (int)(Math.random()*100);

    Scanner entrada = new Scanner(System.in);
 
    byte numero = 0;
    byte intentos = 0;

    while (numero != aleatorio){

    	intentos++;

    	if (intentos > 5){

    		System.out.println("Has superado el numero de intentos posibles!!!!!"+" El numero que buscabas era el: "+(aleatorio)); 

    		break;

    	}

    	switch(intentos){

    	case 1:

    System.out.println("Bienvenido al juego,tienes (5) intentos para adivinar el numero, Suerte!!!");

    break;

   case 2:

    System.out.println("Te quedan 4 intentos");

    break;

   case 3:

    System.out.println("Te quedan 3 intentos");

    break;

   case 4:

    System.out.println("Te quedan 2 intentos");

    break;

   case 5:

    System.out.println("Te quedan 1 intento");

    break;

   

   }

   System.out.println("Introduce un numero entre 0 y 100");

   numero = entrada.nextByte();

   

   if(numero == aleatorio){

    System.out.println("Has acertado el numero"+" en "+intentos+" intentos FELICIDADES!!!!!!!!!");

    break;

    

   }else if(numero > aleatorio){

    System.out.println("El numero que buscas es menor");

   }else{

    System.out.println("El numero que buscas es mayor");

   }

  }



 }

}