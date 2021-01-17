package EjerExtra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public Reparaciones(String descripcion, double horas, boolean finalizado, int tipo) {
//			super(descripcion, horas, finalizado);
		
			
			Reparaciones nueva = new Reparaciones("Pinchazo", 2, true, 1, 10);
			Reparaciones nueva1 = new Reparaciones("otros", 5, false, 2, 5);
			
		
			
			
			System.out.println(nueva.ToString());	
			System.out.println(nueva1.ToString());
		
	}

}
