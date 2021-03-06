package Swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Prueba_dibujo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoDibujo marco = new MarcoDibujo();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(System.getProperty("java.runtime.version"));
		int y = 10;
		comprobar(y);
	}
	
	public static void comprobar(int y) {
		
	}
	
	
	
	
}

class MarcoDibujo extends JFrame{
	public MarcoDibujo(){
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		LaminaDibujo miLamina = new LaminaDibujo();
		add(miLamina);
	}
}

class LaminaDibujo extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Para dibujar.
//		g.drawRect(50, 50, 200, 200);
//		g.drawLine(100, 100, 300, 200);
		//Ahora con la clase rectangle, dibujarlo.
		Graphics2D g2 = (Graphics2D) g; //Casting para redunfir el grapichs
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		//Ahora le mandas un Shape, que hereda de rectangulo.
		g2.draw(rectangulo);
		//Ahora dibujar una elipse.
		
	}
}