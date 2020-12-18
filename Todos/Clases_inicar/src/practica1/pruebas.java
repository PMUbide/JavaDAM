package practica1;

public class pruebas {

	
	public static void ordenarPuntosA(Equipo [] tabla ) {
		//Creamos nuevas tablas que irán recogiendo la información de los equipos por partes.
		String [] equipo = new String [tabla.length];
		int [] puntos = new int[tabla.length];
		int [] ganados = new int [tabla.length];
		int [] perdidos = new int [tabla.length];
		int [] empatados = new int [tabla.length];
		int [] golesFavor = new int [tabla.length];
		//creamos un bucle para recoger los goles a favor ya que es el sumatorio dentro de un bucle.
		int golesTotal = 0;
		for (int i = 0; i < tabla.length; i++) {
			golesTotal = 0;
			Jugador [] pagoles = tabla[i].getJugadores();
				for (int j = 0; j < pagoles.length; j++) {
					golesTotal = golesTotal + pagoles[j].getGoles();
				}
			golesFavor[i] = golesTotal;
		}
//		for (int i = 0; i < golesFavor.length; i++) {
//			
//			System.out.println(golesFavor[i]);
//			
//		}
		//Bucle para ir rellenando los valores de las tablas con la información.
		for (int i = 0; i < tabla.length; i++) {
			equipo[i] = tabla[i].getNombreEquipo();
			puntos[i] = tabla[i].getPuntos();
			ganados[i] = tabla[i].getGanados();
			perdidos[i] = tabla[i].getPerdidos();
			empatados[i] = tabla[i].getEmpatados();
		}
		//Usamos un bucle anidado para ir ordenando.
        for(int i=0;i<(puntos.length);i++){
            for(int j=i+1;j<puntos.length;j++){
                if(puntos[i]<puntos[j]){
                    //Intercambiamos valores
                    //variables para ir almacenando.
                	int auxiliarNumero=puntos[i];
                    String auxiliarNombre = equipo [i];
                    int auxiliarGanados = ganados [i];
                    int auxiliarPerdidos = perdidos[i];
                    int auxiliarEmpatados = empatados[i];
                    int auxiliarGoles = golesFavor[i];
                    //Ahora se mueve el nuevo valor que es mayor a la posicion anterior.
                    puntos[i] = puntos[j];
                    equipo[i] = equipo [j];
                    ganados[i] = ganados[j];
                    perdidos[i] = perdidos[j];
                    empatados [i] = empatados [j];
                    golesFavor[i] = golesFavor [j];
                    //Ahora el valor de i que hemos sobrescrito y añadido al auxiliar se recupera en el valor de j
                    puntos[j] = auxiliarNumero;
                    equipo[j] = auxiliarNombre;
                    ganados[j] = auxiliarGanados;
                    perdidos[j] = auxiliarPerdidos;
                    empatados [j] = auxiliarEmpatados;
                    golesFavor[j] = auxiliarGoles;
                }
            }
        }
        //Ahora se van a visualizar la tabla de equipos por su orden.
		System.out.println("\n");
		System.out.println("CLASIFICACIÓN: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("--------- EQUIPO ------- GANADOS ----- EMPATES ------- PERDIDOS -------- PUNTOS ------ GOLES/Favor ----");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		for (int i = 0; i < tabla.length; i++) {
			if (equipo[i].length() < 13) {
				System.out.println((i+1) + ". " + equipo[i]+ "\t\t" + ganados[i] + "\t\t" + empatados[i] + "\t\t" + perdidos[i] + "\t\t"+  puntos[i] + "\t\t" + golesFavor[i]);
			}else {
				System.out.println((i+1) + ". " + equipo[i]+ "\t" + ganados[i] + "\t\t" + empatados[i] + "\t\t" + perdidos[i] + "\t\t"+  puntos[i] + "\t\t" + golesFavor[i]);
			}
		}
		System.out.println("_________________________________________________________________________________________________________");
	}
}
