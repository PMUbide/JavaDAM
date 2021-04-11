import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Club nuevoClub = new Club("LOS MEJORES");
		
		ArrayList<Club> lista = new ArrayList<Club>();
		
//		Socio uno = new Socio("ZZatsAblo", "abc", "1234", "ase");
//		Socio dos = new Socio("Edurne", "abc", "1234", "ase");
//		Socio tres = new Socio("bdurne", "abc", "1234", "ase");
//
//		nuevoClub.incorporacion(uno);
//		nuevoClub.incorporacion(dos);
//		nuevoClub.incorporacion(tres);
//		nuevoClub.incorporacion(new Socio("Cesar", "ZAatruste", "ab", "ase"));
//		nuevoClub.incorporacion(new Socio("Cesario", "abc", "ac", "ase"));
//		nuevoClub.incorporacion(new Socio("AAAAAAAAaaablo", "bbc", "1234", "ase"));
		
//		nuevoClub.escribirFichero();
		
//		mostrarSocios(nuevoClub);
		
		Club nuevoClub = new Club("LOS MEJORES");
//		
//		
//		Socio uno = new Socio("ZZatsAblo", "abc", "1234", "ase");
//		Socio dos = new Socio("Edurne", "abc", "1234", "ase");
//		Socio tres = new Socio("bdurne", "abc", "1234", "ase");
//		System.out.println(("aatsAblo").compareToIgnoreCase("bdurne"));
//
//		nuevoClub.incorporacion(uno);
//		nuevoClub.incorporacion(dos);
//		nuevoClub.incorporacion(tres);
//		nuevoClub.incorporacion(new Socio("Cesar", "ZAatruste", "ab", "ase"));
//		nuevoClub.incorporacion(new Socio("Cesario", "abc", "ac", "ase"));
//		nuevoClub.incorporacion(new Socio("AAAAAAAAaaablo", "bbc", "1234", "ase"));

//		
//		for (int i = 0; i < 200000; i++) {
//			Random r = new Random();
//			Random t = new Random();
//			Random v = new Random();
//			String alphabet = "abcdefghijklmopqrstuvwxyz";
//			String ea = alphabet.charAt(r.nextInt(alphabet.length())) + "";
//			String eo = alphabet.charAt(t.nextInt(alphabet.length())) + "";
//			String eu = alphabet.charAt(v.nextInt(alphabet.length())) + "";
////		    System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
//		    nuevoClub.incorporacion(new Socio(ea, eo, eu, "ase"));
//		}

//		nuevoClub.borrado("Edurne", "abc", "1234");
//		
//		
//		Club otroClub = new Club("LOS PEORES");
//		otroClub.incorporacion(new Socio("Gordo", "abc", "ac", "ase"));
//		otroClub.incorporacion(new Socio("Flaco", "abc", "ac", "ase"));
//		otroClub.incorporacion(new Socio("FEO", "bbc", "1234", "ase"));
//		mostrarSocios(nuevoClub);
//		System.out.println("___________");
//		mostrarSocios(otroClub);
//		System.out.println("___________");
//		Club union = new Club("La union");
//		
		
//		System.out.println(union.isEmpty());
//		union.union(nuevoClub, otroClub);
//		
		
		
//		System.out.println(union.getSize());
//		
////		mostrarSocios(union);
//		System.out.println(union.isEmpty());
//		
//		System.out.println("Pertenece ?");
//		
//		System.out.println(nuevoClub.pertenencia("c", "bbc", "1234"));
		
		leerFichero(lista);
		
		mostrarSocios(lista.get(0));

	}

	public static void mostrarSocios(Club club) {
		if (club.getSize() == 0) {
			System.out.println("Está vacío.");
			return;
		}
		Nodo puntero = club.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < club.getSize()) {
			System.out.println(puntero.getContenido().toString());
			puntero = puntero.getSiguiente();
			cont1++;
		}
	}
	
	public static void leerFichero(ArrayList<Club> lista) {
		try {
			FileInputStream fi = new FileInputStream("files/clubs.dat");
			ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream("files/clubs.dat"));
			while (true) {
				lista.add((Club) oisFP.readObject());
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
	}
	
}
