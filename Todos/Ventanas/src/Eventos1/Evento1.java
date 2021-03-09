package Eventos1;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Evento1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBoton2 miMarco = new MarcoBoton2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBoton extends JFrame{
	
	public MarcoBoton() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBoton2 miLamina = new LaminaBoton2();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaBoton extends JPanel implements ActionListener{
	
	//Añadir primer botón, con el nombre del botón.
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonVerde = new JButton("Verde");
	public LaminaBoton() {
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		//Un listener de tipo CLICK,
		//que el oyente será el que se va a cambiar.
		//Añadiendo la interfaz de ActionListener.
		botonAzul.addActionListener(this); //En este caso es la propia lámina.
		botonRojo.addActionListener(this); //En este caso es la propia lámina.
		botonVerde.addActionListener(this); //En este caso es la propia lámina.
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	/**
	 * Cuando clickamos, crea un objeto evento que se crea
	 * automáticamente y viaja a este método.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Programar lo que tiene que hacer.
		Object botonPulsado = e.getSource();
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}else if(botonPulsado.equals(botonVerde)) {
			setBackground(Color.GREEN);
		}else {
			setBackground(Color.RED);
		}
	}
}

