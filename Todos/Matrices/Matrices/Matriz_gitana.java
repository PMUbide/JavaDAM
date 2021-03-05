import java.util.Scanner;
public class Matriz_gitana {

    public static void main(String[] args) {

        String[][] myNumbers = { {"Juan", "Ruiz", "976123123", "DIENTE"}, 
                {"Manolo", "Sanchez", "976552211", "PALAS"},
                {"Antonio", "ASD", "988775112", "MUELAS"}, 
                {"Manolo", "Gimeno", "666666666", "PREMOLAR"} };
        System.out.print("¿Qué nombre quieres buscar?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        String busqueda = "";
        int i = -1;
        int j=0;
        int encontrar = 0;
        while (busqueda.equals(nombre)==false && i<myNumbers.length-1) {
            i++;
            for(j = 0; j < myNumbers[i].length; ++j) {
                busqueda= (myNumbers[i][j]);
                if (busqueda.equals(nombre)==true) {
                    //for (int x = 0; x < myNumbers[i].length; x++) {
                    String nombree = myNumbers[i][0];
                    String apellido = myNumbers[i][1];
                    String telefono = myNumbers[i][2];
                    String pieza = myNumbers[i][3];
                    System.out.println("Nombre: " + nombree + " " + apellido + ". Teléfono: "
                    + telefono +". Pieza a realizar: "+ pieza);
                    //System.out.print(myNumbers[i][x]);
                    encontrar=1;
                    //*} 
                }
            }
        }
        if (busqueda.equals(nombre)==false && encontrar==0) {
            System.out.println("No se encuentra");
        }
    }
}