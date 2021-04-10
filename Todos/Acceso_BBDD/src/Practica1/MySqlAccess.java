package Practica1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySqlAccess {
	
	private String	host, user, passwd;
	
	private Connection			connect				= null;
	private Statement			statement			= null;
	private PreparedStatement	preparedStatement	= null; //Usar este mejol
	private ResultSet			resultSet			= null;
	
	public MySqlAccess(String host, String user, String passwd) {
		this.host = host;
		this.user = user;
		this.passwd = passwd;
	}

	public MySqlAccess() {
		
	}
	
	
	
	/**
	 * Método para leer BASE De DATOS.
	 * @throws Exception
	 */
	public void readDataBase() throws Exception {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);

			/*
			 * Creamos statement para que la BD nos permita realizar consultas
			 * enlace para ver las consultas.
			 */
			statement = connect.createStatement();
			/*
			 * Almacenamos en resultTest el resultado de ejecutar la consulta select.
			 */
			resultSet = statement.executeQuery("select * from autores");
			System.out.println("QUERY ---> select * from autores");
			/*
			 * Invocamos al método escribir, que muestra por pantalla el resultado de la
			 * consulta anterior.
			 */
			writeResultSet(resultSet);
			
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public void insertDataBase(int id, String nombre, String apellido) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			
			preparedStatement = connect.prepareStatement("insert into autores(id, nombre, apellidos) values (?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, nombre);
			preparedStatement.setString(3, apellido);
			System.out.println("QUERY ---> insert into user(id, nombre, apellidos)");
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	public void deleteDataBase(int id) throws Exception {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);

			// Remove again the insert comment
			preparedStatement = connect.prepareStatement("delete from autores where id = ?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	public void updateDataBase(String nombre, String nombreNuevo) throws Exception {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);

			preparedStatement = connect.prepareStatement("update autores SET nombre = ? where nombre = ?");
			preparedStatement.setString(1, nombreNuevo);
			preparedStatement.setString(2, nombre);
			System.out.println("ea");
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
	 * Pre: --- Post: muestra por pantalla el contenido almacenado en [resultSet].
	 */
	private void writeResultSet(ResultSet resultSet) throws SQLException {
		/*
		 * Mientras resultSet contenga más usuarios, seguimos avanzando de manera
		 * similar a los ficheros de texto.
		 */
		while (resultSet.next()) {
			/*
			 * Podemos seleccionar la columna de la que queremos leer el dato poniendo su
			 * nombre, o también indicando su número de columna... siempre empezando desde
			 * 1! EJ: resultSet.getSTring(2);
			 */
			int id = resultSet.getInt(1);
			String nombre = resultSet.getString(2);
			String apellidos = resultSet.getString(3);
			System.out.println("\tID: " + id);
			System.out.println("\tUsername: " + nombre);
			System.out.println("\tPassword: " + apellidos);
		}
	}

	/**
	 * Pre: --- Post: cerramos todas las conexiones abiertas, el resultSet y el
	 * statement. Si no se cierran correctamente, puede ocurrir que las consultas no
	 * devuelvan el resultado esperado. Además, si dejamos muchas conexiones a la BD
	 * abiertas podemos llegar a saturarla y no aceptará más conexiones.
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
