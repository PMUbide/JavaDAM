
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int prob_difficulty = (int) (Math.random() * 100);
//		mostrarDifi();
		int num = 23;
		int u = num%10;
		int d = (num/10)%10;
		int c = (num/100)%10;
		System.out.println(c + " - " + d + " -" + u);
	}

	public static void mostrarDifi() {
		System.out.println((int) (Math.random() * 100));
		mostrarDifi();
	}
	
}
