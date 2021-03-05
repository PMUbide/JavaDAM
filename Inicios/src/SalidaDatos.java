import javax.swing.*;
public class SalidaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		
		System.out.println("Hola " + nombre_usuario + ". Tienes "+ (edad_usuario+1)+ " años.");
		
		
		
	}

}
