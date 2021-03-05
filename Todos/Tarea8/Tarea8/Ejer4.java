
public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un método Java llamado copiarTabla, el cual
//		recibe como parámetro una tabla de Strings, y devuelve una nueva tabla
//		con los elementos en orden inverso.
		String productos[]=  {"Kit-Kat","Lacasitos","KinderBueno","chocolate"};
		String[] tabla2=copiarTabla(productos);
		for(int u=0;u<tabla2.length;u++) {
			System.out.println(tabla2[u]);
		}
	}

	
	public static String[] copiarTabla(String tabla[]) { //Devolveria el PRINt, pero..¿Hay alguna manera de devolver la tabla 2 y mostrarla en el main?
		
		String tabla2[]=new String[tabla.length]; 
		int y=tabla.length-1;
		for(int i=0;i<tabla.length;i++) {
			tabla2[y]=tabla[i];
			y--;
		}
		return tabla2;
	}
}
