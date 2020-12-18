import javax.swing.*;
public class peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//peso ideal hombre= altura-110
		//peso ideal mujer=altura - 85

		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
						
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		// va a salir la pantallita mientras lo que pongas sea diferente a H o M.
		
		//el joption mete un string, aunque sea estático. Entonces se usa el parseInt pa cambiarlo. que pertenece a la clase Integer.
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal=0;
		
		if (genero.equalsIgnoreCase("H")){
				pesoideal=altura-110;
				
			
		}		
		
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal=altura-120;
			
		}
		
		System.out.println("Tu peso ideal es "+ pesoideal +" kg.");
		
		
		
		
		
		
		
	}

}
