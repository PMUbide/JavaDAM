package Pilas;


public class Main_pilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo n1 = new Nodo(1);
		Nodo n2 = new Nodo(2);
		Nodo n3 = new Nodo(34);
		Pila nuevaP = new Pila();
		nuevaP.push(n1);
		nuevaP.push(n2);
		nuevaP.push(n3);
		System.out.println(nuevaP.getUltimo().getContenido());
		Nodo ultimo = nuevaP.pop();
		System.out.println(ultimo.getContenido());
		System.out.println(nuevaP.getUltimo().getContenido());
	}

}

