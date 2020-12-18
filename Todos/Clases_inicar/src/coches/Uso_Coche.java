package coches;
import java.util.*;
public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche renault = new Coche();
		
		//renault.setRuedas(20);
		
		
		System.out.println(renault.getRuedas());
	
		renault.setColor("Verde","Oscuro");
		
		System.out.println(renault.getColor());

		
		System.out.println(renault.dimeTodo());
		
		//Pregunta por los asientos de cuero.
		System.out.println("Quieres asientos de cuero? S/n");
		Scanner in = new Scanner (System.in);
		renault.configura_asientos(in.next());
		System.out.println("Quieres climatizador? si/no");
		renault.setClimatizador(in.next());
		//Metodo geter para que nos lo diga.
		System.out.println(renault.getClimatizador()+ ". "+ renault.dime_asientos());
		
		System.out.println("El precio total según su configuración es: "+renault.getPrecio());
		
	}

}


