package Layouts;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Layout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco extends JFrame{
	public Marco(){
		setTitle("Prueba de layout");
		setSize(400, 400);
		Lamina miLamina = new Lamina();
		//miLamina.setBackground(Color.RED);
		//Color pord efecto.
		miLamina.setBackground(SystemColor.window);
//		FlowLayout layaout = new FlowLayout(FlowLayout.LEFT);
//		miLamina.setLayout(new FlowLayout(FlowLayout.LEFT));
		miLamina.setLayout(new FlowLayout(FlowLayout.LEFT, 75, 100));
		
		
		add(new Jpanel());
	}
}


class Lamina extends JPanel{
	
	public Lamina() {
		add(new JButton("EA"));
		add(new JButton("NOO"));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Para dibujar.
	}
}
