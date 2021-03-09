package Eventos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class Eventos_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana marco = new MarcoVentana();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Marco 1");
		marco.setVisible(true);
		marco.setBounds(300, 300, 500, 350);
		MarcoVentana marco2 = new MarcoVentana();
		marco2.setTitle("Marco 2");
		marco2.setBounds(1000, 300, 500, 350);
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco2.setVisible(true);

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
//		setTitle("Respondiendo");
//		setBounds(500, 200, 700, 700);
		setVisible(true);
//		M_ventana oyente = new M_ventana();
//		addWindowListener(new ventana());
		addWindowStateListener(new ventana_cambia());
	}
}

/*
 * Clase adaptadora! puede utilizar esos métodos.
 * Para no tener que incluir todos los métodos de
 * la interfaz de WindowListener
 */
class ventana extends WindowAdapter{
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana maximizada");
	}
}

/*
 * Interfaz en caso de que cambie la ventana!
 */
class ventana_cambia implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado");
		System.out.println(arg0.getNewState());
	}
	
}


/**
 * La interfaz de windowListener implementa todos esos
 * métodos. 
 * Para evitar eso se usa una clase adaptadora!
 * @author Pablo
 *
 */
class M_ventana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana maximizada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	
}



