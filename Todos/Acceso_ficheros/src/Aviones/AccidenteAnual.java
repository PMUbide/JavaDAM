package Aviones;

public class AccidenteAnual {
	private String anno; //Año del accidente
	private int veces;  //Veces que aparece
	
	public AccidenteAnual(String anno, int veces) {
		this.anno = anno;
		this.veces = veces;
	}
	public AccidenteAnual(String anno) {
		this.anno = anno;
	}


	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public int getVeces() {
		return veces;
	}

	public void setVeces(int veces) {
		this.veces = veces;
	}
	
	
}
