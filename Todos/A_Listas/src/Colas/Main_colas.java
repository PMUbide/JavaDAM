package Colas;

public class Main_colas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo n1 = new Nodo(1);
		Cola nuevaC = new Cola();
		nuevaC.insert(n1);
		Nodo n2 = new Nodo(3);
		Nodo n3 = new Nodo(4);
		
		System.out.println(sum(10));
		
	}

	public static void mostrar(Cola c) {
		Nodo puntero = c.getFirst();
		System.out.println(puntero.getContenido());
		for (int i = 1; i < c.getSize(); i++) {
			puntero = puntero.getSiguiente();
			System.out.println(puntero.getContenido());
		}
	}
	
	public static int sum(int n) {
		if (n >= 1) {
	        return sum(n - 2) + n;
	    }
	    return 1;
	}
	
}
