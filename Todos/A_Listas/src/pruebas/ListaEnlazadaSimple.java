package pruebas;

public class ListaEnlazadaSimple {
	private int size; //tamaño de la lista
	private Nodo primerNodo; //Nodo que empieza.
	
	public ListaEnlazadaSimple() {
		primerNodo = null;
		size = 0; 
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
	public void setPrimerNodo(Nodo a) {
		primerNodo = a;
	}
	
	public void aumentarUno(Nodo a){
		if(size == 0) {
			primerNodo = a;
		}else {
			Nodo puntero = primerNodo; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size) {
				puntero = puntero.getSiguiente();
				i++;
			}
			puntero.setSiguiente(a);
		}
		size++;
	}
	
	
}
