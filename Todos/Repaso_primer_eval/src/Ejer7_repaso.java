
public class Ejer7_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 7: Escribe un programa Java que multiplique dos números binarios,
//		escritos por el usuario.
		String num = "11";
		String num2 = "1101";
		double sum = 0;
		String [] tabla = new String [num.length()];
		tabla = num.split("");
		for(String i : tabla) {
			System.out.println(" " +i);
		}
		int longitud=tabla.length;
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i].equals("1")) {
				sum=sum + Math.pow(2, longitud-1);
			}
			longitud--;
			if (longitud==0){
				break;
			}
		}
		System.out.println(sum);
		System.out.println();
		String [] tabla2 = new String [num2.length()];
		tabla2 = num2.split("");
		for(String i : tabla2) {
			System.out.println(" " +i);
		}
		double sum2=0;
		int longitud2=tabla2.length;
		for(int i = 0; i < tabla2.length; i++) {
			if(tabla2[i].equals("1")) {
				sum2=sum2 + Math.pow(2, longitud2-1);
			}
			longitud2--;
			if (longitud2==0){
				break;
			}
		}
		System.out.println(sum2);
		System.out.println("La multiplicacion es :"+sum*sum2);
		double operacion = 0;
		int exponente = 0 ;
		while (operacion < (sum2*sum)) {
			operacion = operacion + Math.pow(2,exponente);
			exponente++;
		}
		System.out.println(exponente);
		exponente--;
		String [] tabla3 = new String [exponente+1];
		operacion = 0;
		int tablalero = 0;
		double multi = sum*sum2;
		while (exponente>-1) {
//			System.out.println("HHHHHHHHHHHHHHHHH");
			operacion = Math.pow(2,exponente);
			if(operacion <= multi) {
//				System.out.println("AAAAAAAAAAAAAAAAA");
				tabla3[tablalero]="1";
				multi= multi - operacion;
			}
			else tabla3[tablalero]="0";
			tablalero++;
			exponente--;
		}
		
		System.out.println("El resultado de multiplicar es: ");
		for(String i : tabla3) {
			System.out.print(" " +i);
		}

	}
}
