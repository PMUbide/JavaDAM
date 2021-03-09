package MultiplesOyentes;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco = new MarcoAccion();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoAccion extends JFrame{
	public MarcoAccion() {
		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		PanelAction nueva = new PanelAction();
		add(nueva);
	}
}


class PanelAction extends JPanel{
	
	public Icon transformarIcono(String ruta) {
		ImageIcon imgIcon1 = new ImageIcon(ruta);
		Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
		return new ImageIcon(imgEscalada1);
	}
	
	public PanelAction() {
		ActionColor accion_amarillo = new ActionColor("Amarillo", transformarIcono("files/boton_amarillo.png"),
				Color.YELLOW);
		ActionColor accion_verde = new ActionColor("Verde", transformarIcono("files/boton_verde.png"),
				Color.GREEN);
		ActionColor accion_rojo = new ActionColor("Rojo", transformarIcono("files/boton_rojo.png"),
				Color.RED);
		//Constructor de boton con un parámetro ACTION
//		JButton botonAmarillo = new JButton(accion_amarillo);
		add(new JButton(accion_amarillo));
		add(new JButton(accion_verde));
		add(new JButton(accion_rojo));
		
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonVerde = new JButton("Verde");
		JButton botonRojo = new JButton("Rojo");
		add(botonAmarillo);
		add(botonRojo);
		add(botonVerde);*/
		//addlistener
	}

	
	/**
	 * clase que hereda de la clase Action
	 * DEBERA SER INTERNA PARA HEREDAR TBM DE JPANEL.!
	 * clase interna !!!!! 
	 * @author Pablo
	 * ENCAPSULADA PARA QUE NO SE PUEDA ACCEDER
	 */
	private class ActionColor extends AbstractAction{
		//Al pulsar el boton se crea un objeto, que
		//va a ir guardando los valores.
		public ActionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			//La clave de la informacion que le pasemos al boton.
			putValue("color_de_fondo", color_boton);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
		}
		
	}
}

