import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class JuegoMain {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Menu juego, restar o sumar.
		Scanner in = new Scanner (System.in);
		boolean juego = true; //variable para acabar el juego.
		while (juego) {
			System.out.println("Juego MATEMÁTICO");
			System.out.println("Elige una operación");
			System.out.println("1- Suma / 2-Resta / 3- Multiplicación / 4- División");
			int eleccion = 99999;
			while(eleccion == 99999) {
				eleccion = probarMenu();
			}
			String restart = "";
			System.out.println("Elige número de rondas");
			System.out.println("----------------------");
			int rondas = in.nextInt();
			System.out.println("Elige dificultad");
			System.out.println("----------------");
			System.err.println("1/Fácil (1 cifra) \n2/Medio (2 cifras) \n3/Dificil (3cifras) \n");
			int dificultad = 99999;
			while(dificultad == 99999 || (dificultad < 1 || dificultad > 3)) {
				dificultad = probarMenu();
				if (dificultad > 3 || dificultad < 1) {
					System.out.println("Vuelve a probar");
				}
			}
			int random; //Variable para cambiar el número de cifras de las operaciones.
			if (dificultad == 1) {
				System.out.println("Dificultad: Fácil " + rondas + " rondas.");
				random = 10;
			}
			else if (dificultad == 2) {
				System.out.println("Dificultad: Medio " + rondas + " rondas.");
				random = 100;
			}
			else {
				System.out.println("Dificultad: Dificil " + rondas + " rondas.");
				random = 1000;
			}
			switch(eleccion) {
				case 1: 
					operacionSuma(rondas, random);
					System.out.println("¿Quieres volver a jugar? S/N");
					restart = in.next();
					if (restart.equalsIgnoreCase("n")){
						juego = false;
					}
					break;
				case 2:
					operacionResta(rondas, random);
					System.out.println("¿Quieres volver a jugar? S/N");
					restart = in.next();
					if (restart.equalsIgnoreCase("n")){
						juego = false;
					}
					break;
				case 3:
					operacionMultiplicacion(rondas, random);
					System.out.println("¿Quieres volver a jugar? S/N");
					restart = in.next();
					if (restart.equalsIgnoreCase("n")){
						juego = false;
					}
					break;
			}
		}
		System.out.println("Fin del Programa.");	
	}

	
	
	public static int probarMenu() {
		Scanner entrada = new Scanner (System.in);
		try {
			int eleccion = entrada.nextInt();
			return eleccion;
		} catch(InputMismatchException e) {
			System.out.println("Error al introducir número, vuelve a probar.");
			return 99999;
		}
	}
	
//		Timer timer = new Timer (1000, (ActionListener) new ActionListener () {
//			public void actionPerformed(ActionEvent e) {
//				int cuentaAtras = 3;
//				System.out.println(cuentaAtras);
//				cuentaAtras--;
//			}
//		});
//		timer.start();
	
	public static void operacionMultiplicacion(int rondas, int random) {
		Scanner in = new Scanner (System.in);
		int i = 3;
		System.out.println("Empieza en: ");
		while (i > 0){
		  System.out.println(i);
		  try {
		    i--;
		    Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
		   }
		   catch (InterruptedException e) {
		       //I don't think you need to do anything for your particular problem
		   }
		 }
		int contOperacion = 0; //Contador de operaciones
		String resultado = "";
		int contAcierto = 0;  //Contador de aciertos.
		double start = System.currentTimeMillis(); //empieza un contador el tiempo en milisegundos.
		while(contOperacion < rondas) {
			System.out.println(" OPERACIÓN MULTIPLICACIÓN: ");
			int num1, num2;
			if (random == 1000) {
				num1 = (int) (100* Math.random());
				num2 = (int) (10* Math.random());
					while (num2 == 0) { //Evita que cree 0 y sea muy fácil.
						num2 = (int) (10* Math.random());
					}
			}else {
				num1 = (int) (random* Math.random());
				num2 = (int) (random* Math.random());
			}
			System.out.println("La operación " + num1 + " * " + num2 + " = ? ");
			int respuesta  = in.nextInt();
			if ((num1 * num2) == respuesta) {
				contAcierto ++;
			}
			resultado += "El resultado de " + num1 + " * " + num2 + " = " + (num1 * num2) + " ----- " + ((num1 * num2) == respuesta ? "Acierto" : "Fallo") + "\n";
			contOperacion++;
			
		}
		double finish = System.currentTimeMillis(); //Otro contador del tiempo al acabar en milisegundos.
		System.out.println();
		System.out.println("El número de operaciones han sido " + contOperacion + " has acertado " + contAcierto + ": ");
		System.out.printf("%s %3.2f %s %n", "El tiempo ha sido de ", (finish - start)/1000, "segundos");
		System.out.println();
		System.out.println(resultado);
	}
	
	
	
	public static void operacionResta(int rondas, int random) {
		Scanner in = new Scanner (System.in);
		int i = 3;
		System.out.println("Empieza en: ");
		while (i > 0){
		  System.out.println(i);
		  try {
		    i--;
		    Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
		   }
		   catch (InterruptedException e) {
		       //I don't think you need to do anything for your particular problem
		   }
		 }
		int contOperacion = 0; //Contador de operaciones
		String resultado = "";
		int contAcierto = 0;  //Contador de aciertos.
		double start = System.currentTimeMillis(); //empieza un contador el tiempo en milisegundos.
		while(contOperacion < rondas) {
			System.out.println(" OPERACIÓN RESTA: ");
			int num1 = (int) (random * Math.random());
			int num2 = (int) (random * Math.random());
			System.out.println("La operación " + num1 + " - " + num2 + " = ? ");
			int respuesta  = in.nextInt();
			if ((num1 - num2) == respuesta) {
				contAcierto++;
			}
			resultado += "El resultado de " + num1 + " - " + num2 + " = " + (num1 - num2) + " ----- " + ((num1 - num2) == respuesta ? "Acierto" : "Fallo") + "\n";
			contOperacion++;
			
		}
		double finish = System.currentTimeMillis(); //Otro contador del tiempo al acabar en milisegundos.
		System.out.println();
		System.out.println("El número de operaciones han sido " + contOperacion + " has acertado " + contAcierto + ": ");
		System.out.printf("%s %3.2f %s %n", "El tiempo ha sido de ", (finish - start)/1000, "segundos");
		System.out.println();
		System.out.println(resultado);
	}
	
	
	public static void operacionSuma(int rondas, int random) {
		Scanner in = new Scanner (System.in);
		int i = 3;
		System.out.println("Empieza en: ");
		while (i > 0){
		  System.out.println(i);
		  try {
		    i--;
		    Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
		   }
		   catch (InterruptedException e) {
		       //I don't think you need to do anything for your particular problem
		   }
		 }
		int contOperacion = 0; //Contador de operaciones
		String resultado = "";
		int contAcierto = 0;  //Contador de aciertos.
		double start = System.currentTimeMillis(); //empieza un contador el tiempo en milisegundos.
		while(contOperacion < rondas) {
			System.out.println(" OPERACIÓN SUMA: ");
			int num1 = (int) (random * Math.random());
			int num2 = (int) (random * Math.random());
			System.out.println("La operación " + num1 + " + " + num2 + " = ? ");
			int respuesta  = in.nextInt();
			if ((num1 + num2) == respuesta) {
				contAcierto++;
			}
			resultado += "El resultado de " + num1 + " + " + num2 + " = " + (num1+num2) + " ----- " + ((num1+num2) == respuesta ? "Acierto" : "Fallo") + "\n";
			contOperacion++;
		}
		double finish = System.currentTimeMillis(); //Otro contador del tiempo al acabar en milisegundos.
		System.out.println();
		System.out.println("El número de operaciones han sido " + contOperacion + " has acertado " + contAcierto + ": ");
		System.out.printf("%s %3.2f %s %n", "El tiempo ha sido de ", (finish - start)/1000, "segundos");
		System.out.println();
		System.out.println(resultado);
	}

		
		
		
	
	
	
}
