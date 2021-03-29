package pruebas2;

public class MyAdvancedLinkedList {
	
	private int size = 0;
	private Nodo primerNodo;
	
	public MyAdvancedLinkedList(Nodo primerNodo) {
		this.primerNodo = primerNodo;
		size++;
	}
	
	public MyAdvancedLinkedList() {
		this.primerNodo = null;
		size = 0;
	}

	public void insert(Alumno a, int n) {
		if(n == 0) {
			Nodo nuevo = new Nodo (a, this.primerNodo);
			this.primerNodo = nuevo;
			size++;
		}else if(n < size - 1) {
			
			
			
		}
		else {
			Nodo ultimo = new Nodo(a, null);
			Nodo aux = this.primerNodo; //El primero
			for (int i = 1; i <= size-1 ; i++) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(ultimo);
			size++;
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Nodo getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Nodo primerNodo) {
		this.primerNodo = primerNodo;
	}
	
//	- public void insert(Object o, int n): Inserta un nuevo elemento en la lista, colocandolo en la posici�n n.
//	Si n es mayor que el tama�o de la lista, lo inserta en la �ltima posici�n. Si la lista est� vac�a,
//	lo inserta como primer y �nico elemento.
//	- public Object extract(int n): Elimina de la lista el elemento que est� en la posici�n n y devuelve el valor que dicho
//	elemento ten�a almacenado. Tras la ejecuci�n del m�todo, la posici�n n-1 deber� apuntar a la posici�n n+1. Si la lista es
//	demasiado corta, elimina el �ltimo elemento.
//	- public String toString(int n): Devuelve un String, que es la representaci�n textual del objeto almacenado en la posici�n n
//	de la lista. Si la lista tiene menos de n-1 posiciones, el m�todo devuelve null. La ejecuci�n de este m�todo no debe modificar
//	el contenido de la lista.
//	- public String toString(): Devuelve un String, que es el resultado de concatenar la representaci�n textual cada uno de los
//	objetos de la lista. Inserta un espacio entre cada dos elementos. La ejecuci�n de este m�todo no debe modificar el contenido
//	de la lista.
	//private Alumno alumno;
	
	
	
}
