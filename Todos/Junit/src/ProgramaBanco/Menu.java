package ProgramaBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Usuario> usuarios;
	private Scanner in;
	
	public Menu(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
		this.in = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("Empieza el programa.");
		String usuario = "a", pass;
		while(true) {
			System.out.println("Usuario: ");
			usuario = in.next();
			System.out.println("Pass: ");
			pass = in.next();
			Usuario elegido = iniciarSesion(usuario, pass);
			if(elegido != null) {
				System.out.println("Elige opciones");
				System.out.println("1 - Insertar Dinero");
				System.out.println("2 - Extraer Dinero");
				System.out.println("3 - SALIR");
				String opcion = in.next();
				switch(opcion) {
				case "1":
					insertarDinero(elegido);
					break;
				case "2":
					extraerDinero(elegido);
					break;
				case "3":
					break;
				}
				
			}else {
				System.out.println("usuario incorrecto");
			}
		}
		
	}
	
	
	public void insertarDinero(Usuario user) {
		System.out.println("Introduce dinero");
	}
	
	public void extraerDinero(Usuario user) {
		System.out.println("Extraer dinero");
	}
	
	
	public Usuario iniciarSesion(String user, String pass) {
		for (Usuario usuario : usuarios) {
			if(usuario.getNombre().equals(user)) {
				if(usuario.getPass().equals(pass)) {
					return usuario;
				}
			}
		}
		return null;
	}
}
