package ProgramaBanco;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MenuTest {
	
	//Variables generales para el funcionamiento del test
	Usuario pepe = new Usuario("Pepe", "Pepe123", 2000);
	Usuario marta = new Usuario("Marta", "MArta123", 2000);
	ArrayList<Usuario> usuarios;
	Menu menu;
	
	/**
	 * M�todo Before para hacer la creaci�n de la lista de usuarios y
	 * a�adir
	 */
	@BeforeEach
	public void before() {
		usuarios = new ArrayList<Usuario>();
		usuarios.add(pepe);
		usuarios.add(marta);
		menu = new Menu(usuarios);
	}
	
	/**
	 * Test para probar que el metodo inicioSesion devuelve null
	 * si no es correcta el usuario
	 */
	@Test
	public void Inicio_Sesion_Incorrecta_Usuario() {
		String user = "a"; //user incorrecta
		String pass = "Pepe123"; //pass correcta
		Usuario encontrado = menu.iniciarSesion(user, pass);
		//tiene que ser null
		assertEquals(null, encontrado);
	}
	
	/**
	 * Test para probar que el m�todo inicioSesion devuelve null
	 * si no es correcta la contrase�a
	 */
	@Test
	public void Inicio_Sesion_Incorrecta_Pass() {
		String user = "Pepe"; //user correcta
		String pass = "Pepe"; //pass incorrecta
		Usuario encontrado = menu.iniciarSesion(user, pass);
		//Tiene que ser null 
		assertEquals(null, encontrado);
	}
	
	/**
	 * Metodo test que comprueba que el usuario de inicioSesion
	 * es el que corresponde
	 */
	@Test
	public void Inicio_Sesion_Correcta() {
		String user = "Pepe"; //user correcto
		String pass = "Pepe123"; //pass correcto
		Usuario encontrado = menu.iniciarSesion(user, pass);
		//Los usuarios tiene que coincidir
		assertEquals(pepe, encontrado);
	}
	
	/**
	 * Test para comprobar que funciona el
	 *  insertar dinero que es > 0
	 */
	@Test
	public void Insertar_Dinero_Positivo() {
		String user = "Pepe";
		String pass = "Pepe123";
		Usuario a = menu.iniciarSesion(user, pass);
		//Se insertar dinero
		menu.insertarDinero(a, 200.5);
		//el saldo tiene que ser la suma de 2000 + 200.5
		assertEquals(2200.5, a.getSaldo());
	}
	
	/**
	 * Test para comprobar que no inserta nada
	 * si se le pasa un numero negativo
	 */
	@Test
	public void Insertar_Dinero_Negativo() {
		String user = "Pepe";
		String pass = "Pepe123";
		Usuario a = menu.iniciarSesion(user, pass);
		//Se le intenta insertar un numero negativo
		menu.insertarDinero(a, -100);
		//el saldo tiene que ser el mismo que tenia
		assertEquals(2000, a.getSaldo());
	}
	
	/**
	 * Test para comprobar que no extrae dinero si no hay
	 * suficiente
	 */
	@Test
	public void Extraer_Dinero_Sin_Tener_Suficiente() {
		String user = "Pepe";
		String pass = "Pepe123";
		Usuario a = menu.iniciarSesion(user, pass);
		//Se le intenta extraer m�s dinero del disponible
		menu.extraerDinero(a, 2001);
		//El saldo tiene que ser el mismo porque no realiza la accion
		assertEquals(2000, a.getSaldo());
	}
	
	/**
	 * Test para comprobar que se ha extraido el dinero
	 * correctamente
	 */
	@Test
	public void Extraer_Dinero() {
		String user = "Pepe";
		String pass = "Pepe123";
		Usuario a = menu.iniciarSesion(user, pass);
		//Se ejecuta el extraer 200
		menu.extraerDinero(a, 200);
		//El saldo que debe tener "Pepe" ser� de 2000 - 200
		assertEquals(1800, a.getSaldo());
	}

}
