import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(format.format(new Date()));
	}

	public static void mostrarDifi() {
		System.out.println((int) (Math.random() * 100));
		mostrarDifi();
	}
	
}
