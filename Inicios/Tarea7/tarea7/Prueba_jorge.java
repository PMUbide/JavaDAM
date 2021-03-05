package tarea7;
import javax.swing.JOptionPane;
public class Prueba_jorge
{
    public static void main (String args[]) 
    {
        int[] tabla= {1,4,6,8};
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Inserta un número que quieres introucir"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Inserta el índice donde quieres "
                + "que vaya dicho número"));

        for (int j=0;j<insertElement(tabla,num1, num2).length;j++) 
        {
            System.out.print(insertElement(tabla,num1, num2)[j]);
        }
    }
    public static int [] insertElement (int[] tabla, int num, int index) 
    {
        int [] tabla1= new int [tabla.length+1];
        tabla1[index]= num;
        
        for (int j=0;j<tabla.length;j++){ 
        	
        	System.out.print(j);

            if (index< j+1) 
            {
                tabla1[j]= tabla[j];
            }
            else 
            {
                tabla1[j]= tabla[j+1];
            }

        }
        return tabla1;
    }
}