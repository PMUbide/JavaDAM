package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal avestruz = new Animal("Julio", 0, 25 ); //uno genérico
		
		avestruz.mostrar();
	
		Perro perrito = new Perro ("Gordo", 4, 10); //otro especifico con un método mostrar diferente en su clase para así decir otra cosa
		
		perrito.mostrar();
		
		Delfin fliper = new Delfin ("Flipper", 0, 60, true);
	
		fliper.mostrar();
		
		Animal[] animales = {avestruz, perrito, fliper};
		for (int i = 0; i < animales.length; i++) {
			System.out.println("-----------------------");
			animales[i].mostrar();
		}
		
		//Enseñar varios bucles.
		
		Delfin [] delfines = {fliper};
		
		
		
	}

}
