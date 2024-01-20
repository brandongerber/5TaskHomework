/* Brandon Gerber
 * 1/19/2024
 * COP3804
 */
public class Task1 {
	public static void main(String[] args) {
		// Name in normal format
		String sentence = "Brandon Gerber";
		//string builder to reverse characters
		String reversedSentence = new StringBuilder (sentence).reverse().toString();
		// printing input and output 
		System.out.println ("My name is " + sentence);
		System.out.println ("My name reversed is " + reversedSentence);
		
	}
}
