import java.util.*;
public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce la cadena de carácteres: ");
		
		Scanner entrada= new Scanner(System.in);
		
		String Val=entrada.nextLine();
		
		String cadena="aaa";
		
		int num_veces=0;
		
		int cont=0;
		
		/*for(int i=0; i<Val.length()-1;i++) {
			
			cadena=Val.substring(i,i+2);
			
			if (cadena.equals("aa")) {
				
				cont++;
			}
						
		}
		*/
				
		//System.out.println("Numero de veces que sale aa: " + cont);
		
				
		/*
		while(Val.indexOf(cadena) > -1) {
			
			Val=Val.substring(Val.indexOf(cadena));
			
			num
			
			System.out.println(Val);
		}
		
		*/
		
		Val = Val.substring(Val.length()-1) + Val.substring(1,Val.length()-1) + Val.substring(0,1);
		
		System.out.println(Val);
		
	}

}

