
public class Ejer4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Implementa un programa Java con un m�todo llamado indexContains(String[] tabla, String cadena)
//		que devuelva el �ndice de la tabla cuyo valor es igual al valor de �cadena�.
//		En caso de no haber ning�n valor igual, devuelve -1

		String [] tabla1= {"Pablo", "Quike", "Jorge", "juan"};
		String cadena1="Juan";
		System.out.println("Posici�n: "+(indexContains(tabla1, cadena1)));
	}
	/**
	 * Este m�todo busca en la matriz esos numero.
	 * @param tabla
	 * @param cadena
	 * @return
	 */
	public static int indexContains (String[] tabla, String cadena) 
	{
		int resultado=-1;
		for (int i=0;i<tabla.length;i++) {
			if (tabla[i]==cadena) {
				resultado=(i+1);
			}
		}
		return resultado; 
	}
}
