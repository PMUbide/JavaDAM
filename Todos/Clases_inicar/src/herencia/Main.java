package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal avestruz = new Animal("Julio", 0, 25 ); //uno gen�rico
		
		avestruz.mostrar();
	
		Perro perrito = new Perro ("Gordo", 4, 10); //otro especifico con un m�todo mostrar diferente en su clase para as� decir otra cosa
		
		perrito.mostrar();
		
		Delfin fliper = new Delfin ("Flipper", 0, 60, true);
	
		fliper.mostrar();
		
		Animal[] animales = {avestruz, perrito, fliper};
		for (int i = 0; i < animales.length; i++) {
			System.out.println("-----------------------");
			animales[i].mostrar();
		}
		
		//Ense�ar varios bucles.
		
		Delfin [] delfines = {fliper};
		
		
		
	}

}
