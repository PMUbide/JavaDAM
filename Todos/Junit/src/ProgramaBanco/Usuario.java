package ProgramaBanco;

public class Usuario {
	private String nombre;
	private String pass;
	private double saldo;
	
	public Usuario(String nombre, String pass, double saldo) {
		this.nombre = nombre;
		this.pass = pass;
		this.saldo = saldo;
	}
	
	public Usuario(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
		this.saldo = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", saldo=" + saldo + "]";
	}
	
	
	
}
