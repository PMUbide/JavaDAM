package Swing1;

import javax.swing.*;
import java.awt.*;
public class Swing_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marco extends JFrame{
	Marco(){
		setVisible(true);
		setSize(600, 450);
		setLocationRelativeTo(null);
		setTitle("Primer texto");
		//Incluiremos una l�mina
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		//Que haga lo que est� programado, y adem�s lo que le decimos,
		//Un Overide no del todo.
		//Que haga lo que haga la super, y luego lo q le digamos nosotros.
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo", 100, 100);
		
	}
}