
public class Carta {
	private int numero;
	private String palo;
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public Carta() {
	}
	
	public String toString() {
		if(numero == 8) {
			return "Numero sota de " + palo;
		}else if(numero == 9) {
			return "Numero caballo de " + palo;
		}else if(numero == 10) {
			return "Numero REY de " + palo;
		}else {
			return "Numero " + numero + " de " + palo;
		}
	}
	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
}
