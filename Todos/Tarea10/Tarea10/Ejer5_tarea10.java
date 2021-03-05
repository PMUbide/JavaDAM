import java.util.Arrays;

public class Ejer5_tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tenemos la siguiente tabla:
//		String nombres[] = {&quot;Pepe&quot;, &quot;Juan&quot;, &quot;María&quot;, &quot;Antonio&quot;, &quot;Luisa&quot;};
//		Implementa un programa Java que ordene la tabla anterior
//		alfabéticamente, y muestre el resultado final por pantalla.
		String nombres [] = {"Bobo","Pepe","Juan","María", "Antonio", "Luisa","Dona"};
		//Arrays.sort(nombres);
		String aux="";
		for(int i=0;i<nombres.length;i++) {
			for( int x=i+1;x<nombres.length;x++) {
				if(nombres[i].compareToIgnoreCase(nombres[x])>0 ) {
					//Intercambiar los valores.
					aux=nombres[i];
					nombres[i]=nombres[x];
					nombres[x]=aux;
				}
			}
		}
		
		
		for (String i : nombres) {
             System.out.print(i + ", ");
            
        }
	}
}
