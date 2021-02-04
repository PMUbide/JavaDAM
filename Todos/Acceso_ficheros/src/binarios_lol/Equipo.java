package binarios_lol;

public class Equipo {
	private int idLiga;
	private String nombreLiga;
	//
	private int anno;
	private int idEquipoLocal;
	private String nombreEquipoLocal;
	//
	
	private int idEquipoVisitante;
	private int ganador;
	
	public Equipo(int idLiga, int anno, int idEquipoLocal, int idEquipoVisitante, int ganador) {
		this.idLiga = idLiga;
		this.anno = anno;
		this.idEquipoLocal = idEquipoLocal;
		this.idEquipoVisitante = idEquipoVisitante;
		this.ganador = ganador;
	}

	public int getIdLiga() {
		return idLiga;
	}

	public void setIdLiga(int idLiga) {
		this.idLiga = idLiga;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getIdEquipoLocal() {
		return idEquipoLocal;
	}

	public void setIdEquipoLocal(int idEquipoLocal) {
		this.idEquipoLocal = idEquipoLocal;
	}

	public int getIdEquipoVisitante() {
		return idEquipoVisitante;
	}

	public void setIdEquipoVisitante(int idEquipoVisitante) {
		this.idEquipoVisitante = idEquipoVisitante;
	}

	public int getGanador() {
		return ganador;
	}

	public void setGanador(int ganador) {
		this.ganador = ganador;
	}
	
	
	

}
