package clases;

public class Equipo {
		
	    private String nombre;
	    private String estadio;
	    private int anoFundacion;
	    private Jugador [] jugadores;
	    
	    public Equipo(String nombre, String estadio, int anoFundacion, Jugador [] jugadores) {
	        this.nombre = nombre;
	        this.estadio = estadio;
	        this.anoFundacion = anoFundacion;
	        this.jugadores = jugadores;
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public String getEstadio() {
	        return estadio;
	    }
	    public void setEstadio(String estadio) {
	        this.estadio = estadio;
	    }
	    public int getAnoFundacion() {
	        return anoFundacion;
	    }
	    public void setAnoFundacion(int anoFundacion) {
	        this.anoFundacion = anoFundacion;
	    }
	    public Jugador[] getJugadores() {
	        return jugadores;
	    }
	    public void setJugadores(Jugador[] jugadores) {
	        this.jugadores = jugadores;
	        System.out.print("-----------------------------------------------------------------------------------");  
	    }

	    
}
	
	

