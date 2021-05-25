package Ejercicio1;

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
	 * Contructor por defecto con la conexion la bbdd.
	 */
	public MySqlAccess() {
		this.host = "localhost:3306/ejercicio1Examen";
		this.user = "root";
		this.passwd = "12345678";
	}
	
	//Crear tabla en la bbdd ejercicio1Examen
//	CREATE TABLE Registro
//	(
//	  id      INT         NOT NULL AUTO_INCREMENT,
//	  letra   VARCHAR(1)  NULL    ,
//	  palabra VARCHAR(50) NULL    ,
//	  linea   INT         NULL    ,
//	  PRIMARY KEY (id)
//	);

	/**
	 * Método que recibe datos para insertarlo a la bbdd con una conexión.
	 * @param nueva -> tupla a insertar
	 * @param letra -> la letra que ha buscado
	 * @throws Exception
	 */
	public void insertTupla(Tupla nueva, String letra) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			preparedStatement = connect.prepareStatement("INSERT INTO `Registro` (`letra`, `palabra`, `linea`) VALUES (?, ?, ?)");
			preparedStatement.setString(1, letra);
			preparedStatement.setString(2, nueva.getPalabra());
			preparedStatement.setInt(3, nueva.getLinea());
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
