import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Aviones.AccidenteAnual;

public class LeerObjetos2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccidenteAnual otro = new AccidenteAnual("2000", 12);
		AccidenteAnual otro2 = new AccidenteAnual("2220", 156);
		ArrayList <AccidenteAnual> lista = new ArrayList<>();
		
        File fichero= new File("files/ficheroAlquileres.dat");
        
      //ESCRIBIR
        
      try {
            FileOutputStream f = new FileOutputStream(fichero);
            
            ObjectOutputStream oosFP = new ObjectOutputStream(f);
//            for(AccidenteAnual	 i: lista) {
                oosFP.writeObject(otro);
                oosFP.writeObject(otro2);
//            }
            oosFP.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
        }
        
        //LEER
        try {
        	
        	FileInputStream fi = new FileInputStream(fichero);
        	
            ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream(fichero));
            while(true) {
                lista.add((AccidenteAnual)oisFP.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha importado ningún objeto");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Objetos importados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(int i = 0; i < lista.size(); i++) {
        	System.out.println("hola");
        	System.out.println(lista.get(i).getAnno());
        }
        
        
        
	}
}