package pruebas;


public class UsuarioBici implements Comparable{
	private int idUsuario;
	private int traslados;
	private int circular;
	private int total;
	
	public UsuarioBici(int idUsuario, int traslados, int circular) {
		this.idUsuario = idUsuario;
		this.traslados = traslados;
		this.circular = circular;
		total = this.circular + this.traslados;
	}
	
	
	public String toString() {
		return "ID: " + idUsuario + " Traslados: " + traslados + ". Circulares: " + circular
				+ " TOTAL: " + total;
	}
	
	@Override
	public int compareTo(Object miObjeto) {
		//Casting, refundición del objeto.
		UsuarioBici otro = (UsuarioBici) miObjeto;
		if((this.total) < (otro.total)) {
			return 1;
		}
		if((this.total) > (otro.total)) {
			return -1;
		}
		return 0;
	}	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTraslados() {
		return traslados;
	}

	public void setTraslados(int traslados) {
		this.traslados = traslados;
	}

	public int getCircular() {
		return circular;
	}

	public void setCircular(int circular) {
		this.circular = circular;
	}

	
}
