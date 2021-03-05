import java.util.*;
public class Refactorizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println(i);
			for(int j = 0; j <= i ; j++) {
				System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
