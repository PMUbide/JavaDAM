package MultiplesOyentes;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class AccionesTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMapa marco = new MarcoMapa();
		marco.setVisible(true);
			
	}

}


class MarcoMapa extends JFrame{
	public MarcoMapa() {
		setTitle("Prueba mapa entrada");
		setBounds(600, 450, 500, 300);
		Panel nueva = new Panel();
		add(nueva);
	}
}


class Panel extends JPanel{
	
	public Icon transformarIcono(String ruta) {
		ImageIcon imgIcon1 = new ImageIcon(ruta);
		Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
		return new ImageIcon(imgEscalada1);
	}
	
	public Panel() {
		AcctionColor accion_amarillo = new AcctionColor("Amarillo", transformarIcono("files/boton_amarillo.png"),
				Color.YELLOW);
		AcctionColor accion_verde = new AcctionColor("Verde", transformarIcono("files/boton_verde.png"),
				Color.GREEN);
		AcctionColor accion_rojo = new AcctionColor("Rojo", transformarIcono("files/boton_rojo.png"),
				Color.RED);
		//Constructor de boton con un parámetro ACTION
		add(new JButton(accion_amarillo));
		add(new JButton(accion_verde));
		add(new JButton(accion_rojo));
		
		
		//1ªCrear el mapa de entrada. la combinacion de teclas va a incidir en algo dentro
		//de la lámina.
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//2º Crear combinacion teclas.
//		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		//3ª Asignar combinación teclas a un objeto.
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_verde");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		//4ª Asignar el objeto a la accion.
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accion_amarillo);
		mapaAccion.put("fondo_verde", accion_verde);
		mapaAccion.put("fondo_rojo", accion_rojo);
		
		
	}


	
	
	/**
	 * clase que hereda de la clase Action
	 * DEBERA SER INTERNA PARA HEREDAR TBM DE JPANEL.!
	 * clase interna !!!!! 
	 * @author Pablo
	 * ENCAPSULADA PARA QUE NO SE PUEDA ACCEDER
	 */
	private class AcctionColor extends AbstractAction{
		//Al pulsar el boton se crea un objeto, que
		//va a ir guardando los valores.
		public AcctionColor(String nombre, Icon icono, Color color_boton) {
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
			System.out.println("Nombre: " + getValue(Action.NAME));
		}
		
	}
}
