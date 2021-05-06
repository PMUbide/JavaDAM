import java.util.*;

public class G2 {
	static Scanner sc;

	public static void casosDePrueba() {
		String linea = sc.nextLine();
		String[] lineaSep = linea.split(" ");
		int[] valores = new int[4];
		for (int j = 0; j < 4; j++) {
			valores[j] = Integer.parseInt(lineaSep[j]);
		}
		int contador = valores[0];
		ArrayList<Integer> muertes = new ArrayList<Integer>();
		for (int k = 0; k < contador; k++) {
			if (k == valores[1] - 1) {
				muertes.add(2); // Stark
			} else if (k == valores[2] - 1) {
				muertes.add(3); // Spiderman
			} else {
				muertes.add(1);
			}
		}
		int salto = 0;
		while (contador > valores[0] / 2) {
			salto = salto + valores[3];
			if (salto >= muertes.size()) {
				salto = salto - muertes.size();
			}
			muertes.remove(salto);
			contador--;
		}
		if (muertes.contains(2) && !muertes.contains(3)) {
			System.out.println("No quiero irme, Sr. Stark!");
		} else if (!muertes.contains(2) && muertes.contains(3)) {
			System.out.println("No quiero irme, Peter!");
		}else {
			System.out.println("No hay abrazo");
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String casos = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(casos); i++) {
			casosDePrueba();
		}
	}
}