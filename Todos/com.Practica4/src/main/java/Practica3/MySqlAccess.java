package Tarea2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MySqlAccess {

	private String				host, user, passwd;

	private Connection			connect				= null;
	private Statement			statement			= null;
	private PreparedStatement	preparedStatement	= null;	// Usar este mejol
	private ResultSet			resultSet			= null;


	/**
	 * Contructor por defecto con la conexi�n a la bbdd.
	 */
	public MySqlAccess() {
		this.host = "localhost:3306/alumnosTarea2";
		this.user = "root";
		this.passwd = "12345678";
	}

	/**
	 * Método que recibe un array de Strings y hace la conexión a la bbdd para insertar
	 * @param alumnoInfo -> String[] de los datos del alumnos.
	 * @throws Exception
	 */
	public void insertAlumno(String[] alumnoInfo) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			preparedStatement = connect.prepareStatement("insert into alumno(id_alumno, nombre, apellidos, dni, edad) values (?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, Integer.parseInt(alumnoInfo[0])); //id int
			preparedStatement.setString(2, alumnoInfo[1]); //Nombre String
			preparedStatement.setString(3, alumnoInfo[2]); //Apellidos String 
			preparedStatement.setString(4, alumnoInfo[3]); //DNI String
			preparedStatement.setInt(5, Integer.parseInt(alumnoInfo[4])); //Edad int
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	/**
	 * Método que recibe un array de String con la información leida de una nota y hace 
	 * su inserción a la bbdd
	 * @param alumnoInfo -> String[] de la info de las notas.
	 * @throws Exception
	 */
	public void insertNota(String[] alumnoInfo) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			//id_nota 	nombre 	nota 	id_alumno 
			preparedStatement = connect.prepareStatement("insert into nota(id_nota, nombre, nota, id_alumno) values (?, ?, ?, ?)");
			preparedStatement.setInt(1, Integer.parseInt(alumnoInfo[0])); //id int
			preparedStatement.setString(2, alumnoInfo[2]); //nombre String
			preparedStatement.setInt(3, Integer.parseInt(alumnoInfo[3])); //nota int
			preparedStatement.setInt(4, Integer.parseInt(alumnoInfo[1])); //id_alumno int
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	

	/**
	 * Pre: --- Post: muestra por pantalla el nombre de la tabla sobre la que se ha
	 * ejecutado la consulta, seguido de todas sus columnas.
	 */
	private void writeMetaData(ResultSet resultSet) throws SQLException {
		System.out.println("The columns in the table are: ");
		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
		}
	}


	/**
	 * Pre: --- Post: cerramos todas las conexiones abiertas, el resultSet y el
	 * statement. Si no se cierran correctamente, puede ocurrir que las consultas no
	 * devuelvan el resultado esperado. Adem�s, si dejamos muchas conexiones a la BD
	 * abiertas podemos llegar a saturarla y no aceptar� m�s conexiones.
	 */
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
		}
	}

}
