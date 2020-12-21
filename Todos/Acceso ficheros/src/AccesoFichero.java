import java.io.*;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero accediendo = new LeerFichero ();
		accediendo.lee();
	}
}
	class LeerFichero{
		
		public void lee() {
			try {
				FileReader entrada = new FileReader ("F:/Programacion/nuevo.txt");
				int c = entrada.read ();
				while (c != -1) {
					c = entrada.read ();
					char letra = (char) c;
					System.out.print (letra);
				}
				entrada.close();
			} catch (IOException e) { // Este método te obliga a tener el try/catch.
				// TODO Auto-generated catch block
				System.out.println ("No se ha encontrado el archivo.");
			}
		}
	}
	
	
	
