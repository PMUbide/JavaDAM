import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Club implements Serializable {
	private String	nombre; //Nombre del club
	private Nodo	primerNodo; //Primer nodo
	private Nodo	ultimoNodo; //ultimo nodo
	private int		size; //Tama�o del club

	/**
	 * Constructor del objeto
	 * @param nombre -> Recibe un nombre para la creaci�n
	 */
	public Club(String nombre) {
		this.nombre = nombre;
		this.primerNodo = null;
		this.ultimoNodo = null;
		size = 0;
	}

	/**
	 * M�todo para incorporar un nuevo socio al club.
	 * Lo va a colocar por orden alfab�tico.
	 * @param nuevoSocio -> Socio para a�adir.
	 */
	public void incorporacion(Socio nuevoSocio) {
		//Creamos un nodo nuevo con el socio.
		Nodo nuevo = new Nodo(nuevoSocio);
		//En caso de que est� vac�o.
		if (size == 0) {
			primerNodo = nuevo;
			ultimoNodo = nuevo;
			size++;
			return;
		}
		// En caso de que no est� vac�o.
		// Gesti�n de orden alfab�tico desde atr�s de la lista.
		Nodo puntero = ultimoNodo;
		int contador = 0;
		while (contador <= size - 1) {
			//LLama al m�todo para comparar el nombre del socio.
			// Si es menor de 0 lo metera a su derecha.
			if (comparacion(puntero, nuevoSocio) < 0) {
				//para gestionar si no es el �ltimo nodo o si.
				if (puntero.getSiguiente() != null) {
					puntero.getSiguiente().setAnterior(nuevo);
					nuevo.setSiguiente(puntero.getSiguiente());
				} else {
					ultimoNodo = nuevo;
				}
				puntero.setSiguiente(nuevo);
				nuevo.setAnterior(puntero);
				size++;
				return;
			} else {
				//Si no llega al primer Nodo, avanzar� una posici�n para detr�s.
				if (puntero.getAnterior() != null) {
					puntero = puntero.getAnterior();
				} else {
					//En caso de que llegue al primero: 
					puntero.setAnterior(nuevo);
					nuevo.setSiguiente(puntero);
					primerNodo = nuevo;
					size++;
					return;
				}
			}
			contador++;
		}
	}

	/**
	 * M�todo para borrar un usuario con los nombres dados.
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 */
	public void borrado(String nombre, String primerApellido, String segundoApellido) {
		Nodo puntero = primerNodo;
		int cont1 = 0;
		int posicion = -1;
		if(!pertenencia(nombre, primerApellido, segundoApellido)) {
			System.out.println("Socio no encontrado.");
			return;
		}
		while (cont1 < size) {
			//Recorre para quedarse con la posici�n.
			// Si coincide los nombres y apellidos.
			if(comparacion(puntero, new Socio(nombre, primerApellido, segundoApellido, "0000")) == 0) {
				posicion = cont1;
			}
			puntero = puntero.getSiguiente();
			cont1++;
		}
		//Si lo ha encontrado y guardado la posicion en la lista:
		if (posicion == 0) {
			//Gestiona si solo hay un socio.
			//Dejar� la lista vac�a.
			if(size < 2) {
				primerNodo = null;
				ultimoNodo = null;
				size--;
			}else {
				//En otro caso gestiona borrar la primera posicion.
				primerNodo.getSiguiente().setAnterior(null);
				primerNodo = primerNodo.getSiguiente();
				size--;
			}
			//Si est� en la �ltima posici�n: 
		} else if (posicion >= size - 1) {
				ultimoNodo = ultimoNodo.getAnterior();
				ultimoNodo.setSiguiente(null);
				size--;
		} else {
			//Si est� en medio recorre hasta la posici�n y procede a borrarlo.
			puntero = primerNodo;
			for (int i = 1; i <= posicion; i++) {
				puntero = puntero.getSiguiente();
			}
			puntero.getAnterior().setSiguiente(puntero.getSiguiente());
			puntero.getSiguiente().setAnterior(puntero.getAnterior());
			size--;
		}
		System.out.println("Socio borrado");
	}

	
	/**
	 * M�todo que le llegan dos clubs y los unir� en un objeto de esta clase.
	 * @param uno -> Recibe un club
	 * @param dos -> Recibe otro club
	 */
	public void union(Club uno, Club dos) {
		if(uno.isEmpty() || dos.isEmpty()) {
			System.out.println("Alg�n club est� vac�o.");
			return;
		}
		Nodo puntero1 = uno.getPrimerNodo();
		Nodo puntero2 = dos.getPrimerNodo();
		int cont = 0;
		boolean incorpora1 = true;
		boolean incorpora2 = true;
		//Va recorriendo los clubs y haciendo la incorporacion a la vez.
		while (cont < uno.size + dos.size) {
			if (incorpora1) {
				incorporacion(puntero1.getContenido());
				incorpora1 = false;
			}
			if (incorpora2) {
				incorporacion(puntero2.getContenido());
				incorpora2 = false;
			}
			if (puntero1.getSiguiente() != null) {
				puntero1 = puntero1.getSiguiente();
				incorpora1 = true;
			}
			if (puntero2.getSiguiente() != null) {
				puntero2 = puntero2.getSiguiente();
				incorpora2 = true;
			}
			cont++;
		}
		System.out.println("Club creado");

	}

	/**
	 * M�todo que devuelve true o false seg�n si existe un socio en el con ese nombre.
	 * Va recorriendo desde el principio y desde el final para aumentar la eficaciad de
	 * b�squeda.
	 * @param nombre 
	 * @param apellido
	 * @param segundo
	 * @return -> Devuelve true si encuentra una coincidencia de nombres.
	 */
	public boolean pertenencia(String nombre, String apellido, String segundo) {
		Nodo puntero = primerNodo;
		Nodo puntero2 = ultimoNodo;
		int cont = 0;
		Socio nuevo = new Socio(nombre, apellido, segundo, "00000");
		while (cont < size) {
			if (comparacion(puntero, nuevo) == 0 || comparacion(puntero2, nuevo) == 0) {
				return true;
			}
			puntero = puntero.getSiguiente();
			puntero2 = puntero2.getAnterior();
			cont++;
		}
		return false;
	}

	/**
	 * M�todo que devuelve true si el club est� vac�o,
	 * si no est� vac�o devuelve false.
	 * @return
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}


	/**
	 * M�todo compara Dos socios alfab�ticamente, seg�n su nombre y apellidos.
	 * @param puntero -> Recibe el puntero en el que est� y donde tiene que buscar el socio a comparar.
	 * @param nuevoSocio  -> Socio para comparar.
	 * @return -> Devuelve <0 si est� a la derecha en el alfabeto, o lo contrario.
	 * Devuelve 0 si es id�ntico.
	 */
	public int comparacion(Nodo puntero, Socio nuevoSocio) {
		Socio elegido = puntero.getContenido();
		String A = elegido.getNombre() + " " + elegido.getPrimerApellido() + " " + elegido.getSegundoApellido();
		String B = nuevoSocio.getNombre() + " " + nuevoSocio.getPrimerApellido() + " "
				+ nuevoSocio.getSegundoApellido();
		return A.compareToIgnoreCase(B);

	}

	/**
	 * M�todo getter del nombre.
	 * @return -> Devuelve un String nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo setter del nombre.
	 * @param nombre -> Recibe un String.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter del primer nodo.
	 * @return -> Devuelve el Nodo asociado a la primera posici�n.
	 */
	public Nodo getPrimerNodo() {
		return primerNodo;
	}

	/**
	 * M�todo setter del primer nodo.
	 * @param primerNodo -> Recibe un nodo.
	 */
	public void setPrimerNodo(Nodo primerNodo) {
		this.primerNodo = primerNodo;
	}

	/**
	 * M�todo getter del �ltimo nodo.
	 * @return
	 */
	public Nodo getUltimoNodo() {
		return ultimoNodo;
	}

	/**
	 * M�todo setter del �ltimo nodo.
	 * @param ultimoNodo -> Recibe un nodo.
	 */
	public void setUltimoNodo(Nodo ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	/**
	 * M�todo getter del tama�o.
	 * @return -> devuelve un int de size.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * M�todo setter del tama�o.
	 * @param size -> Recibe un int del tama�o.
	 */
	public void setSize(int size) {
		this.size = size;
	}

}
