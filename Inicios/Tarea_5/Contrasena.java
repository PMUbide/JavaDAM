import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {
    	
        String [] matriz = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","!","|","@","·","#",
                "$","%","&","¬","/","(",")","=","?","'","¿","¡","*","^","`","[","]","+","¨","´","{"
                        + "ç","}",";",",",":",".","-","<",">","º","ª"};
        String password, dato;
        
        System.out.print("Introduce tu contraseña [5 dígitos, números o letras, sin mayúsculas]: ");
        
        Scanner entrada = new Scanner(System.in);
        
        password = entrada.nextLine();
        
        while(password.length()>5) {
            System.out.print("Error. Introduce tu contraseña [5 dígitos, números o letras, sin mayúsculas]: ");
            password = entrada.nextLine();
        }
        /**
         * Para leer los 720 billones de combinaciones tardaria SOLO
         * 92 años y pico, que el pico, ya es demasiado, DEJA DE ROBAR CUENTAS
         * Y TRABATELO TU
         * QUE ACABAS
         * ANTES
         */
        for (int a = 0; a < matriz.length; ++a) {
        	for (int b = 0; b < matriz.length; ++b) {
            	for (int c = 0; c < matriz.length; ++c) {
                    for (int d = 0; d < matriz.length; ++d) {
                        for (int e = 0; e < matriz.length; ++e) {
                            dato = matriz[a] + matriz[b] + matriz[c]+ matriz[d]+ 
                                    matriz[e];
                            if(dato.equals(password)) {
                                System.out.println("¡La contraseña era: " + dato + "!");
                            }
                        }
                    }
                }
            }
        }
    }
}