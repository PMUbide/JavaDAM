
public class Ejer10_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 10: Escribe un programa Java que muestre por pantalla todos los
//		posibles números de 3 dígitos que se pueden crear con los números 1, 2, 3 y
//		4. Además, debe devolver la cuenta del número total de posibilidades.
		// 4 ^3 sería el numero de combinaciones que te va a salir.
		int cont = 0;
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=4 ; j++){
				for(int k = 1; k <= 4; k++) {		
					System.out.println(i+""+j+""+k);
					cont++;
				}
			}
		}
		System.out.println(cont+" combinaciones.");
	}

}
