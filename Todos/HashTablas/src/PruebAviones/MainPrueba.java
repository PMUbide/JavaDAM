package PruebAviones;

import java.io.*;
import java.util.*;


public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer fichero
//		File f = new File(ruta);
		//En vez de un ArrayList,
		ArrayList<Accidentes> lista= new ArrayList<>();
		//Un Cellections map
		
		
		String fichero = "files/aviones_datos.dat";
		 //LEER
        try {
            ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream(fichero));
            while(oisFP.readObject() != null) {
            	Accidentes a = (Accidentes) oisFP.readObject();
                //lista.add((Accidentes)oisFP.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha importado ningún objeto");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROr");
        } catch (EOFException e) {
            System.out.println("Objetos importados correctamente.");
        } catch (IOException e) {
        	System.out.println("FAILED");
            //e.printStackTrace();
        }
        
//        for(int i = 0; i < lista.size(); i++) {
//        	System.out.println("hola");
//        	System.out.println(lista.get(i).getAnno());
//        }

	}

}
