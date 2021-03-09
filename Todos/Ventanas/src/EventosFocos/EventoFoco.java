package EventosFocos;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco nuevo = new Marco();
	}

}


class Marco extends JFrame implements WindowFocusListener {

	public Marco() {
		setTitle("FOCOS!");
		setBounds(700, 300, 500, 300);
		LaminaFoco lamina = new LaminaFoco();
		add(lamina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		addWindowFocusListener(this);
		setVisible(true);
	}

	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Ha ganado el foco.");
	}

	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Ha perdido el foco");
	}

}


class LaminaFoco extends JPanel{

	//Declaradas para la clase.
	JTextField cuadro1;
	JTextField cuadro2;
	
	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
		setLayout(null);
		
		cuadro1 = new JTextField();
//		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
//		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
//		add(cuadro2);
		cuadro1.addFocusListener(new LanzaFocos());
	}

	//CREAR CLASE OYENTE PARA LOS FOCOS.
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("cuadro foco ganado");
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("cuadro foco perdido");
			cuadro1 = (JTextField) arg0.getSource();
			String cadena = cuadro1.getText();
			System.out.println(cadena.length());
			System.out.println("Has escrito: " + cadena);
			boolean comprobacion = false;
			for (int i = 0; i < cadena.length(); i++) {
				if(cadena.charAt(i) == (char) 64) {
					//el simbolo de arroba.
					comprobacion = true;
				}
			}
			if(comprobacion) {
				System.out.println("es correcto");
			}
		}
		
	}
	
	
}



