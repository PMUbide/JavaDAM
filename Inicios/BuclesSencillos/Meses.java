import java.util.*;
public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes=0;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el número de un mes: ");
		mes=entrada.nextInt();
		
		while (mes<=0 || mes>12) {
								
			System.out.println("Ese número no corresponde con ningún mes, introduce otro: ");
			mes=entrada.nextInt();
		
		}
		
		switch (mes) {
			case 1: System.out.println("Enero");break;
			case 2: System.out.println("Febrero");break;
			case 3: System.out.println("Marzo");break;
			case 4: System.out.println("Abril");break;
			case 5: System.out.println("Mayo");break;
			case 6 : System.out.println("Junio");break;
			case 7: System.out.println("Julio");break;
			case 8: System.out.println("Agosto");break;
			case 9: System.out.println("Septiembre");break;
			case 10: System.out.println("Octubre");break;
			case 11: System.out.println("Noviembre");break;
			case 12: System.out.println("Diciembre");break;
			
		}
		
		
		
		if (mes==2) {
			System.out.println("Tiene 28 días");
		
		}
		else if(mes==1 || mes== 5 || mes== 7|| mes== 8 || mes== 10|| mes== 12) {
			System.out.println("Tiene 31 días");
					
		}
		
		else System.out.println("Tiene 30 días");
		
		
		
			
		
		
	}

}
