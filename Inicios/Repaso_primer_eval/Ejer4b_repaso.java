
public class Ejer4b_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 4: Escribe un programa Java que dado un String, elimine de este los
//		caracteres “b” y “ac”.
		String pal="bastaco";
		pal=pal.replaceAll("b","");
		pal=pal.replaceAll("ac","");
		System.out.println(pal);
	}

}
