package Principal;

public class Matricula {
	private int nip; //El nip de un alumno
	private int cod; //La matricula de ese alumno.
	
	public Matricula(int nip, int cod) {
		this.nip = nip;
		this.cod = cod;
	}

	
	@Override
	public String toString() {
		return "Matricula [nip=" + nip + ", cod=" + cod + "]";
	}


	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
	
	
}
