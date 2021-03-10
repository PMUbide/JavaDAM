package MultiplesFuentes;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class variosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco marco = new Marco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco extends JFrame {
	public Marco() {
		setTitle("Prueba varios");
		setBounds(1300, 100, 300, 200);
		Panel panel = new Panel();
		add(panel);
	}
}

class Panel extends JPanel {

	private JButton	botonNuevo;
	private JButton	botonCerrar;

	public Panel() {
		botonNuevo = new JButton("Nuevo");
		botonCerrar = new JButton("Cerrar");
		add(botonNuevo);
		add(botonCerrar);
		// Ahora al pretar al boton tiene que llamar a la clase de crear clase.
		OyenteNuevo miOyente = new OyenteNuevo();
		botonNuevo.addActionListener(miOyente);
	}

	/**
	 * CLASE INTERNA
	 */
	private class OyenteNuevo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
		}

	}
}

/**
 * Constuir nuevas ventanas.
 * @author Pablo
 */
class MarcoEmergente extends JFrame {

	private static int contador = 0;
	
	/**
	 * Método para cerrar las pestañas.
	 * @author Pablo
	 *
	 */
	private class CierraTodos implements ActionListener{
		//Método que hereda y cierra de la clase WINDOW
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			dispose();
			contador = 0;
		}
		
	}
	
	//Referencia del boton
	public MarcoEmergente(JButton botonPrincipal) {
		contador ++;
		setTitle("Ventana " + contador);
		setBounds(40 * contador, 40 * contador, 300, 150);
//		CierraTodos oyenteCerrar = new CierraTodos();
		botonPrincipal.addActionListener(new CierraTodos());
	}
}
