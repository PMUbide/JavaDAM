import java.util.Arrays;

public class Ejer2_tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Utilizando las mismas tablas del ejercicio anterior,
//		implementa un programa Java que ordene los salarios de cada uno de los
//		empleados de mayor a menor, y los muestre ordenados por pantalla de la
//		siguiente forma:
//		Javier Marías -> 700 / 900 / 1300
//		Antonio Muñoz -> 950 / 1000 / 1080
//		Isabel Allende -> 930 / 1200 / 1300
		int salarios[][]= {{700,900,1300},{1000,950, 1080},{1300, 930, 1200}};
		String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende"};
		int salarios2[][]=new int[salarios.length][salarios.length];
		for(int t=0;t<salarios.length;t++) {
			for(int i=0;i<salarios[t].length-1;i++){
		       
		            if(salarios[t][i]>salarios[t][i+1]){
		                //Intercambiamos valores
		                int variableauxiliar=salarios[t][i];
		                salarios[t][i]=salarios[t][i+1];
		                salarios[t][i+1]=variableauxiliar;
		            }
		        
			}
		}
		for(int i=0;i<salarios.length;i++) {
			System.out.print(empleados[i]+" -> ");
				for(int z=0;z<salarios.length;z++) {
					if(z==0)System.out.print( salarios[i][z]);
					else System.out.print( " / " + salarios[i][z]);
				}
			System.out.println();
		}
	}

}
