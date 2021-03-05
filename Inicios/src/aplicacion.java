import javax.swing.*;
public class aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Pablo";
				
		String pass="";		
		
		//equals se usa para comparar cadenas de texto.
		//a ver si clave es igual  a pass. Al principio nunca será igual. Por ello, mientras sea diferente,
		// saca una ventana pa preguntar., que se almacena en la variable pass. Entonces, cuando sean iguales
		

		// en el caso que no seuan iguales
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña, PERO YA");
			
			//si la clave es diferente, que haria en ese caso ?
			if (clave.equals(pass)==false) {
			
					System.out.println("Contraseña incorrecta"); 
			
			
			
			
		}
		
		
	}
		// si el While ya no se cumple, es contraseña incorrecta.
		
		System.out.println("Contraseña correcta, acceso permitido");

}}
