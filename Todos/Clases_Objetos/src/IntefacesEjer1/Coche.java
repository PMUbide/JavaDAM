package IntefacesEjer1;

public class Coche implements Vehiculo{

	private int plazas;
	private String color;
	private int velocidad = Vehiculo.velocidad_inicial;
	
	
	public Coche(int plazas, String color) {
		this.plazas = plazas;
		this.color = color;
	}

	public Coche() {
	}
	
	
	@Override
	public String frenar(int cuanto) {
		// TODO Auto-generated method stub
		velocidad-=cuanto;
		return "Has frenado hasta los  " + velocidad + " km/h";
	}

	@Override
	public String acelerar(int cuanto) {
		// TODO Auto-generated method stub
		velocidad+=cuanto;
		return "Has acelerado hasta los  " + velocidad + " km/h";
	}


	public int getPlazas() {
		return plazas;
	}

	public String getColor() {
		return color;
	}

	
	public String girar(String direccion) {
		// TODO Auto-generated method stub
		return null;
	
	}

	

	
}
