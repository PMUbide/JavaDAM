package Banco;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 2000000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 3000000);
		Cliente cl3 = new Cliente("Penélope Cruz", "00003",4000000);
		Cliente cl4 = new Cliente("Julio Iglesias", "0004", 4500000);
		Cliente cl5 = new Cliente("Julio Iglesias", "0004", 4500000);
		//ahora hacer coleccion
		//Por ejemplo el Set. Que no permite elementos duplicados.
		//y saseguro no elementos duplicados.
		//Set <Cliente> clientesBanco = new Set <>(); //no se puede instanciar una interfaz
		//Ahora habrá que implementar una clase de la interfaz SET.
		Set <Cliente> clientesBanco = new HashSet <>();
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		//equals & hashCode()
		if(cl4.equals(cl5)) { //Se ha sobrescrito el método equals y el hashCode
			System.out.println("Es igual");
			System.out.println(cl4.hashCode());
			System.out.println(cl5.hashCode());
		}else System.out.println("No es igual");
	
		
//		for (Cliente i : clientesBanco) {
//			System.out.println(i.toString());
//			System.out.println(i.hashCode());
//			
//			if(i.getNombre().equals("Julio Iglesias")) {
//				clientesBanco.remove(i);
//			}
			
//		}
		
//		Iterator <Cliente> it = clientesBanco.iterator();
//		while(it.hasNext()) {
//			String nombre_cliente = it.next().getNombre();
//			System.out.println(nombre_cliente);
//			
//		}
		
		
		//REMOVE mejor ITERATOR
		Iterator <Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			System.out.println(nombre_cliente);
			if(nombre_cliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		//visualizar.
		for (Cliente i : clientesBanco) {
			System.out.println(i.toString());
		}
		
		
		//Ahora habrá que ordenarlos. Con otra clase de la interfaz set?
		
	}

}
