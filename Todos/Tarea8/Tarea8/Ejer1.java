
public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[]={4,1,4,1,4,1,1,1,44,4,1,4,4,4,1,1};
		calcularModa(tabla);
	}

	public static void calcularModa(int tabla[]) {
		int cont_prin=0;//el que ira contando cada bucle 
		int cont_max=0;//el que se reestablecera como el que mayor numero de veces
		//int num=0;//para no repetir el mismo numero cuando avanza una posicion en el bucle.
		int elegido=0; //el numero que se mostrará como LA MODA
		int tabla_elegidos []=new int [tabla.length];
		int z=0; //Para ir sumando a la tabla de los elegidos.
		for(int i=0;i<tabla.length;i++) {
			cont_prin=0;
			for(int y=i+1;y<tabla.length;y++) {
				if(tabla[i]==tabla[y]) {
					cont_prin++;
				}	
			}
			if (cont_prin>cont_max) {
				cont_max=cont_prin;
				if (tabla[i]==tabla[1]) {
					elegido=tabla[i];
					tabla_elegidos[z]=tabla[i];
					z++;
				}
				
				//elegido2=tabla[i];
			}
		}
		System.out.println("La moda de la tabla es el número " +elegido);
	}
}
