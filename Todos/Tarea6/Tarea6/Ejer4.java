
public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribe un programa Java que muestre el siguiente patrón (hasta 7, tal
				cual se muestra en el ejemplo). Pista: debes utilizar 3 bucles.
		*/
		int contador=6;
		for(int i=1;i<=7;i++) {
			for (int x=1;x<=i;x++) {
				System.out.print(x);
			}
			for (int y=contador;y>0;y--) {
				System.out.print("*");
			}
			contador--;
			System.out.println();
		}
	}
}
