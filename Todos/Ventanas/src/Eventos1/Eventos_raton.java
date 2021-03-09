package Eventos1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos_raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMouse nuevo = new MarcoMouse();
//		nuevo.setVisible(true);
//		nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Scanner in = new Scanner(System.in);
		String select = "";
		System.out.println("Quieres abrir la ventana? (s/n)");
		while (!select.equals("s")) {
			select = in.next();
			if (select.equalsIgnoreCase("s")) {
				nuevo.setVisible(true);
			}

		}
	}

}

class E_Raton extends MouseAdapter {

	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getX() + "," + e.getY());
		System.out.println(e.getClickCount());
		System.out.println(e.getXOnScreen() + "," + e.getYOnScreen());
		if (e.getModifiersEx() == 0) {
			System.out.println("Izquierda");
		} else if (e.getModifiersEx() == 256) {
			System.out.println("Derecha");
		} else {
			System.out.println("Rueda");
			
		}

	}

}

class MarcoMouse extends JFrame {

	public MarcoMouse() {
		setTitle("Ratón!");
		setBounds(700, 300, 500, 300);
		LaminaMouse lamina = new LaminaMouse();
		add(lamina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		addMouseListener(new E_Raton());
//		setVisible(true);
	}

}

class LaminaMouse extends JPanel implements MouseListener, MouseMotionListener{

	public LaminaMouse() {
		//Listener de la propia lámina.! 
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	private int	posicionX	= 0;
	private int	posicionY	= 0;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (posicionX > 0 && posicionY > 0) {
			g.drawString("Posicion X: " + posicionX + "", 100, 150);
			g.drawString("Posicion Y: " + posicionY + "", 100, 180);
		}
	}

	@Override
	public void mouseClicked(
			MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("raton click " + arg0.getModifiersEx());
		posicionX = arg0.getX();
		posicionY = arg0.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Raton entra");
		setBackground(Color.gray);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("raton sale");
		setBackground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el ratón.");
		posicionX = arg0.getX();
		posicionY = arg0.getY();
		repaint();
	}
}