package a;

public class letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase= "Hola hijuesputas";
		
		System.out.println("   J    A   V     V   A");
		System.out.println("   J   A A   V   V   A A");
						
		
		
		System.out.println(System.currentTimeMillis());
				
		int i = 10;
		int nuevoNum = 10 * (++i);
		System.out.println(nuevoNum +" "+ i);
		
		System.out.println("Hola");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {}    // 1000L = 1000ms = 1 second
		System.out.println("Adios");
		int num1 = 1;
		int num2 = 2;
		double media = (1+2)/2.0;
		System.out.println(media);
	}

}
