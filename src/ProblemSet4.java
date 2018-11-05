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
import java.lang.Math;

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();

		System.out.println(ps.surroundMe("<<>>", "abc"));
		System.out.println(ps.surroundMe("[[]]", "xyz"));
		System.out.println(ps.surroundMe("abc", "abc"));
		System.out.println(ps.surroundMe("(())", "qwerty"));
		System.out.println(ps.surroundMe(null, "abc"));
		System.out.println(ps.surroundMe("<<>>", null));
		System.out.println("\n");
		
		System.out.println(ps.endsMeet("qwerty", 2));
		System.out.println(ps.endsMeet("basketball", 3));
		System.out.println(ps.endsMeet("qwerty", -1));
		System.out.println(ps.endsMeet("basketball", 0));
		System.out.println(ps.endsMeet("qwerty", 9));
		System.out.println(ps.endsMeet("programming", 2));
		System.out.println(ps.endsMeet(null, 1));
		System.out.println("\n");
		
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.middleMan("programming"));
		System.out.println(ps.middleMan("even"));
		System.out.println(ps.middleMan(null));
		System.out.println("\n");
		
		System.out.println(ps.doubleVision("qwerty"));
		System.out.println(ps.doubleVision("a"));
		System.out.println(ps.doubleVision(null));
		System.out.println("\n");
		
		System.out.println(ps.centered("candy", "and"));
		System.out.println(ps.centered("programmings", "ram"));
		System.out.println(ps.centered("qwerty", "qwe"));
		System.out.println(ps.centered("qwerty", "er"));
		System.out.println(ps.centered("qwerty", null));
		System.out.println(ps.centered(null, "abc") );
		System.out.println(ps.centered(null, null));
		System.out.println("\n");
		
		System.out.println(ps.upOrDown(12.7, 'r'));
		System.out.println(ps.upOrDown(12.2, 'r'));
		System.out.println(ps.upOrDown(12.7, 'f'));
		System.out.println(ps.upOrDown(12.2, 'c'));
		System.out.println(ps.upOrDown(12.7, 'x'));
		System.out.println("\n");
		
		System.out.println(ps.countMe("these are just some sample words", 'e'));
		System.out.println(ps.countMe(null, 'n'));
		System.out.println(ps.countMe("and some more sample words", '+'));
		System.out.println(ps.countMe("one more batch of sample words", 'h'));
		System.out.println("\n");
		
		System.out.println(ps.isNotEqual("is not is not is"));
		System.out.println(ps.isNotEqual("is not is not is not"));
		System.out.println(ps.isNotEqual(null));
		System.out.println("\n");
		
		
		System.out.println(ps.triplets("abbbccccd"));
		System.out.println(ps.triplets("aaabbbbccccc"));
		System.out.println(ps.triplets(null));
		System.out.println(ps.triplets("abbb1ccc"));
		System.out.println(ps.triplets("aaa bbb"));
		
		
		System.out.println("\n");
		System.out.println(ps.addMe("a123b456c789", true));
		System.out.println(ps.addMe("a123b456c789", false));
		System.out.println(ps.addMe(null, true));
		System.out.println(ps.addMe("abc 123 def", true));
		
	}
	
	public String surroundMe(String out, String in) {
		String out2;
		if (in != null && out != null && in.length() == 3 && out.length() == 4){
			out2 = "" + out.charAt(0) + out.charAt(1) + in + out.charAt(2) + out.charAt(3);
		}else{
			out2 = null;
		}
		return out2;
	}
	
	public String endsMeet(String str, int n) {
		String out;
		if (str != null && str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= str.length()){
			out = str.substring(0, n) + str.substring(str.length() - n, str.length());
		}else{
			out = null;
		}
		return out;
	}
	
	public String middleMan(String str) {
		String out;
		if (str != null && str.length() >= 3 && str.length() % 2 == 1){
			out = str.substring( ((int)str.length())/2 - 1, ((int)str.length())/2 + 2);
		}else{
			out = null;
		}
		return out;
	}
	
	public String doubleVision(String str) {
		String out;
		if (str != null){
			out = "";
			for (int x = 0; x < str.length(); x++){
				out = out + str.charAt(x) + str.charAt(x);
			}
		}else{
			out = null;
		}
		return out;
	}
	
	public boolean centered(String str, String target) {
		boolean out;
		if (str != null && target != null && str.length() >= 3 && target.length() == 3){
			out = false;
			for (int x = 0; x < str.length()-target.length(); x++){
				if (str.substring(x, x + target.length()).equals(target)){
					if (x == str.length()-x-target.length() || x == str.length()-x-target.length() + 1 || x == str.length()-x-target.length() -1){
						out = true;
					}
				}
			}
		}else{
			out = false;
		}
		return out;
	}
	
	public int upOrDown(double number, char operation) {

		if (operation == 'f' || operation == 'r' || operation == 'c'){
			if (number == (int) number) {
				return (int)number;
			}else{
				if (operation == 'f') {
					return (int) number;
				}
				if (operation == 'r') {
					return Math.round((float)number);
				}
				if (operation == 'c') {
					return ((int) number) + 1;
				}
			}
		}
		return -1;
	}
	
	public int countMe(String text, char end) {
		int count = 0;
		if (end > 45 && end < 122 && text != null){
			for (int x = 0; x < text.length()-1; x++){
				if (text.charAt(x+1) == ' '){
					if (text.charAt(x) == end){
						count++;
					}
				} else if (x == text.length() - 1){
					if (text.charAt(x) == end){
						count++;
					}
				}
			}
			return count;
		} else {
			return -1;
		}

	}
	
	public boolean isNotEqual(String str){
		int countIs = 0;
		int countNot = 0;
		if (str != null){
			for (int x = 0; x < str.length(); x++){
				if ((str.charAt(x) == 'i' || str.charAt(x) == 'I') && x + 1  < str.length()){
					if (str.charAt(x + 1) == 's' || str.charAt(x + 1) == 'S'){
						countIs++;
					}
				}
				if ((str.charAt(x) == 'n' || str.charAt(x) == 'N') && x + 2  < str.length()){
					if (str.charAt(x + 1) == 'o' || str.charAt(x + 1) == 'O'){
						if (str.charAt(x + 2) == 't' || str.charAt(x + 2) == 'T'){
							countNot++;
						}
					}
				}
			}
		} else {
			return false;
		}
		if (countIs == countNot){
			return true;
		} else {
			return false;
		}
	}
	
	public int triplets(String str){
		int count = 0;
		boolean meetsCriteria = true;
		if (str != null) {
			for (int x = 0; x < str.length(); x++){
				if (str.charAt(x) < 65 || (str.charAt(x) > 90 && str.charAt(x) < 97) || str.charAt(x) > 122){
					meetsCriteria = false;
				}
			}
		} else {
			meetsCriteria = false;
		}
		if (meetsCriteria){
			for (int x = 0; x < str.length() - 2; x++){
				if (str.charAt(x) == str.charAt(x+1) && str.charAt(x) == str.charAt(x+2)){
					count++;
				}
			}
			return count;
		} else {
			return -1;
		}
	}
	
	public int addMe(String str, boolean digits) {
		boolean meetsCriteria = true;
		int result = 0;
		if (str != null){
			for (int x = 0; x < str.length(); x++){
				if (str.charAt(x) == ' '){
					meetsCriteria = false;
				}
			}
			if (meetsCriteria) {
				if (digits){
					for (int y = 0; y < str.length(); y++){
						if (str.charAt(y) >= 48 && str.charAt(y) <= 57) {
							result += str.charAt(y) - '0';
						}
					}
				} else {
					String num = "0";
					for (int y = 0; y < str.length(); y++){
						if (str.charAt(y) >= 48 && str.charAt(y) <= 57){
							num += str.charAt(y);
							if (y == str.length() - 1){
								result += Integer.parseInt(String.valueOf(num));
								num = "0";
							}
						} else {
							result += Integer.parseInt(String.valueOf(num));
							num = "0";
						}
					}
				}
				return result;
			} else {
				result = -1;
				return result;
			}
		} else {
			result = -1;
			return result;
		}
	}
}