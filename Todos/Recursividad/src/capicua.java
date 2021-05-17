
public class capicua {

	public static void main(String[] args) {
		
		System.out.println(capicua2("otto"));
		System.out.println(capicua2("pablo"));
		
	}

	public static boolean capicua2(String s) {
		String[] s1 = s.split("");
		String[] s2 = new String[s1.length];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = s1[s1.length - i - 1];
		}
		String dos = "";
		for (int i = 0; i < s2.length; i++) {
			dos += s2[i];
		}
		if(s.equals(dos)) return true;
		else return false;
	}
	
//	public static boolean capicua(String s) {
//		if(s.length() <= 1) return true;
//		if(!s.substring(0, 1).equals(s.substring(s.length()-1, s.length()))) {
//			return false;
//		}else {
//			return capicua(s.substring(1, s.length()-1));
//		}
//	}
}
