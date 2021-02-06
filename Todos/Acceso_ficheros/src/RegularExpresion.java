
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {

    public static void main(String[] args) {
        String[] texto = {"anacleta", "pedro", "alfredo", "mand1arina", "quijote1"};
        Pattern pattern = Pattern.compile("\\d$", Pattern.CASE_INSENSITIVE);
        for(int i = 0; i < texto.length; i++) {
            Matcher matcher = pattern.matcher(texto[i]);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Match found");
                System.out.println(texto[i]);
            } else {
                System.out.println("Match not found");
                System.out.println(texto[i]);
            }
        }
    }

}