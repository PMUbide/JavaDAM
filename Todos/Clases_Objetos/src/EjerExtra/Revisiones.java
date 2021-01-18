package EjerExtra;

public class Revisiones extends Trabajo{

	public Revisiones(String descripcion, double horas, boolean finalizado) {
		super(descripcion, horas, finalizado);
		// TODO Auto-generated constructor stub
		
		this.precio = horas * 20;
		
		
	}

	
	
}
