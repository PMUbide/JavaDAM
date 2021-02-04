package binarios_intro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class binarios_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/binarios/archivo1.bin";
		try {
			DataOutputStream nuevo = new DataOutputStream(new FileOutputStream (ruta));
			nuevo.writeInt(1000);
			nuevo.close();
			//Leer
			DataInputStream f = new DataInputStream(new FileInputStream(ruta));
			int numero = f.readInt();
			f.close();
			System.out.println(numero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
