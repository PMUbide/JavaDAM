
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int prob_difficulty = (int) (Math.random() * 100);
		mostrarDifi();
		
	}

	public static void mostrarDifi() {
		System.out.println((int) (Math.random() * 100));
		mostrarDifi();
	}
	
}
