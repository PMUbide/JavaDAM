package ProgramaBanco;

public class Usuario {
	private String nombre; //nombre del usuario
	private String pass; //contraseña del usuario 
	private double saldo; //saldo del usuario
	
	/**
	 * Constructor para el objeto USuario con todos los
	 * atributos como parámetro
	 * @param nombre
	 * @param pass
	 * @param saldo
	 */
	public Usuario(String nombre, String pass, double saldo) {
		this.nombre = nombre;
		this.pass = pass;
		this.saldo = saldo;
	}
	
	/**
	 * Constructor con saldo 0 para recibir solo el nombre 
	 * y la contraseña
	 * @param nombre
	 * @param pass
	 */
	public Usuario(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
		this.saldo = 0;
	}


	/**
	 * @return devuelve la variable de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param setter de nombre lo inserta en  nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return devuelve la variable de pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param setter de pass lo inserta en  pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return devuelve la variable de saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param setter de saldo lo inserta en  saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método toString devuelve String con los datos de un usuario
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", saldo=" + saldo + "]";
	}
	
	
	
}
