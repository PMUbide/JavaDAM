package Swing1;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JFrame;

public class Swing1 {

	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
		//hacer visible la ventana, de la clase window que jframe lo hereda.
		marco1.setVisible(true);
		/*Que hacer cuando se cierra. Es una constante de clase, definida en
		* enJframe, por eso hay que poner el nomnbre de la clase delante.
		* Así se establece el compotamiento de nuestro marco cuando lo cerremos.
		*/
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}



class miMarco extends JFrame{
	/*
	 * Constructor de una ventana.
	*/
	public miMarco() {
		setSize(500, 300);
//		setLocation(600, 300);
		//Le das todo de golpe,
//		setBounds(600, 300, 550, 350);
		//Impedir que se pueda redimensionar, es true por defecto
//		setResizable(false);
		//Método para poner pantalla completa.
//		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi ventanica");
		//Objeto toolkit para sacar la posicion en medio.
		Toolkit screen = Toolkit.getDefaultToolkit();
//		Dimension tamanoScreen = screen.getScreenSize();
//		int ancho = tamanoScreen.width;
//		int alto = tamanoScreen.height;
		//Entonces tendra que ser la mitad y la mitad.
//		setSize(ancho/2, alto/2);
//		setLocation(ancho/4, alto/4);
		//Con un método para ponerlo en medio.
		setLocationRelativeTo(null);
		//Ponerle otra imagen al icono.
		Image miIcono = screen.getImage("files/pizza_logo2.jpg");
			
		setIconImage(miIcono);	
	}
	
}