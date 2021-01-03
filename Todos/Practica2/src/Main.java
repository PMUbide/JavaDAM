import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] tablero = new String[5][5];
		
		tablero [0][0] = new String ("");
		tablero [0][1] = new String ("");
		tablero [0][2] = new String ("");
		tablero [0][3] = new String ("");
		tablero [0][4] = new String ("");
		
		
		tablero [1][0] = new String ("");
		tablero [1][1] = new String ("");
		tablero [1][2] = new String ("*");
		tablero [1][3] = new String ("");
		tablero [1][4] = new String ("");
		
		
		tablero [2][0] = new String ("");
		tablero [2][1] = new String ("");
		tablero [2][2] = new String ("*");
		tablero [2][3] = new String ("");
		tablero [2][4] = new String ("");
		
		
		tablero [3][0] = new String ("");
		tablero [3][1] = new String ("");
		tablero [3][2] = new String ("*");
		tablero [3][3] = new String ("");
		tablero [3][4] = new String ("");
		
		
		tablero [4][0] = new String ("");
		tablero [4][1] = new String ("");
		tablero [4][2] = new String ("");
		tablero [4][3] = new String ("");
		tablero [4][4] = new String ("");
		
		//Muestra el tablero inicial
		System.out.println("INICIAL \n");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.printf("%5s", tablero[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		//Copia del tablero inicial para ir haciendo los cambios en cada generación.
		String [][] tablero2 = new String[tablero.length][tablero.length];
		//Copiar tablero inicial.
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero2[i][j] = tablero[i][j]; 
			}
		}
		int generacion = 0;
		
		boolean estado; //Si es TRUE esta viva, y si es FALSE esta muerta.
		Scanner in = new Scanner (System.in);
		/**
         * Recorre el tablero comprobando en todas las casillas sus
         * alrrededores. Comprobamos su estado. Si está 0: si tiene 3 activos
         * entonces 1. Si está 1: si tiene 2 o 3 activos entonces 1. Si está 1:
         * si tiene menos de 2 activos entonces 0
         */
		while(generacion < 1) {
			for (int i = 0; i < tablero.length  ; i++) {
				for (int j = 0; j < tablero[i].length ; j++) {
					String casilla = tablero[i][j]; //Bucle que va a ir comprobando la casilla 
					if (casilla.equals("")) { //Primero si la casilla está MUERTA. Puede vivir si hay 3 vivas Exactamente alrededor o seguir muerta.
						estado = comprobarCasilla (false, i, j, tablero); //Envía directamente que es False, que está muerta.
					}
					//Si la celula esta viva
					else {
						//Podrá sobrevivir si hay 2 o 3 celulas vivas. Muere si hay más de 3 o menos de 1.
						estado = comprobarCasilla (true, i, j, tablero);
					}
					//ahora actualizamos el tablero SECUNDARIO. Porque va a seguir haciendo la comprobación con el principal.
					if (estado) {
						//Si esta vivo.
						tablero2[i][j] = "*";
					}
					else {
						//o si resulta morir
						tablero2[i][j] = "";
					}
					
				}
//				int aa = in.nextInt();
//				for (int a = 0; a < tablero.length; a++) {
//					for (int b = 0; b < tablero[a].length; b++) {
//						System.out.printf("%5s", tablero[a][b]);
//					}
//					System.out.println();
//				}
			}
			generacion++;
			//Ahora colocar como ha quedado el tablero después del bucle a la siguiente generación con otra completada del bucle..
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					tablero[i][j] = tablero2[i][j]; 
				}
			}
		
		}
		
		
		System.out.println("FINAL		generaciones: " + generacion);
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.printf("%5s", tablero[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
    
	/**
     * Comprobar si la casilla tiene 
     * @param estado muestra el estado de la célula
     * @param i coordenada en el eje x de la matriz
     * @param j coordenada en el eje y de la matriz
     * @return true si debe vivir o sobrevivir y false si va a morir.
     */
    public static boolean comprobarCasilla(boolean estado, int i, int j, String[][] tablero) {
    	/**
    	* 		i-1, j-1	|______i - 1 , j____|  i-1 , j + 1
    	 * 		i,   j-1	|	Casilla(i,j)	|  i   , j + 1
    	 * 		i+1, j-1	|___________________|  i+1 , j + 1
    	 * 						   i + 1, j
    	 */
		int count = 0;
	    //En la casilla analiza si encuentra una VIVA en los alrededores va sumando el contador.
		//Para comprobar al final que le pasará a la casilla que está anlizando.
		try{
	        if(tablero[i-1][j-1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i-1][j].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i-1][j+1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i][j-1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i][j+1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i+1][j-1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i+1][j].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        if(tablero[i+1][j+1].equals("*")) count++;
	    }catch(ArrayIndexOutOfBoundsException e){}
	    //Si está muerta y tiene 3 vivas alrededor revivira y devuelve TRUE.
	    if(!estado && count == 3) return true;
	    //si está viva y tiene 2 o 3 vivas sigue viva,
	    if(estado && count==2 || count==3) return true;
	    //de lo contrario en todos los otros casos muere.
	    return false;
	}
	
		
	
	
	
}
