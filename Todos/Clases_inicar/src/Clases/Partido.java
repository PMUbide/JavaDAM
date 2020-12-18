package clases;

public class Partido {
	
	private Equipo local;
    private Equipo visitante;
    private String resultado;
    private Jugador [] goleadores;
    
    public Partido (Equipo local, Equipo visitante, String resultado, Jugador [] goleadores) {
        this.visitante= visitante;
        this.resultado = resultado;
        this.goleadores = goleadores;
    }
    
    
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Jugador[] getGoleadores() {
		return goleadores;
	}
	public void setGoleadores(Jugador[] goleadores) {
		this.goleadores = goleadores;
	}

    
    
    
}
