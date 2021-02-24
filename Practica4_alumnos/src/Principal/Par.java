package Principal;


public class Par {
	private String nip;
	private String matricula;
	
	public Par(String nip, String matricula) {
		this.nip = nip;
		this.matricula = matricula;
	}
	
	
//	public int compareTo(Object miObjeto) {
//		//Casting, refundición del objeto.
//		Par otro = (Par) miObjeto;
//		if((this.matricula) < (otro.matricula)) {
//			return 1;
//		}
//		if((this.total) > (otro.total)) {
//			return -1;
//		}
//		return 0;
//	}	
	
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
