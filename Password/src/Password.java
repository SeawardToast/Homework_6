import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a password");
		String pass = s.next();
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean digit = false;
		boolean nonDigit = false;
		boolean length = false;
		final int requiredLength = 8;
		
		for (int i = 0; i<=pass.length()-1; i++) {
			char x = pass.charAt(i);
			if (Character.isUpperCase(x) == true) {
				upperCase = true;
			}
			
			if (Character.isLowerCase(x) == true) {
				lowerCase = true;
			}
			
			if (Character.isDigit(x) == true) {
				digit = true;
			}
			
			if (Character.isLetterOrDigit(x) == false) {
				nonDigit = true;
			}	
			
			if (pass.length() >= requiredLength) {
				length = true;
			} 
		}

		if (upperCase == true && lowerCase == true && digit == true && nonDigit == true && length == true) {
			System.out.println("Entered Password: " + pass);
			System.out.println("Verdict: Valid");
		} else {
			System.out.println("Entered Password: " + pass);
			System.out.println("Verdict: Invalid");
		}
	}
}
