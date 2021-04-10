import java.util.ArrayList;

public class Club {
	private String	nombre;
	private Nodo	primerNodo;
	private Nodo	ultimoNodo;
	private int		size;

	/*
	 * Constructor por defecto.
	 */
	public Club(String nombre) {
		this.nombre = nombre;
		this.primerNodo = null;
		this.ultimoNodo = null;
		size = 0;
	}

	/**
	 * Añadir un socio al club, por orden alfabético.
	 */
	public void incorporacion(Socio nuevoSocio) {
		//En caso de que esté vacío.
		Nodo nuevo = new Nodo(nuevoSocio);
		if(size == 0) {
			primerNodo = nuevo;
			ultimoNodo = nuevo;
			size++;
			return;
		}
		//En caso de que no esté vacío.
		//Gestión de orden alfabético.
		//Si no tiene un null a la derecha.
		Nodo puntero = ultimoNodo;
		
		int contador = 0;
		while(contador <= size-1) {
			//Si lo puede meter a la derecha
			if(comparacion(puntero, nuevoSocio) < 0) {
//				Nodo nuevo = new Nodo(nuevoSocio);
				if(puntero.getSiguiente() != null) {
					puntero.getSiguiente().setAnterior(nuevo);
					nuevo.setSiguiente(puntero.getSiguiente());
					System.out.println(puntero.getSiguiente());
				}else {
					ultimoNodo = nuevo;
				}
				puntero.setSiguiente(nuevo);
				nuevo.setAnterior(puntero);
				size++;
				return;
			} else {
				if(puntero.getAnterior() != null) {
					puntero = puntero.getAnterior();
				}else {
//					Nodo nuevo = new Nodo(nuevoSocio);
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

	
	public void borrado(String nombre, String primerApellido, String segundoApellido) {
		Nodo puntero = primerNodo;
		int cont1 = 0;
		
		while (cont1 < size) {
			//Si coincide los nombres y apellidos.
			if(comparacion(puntero,
					new Socio(nombre, primerApellido, segundoApellido, "avc")) == 0) {
				//comprobar si hay otro igual.
				if(comparacion(puntero.getSiguiente(), puntero.getContenido()) != 0){
					//Lo ha comparado con el siguiente y no es igual lo elimina.
					puntero.getSiguiente().setAnterior(puntero.getAnterior());
					puntero.getAnterior().setSiguiente(puntero.getSiguiente());
					size--;
				}else {
					//Lo ha comprado y el siguiente es igual, habrá que elegir cual borrar.
					
				}
			}
			puntero = puntero.getSiguiente();
			cont1++;
		}
		
//		if(iguales.size() == 1) {
//			puntero.getSiguiente().setAnterior(puntero.getAnterior());
//			puntero.getAnterior().setSiguiente(puntero.getSiguiente());
//			size--;
//			
//		}else {
//			System.out.println("Existen los siguientes socios con los mismos nombres: ");
//			for (Socio socio : iguales) {
//				System.out.println(socio.toString());
//			}
//			System.out.println("¿cual quieres eliminar?");
//			int eliminado = 1; 
//			puntero = primerNodo;
//			cont1 = 0;
//			while (cont1 < size) {
//				if(comparacion(puntero,
//						new Socio(nombre, primerApellido, segundoApellido, "avc")) == 0 &&
//						puntero.getContenido().getFechaEntrada().equalsIgnoreCase(iguales.get(eliminado-1).getFechaEntrada())) {
//					puntero.getSiguiente().setAnterior(puntero.getAnterior());
//					puntero.getAnterior().setSiguiente(puntero.getSiguiente());
//					size--;
//				}
//				puntero = puntero.getSiguiente();
//				cont1++;
//			}
//		}
		
		
//		System.out.println("No coincide el socio.");
	}
	
	public void union(Club uno, Club dos) {
		//Club unido = new Club(nombreUnion);
		Nodo puntero1 = uno.getPrimerNodo();
		Nodo puntero2 = dos.getPrimerNodo();
		int cont = 0;
		boolean incorpora1 = true;
		boolean incorpora2 = true;
		while (cont < uno.size + dos.size) {
			if(incorpora1) {
				incorporacion(puntero1.getContenido());
				incorpora1 = false;
			}
			if(incorpora2) {
				incorporacion(puntero2.getContenido());
				incorpora2 = false;
			}
			if(puntero1.getSiguiente() != null) {
				puntero1 = puntero1.getSiguiente();
				incorpora1 = true;
			}
			if(puntero2.getSiguiente() != null) {
				puntero2 = puntero2.getSiguiente();
				incorpora2 = true;
			}
			cont++;
		}
	}
	
	
	
	
	//Interrogación sobre la pertenencia de un socio a un club.
	
	public boolean pertenencia(String nombre, String apellido, String segundo ) {
		Nodo puntero = primerNodo;
		int cont = 0;
		Socio nuevo = new Socio(nombre, apellido, segundo, "00000");
		while (cont < size) {
			System.out.println(puntero.getContenido().toString());
			if(comparacion(puntero, nuevo) == 0) {
				return true;
			}
			puntero = puntero.getSiguiente();
			cont++;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	
	public void mostrarClub(Club club) {
		Nodo puntero = club.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < club.getSize()) {
			System.out.println(puntero.getContenido().toString());
			puntero = puntero.getSiguiente();
			cont1++;
		}
	}
	
	
	
	/**
	 * Método compara Dos palabras alfabéticamente.
	 * @param nuevoSocio
	 * @return
	 */
	public int comparacion(Nodo puntero, Socio nuevoSocio) {
		Socio elegido = puntero.getContenido();
		String A = elegido.getNombre() + " " + elegido.getPrimerApellido() + " " + elegido.getSegundoApellido();
		String B = nuevoSocio.getNombre() + " " + nuevoSocio.getPrimerApellido() + " " + nuevoSocio.getSegundoApellido();
		return A.compareToIgnoreCase(B);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Nodo getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Nodo primerNodo) {
		this.primerNodo = primerNodo;
	}

	public Nodo getUltimoNodo() {
		return ultimoNodo;
	}

	public void setUltimoNodo(Nodo ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	

	
	
	
}
