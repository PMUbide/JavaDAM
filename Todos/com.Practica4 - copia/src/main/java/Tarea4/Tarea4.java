package Tarea4;

public class Tarea4 {

	public static void main(String[] args) {
		System.out.println(selfish("wafles", "elf"));
	}

	public static boolean selfish(String str, String elf) {
		if(elf.length() == 0) return true;
		if(str.indexOf(elf.substring(0, 1)) != -1) {
			return selfish(str, elf.substring(1));
		}else {
			return false;
		}
	}
}
