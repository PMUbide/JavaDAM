package pruebas;

import java.io.Serializable;

public class UsoBici implements Comparable, Serializable{
	
	private int idUsuario;
	private int estacionRetiro;
	private int estacionAnclaje;
	
	public UsoBici(int idUsuario, int estacionRetiro, int estacionAnclaje) {
		this.idUsuario = idUsuario;
		this.estacionRetiro = estacionRetiro;
		this.estacionAnclaje = estacionAnclaje;
	}
	
	public UsoBici() {
		
	}
	

	public String toString() {
		return "Usuario: " + idUsuario + ". Estación " + estacionRetiro + ". Anclaje " + estacionAnclaje;
	}
	
	public int comprobarCircular() {
		if(this.estacionAnclaje == this.estacionRetiro) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	public int compareTo(Object miObjeto) {
		
		//Casting, refundición del objeto.
		
		UsoBici otro = (UsoBici) miObjeto;
		
		if(this.idUsuario < otro.idUsuario) {
			return -1;
		}
		if(this.idUsuario > otro.idUsuario) {
			return 1;
		}
		return 0;
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getEstacionRetiro() {
		return estacionRetiro;
	}

	public void setEstacionRetiro(int estacionRetiro) {
		this.estacionRetiro = estacionRetiro;
	}

	public int getEstacionAnclaje() {
		return estacionAnclaje;
	}

	public void setEstacionAnclaje(int estacionAnclaje) {
		this.estacionAnclaje = estacionAnclaje;
	}
	
	
	

}
