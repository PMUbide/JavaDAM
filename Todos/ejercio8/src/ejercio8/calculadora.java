package ejercio8;
import javax.swing.*;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
				double num1=preguntar("Introduce el primer n�mero: ");
				
				double num2=preguntar("Introduce el segundo n�mero: ");
									
				int calculo=preguntar_int(" Elige la opci�n: 1-SUMA, 2-RESTA, 3-MULTIPLICA, 4-DIVIDE. ");
				
										
			switch(calculo)
			{

		    case 1:

		    System.out.println("El resultado de su suma es: "+(num1+num2));
		    		    		    
		    break;

		   case 2:

		    System.out.println("El resultado de su resta es: "+(num1-num2));

		    break;

		   case 3:

		    System.out.println("El resultado de su multiplicaci�n es: "+(num1*num2));

		    break;

		   case 4:

		    System.out.println("El resultado de su divisi�n es: "+(num1/num2));

		    break;

			}		
				
				
				
			
	}
				
	
	public static double preguntar (String mensaje) 
	
	{
				//Esta opci�n abre una ventana
				String ventana=JOptionPane.showInputDialog(mensaje);
				
				double numven=Double.parseDouble(ventana);
		
				return numven;
				
				//System.out.println(mensaje);
						
				//Scanner entrada = new Scanner(System.in);
				
				//return entrada.nextDouble();
			
		
	}
				
public static int preguntar_int (String mensaje) 
	
	{
	
				//Esta opci�n abre una ventana
				String ventana2=JOptionPane.showInputDialog(mensaje);
	
				int numven2=Integer.parseInt(ventana2);

				return numven2;
	
				
				//System.out.println(mensaje);
						
				//Scanner entrada = new Scanner(System.in);
				
				//return entrada.nextInt();
			
		
	}			
				
}

		

