import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

	/**
	 * This is the question 1 part 1 
	 * 
	 * @param text
	 * @return reverse the provided string
	 * 	
	 */
	public String reverse(String text) {
		
		if (text == null || text.length() == 0) {
			return text;
		}
		
		char[] newStringChar = new char[text.length()];
		
		int j = 0;
		for (int i = text.length() -1; i >= 0; i --) {
			newStringChar[j] = text.charAt(i);
			j ++;
		}
		
		return new String(newStringChar);
	}
	
	
	/**
	 * This is the question 1 part 2
	 * 
	 * @param text
	 * @return return the reshuffle string
	 */
	public String reshuffle(String text) {
		
		if (text == null || text.length() == 0) {
			return text;
		}
		
		List<Character> charList = new ArrayList<Character>();
		
		for (int i = 0; i < text.length(); i ++) {
			charList.add(text.charAt(i));
		}
		
		StringBuilder newString = new StringBuilder();
		
		while(charList.size() != 0) {
			int index = new Long(Math.round(Math.random() * (charList.size() - 1))).intValue();
			newString.append(charList.get(index));
			charList.remove(index);	
		}
		
		return newString.toString();
	}
	
	
	/**
	 * This is question 2
	 * 
	 * @param resource
	 * @return the median of a given array
	 */
	public double findMedian(int[] resource) {
		
		double median = -1;
		if (resource == null || resource.length == 0) {
			return median;
		}
		
		Arrays.sort(resource);
		
		if (resource.length % 2 == 0) {
			median = (resource[resource.length/2] +  resource[(resource.length - 1)/2]) / 2.0;
		}else {
			median = resource[resource.length/2];
		}
		
		return median;
	}
	
	public static void main(String[] args) {
		
		Question question = new Question();
		int[] resource = {0,1,5,2,4,3,6};
		
		System.out.println(question.findMedian(resource));
		
		System.out.println(question.reverse("abcdefg"));
		
		System.out.println(question.reshuffle("bcdefag"));
	}
}
