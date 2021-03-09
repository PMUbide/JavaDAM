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
		//Incluiremos una lámina
		Lamina miLamina = new Lamina();
		add(miLamina);
		
		//miLamina.setForeground(fg); //Color por defecto de lo que añadamos.
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		//Que haga lo que está programado, y además lo que le decimos,
		//Un Overide no del todo.
		//Que haga lo que haga la super, y luego lo q le digamos nosotros.
		super.paintComponent(g);
		g.setFont(new Font("Comic Sans MS", 30, 30));
		g.drawString("Estamos aprendiendo", 100, 100);
		g.setColor(Color.BLUE);
		
		g.drawString("Asi que no me jodas", 100, 150);
		//Saber que tipos de letras hay en ese objeto.
		String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String string : nombresFuentes) {
			System.out.println(string);
		}
	}
}