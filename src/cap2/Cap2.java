package cap2;
import java.util.regex.*;

public class Cap2 {
	int miss = 6;
	public void psswrd(String e) {
	String regex1 = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*!&@#])[0-9a-zA-Z$*&@#]{6,}";
	
	Pattern a = Pattern.compile(regex1);
	
	Matcher find1 = a.matcher(e);
	
	boolean result1 = find1.matches();
	System.out.printf("%s", result1);
		if(result1 == false) {
			if(e.length()<6) {
				System.out.printf("%s",6-e.length());
			}else {
				System.out.print("Sua senha deve ter no minimo uma letra minuscula, uma maiuscula, um caractere especial e um digito");
			}
		}
	}
	}

