
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("resultado " + count8(8128838));
		
		
	}

	public static int count8(int n) {
		  if(n == 0) return 0;
		  if(n%10 == 8){
			  System.out.println(n%10);
		    if((n/10)%10 == 8){
		    	System.out.println(n%1);
		      return 2 + count8(n/10);
		    }else{
		      return 1 + count8(n/10);
		    }
		  }else{
		    return count8(n/10);
		  }
	}
	
	public int countX(String str) {
		  if (str.equals("")) return 0;
		  if(((str.substring(0,1)).equals("x"))){
		    return 1 + countX(str.substring(1, str.length()));
		  }else{
		    return countX(str.substring(1, str.length()));
		  }
		}

}
