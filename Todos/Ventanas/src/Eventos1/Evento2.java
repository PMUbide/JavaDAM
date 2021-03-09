package Eventos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento2 {

	public static void main(String[] args) {

		MarcoBoton2 miMarco = new MarcoBoton2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBoton2 extends JFrame{
	
	public MarcoBoton2() {
		setTitle("Botones y eventos 222");
		setBounds(700, 300, 500, 300);
		LaminaBoton2 miLamina = new LaminaBoton2();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaBoton2 extends JPanel{
	
	//Añadir primer botón, con el nombre del botón.
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonVerde = new JButton("Verde");
	public LaminaBoton2() {
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		//Instanciar Colorfondo
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		ColorFondo verde = new ColorFondo(Color.GREEN);
		//Un listener de tipo CLICK,
		//que el oyente será el que se va a cambiar.
		//Añadiendo la interfaz de ActionListener.
		//Se le pasará el objeto que se va a cambiar.
		botonAzul.addActionListener(azul); 
		botonRojo.addActionListener(rojo); 
		botonVerde.addActionListener(verde); 
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}
	
	/** CLASE INTERNA DE LAMINA BOTONES
	 * Es el que va a cambiar cuando se clicke.
	 * implmenmeta el actionListener.
	 * @author Pablo
	 *
	 */
	private class ColorFondo implements ActionListener{

		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
	}
	
}

