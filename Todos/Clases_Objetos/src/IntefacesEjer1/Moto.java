package IntefacesEjer1;

public class Moto implements Vehiculo {
	
	private int velocidad = Vehiculo.velocidad_inicial;
	
	
	public Moto(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public Moto() {
	}

	@Override
	public String frenar(int cuanto) {
		// TODO Auto-generated method stub
		velocidad -= cuanto;
		return "Has frenado hasta los  " + velocidad + " km/h";
	}

	@Override
	public String acelerar(int cuanto) {
		// TODO Auto-generated method stub
		velocidad += cuanto;
		return "Has acelerado hasta los  " + velocidad + " km/h";
	}

	@Override
	public String girar(String direccion) {
		// TODO Auto-generated method stub
		return null;
	}

}
