package PRÁCTICA3;

public class UsoBizi {
	private int idUsuario;
	private int estRetiro;
	private int estAnclaje;
	
	public UsoBizi(int idUsuario, int estRetiro, int estAnclaje) {
		super();
		this.idUsuario = idUsuario;
		this.estRetiro = estRetiro;
		this.estAnclaje = estAnclaje;
	}
	
	public String toString() {
		return "ID: " + idUsuario + " Anclaje: " + estAnclaje + " Retirada " + estRetiro + "\n";
				
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getEstRetiro() {
		return estRetiro;
	}
	public void setEstRetiro(int estRetiro) {
		this.estRetiro = estRetiro;
	}
	public int getEstAnclaje() {
		return estAnclaje;
	}
	public void setEstAnclaje(int estAnclaje) {
		this.estAnclaje = estAnclaje;
	}
	
	
}
