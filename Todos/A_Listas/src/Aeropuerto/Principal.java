package Aeropuerto;

import java.util.ArrayList;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasajero uno = new Pasajero("Luis", "123123123H", 123);
		Pasajero dos = new Pasajero("Elena", "321321321D", 23);
		Pasajero tres = new Pasajero("Carmen", "17799874X", 123);
		Pasajero cuatro = new Pasajero("Manuel", "22669988D", 123);
		Pasajero cinco = new Pasajero("Será el segundo", "22669988D", 123);
		
		/*Primero entrada al aeropuerto*/
		Cola cola = new Cola();
		Pila pila = new Pila();
		entrada(uno, cola, pila);
		entrada(dos, cola, pila);
		entrada(tres, cola, pila);
		entrada(cuatro, cola, pila);
		entrada(cinco, cola, pila);
		
		/*Entregar la documentación y entrar al avión*/
		Aeropuerto principal = new Aeropuerto("El grande");
		principal.pushAvion(new Avion(123));
		principal.pushAvion(new Avion(23));
//		
//		entregaDocumentacion(cola, pila, principal);
//		entregaDocumentacion(cola, pila, principal);
////		entregaDocumentacion(cola, pila, principal);
////		entregaDocumentacion(cola, pila, principal);
//		
		System.out.println(cola.getPrimerNodo().getContenido().getNombre());
		System.out.println(pila.getPrimerNodo().getContenido().getNombre());
		System.out.println(pila.getUltimoNodo().getContenido().getNombre());
		
		mostrar(cola);
		entregaDocumentacion(cola, pila, principal);
		entregaDocumentacion(cola, pila, principal);
		entregaDocumentacion(cola, pila, principal);
		entregaDocumentacion(cola, pila, principal);
		entregaDocumentacion(cola, pila, principal);
		
		mostrar(cola);
		mostrar(pila);
		
		System.out.println("_____________________________________________");
		
		
		for (int i = 0; i < principal.getAviones().size(); i++) {
			System.out.println("Pasajeros avion " + principal.getAviones().get(i).getId());
			ArrayList<Pasajero> personasBordo = principal.getAviones().get(i).getIntegrantes();
			for (int j = 0; j < personasBordo.size(); j++) {
				System.out.println(personasBordo.get(j).getNombre());
			}
		}
		
		
		System.out.println("Relog prueba: ");
		int hora = 0;
		int  minuto = 0;
		int segundo = 0;
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				segundo = 0;
				for (int j2 = 0; j2 < 60; j2++) {
					try {
						Thread.sleep(1000L);
						segundo++;
						System.out.println("Hora: " + hora + " minuto " + minuto + " segundos " + segundo);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   
				}
				minuto++;
			}
			hora++;
		}
		
		
	}
	
	
	
	public static void mostrar(Pila c) {
		System.out.println("MOSTRAR PILA: ");
		if(c.getUltimoNodo() != null) {
			Nodo puntero = c.getUltimoNodo();
			System.out.println(puntero.getContenido());
			for (int i = 1; i < c.getSize(); i++) {
				puntero = puntero.getSiguiente();
				System.out.println(puntero.getContenido());
			}
		}else {
			System.out.println("PILA vacía");
		}
	}
	
	
	
	public static void mostrar(Cola c) {
		System.out.println("MOSTRAR COLA: ");
		if(c.getPrimerNodo() != null) {
			Nodo puntero = c.getPrimerNodo();
			System.out.println(puntero.getContenido());
			for (int i = 1; i < c.getSize(); i++) {
				puntero = puntero.getSiguiente();
				System.out.println(puntero.getContenido());
			}
		}else {
			System.out.println("COla vacía");
		}
	}
	
	
	
	public static void entregaDocumentacion(Cola cola, Pila pila, Aeropuerto aero) {
		Nodo elegido = new Nodo();
		if(cola.getSize() != 0) {
			elegido = cola.remove();
		}
		else {
			elegido = pila.pop();
		}
		for (int i = 0; i < aero.getAviones().size(); i++) {
			if(aero.getAviones().get(i).getId() == elegido.getContenido().getNumVuelo()) {
				aero.getAviones().get(i).subirPasajero(elegido.getContenido());
			}
		}
	}
	
	
	public static void entrada(Pasajero pasajero, Cola cola, Pila pila) {
		System.out.println(cola.getSize());
		if(cola.getSize() < 2) {
			System.out.println("Entra en la cola");
			cola.insert(new Nodo(pasajero));
		}else {
			System.out.println("Entra en la pila");
			pila.push(new Nodo(pasajero));
		}
	}
}
