import java.util.Scanner;

public class G {
	static Scanner sc;

	 public static void main(String[] args){
	        sc = new Scanner(System.in);
	        String casos = sc.nextLine();
	        for (int i = 0; i < Integer.parseInt(casos); i++) {
	        	casosDePrueba();
			}
	    }
	 
	    public static void casosDePrueba(){
	            String num = sc.nextLine();
	            int numCasos = Integer.parseInt(num);
	            for(int i = 0; i < numCasos; i++){
	                String linea = sc.nextLine();
	                String[] lineaSep = linea.split(" ");
	                int[] valores = new int[4];
	                for(int j = 0; j < 4; j++){
	                    valores[j] = Integer.parseInt(lineaSep[j]);
	                }
	                int contador = valores[0];
	                ArrayList<Integer> muertes= new ArrayList<Integer>();
	                for(int k = 0; k < contador; k++){
	                    if(k == valores[1] - 1){
	                        muertes.add(2); //Stark
	                    }
	                    else if(k == valores[2] - 1){
	                        muertes.add(3); //Spiderman
	                    }
	                    else{
	                        muertes.add(1);
	                    }
	                }
	                int salto = 0;
	                while(contador > valores[0]/2){
	                    salto = salto + valores[3];
	                    if(salto >= muertes.size()){
	                        salto = salto - muertes.size();
	                    }
	                    muertes.remove(salto);
	                    contador--;
	                }
	                
	                if((muertes.contains(2) && muertes.contains(3)) || (!muertes.contains(2) && !muertes.contains(3))){
	                    System.out.println("No hay abrazo.");
	                }
	                else if(muertes.contains(2) && !muertes.contains(3)){
	                    System.out.println("No quiero irme, Sr. Stark!");
	                }
	                else if(!muertes.contains(2) && muertes.contains(3)){
	                    System.out.println("No quiero irme, Peter!");
	                }
	            }
	    }
	   
	

}
