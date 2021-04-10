package Practica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

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

	public MySqlAccess() {

	}

	
	public void readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select a.idAlumno, a.nombre, a.apellidos, a.dni, asig.idAsignatura, asig.nombre, asig.curso\r\n"
					+ "from alumnos a, asignaturas asig, alumnos_asignaturas c\r\n"
					+ "where a.idAlumno = c.idAlumno AND c.idAsignatura = asig.idAsignatura\r\n"
					+ "order by a.idAlumno");
			System.out.println("QUERY ---> select * from alumnos");
			ArrayList<Alumno> alumnosTotales = new ArrayList<Alumno>();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String nombre = resultSet.getString(2);
				String apellidos = resultSet.getString(3);
				String dni = resultSet.getString(4);
				int idAsig = resultSet.getInt(5);
				int nombreAsig = resultSet.getInt(6);
				int idAsig = resultSet.getInt(7);
				System.out.println("\tID: " + id);
				System.out.println("\tNombre: " + nombre);
				System.out.println("\tApellidos: " + apellidos);
				System.out.println("\tdni: " + dni);
				System.out.println("\tidasig: "+ idAsig);
				System.out.println("\tidasig: "+ idAsig);
				System.out.println("\tidasig: "+ idAsig);
//				Alumno nuevo = new Alumno(id, nombre, apellidos, dni);
//				alumnosTotales.add(nuevo);

			}
			
			
			
			
//			return alumnos;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	
	/**
	 * Método para leer BASE De DATOS.
	 * 
	 * @throws Exception
	 */
	public ArrayList<Alumno> readTableAlumnos() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from alumnos");
			System.out.println("QUERY ---> select * from alumnos");
			ArrayList<Alumno> alumnos = writeResultSetAlumnos(resultSet);
			return alumnos;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public void readTableIntermedia(ArrayList<Alumno> alumnos) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from alumnos_asignaturas");

			writeResultSetTablaIntermedia(resultSet, alumnos);
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public ArrayList<Asignatura> readTableAsignatura() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);

			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from asignaturas");
			System.out.println("QUERY ---> select * from asignaturas");
			ArrayList<Asignatura> AsigTotales = writeResultSetAsignaturas(resultSet);
			return AsigTotales;
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
	private ArrayList<Alumno> writeResultSetAlumnos(ResultSet resultSet) throws SQLException {
		ArrayList<Alumno> alumnosTotales = new ArrayList<Alumno>();
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String nombre = resultSet.getString(2);
			String apellidos = resultSet.getString(3);
			String dni = resultSet.getString(4);
//			System.out.println("\tID: " + id);
//			System.out.println("\tNombre: " + nombre);
//			System.out.println("\tApellidos: " + apellidos);
//			System.out.println("\tdni: " + dni);
			Alumno nuevo = new Alumno(id, nombre, apellidos, dni);
			alumnosTotales.add(nuevo);

		}
		return alumnosTotales;
	}

	private ArrayList<Asignatura> writeResultSetAsignaturas(ResultSet resultSet) throws SQLException {
		ArrayList<Asignatura> asignaturasTotales = new ArrayList<Asignatura>();
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String nombre = resultSet.getString(2);
			int curso = resultSet.getInt(3);
//			System.out.println("\tID: " + id);
//			System.out.println("\tNombre: " + nombre);
//			System.out.println("\tCurso: " + curso);
			Asignatura nueva = new Asignatura(id, nombre, curso);
			asignaturasTotales.add(nueva);
		}
		return asignaturasTotales;
	}
	
	
	private void writeResultSetTablaIntermedia(ResultSet resultSet, ArrayList<Alumno> alumnos) throws SQLException {
		while (resultSet.next()) {
			int idAlumno = resultSet.getInt(1);
			int idAsignatura = resultSet.getInt(2);
			
			for (Alumno alumno : alumnos) {
				if(alumno.getIdAlumno() == idAlumno) {
					alumno.insertAsignatura(idAsignatura);
				}
			}
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
