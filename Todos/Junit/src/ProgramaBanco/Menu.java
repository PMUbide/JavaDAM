package ProgramaBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Usuario> usuarios; //variable de la lista de usuarios
	private Scanner in; //Variable objeto Scanner
	
	/**
	 * Constructor de un menu por defecto
	 * @param usuarios -> recibe la lista de usuarios para
	 * el programa
	 */
	public Menu(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
		this.in = new Scanner(System.in);
	}
	
	/**
	 * Método del menu para empezar el funcionamiento del programa.
	 */
	public void start() {
		System.out.println("Empieza el programa.");
		String usuario = "a", pass;
		boolean finPrograma = false;
		//Mientras sea false seguirá preguntando usuario y pass
		while(!finPrograma) {
			System.out.println("Usuario: ");
			usuario = in.next();
			System.out.println("Pass: ");
			pass = in.next();
			Usuario elegido = iniciarSesion(usuario, pass);
			//Si elegido es null no entra a las opciones del menu
			if(elegido != null) {
				System.out.println("Elige opciones");
				System.out.println("1 - Insertar Dinero");
				System.out.println("2 - Extraer Dinero");
				System.out.println("3 - SALIR");
				String opcion = in.next();
				switch(opcion) {
				case "1":
					System.out.println("Dinero a añadir: ");
					double dineroInsertar = in.nextDouble();
					//Llama al metodo de insertar dinero
					insertarDinero(elegido, dineroInsertar);
					break;
				case "2":
					System.out.println("Dinero a extraer: ");
					double dineroExtraer = in.nextDouble();
					//llama al metodo de extraer dinero
					extraerDinero(elegido, dineroExtraer);
					break;
				case "3":
					//cambia la variable y sale del while
					finPrograma = true;
					break;
				}
			}else {
				System.out.println("Acceso incorrecto");
			}
		}
		System.out.println("Fin programa");
	}
	
	/**
	 * Método para insertar dinero a un usuario
	 * @param user -> usuario para añadir dinero
	 * @param dinero -> cantidad de dinero a insertar
	 */
	public void insertarDinero(Usuario user, double dinero) {
		//saldo actual
		double dineroActual = user.getSaldo();
		if(dinero > 0) {
			//hace la suma
			user.setSaldo(dineroActual + dinero); 
		}
	}
	
	/**
	 * Método para extraer dinero de un usuario.
	 * Resta al dinero que tiene actualmente.
	 * @param user -> usuario al que hacerle el extraer
	 * @param dinero -> cantidad de dinero a extraer
	 */
	public void extraerDinero(Usuario user, double dinero) {
		//saldo actual
		double dineroActual = user.getSaldo();
		//Si el dinero a extraer es menor o igual que el que tiene
		if(dinero <= dineroActual) {
			//Establece con la resta
			user.setSaldo(dineroActual - dinero);
		}
	}
	
	/**
	 * Método para iniciar sesión
	 * @param user -> el nombre del usuario
	 * @param pass -> la contraseña del usuario
	 * @return -> Devuelve el Usuario si coincide con uno de la lista
	 * En caso contrario devuelve null
	 */
	public Usuario iniciarSesion(String user, String pass) {
		//Recorre usuarios del menu
		for (Usuario usuario : usuarios) {
			//si coincide el usuario
			if(usuario.getNombre().equals(user)) {
				//Si coincide la contraseña
				if(usuario.getPass().equals(pass)) {
					return usuario;
				}
			}
		}
		//si no encuentra nada devuelve null
		return null;
	}
}
