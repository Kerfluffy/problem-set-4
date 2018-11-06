/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
	
		// test your solutions
		
		System.out.println(ps.surroundMe("gamr", "mom"));
		System.out.println(ps.endsMeet("gamer", 2));
		System.out.println(ps.middleMan("programming"));
		System.out.println(ps.doubleVision(null));
		System.out.println(ps.centered(null, null));
		System.out.println(ps.upOrDown(0, '1'));
		System.out.println(ps.countMe(null, '1'));
		System.out.println(ps.isNotEqual(null));
		System.out.println(ps.triplets(null));
		System.out.println(ps.addMe("a123b456c789", true));
	}
	
	public String surroundMe(String out, String in) {
		if (out != null && out.length() == 4 && in.length() == 3) {
			return out.substring(1, 2) + in + out.substring(3, 4);
		}
		else {
			return null;
		}
	}
	public String endsMeet(String str, int n) {
		int m = str.length();
		if (str == null || m < 1 || m > 10) {
			return null;
		}
		else if (n < 1 && n > m) {
			return null;
		}
		else {
			return str.substring(0, n) + str.substring((m - 2), m);
		}
	}
	public String middleMan(String str) {
		if (str.length() % 2 == 1 && str.length() >= 3) {
				int middle = str.length() / 2;
				return str.substring(middle-1, middle+2);
		}
		else {
			return null;
		}
	}
	public String doubleVision(String str) {
		if (str == null) return null;
		String double_str = new String();
			for (int i = 0; i <= str.length(); i++) {
				double_str += str.charAt(i) + "" + str.charAt(i);
			}
			return double_str;
	}
	public boolean centered(String str, String target) {
		if (str == (null) || target == (null) || target.length() != 3) {
			return false;
		}
		
		if (target.equals( str.substring((str.length() / 2) - 1 , (str.length() / 2) + 2))) {
			return true;
		}
		return false;
	}
	public int upOrDown(double number, char operation) {
		if (operation == 'r') {
			return (int) Math.round(number);
		}
		else if (operation == 'f') {
			return (int) Math.floor(number);
		}
		else if (operation == 'c') {
			return (int) Math.ceil(number);
		}
		else {
			return -1;
}
	}
	public int countMe(String text, char end) {
		if (!Character.isAlphabetic(end) || text == null)
			return -1;
		int count = 0;
		String wordEnd;
		for (int i = 0; i < text.length() - 1; i++) {
			if (!Character.isAlphabetic(text.charAt(i)) && !Character.isWhitespace(text.charAt(i)))
				return -1;

			wordEnd = text.substring(i, i+2);
			if (Character.isWhitespace(wordEnd.charAt(1)) && wordEnd.charAt(0) == end)
				count++;
		}

		if (!Character.isAlphabetic(text.charAt(text.length() - 1)) && !Character.isWhitespace(text.charAt(text.length() - 1)))
			return -1;
		else if (text.charAt(text.length() - 1) == end)
			count++;

		return count;
	}
	public boolean isNotEqual(String str) {
		if (str == (null)) {
			return false;
		}
		int iscounter = 0;
		int notcounter = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
					iscounter++;
				}
				else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
					notcounter++;
				}
		}
		return iscounter == notcounter;
	}
	public int triplets(String str) {
		if (str == (null)) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (Character.isLetter(str.charAt(i)) == false) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
			
		} 
		return count;
	}
	public int addMe(String str, boolean digits) {
		int sum = 0;
		
		if (str == null) {
			return -1;
		}
		if (digits) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					sum += Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else { 
			int check = 0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					check *= 10;
					check += Character.getNumericValue(str.charAt(i));;
				}
				else if (!Character.isAlphabetic(str.charAt(i))) {
					return -1;
				}
				else {
					sum += check;
					check = 0;
				}
				
			}
			
			sum += check;
		}
		return sum;
	}
}