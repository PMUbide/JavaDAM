
public class Ejer11_b_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 11: Escribe un programa Java que encuentre el segundo elemento
//		más largo de un array de Strings.
		String [] tabla = {"JUANCHO", "QUIKEeL", "JORGICOL","PABLO"};
		int num_primer=0;
		String nom_primer="";
		String nom_segun="";
		int num_segun=0;
		for(int i = 0; i < tabla.length; i++){
			if(i==0) {
				num_primer=tabla[i].length();
				nom_primer=tabla[i];
			
			}else {
				if (tabla[i].length()>num_primer ) {
					num_segun=num_primer;
					nom_segun=nom_primer;
					num_primer=tabla[i].length();
					nom_primer=tabla[i];
					
				}
				else if (tabla[i].length()>=num_segun ) {
					num_segun=tabla[i].length();
					nom_segun=tabla[i];
				}
			}
		}
			
		System.out.println("El segundo nombre " + nom_segun + " con "+num_segun+" letras.");
	}
}
	


