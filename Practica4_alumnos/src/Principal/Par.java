package Principal;

public class Par {
	private String nip;
	private String matricula;
	
	public Par(String nip, String matricula) {
		this.nip = nip;
		this.matricula = matricula;
	}
	
	
	
	@Override
	public String toString() {
		return "Par [nip=" + nip + ", matricula=" + matricula + "]";
	}



	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
