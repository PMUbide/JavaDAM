package Practica1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Base de datos que quieres leer: ");
		String host = "localhost:3306/biblioteca";
//		host += in.next();
		System.out.println("Usuario: ?");
		String user = "root";
		System.out.println("Contraseña?: ");
		String passwd = "12345678";
		//leer database.
		MySqlAccess dao = new MySqlAccess(host, user, passwd);
		
		System.out.println("Elige comando: ");
		System.out.println("1- Visualizar tabla");
		System.out.println("2 - Insert");
		System.out.println("3 - update");
		System.out.println("4 - delete");
		
		int eleccion = 1;
		try {
			while(eleccion != 999) {
				eleccion = in.nextInt();
				switch(eleccion) {
					case 1:
						dao.readDataBase();
						break;
					case 2:
						dao.insertDataBase(3, "Pepe", "Botijo");
						System.out.println("Actualizado");
						break;
					case 3:
						dao.updateDataBase("Pepe", "Julio");
						System.out.println("actualizado");
						break;
					case 4:
						dao.deleteDataBase(3);
						System.out.println("Borrado");
						break;
				}
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Linea SQL errónea");
			//e.printStackTrace();
		}
		
	}

}
