import javax.swing.*;
public class aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Pablo";
				
		String pass="";		
		
		//equals se usa para comparar cadenas de texto.
		//a ver si clave es igual  a pass. Al principio nunca ser� igual. Por ello, mientras sea diferente,
		// saca una ventana pa preguntar., que se almacena en la variable pass. Entonces, cuando sean iguales
		

		// en el caso que no seuan iguales
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, PERO YA");
			
			//si la clave es diferente, que haria en ese caso ?
			if (clave.equals(pass)==false) {
			
					System.out.println("Contrase�a incorrecta"); 
			
			
			
			
		}
		
		
	}
		// si el While ya no se cumple, es contrase�a incorrecta.
		
		System.out.println("Contrase�a correcta, acceso permitido");

}}
