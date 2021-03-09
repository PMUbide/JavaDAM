package Swing1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing_img {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame {
	MarcoImagen() {
		setSize(600, 450);
		setLocationRelativeTo(null);
		setTitle("Primera imagen");
		// Incluiremos una lámina
		LaminaImagen miLamina = new LaminaImagen();
		add(miLamina);
		setVisible(true);

	}
}

class LaminaImagen extends JPanel {

	private Image imagen;

	public LaminaImagen() {
		try {
			imagen = ImageIO.read(new File("files/pizza_logo2.png"));
			System.out.println("imagen creada");
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagen, 0, 0, null);
//		g.copyArea(0, 0, imagen.getWidth(this), imagen.getHeight(this), 100, 100);

	}
}