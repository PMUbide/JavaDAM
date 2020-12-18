
public class Cuenta {
	private String titular;
	private double cantidad;
	public Cuenta(String titular) {
		super();
		this.titular = titular;
		cantidad = 0;
	}
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void ingresar(double dinero) {
		if ( dinero >= 0) {
			cantidad = cantidad + dinero;
		}
	}
	public void retirar (double dinero) {
		cantidad = cantidad - dinero;
		if (cantidad <=0 ) {
			cantidad = 0;
		}
	}

}
