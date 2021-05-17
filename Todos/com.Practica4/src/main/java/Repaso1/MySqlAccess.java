package Repaso1;

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

	public MySqlAccess(String host, String user, String passwd) {
		this.host = host;
		this.user = user;
		this.passwd = passwd;
	}

	/**
	 * Contructor por defecto con la conexi�n a la bbdd.
	 */
	public MySqlAccess() {
		this.host = "localhost:3306/fone";
		this.user = "root";
		this.passwd = "12345678";
	}


	public void insertConstructor(String[] constructor) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			preparedStatement = connect.prepareStatement("INSERT INTO `constructor` (`constructor_id`, `constructor_ref`, `name`, `nationality`, `url`) VALUES (?, ?, ?, ?, ?) ");
			preparedStatement.setInt(1, Integer.parseInt(constructor[0]));
			preparedStatement.setString(2, (constructor[1]));
			preparedStatement.setString(3, constructor[2]);
			preparedStatement.setString(4, constructor[3]);
			preparedStatement.setString(5, constructor[4]);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	public void insertStanding(String[] standing) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			preparedStatement = connect.prepareStatement("INSERT INTO `standing` (`constructor_id`, `standing_id`, `race_id`, `points`, `position`, `wins`) VALUES (?, ?, ?, ?, ?, ?)  ");
			preparedStatement.setInt(1, Integer.parseInt(standing[2]));
			preparedStatement.setInt(2, Integer.parseInt(standing[0]));
			preparedStatement.setInt(3, Integer.parseInt(standing[1]));
			preparedStatement.setInt(4, Integer.parseInt(standing[3]));
			preparedStatement.setInt(5, Integer.parseInt(standing[4]));
			preparedStatement.setInt(6, Integer.parseInt(standing[6]));
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	
	public void insertNota(String[] alumnoInfo) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			//id_nota 	nombre 	nota 	id_alumno 
			preparedStatement = connect.prepareStatement("insert into nota(id_nota, nombre, nota, id_alumno) values (?, ?, ?, ?)");
			preparedStatement.setInt(1, Integer.parseInt(alumnoInfo[0]));
			preparedStatement.setString(2, alumnoInfo[2]);
			preparedStatement.setInt(3, Integer.parseInt(alumnoInfo[3]));
			preparedStatement.setInt(4, Integer.parseInt(alumnoInfo[1]));
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
