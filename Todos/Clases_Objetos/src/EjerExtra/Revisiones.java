package EjerExtra;

public class Revisiones extends Trabajo{

	public Revisiones(String descripcion, double horas, boolean finalizado) {
		super(descripcion, horas, finalizado);
		// TODO Auto-generated constructor stub
		
		this.precio = horas * 20;
		
		
	}
	
	@Override
	public void setHoras(double horas) {
		if(!finalizado) {
			this.horas += horas;
			this.precio += horas * 20;
		}
		else {
			System.out.println("Trabajo finalizado.");
		}
	}
	
}
