package examen;

public class aaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nueva="holaao";
		String Letra;
		int cont=0;
		
		
		for(int i=0;i<nueva.length();i++) {
			Letra = nueva.substring(i,i+1);
			System.out.println(Letra);
			for (int d=i+1;d<nueva.length();d++) {
				if (Letra.equals(nueva.substring(d,d+1))) {
					cont++;
				}
			}
			
		}
		
		System.out.println(cont);
	}


}