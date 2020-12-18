package herencia;

public class Delfin extends Animal {

	private boolean acuatico;
	
	
	public Delfin(String nombre, int patas, int edad, boolean acuatico) {
		super(nombre, patas, edad);
		// TODO Auto-generated constructor stub
		this.acuatico = acuatico;
		
	}


	public boolean isAcuatico() {
		return acuatico;
	}


	public void setAcuatico(boolean acuatico) {
		this.acuatico = acuatico;
	}
	
	
	
	
	
	
	
	
}
