package Eventos1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Evento_teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTeclado marco = new MarcoTeclado();
		marco.setVisible(true);
//		marco.addKeyListener(new TeclaPresionada());
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

}


class MarcoTeclado extends JFrame{
	
	public MarcoTeclado() {
		setTitle("Tecladop");
		setBounds(700, 300, 500, 300);
		LaminaTeclado miLamina = new LaminaTeclado();
		add(miLamina);
		addKeyListener(miLamina);
		setVisible(true);
	}
}


//class TeclaPresionada implements KeyListener{
//	
//	@Override
//	public void keyPressed(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Tecla presionada " + arg0.getKeyCode());
////		setBackground(Color.BLUE);
//	}
//	
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

class LaminaTeclado extends JPanel implements KeyListener{
	
	
	//Añadir primer botón, con el nombre del botón.
	public LaminaTeclado() {
		System.out.println("EA");
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Tecla presionada");
		if(arg0.getKeyCode() == 50) {
			setBackground(Color.BLUE);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
}

