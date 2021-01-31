package Titanic;

public class Pasajero {
	private String sexo;
	private boolean estado; //true vivo false muerto
	
	public Pasajero(String sexo, boolean estado) {
		this.sexo = sexo;
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
