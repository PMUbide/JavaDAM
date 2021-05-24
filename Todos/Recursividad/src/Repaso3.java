
public class Repaso3 {

	public static void main(String[] args) {
		//Diseña un método recursivo en Java que elimine todas las vocales de una frase.
		String frase = "Eliminame todas las vocales baby";
		System.out.println(eliminaVocal(frase));
//		countPairs("axa");
		
	}

	
	public static String eliminaVocal(String str) {
		if(str.length() == 0) return "";
		if(str.substring(0, 1).equalsIgnoreCase("a") || str.substring(0, 1).equalsIgnoreCase("e") || str.substring(0, 1).equalsIgnoreCase("i")
				|| str.substring(0, 1).equalsIgnoreCase("o") || str.substring(0, 1).equalsIgnoreCase("u")) {
			return eliminaVocal(str.substring(1));
		}else {
			return str.substring(0, 1) + eliminaVocal(str.substring(1));
		}
		
	}
	
	public static int countPairs(String str) {
		  if(str.length() == 1) return 0;
		  System.out.println(str.substring(2, 3));
		  if(str.substring(0, 1).equals(str.substring(1, 2))){
		    return 1 + countPairs(str.substring(1));
		  }else{
		    return countPairs(str.substring(1));
		  }
	}
	
	//Devuelve las dos primeras 
	public String front22(String str) {
		  int coge = 2;
		  if(coge > str.length()){
		    coge = str.length();
		  }
		  String front = str.substring(0, coge);
		  return front + str + front;
		  
		}


}
