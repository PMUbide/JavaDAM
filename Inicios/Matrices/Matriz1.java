import java.util.Scanner;
public class Matriz1 {

    public static void main(String[] args) {

        String[][] myNumbers = { {"Juan", "Ruiz", "976123123", "DIENTE"}, {"Manolo", "Sanchez", "976552211", "PALAS"},{"Pablo", "Petas", "976545327", "LENGUA"}, {"Tron", "MANCO", "99674352", "BOBO"} };
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        String busqueda = "";
        int i = -1;
        int j=0;
        while (busqueda.equals(nombre)==false && i<myNumbers.length-1) {
            i++;
            for(j = 0; j < myNumbers[i].length; ++j) {
                busqueda= (myNumbers[i][j]);
                if (busqueda.equals(nombre)==true) {
                    for (int x = 0; x < myNumbers[i].length; x++) {
                    System.out.print(myNumbers[i][x]);
                    }
                break;
                }
            }
        }
        if (busqueda.equals(nombre)==false) {
            System.out.println("No se encuentra");
        }
    }
}