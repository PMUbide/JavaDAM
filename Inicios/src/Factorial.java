import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long resultado=1L;
		
		//Transformar el String que entra en el panel a integer.
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número."));
		
		
		//un factorial es 6!= 6x5x4x3x2x1
		for (int i=numero; i>0;i--) {
		
			resultado=resultado*i;
			
			
			
					
		}
		
		System.out.println("El factorial de "+ numero+ " es "+ resultado );
		
		
		
	}
}
