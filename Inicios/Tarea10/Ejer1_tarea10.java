

public class Ejer1_tarea10 {

	public static void main(String[] args) {
//		Tenemos la siguiente tabla multidimensional, la cual almacena
//		por cada una de sus filas el salario trimestral de cada uno de los
//		empleados de la empresa:
//		int salarios[][] = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} }
//		A su vez, disponemos tambi�n de una tabla empleados, con los nombres
//		de los trabajadores:
//		String empleados[] = {&quot;Javier Mar�as&quot;, &quot;Antonio Mu�oz&quot;, &quot;Isabel Allende&quot;}
//		Implementa un programa Java que muestre por pantalla lo siguiente:
//		Javier Mar�as ->; 700 + 900 + 1300 = 2900�
//		Antonio Mu�oz ->; 1000 + 950 + 1080 = 3030�
//		Isabel Allende ->; 1300 + 930 + 1200 = 3430�
		
		int salarios[][]= {{700,900,1300},{1000,950, 1080},{1300, 930, 1200}};
		String empleados[] = {"Javier Mar�as", "Antonio Mu�oz", "Isabel Allende"};
		int suma=0;	
		for(int i=0;i<salarios.length;i++) {
			System.out.print(empleados[i]+" -> ");
			for(int x=0;x<salarios.length;x++) {
				suma=suma+salarios[i][x];
			}
			for(int z=0;z<salarios.length;z++) {
				if(z==0)System.out.print( salarios[i][z]);
				else System.out.print( " + " + salarios[i][z]);
			}
			System.out.print(" = "+suma+"�" + "");
			System.out.println();
			suma=0;
			}
		}

}
