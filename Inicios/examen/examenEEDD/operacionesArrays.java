package examenEEDD;

public class OperacionesArrays {
	
	/**	Pre: [pArray] contiene el array de enteros a visualizar.
	 *	Post: Función que recibe un array de enterio y lo muestra por pantalla.
	 * 
	 * @param pArray
	 */
    public static void visualizarArray(int[] pArray){
	    for(int i=0;i<pArray.length;i++){
	    	System.out.print("\t" + pArray[i]);
	    }
    }

    /** Pre: [pMatriz] contiene el array de enteros a visualizar.
 	 *	Post: Función que rellena la matriz 5x5 con numeros consecutivos.
 	 * 
 	 * @param pMatriz
 	 */
    public static void inicializar(int[][] pMatriz){
        int aux = 1; 	// Creamos la variable aux y la inicializamos a 1
        for(int i = 0;i < pMatriz.length;i++){
        	for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = aux;
                aux++;
        	}
        }
    }
    
    /** Función que muestra el contenido del array 5x5.
     * 
     * @param pMatriz
     */
    public static void visualizarMatriz(int[][] pMatriz){
        System.out.println("\nArray 5x5");
        for(int i = 0;i<pMatriz.length;i++) {
        	for(int j = 0;j<pMatriz[i].length;j++) {
    			System.out.print("\t" + pMatriz[i][j]);
        	}
            System.out.println();
        }
    }
}
