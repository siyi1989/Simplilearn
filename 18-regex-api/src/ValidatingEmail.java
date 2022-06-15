import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingEmail {

	public static void main(String[] args) {
		Scanner keyboardScanner=new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email=keyboardScanner.next();
		
		//String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";//$ end of sentence
		String regex="^[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,3}";//2 to 3 char at end of string allowed
		
		//boolean result=email.matches(regex);
		
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			System.out.println("Given email-id is valid");
			
		}else {
			System.out.println("Given email-id is not valid.");
		}
		

	}

}
